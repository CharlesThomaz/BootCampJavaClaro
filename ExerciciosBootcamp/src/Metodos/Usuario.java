public class Usuario {
    public static void main(String[] args) {
        SmartTV tvLG = new SmartTV();

        System.out.println("Tv ligada?" + tvLG.ligada);
        tvLG.ligar();
        System.out.println("Tv ligada?" + tvLG.ligada);
        System.out.println("Tv canal?" + tvLG.canal);
        System.out.println("Tv volume?" + tvLG.volume);

        tvLG.aumentarCanal();
        tvLG.aumentarCanal();
        tvLG.aumentarCanal();
        tvLG.aumentarCanal();
        tvLG.aumentarCanal();

        tvLG.aumentarVolume();
        tvLG.desligar();
        System.out.println("Tv ligada?" + tvLG.ligada);




        



    }


}
