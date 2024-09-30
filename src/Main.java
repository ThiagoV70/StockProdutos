import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.Callable;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        produto p = new produto();
        System.out.print("Qual o nome do produto: ");
        p.name = sc.nextLine();
        System.out.print("Qual o valor da produto: ");
        p.price = sc.nextDouble();
        System.out.print("Qual o quantidade do produto: ");
        p.quantity = sc.nextInt();

        System.out.println();
        System.out.print("Product data: " + p);

        System.out.println();
        System.out.print("Qual a quantidade do produto que você que add no stock: ");
        int quantity = sc.nextInt();
        p.addvelur(quantity);

        System.out.println();
        System.out.print("Update data: " + p);

        System.out.println();
        System.out.print("Qual a quantidade que você quer remover: ");
        quantity = sc.nextInt();
        p.removevelur(quantity);

        System.out.println();
        System.out.print("Update data: " + p);

        sc.close();
        }
    }


