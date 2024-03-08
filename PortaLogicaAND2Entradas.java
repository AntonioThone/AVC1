public class PortaLogicaAND2Entradas {

    private boolean entrada1;
    private boolean entrada2;

    public PortaLogicaAND2Entradas(boolean entrada1, boolean entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
    }

    public String getEntradas() {
        return "Entrada 1: " + entrada1 + ", Entrada 2: " + entrada2;
    }

    public boolean getSaida() {
        return entrada1 && entrada2;
    }

    public static void main(String[] args) {
        PortaLogicaAND2Entradas porta1 = new PortaLogicaAND2Entradas(true, true);
        PortaLogicaAND2Entradas porta2 = new PortaLogicaAND2Entradas(false, true);

        System.out.println("Porta 1:");
        System.out.println(porta1.getEntradas());
        System.out.println("Saída: " + porta1.getSaida());

        System.out.println("\nPorta 2:");
        System.out.println(porta2.getEntradas());
        System.out.println("Saída: " + porta2.getSaida());
    }
}

