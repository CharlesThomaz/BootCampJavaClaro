

public class Soma implements InterfaceSoma{

    public static void main(String[] args) {
        
        

        try {
            Soma soma = new Soma();
            soma.somar(0, 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não é possível divisão por zero." +" "+ e.getMessage());
        }

                
}


    @Override
    public  int somar(int num1, int num2) throws Exception {
        
            int resultado = num1 /num2;
                 
       
        return resultado;
    }

}
