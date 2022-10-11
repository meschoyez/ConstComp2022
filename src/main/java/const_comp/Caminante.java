package const_comp;

import org.antlr.v4.runtime.tree.TerminalNode;

import const_comp.miParserParser.*;

public class Caminante extends miParserBaseVisitor<Object> {

    @Override
    public Object visitBloque(BloqueContext ctx) {
        // TODO Auto-generated method stub
        System.out.println(" == Bloque tiene " + ctx.getChildCount() + " hijos");
        System.out.println(" ==   Padre -> " + ctx.getParent().getText());
        System.out.println(" ==   Hijo 0 -> " + ctx.getChild(0).getText());
        System.out.println(" ==   Hijo 1 -> " + ctx.getChild(1).getText());
        System.out.println(" ==   Hijo 2 -> " + ctx.getChild(2).getText());
        return visitInstrucciones((InstruccionesContext)ctx.getChild(1));
    }
    
    @Override
    public Object visitInstruccion(InstruccionContext ctx) {
        // TODO Auto-generated method stub
        System.out.println(" ** Instruccion tiene " + ctx.getChildCount() + " hijos");
        System.out.println(" **   Padre -> " + ctx.getParent().getText());
        return super.visitInstruccion(ctx);
    }

    @Override
    public Object visitPrograma(ProgramaContext ctx) {
        // TODO Auto-generated method stub
        System.out.println("Comienza visita del arbol");
        Object o = super.visitPrograma(ctx);
        System.out.println("Fin de la visita del arbol");
        return o;
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        System.out.println("\tHoja contiene |" + node.getText() + "|");
        return super.visitTerminal(node);
    }
    
}
