package nonneuman.semantico;

import java.util.LinkedList;

import nonneuman.analysis.DepthFirstAdapter;
import nonneuman.node.AABloco;
import nonneuman.node.AAChamadaFunc;
import nonneuman.node.AAFuncAlta;
import nonneuman.node.AComumAParametro;
import nonneuman.node.AFuncaoAFuncao;
import nonneuman.node.AVarAValor;
import nonneuman.node.AVaziaAFuncao;
import nonneuman.node.Start;
/************************************************
 * COMP0391 - COMPILADORES - T01
 * 
 * JO�O MANOEL SANTOS ALMEIDA - 201600016896
 * 
 * JOAO MARCELO DOS SANTOS NASCIMENTO - 201600017427
 * 
 * Classe respons�vel pela an�lise dos erros sem�nticos do programas.
 *************************************************/
public class Semantico extends DepthFirstAdapter{
	
	/** Tabela de Simbolos. */
	private LinkedList<LinkedList<Simbolo>> tabelaSimbolos;
	//Indica qual o escopo atual.
	private int escopoAtual;
	//Indica qual o escopo raiz do programa.
	private static final int escopoRaiz = 0;
	//Flag verificadora de chamadas de fun��o
	private boolean isChamadaFunc;
	
	public Semantico() {
		escopoAtual = 0;
		tabelaSimbolos = new LinkedList<LinkedList<Simbolo>>();
		tabelaSimbolos.add(new LinkedList<Simbolo>());
		
		isChamadaFunc = false;
	}
	
	
	@Override
	public void inStart(Start node) {
		System.out.println("-------------------------------------------------");
		System.out.println("Iniciando an�lise sem�ntica...");
		System.out.println("-------------------------------------------------");
		System.out.println("");
	}
	
	@Override
	public void outStart(Start node) {
		System.out.println("");
		System.out.println("-------------------------------------------------");
        System.out.println("Fim da an�lise sem�ntica");
        System.out.println("-------------------------------------------------");
	}
	
	@Override
	public void inAABloco(AABloco node) {
		escopoAtual++;
		tabelaSimbolos.add(new LinkedList<Simbolo>());
	}
	
	@Override
	public void inAFuncaoAFuncao(AFuncaoAFuncao node) {
		String idFuncao = node.getId().getText();
		Simbolo simb = new Simbolo(node.getId().getText(),
								   escopoRaiz,
								   Categoria.FUNCAO,
								   node.getAType().toString(),
								   null);
		
		//Verifica se uma fun��o j� foi definida.
		if(tabelaSimbolos.get(escopoRaiz).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] J� existe uma fun��o " + idFuncao + " definida.");
		else 
			tabelaSimbolos.get(escopoRaiz).push(simb);		
	}
	
	@Override
	public void inAVaziaAFuncao(AVaziaAFuncao node) {
		String idFuncao = node.getId().getText();
		Simbolo simb = new Simbolo(node.getId().getText(),
								   escopoRaiz,
								   Categoria.FUNCAO,
								   node.getAType().toString(),
								   null);
		
		//Verifica se uma fun��o j� foi definida.
		if(tabelaSimbolos.get(escopoRaiz).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] J� existe uma fun��o " + idFuncao + " definida.");
		else 
			tabelaSimbolos.get(escopoRaiz).push(simb);	
	}
	
	@Override
	public void inAAChamadaFunc(AAChamadaFunc node) {
		Simbolo simb = new Simbolo(node.getId().getText(), 
								  escopoRaiz,
								  Categoria.FUNCAO,
								  null,
								  null);
		
		//Verifica se a fun��o chamada foi declarada.
		if(!tabelaSimbolos.get(escopoRaiz).contains(simb) && !tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] A fun��o " + simb.getId() + " n�o foi definida.");
		
		isChamadaFunc = true;
	}
	
	@Override
	public void outAAChamadaFunc(AAChamadaFunc node) {
		isChamadaFunc = false;
		//Verifica se o n�mero de argumentos passados na chamada condiz com sua declara��o.
		if(tabelaSimbolos.get(escopoAtual-1).size() != qtParamsFunc)
			System.err.println("[ linha "+ node.getId().getLine() + " ] O numero de par�metros passado na fun��o " + node.getId() + " n�o condiz com sua declara��o.");
		
		qtParamsFunc = 0;
		
	}
	
	@Override
	public void inAAFuncAlta(AAFuncAlta node) {
		Simbolo simb = new Simbolo(node.getId().getText(), 
				escopoAtual, 
				Categoria.CHAMADA_FUNC, 
				node.getAType().toString(), 
				null);
		
		//Verifica se a fun��o de alta ordem pode ser utilizada.
		if(tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] A fun��o " + simb.getId() + " n�o pode ser utilizada. ");
		else
			tabelaSimbolos.get(escopoAtual).add(simb);
	}
	
	@Override
	public void inAComumAParametro(AComumAParametro node) {
		Simbolo simb = new Simbolo(node.getId().getText(), 
				escopoAtual, 
				Categoria.PARAMETRO, 
				node.getAType().toString(), 
				null);
		//Verifica se o par�metro foi definido.
		if(tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] O par�metro " + simb.getId() + " j� foi definido escopo " + escopoAtual+".");
		else
			tabelaSimbolos.get(escopoAtual).add(simb);
	}
	
	int qtParamsFunc = 0;
	
	@Override
	public void inAVarAValor(AVarAValor node) {
		Simbolo simb = new Simbolo(node.getId().getText(), 
								  escopoAtual, 
								  Categoria.PARAMETRO, 
								  null, 
								  null);
		
		//Verifica se a var foi declarada.
		if(!tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] A vari�vel " + simb.getId() + " n�o foi definida no escopo atual.");
		
		//Incrementa o n�mero de param�tros da func�o.
		if(isChamadaFunc)
			qtParamsFunc++;
	}
	
	public LinkedList<LinkedList<Simbolo>> getTabelaSimbolos() {
		return tabelaSimbolos;
	}


	public void setTabelaSimbolos(LinkedList<LinkedList<Simbolo>> tabelaSimbolos) {
		this.tabelaSimbolos = tabelaSimbolos;
	}
	
	public void imprimeTabela() {
		for(LinkedList<Simbolo> linha : tabelaSimbolos) {
			for(Simbolo simb : linha) {
				System.out.print(simb.getId()+"|");
			}
			System.out.println("");
		}
	}
	
}
