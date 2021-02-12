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
 * JOÃO MANOEL SANTOS ALMEIDA - 201600016896
 * 
 * JOAO MARCELO DOS SANTOS NASCIMENTO - 201600017427
 * 
 * Classe responsável pela análise dos erros semânticos do programas.
 *************************************************/
public class Semantico extends DepthFirstAdapter{
	
	/** Tabela de Simbolos. */
	private LinkedList<LinkedList<Simbolo>> tabelaSimbolos;
	//Indica qual o escopo atual.
	private int escopoAtual;
	//Indica qual o escopo raiz do programa.
	private static final int escopoRaiz = 0;
	//Flag verificadora de chamadas de função
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
		System.out.println("Iniciando análise semântica...");
		System.out.println("-------------------------------------------------");
		System.out.println("");
	}
	
	@Override
	public void outStart(Start node) {
		System.out.println("");
		System.out.println("-------------------------------------------------");
        System.out.println("Fim da análise semântica");
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
		
		//Verifica se uma função já foi definida.
		if(tabelaSimbolos.get(escopoRaiz).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] Já existe uma função " + idFuncao + " definida.");
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
		
		//Verifica se uma função já foi definida.
		if(tabelaSimbolos.get(escopoRaiz).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] Já existe uma função " + idFuncao + " definida.");
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
		
		//Verifica se a função chamada foi declarada.
		if(!tabelaSimbolos.get(escopoRaiz).contains(simb) && !tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] A função " + simb.getId() + " não foi definida.");
		
		isChamadaFunc = true;
	}
	
	@Override
	public void outAAChamadaFunc(AAChamadaFunc node) {
		isChamadaFunc = false;
		//Verifica se o número de argumentos passados na chamada condiz com sua declaração.
		if(tabelaSimbolos.get(escopoAtual-1).size() != qtParamsFunc)
			System.err.println("[ linha "+ node.getId().getLine() + " ] O numero de parâmetros passado na função " + node.getId() + " não condiz com sua declaração.");
		
		qtParamsFunc = 0;
		
	}
	
	@Override
	public void inAAFuncAlta(AAFuncAlta node) {
		Simbolo simb = new Simbolo(node.getId().getText(), 
				escopoAtual, 
				Categoria.CHAMADA_FUNC, 
				node.getAType().toString(), 
				null);
		
		//Verifica se a função de alta ordem pode ser utilizada.
		if(tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] A função " + simb.getId() + " não pode ser utilizada. ");
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
		//Verifica se o parâmetro foi definido.
		if(tabelaSimbolos.get(escopoAtual).contains(simb))
			System.err.println("[ linha "+ node.getId().getLine() + " ] O parâmetro " + simb.getId() + " já foi definido escopo " + escopoAtual+".");
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
			System.err.println("[ linha "+ node.getId().getLine() + " ] A variável " + simb.getId() + " não foi definida no escopo atual.");
		
		//Incrementa o número de paramêtros da funcão.
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
