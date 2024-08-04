public class Escopo {


        //Variavel de Escopo de classe
        boolean todosUsam = true;

        public void usar(){
            todosUsam = false;
            if (!todosUsam){
                todosUsam = true;
            }System.out.println("resultado true ? " + todosUsam);

        }

        public static void main(String[] args) {
            Escopo escopo = new Escopo();
            escopo.usar();        }
}
