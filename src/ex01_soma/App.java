package ex01_soma;
import entrada.Entrada;

public class App {
    public static void main(String[] args) throws Exception {
        int a = Entrada.leiaInt("Digite um número inteiro: ");
        System.out.println("O número digitado foi: " + a);

        System.exit(0);
    }
}