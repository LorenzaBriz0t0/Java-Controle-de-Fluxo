public class SistemaMedida {
    public static void main(String [] args){

        // Primeiro modo:

       // String sigla = "M";

       // if(sigla == "P")
        //System.out.println("PEQUENO");

       // else if(sigla ==  "M")
       // System.out.println("MEDIO");

       // else if(sigla == "G")
        //System.out.println("GRANDE");
        
        //else
        //System.out.println("INDEFINIDO");

        // Com Switch case:
        String sigla = "M";
        switch ( sigla ) {
            case "P" : {System.out.prinln("PEQUENO");
            break;
        }
            case "M" : {System.out.println("MÉDIO");
            break;
        }
            case "G" ; {System.out.prinln("GRANDE");
            break;
        }

        default;
        System.out.println("INDEFINIDO");
    } // Fecha o Switch



    
} // Fecha o Main

} // Fecha o SistemaMedida
