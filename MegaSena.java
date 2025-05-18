import java.util.Arrays;
import java.util.Scanner;

    public class MegaSena {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[6];
            int count = 0;

            while (count < 6) {
                System.out.print("Digite um número entre 1 e 60: ");
                int numero = scanner.nextInt();

                if (numero < 1 || numero > 60) {
                    System.out.println("Número inválido. Insira um número entre 1 e 60.");
                    continue;
                }

                boolean duplicado = false;
                for (int i = 0; i < count; i++) {
                    if (numeros[i] == numero) {
                        duplicado = true;
                        break;
                    }
                }

                if (duplicado) {
                    System.out.println("Número já inserido. Insira um número diferente.");
                } else {
                    numeros[count] = numero;
                    count++;
                }
            }

            Arrays.sort(numeros);
            System.out.println("Números escolhidos em ordem crescente: " + Arrays.toString(numeros));
            scanner.close();
        }
    }
