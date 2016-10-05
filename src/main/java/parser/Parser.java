package parser;

import inter.Access;
import inter.Expr;
import inter.Id;
import inter.Stmt;
import lexer.Lexer;
import lexer.Token;
import symbols.Env;
import symbols.Type;

import java.io.IOException;

/**
 */
public class Parser {
    private Lexer lex;
    private Token look;
    Env top = null;
    int used = 0;

    public Parser(Lexer lex) {
        this.lex = lex;
    }

    void move() throws IOException {
        this.look = lex.scan();
    }

    void error(String s) {
        throw new Error("near line " + lex.line + ": " + s);
    }

    void match(int t) throws IOException {
        if (look.tag == t) {
            move();
        } else {
            error("syntax error");
        }
    }

    public void program() {

    }

    Stmt block() {
        return null;
    }

    void decls() {

    }

    Type type() {
        return null;
    }

    Type dims(Type p) {
        return null;
    }

    Stmt stmts() {
        return null;
    }

    Stmt stmt() {
        return null;
    }

    Stmt assign() {
        return null;
    }

    Expr bool() {
        return null;
    }

    Expr factor() {
        return null;
    }

    Expr join() {
        return null;
    }

    Expr equality() {
        return null;
    }

    Expr rel() {
        return null;
    }

    Expr expr() {
        return null;
    }

    Expr term() {
        return null;
    }

    Expr unary() {
        return null;
    }

    Access offset(Id a) {
        return null;
    }

}
