import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String sor;
        do {

            Scanner sc = new Scanner(System.in);
            sor = sc.nextLine();
            switch (sor) {
                case "hello":
                    System.out.println("Hello World!");
                    break;
                case "info":
                    System.out.println("v1");
                    break;
                case "exit":
                    System.out.println("Kilépés, viszlát!");
                    break;
            }
        }
        while (sor != "exit");
    }
}
