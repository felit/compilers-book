package symbols;

import inter.Id;
import lexer.Token;

import java.util.Hashtable;

/**
 */
public class Env {
    private Hashtable<Token, Id> table;
    protected Env prev;

    public Env(Env env) {
        table = new Hashtable();
        prev = env;
    }

    public void put(Token w, Id i) {
        table.put(w, i);
    }

    public Id get(Token w) {
        for (Env e = this; e != null; e = e.prev) {
            Id found = e.table.get(w);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
}
