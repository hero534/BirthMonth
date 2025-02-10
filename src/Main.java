import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
            System.out.println("Enter your birth month number: ");
            birthMonth = in.nextInt();
                if (birthMonth >= 1 && birthMonth <= 12) {
                    System.out.println("Your birth month is " + birthMonth);
                } else System.out.println("You entered an incorrect month value: " + birthMonth);
    }
}