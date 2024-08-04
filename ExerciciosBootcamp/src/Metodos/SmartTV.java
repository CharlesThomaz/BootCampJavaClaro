public class SmartTV {

    int canal = 0;
    boolean ligada = false;
    int volume = 0;


    public void ligar(){
       ligada =true;  
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        System.out.println("Volume: " +" "+ ++volume);
       }

    public void diminuirVolume(){
        System.out.println("Volume: " +" "+ --volume);
    }

    public void aumentarCanal(){
        System.out.println("Canal: " +" "+ ++canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }
    public void diminuirCanal(){
        System.out.println("Canal: " +" "+ --canal);
    }
}
