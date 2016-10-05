package inter;

import lexer.Word;
import symbols.Type;

/**
 */
public class Id extends Expr {
    public int offset;

    public Id(Word tok, Type p, int offset) {
        super(tok, p);
        this.offset = offset;
    }
}
