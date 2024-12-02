public class Main {

    public static void main(String[] args) {
        String[] palavras = {"", "01", "0011", "000111", "00001111", "001", "00011", "011"};

        System.out.println("Verificação da Linguagem L = {0^n1^n | n >= 0}:");
        for (String palavra : palavras) {
            System.out.println( palavra + ": " + (automatoDePilha(palavra) ? "Pertence" : "Não pertence"));
        }
    }
    public static boolean automatoDePilha(String palavra) {
        int contador = 0;

        for (char c : palavra.toCharArray()) {
            if (c == '0') {
                contador++;
            } else if (c == '1') {
                contador--;
                if (contador < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return contador == 0;
    }

}
