package com.craftinginterpreters.lox;

class Token{
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokeTpye, tpye, String lexeme, Object literal, int line){
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString(){
        return type + " " + lexeme + " " + literal;
    }
}
