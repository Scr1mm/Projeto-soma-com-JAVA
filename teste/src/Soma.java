import java.util.Scanner;

public class Soma {
   public Soma() {
   }

   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o primeiro número: ");
      int num1 = sc.nextInt();
      System.out.print("Digite o segundo número: ");
      int num2 = sc.nextInt();
      System.out.print("Digite o terceiro número: ");
      int num3 = sc.nextInt();
      System.out.print("Digite o quarto número: ");
      int num4 = sc.nextInt();
      int soma = num1 + num2 + num3 + num4;
      System.out.println("A soma é: " + soma);
      sc.close();
   }
}