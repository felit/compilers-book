package inter;

import lexer.Token;
import symbols.Type;

/**
 */
public class Op extends Expr {
    Op(Token tok, Type p) {
        super(tok, p);
    }
}
