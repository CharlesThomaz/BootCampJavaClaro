/**
 * ESSA É UMA CLASSE DE TESTE DO JAVADOC COM O 
 * OBJETIVO DE VER O PODER DA DOCUMENTAÇÃO JAVA.
 * FACILITANDO EM MUITO A VIDA DO DESENVOLVEDOR.
 * @author CHARLES THOMAZ
 * @version 1.0
 * @since 04/08/2024
 * 
 */

public class JavaDoc {

    /**
     * @param texto ESSE MÉTODO ESPERA RECEBER UM STRING QUE SERÁ IMPRESSA
     * @throws Exception ESSA É A EXEÇÃO QUE PODE SER GERADA NESSA CLASSE
     * @return ELA RETORNA UMA STRING QUE SERÁ DIGITADA NO PARÂMETRO
     */
    public String imprimir(String texto) throws Exception{
       return texto;
    }

    @Override
    public String toString() {
        return "JavaDoc []";
    }

}
