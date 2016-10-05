package inter;

import lexer.Token;
import symbols.Type;

/**
 */
public class Unary extends Op {
    public Expr expr;

    Unary(Token tok, Expr x) {
        super(tok, null);
        this.expr = x;
        type = Type.max(Type.Int, expr.type);
        if (type == null) {
            error("type error");
        }
    }

    public Expr gen() {
        return new Unary(op, expr.reduce());
    }

    public String toString() {
        return op.toString() + " " + " " + expr.toString();
    }
}
