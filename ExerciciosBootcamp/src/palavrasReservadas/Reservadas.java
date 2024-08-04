public class Reservadas {

        
    public static void main(String[] args) {
        String[] controleDeFluxo = {
            "if", "else", "switch", "case", "default", "while", "do", "for", "break", "continue", "return", "try", "catch", "finally", "throw", "throws"
        };

        String[] declaracoesDeTipos = {
            "class", "interface", "enum", "extends", "implements"
        };

        String[] modificadores = {
            "public", "protected", "private", "static", "final", "abstract", "synchronized", "volatile", "transient", "native", "strictfp"
        };

        String[] tiposPrimitivos = {
            "byte", "short", "int", "long", "float", "double", "boolean", "char"
        };

        String[] pacotesEImportacoes = {
            "package", "import"
        };

        String[] variaveisEReferencias = {
            "new", "this", "super", "instanceof", "null"
        };

        String[] reservadasParaUsoFuturo = {
            "goto", "const"
        };

        // Exemplo de como imprimir todas as palavras reservadas por categoria
        imprimirPalavras("Controle de Fluxo", controleDeFluxo);
        imprimirPalavras("Declarações de Tipos", declaracoesDeTipos);
        imprimirPalavras("Modificadores", modificadores);
        imprimirPalavras("Tipos Primitivos", tiposPrimitivos);
        imprimirPalavras("Pacotes e Importações", pacotesEImportacoes);
        imprimirPalavras("Variáveis e Referências", variaveisEReferencias);
        imprimirPalavras("Reservadas para Uso Futuro", reservadasParaUsoFuturo);
    }

    private static void imprimirPalavras(String categoria, String[] palavras) {
        System.out.println(categoria + ":");
        for (String palavra : palavras) {
            System.out.println(" - " + palavra);
        }
        System.out.println();
    }

}
