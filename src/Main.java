import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("enter your rating for the tests ");

    Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        switch (number) {
            case 2:
                System.out.println("its f*cking bad man");
                break;
            case 3:
                System.out.println("still bad");
                break;
            case 4:
                System.out.println("already good");
                break;
            case 5:
                System.out.println("good boy");
                break;
        }
        System.out.println("Bye Bye!!");
    }
}
