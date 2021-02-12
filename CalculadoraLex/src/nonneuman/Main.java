package nonneuman;
import java.io.FileReader;
import java.io.PushbackReader;

import nonneuman.lexer.Lexer;
import nonneuman.node.Start;
import nonneuman.parser.Parser;
import nonneuman.semantico.Semantico;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "teste/teste.calc";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			
			Parser p = new Parser(lexer); 
			   
			Start tree = p.parse();
			
			//Imprime árvore em interface gráfica
			//tree.apply(new ASTDisplay());
			tree.apply(new Semantico());
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}