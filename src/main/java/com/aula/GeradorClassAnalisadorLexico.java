package com.aula;

import java.nio.file.Paths;

public class GeradorClassAnalisadorLexico {
    public static void main(String[] args) {
        String rootPath = Paths.get("").toAbsolutePath().toString();

        String subPath = "/src/main/java/com/aula/";

        String file[] = {rootPath + subPath + "EspecificacaoTokens.lex"};

        jflex.Main.main(file);
    }
}
