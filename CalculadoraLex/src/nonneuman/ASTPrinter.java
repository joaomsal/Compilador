package nonneuman;

import nonneuman.node.*;

import org.sablecc.sablecc.analysis.DepthFirstAdapter;

import nonneuman.analysis.*;

public class ASTPrinter extends DepthFirstAdapter {
	
	int indent;
	
	public void printIndent(){
		for (int i = 0; i < indent; i++) {
			System.out.print("\u0009");
		}
	}
	
	public void printNode(Node node){
		printIndent();
		System.out.print(node.getClass().getSimpleName().toString().replaceAll("class node\\.T?", ""));
		System.out.println(" | "+node.toString() );
	}
	
	public void defaultIn(Node node){
		printNode(node);
		indent++;
	}
	
	public void defaultOut(Node node){
		indent--;
	}
}