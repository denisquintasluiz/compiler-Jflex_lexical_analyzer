package com.aula;

import java.io.IOException;
import java.io.StringReader;

public class CodigoFonte {
    public static void main(String[] args) throws IOException{
        String codigo = "idade = anoAtual * 1995";

        AnalisadorLexico analisador_lexico = new AnalisadorLexico(new StringReader(codigo));
        
        analisador_lexico.yylex();

    }
}
