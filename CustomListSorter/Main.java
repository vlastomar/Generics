package CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //List<Iterator> operation = new ArrayList<>();
        Sorter<String> operation = new Sorter<>();

        String word = scan.nextLine();

        while (!"END".equals(word)){
            String[] input = word.split("\\s+");
            switch (input[0]){
                case "Add":
                    String element = input[1];
                    operation.add(element);
                    break;
                case "Remove":
                    operation.remove(Integer.parseInt(input[1]));
                    break;
                case "Contains":
                    System.out.println(operation.contains(input[1]));
                    break;
                case "Swap":
                    operation.swap(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    break;
                case "Greater":
                    System.out.println(operation.countGreaterThan(input[1]));
                    break;
                case "Max":
                    System.out.println(operation.getMax());
                    break;
                case "Min":
                    System.out.println(operation.getMin());
                    break;
                case "Print":
                     operation.print();
                    break;
                case "Sort":
                    operation.sort();
                    break;
            }

            word = scan.nextLine();
        }


    }
}
