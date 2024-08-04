package op.operadores;

public class operador {
    
public static void main(String[] args) {
      
        System.out.println(validarUsuario( "CHARLES",1234567));



     }

     public static String validarUsuario(String usuario, int senha){

        //BANCO DE DADOS IMPROVISADO
        String user = "CHARLES";
        int password = 1234567;

        //DADOS RECEBIDOS
        String usuarioDigitado = usuario;
        int senhaDigitada = senha;
        
        boolean usuarioCadastrado = usuario.equals(user);
        boolean senhaCadastrada = password == senha;
        String entradaPermitida;
        if( !usuarioCadastrado && !senhaCadastrada){entradaPermitida = "Usuario e senha errados";
        
        }else if(!senhaCadastrada){entradaPermitida = "senha errada";
        }else if( usuarioCadastrado && senhaCadastrada){entradaPermitida = "Entrada Permitida";
         }else if (!usuarioCadastrado){entradaPermitida = "usuario errado";

        }else {entradaPermitida = "Digite seus dados";};

         return entradaPermitida;

     }

     

}
