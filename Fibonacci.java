import java.util.Scanner;

    public class Fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a quantidade de números da série de Fibonacci a exibir: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("A quantidade deve ser maior que zero.");
            } else {
                int[] fibonacci = new int[n];
                fibonacci[0] = 0;
                if (n > 1) fibonacci[1] = 1;

                for (int i = 2; i < n; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }

                System.out.println("Os primeiros " + n + " números da série de Fibonacci: ");
                for (int num : fibonacci) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            scanner.close();
        }
    }

