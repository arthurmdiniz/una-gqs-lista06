import java.util.Scanner;

public class TempoDeslocamento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em km: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite a velocidade média em km/h: ");
        double velocidade = scanner.nextDouble();

        double tempo = distancia / velocidade;

        System.out.println("Tempo de deslocamento: " + tempo + " horas");

        scanner.close();
    }
}
