package GenericCountDouble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        List<Double> word = new ArrayList<>();
        for (int i = 0; i < number ; i++) {
            Double  input = Double.parseDouble(scan.nextLine());
            word.add(input);
        }
        Double input = Double.parseDouble(scan.nextLine());

        System.out.println(compareVar(word, input));
    }

    public static <T extends Comparable<T>> int compareVar(List<T> list, T input){
        int sum = 0;
        for(T lis : list){
            if (lis.compareTo(input) > 0){
                sum ++;
            }
        }
        return sum;
    }

}
