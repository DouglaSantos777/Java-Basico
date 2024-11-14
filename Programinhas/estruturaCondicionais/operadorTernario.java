package estruturaCondicionais;

public class operadorTernario {

    public static void main(String[] args) {
        double conta = 32.25;
        double desconto = (conta > 30) ? conta * 0.05 : conta *0.02;

        double valorfinal = conta - desconto;

        System.out.println(valorfinal);

    }
}
