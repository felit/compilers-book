package main;

import lexer.Lexer;
import parser.Parser;

/**
 */
public class Main {
    public static void main(String args[]) {
        Lexer lex = new Lexer();
        Parser parse = new Parser(lex);
        parse.program();
        System.out.write('\n');
    }
}
