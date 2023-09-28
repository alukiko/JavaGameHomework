import java.util.Random;
import java.util.Scanner;

public class Main {
    public static boolean beginning(){
        System.out.println("Будешь угадывать? (да/нет)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("нет")) {
            System.out.println("(×﹏×)");
            return false;
        } else if (!answer.equals("да")) {
            System.out.println("(︶︹︺)\n непонятно, давай до свидания");
            return false;
        }
        System.out.println("(⌒‿⌒)");
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Привет!");
        Scanner sc = new Scanner(System.in);

        if (beginning() == false) {
            return;
        }
        while (true) {
            int rand = new Random().nextInt(0, 10) + 1;
            System.out.println("угадай число от 1 до 10");
            while (true) {
                int number = sc.nextInt();
                if (number == rand) {
                    System.out.println("╰(▔∀▔)╯");
                    if (beginning() == false) {
                        return;
                    }
                    break;
                } else {
                    if (number < 1 || number > 10) {
                        System.out.println("Читать не умеешь?");
                    } else if (Math.abs(number - rand) > 5) {
                        System.out.println("Холодно");
                    } else if (Math.abs(number - rand) > 2) {
                        System.out.println("Тепло");
                    } else {
                        System.out.println("Жгётся!");
                    }
                }
            }
        }
    }
}