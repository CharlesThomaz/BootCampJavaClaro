

public class MinhaClasse {

    private static int mediaFinal = 6; // Tornar a variável 'mediaFinal' estática

    public static void main(String[] args) {
        int notaAluno = 7; // Exemplo de nota do aluno
        String resultado = resultado(notaAluno);
        System.out.println(resultado); // Exibe o resultado retornado pelo método
    }

    public static String resultado(int nota) {
        if (nota == mediaFinal) {
            return "Recuperação";
        } else if (nota < mediaFinal) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }
}
