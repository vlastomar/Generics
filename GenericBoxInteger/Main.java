package GenericBoxInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number ; i++) {
            //int numb = Integer.parseInt(scan.nextLine());
            Box<Integer> integerBox = new Box<>(Integer.parseInt(scan.nextLine()));
            System.out.println(integerBox);
        }
    }
}
