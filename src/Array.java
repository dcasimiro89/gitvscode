import java.util.Scanner;

public class Array {

    public static int somaArray(int[] array){
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }
        
        for (int arrayNumbers : numeros) {
            System.out.print(arrayNumbers + " ");
        }

        int printSomaArray = somaArray(numeros);
        System.out.println("\nSoma: " + printSomaArray);

        scan.close();

    }
}