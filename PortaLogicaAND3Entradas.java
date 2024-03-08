public class PortaLogicaAND3Entradas {

    public static boolean getSaida(boolean entrada1, boolean entrada2, boolean entrada3) {
        PortaLogicaAND2Entradas portaAux = new PortaLogicaAND2Entradas(entrada1, entrada2);
        return portaAux.getSaida() && entrada3;
    }

    public static void main(String[] args) {
        boolean saida1 = PortaLogicaAND3Entradas.getSaida(true, true, true);
        boolean saida2 = PortaLogicaAND3Entradas.getSaida(false, true, true);
        boolean saida3 = PortaLogicaAND3Entradas.getSaida(true, false, false);

        System.out.println("Saída 1: " + saida1);
        System.out.println("Saída 2: " + saida2);
        System.out.println("Saída 3: " + saida3);
    }
}

