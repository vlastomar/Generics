package TuplePack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        input[0] = input[0] + input[1];
        Tuple<String, String> items = new Tuple<>(input[0], input[2]);
        items.print(input[0], input[2]);
        input = scan.nextLine().split("\\s+");
        Tuple<String, Integer> items2 = new Tuple<String, Integer>(input[0], Integer.parseInt(input[1]));
        items2.print(input[0], Integer.parseInt(input[1]));
        input = scan.nextLine().split("\\s+");
        Tuple<Integer, Double> items3 = new Tuple<Integer, Double>(Integer.parseInt(input[0]), Double.parseDouble(input[1]));
        items3.print(Integer.parseInt(input[0]), Double.parseDouble(input[1]));

    }
}
