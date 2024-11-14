package aleatorio.composicao;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHAPED(2),
    DELIVERED(3);

    private final int numero;

    OrderStatus(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

}
