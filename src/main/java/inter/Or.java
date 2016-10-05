package inter;

import lexer.Token;

/**
 */
public class Or extends Logical {

    Or(Token tok, Expr expr1, Expr expr2) {
        super(tok, expr1, expr2);
    }

    public void jumping(int t, int f) {
        int label = t != 0 ? t : newlabel();
        expr1.jumping(label, 0);
        expr2.jumping(t, f);
        if (t == 0) {
            emitlabel(label);
        }
    }
}
