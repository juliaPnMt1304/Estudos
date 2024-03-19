import java.util.Scanner;

public class EstudandoBash {
        public static double valorSupermercado(double compra1, double compra2){
            Scanner input = new Scanner(System.in);

            double result;
            System.out.println("Qual o valor do produto1?");
            compra1 = input.nextDouble();
            System.out.println("Qual o valor do produto2?");
            compra2 = input.nextDouble();

            result = compra1 + compra2;
            return result;
    }
}
