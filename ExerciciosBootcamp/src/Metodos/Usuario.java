public class Usuario {
    

    public static void main(String[] args) {
       metodo();
       
        
    }
    public static void metodo(){
        boolean livre = true;
        SmartTV tvLG = new SmartTV();
        if (livre){
            SmartTV tvPhil = new SmartTV();

            tvLG.ligar();
        }
        System.out.println(tvLG.ligada);
    }


}
