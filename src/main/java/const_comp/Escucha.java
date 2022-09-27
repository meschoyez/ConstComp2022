package const_comp;

import org.antlr.v4.runtime.tree.TerminalNode;

import const_comp.miParserParser.BloqueContext;
import const_comp.miParserParser.ProgramaContext;

public class Escucha extends miParserBaseListener {
    private Integer contexto = 0;

    @Override
    public void enterBloque(BloqueContext ctx) {
        contexto++;
        System.out.println("Nuevo contexto " + contexto);
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        System.out.println("Fin contexto " + contexto);
        contexto--;
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("Comienza la compilacion |" + ctx.getText() + "|");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        contexto++;
        System.out.println("Fin compilacion |" + ctx.getText() + "|");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println(" -- TOKEN --> |" + node.getText() + "|");
    }
    
    
}
