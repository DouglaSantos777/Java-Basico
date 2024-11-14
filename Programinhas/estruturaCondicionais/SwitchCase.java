package estruturaCondicionais;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Que dia é hoje?");
        String dia = scan.nextLine();

        String msg;

        switch(dia){
            case "domingo" :
                msg = "Bom domingo!";
                break;
            case "segunda" :
                msg = "Boa segunda!";
                break;
            case "terça" :
                msg = "Boa terça!";
                break;
            case "quarta" :
                msg = "Boa quarta!";
                break;
            case "quinta" :
                msg = "Boa quinta!";
                break;
            case "sexta" :
                msg = "Boa sexta!";
                break;
            case "sabado" :
                msg = "Bom sabado!";
               break;
            default:
                msg = "valor invalido";
        }

        System.out.println(msg);

        scan.close();
    }
}
