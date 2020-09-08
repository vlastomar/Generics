package GenericSwapInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main<T, swapStrings> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> stringList = new ArrayList<>();
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number ; i++) {
            stringList.add(Integer.parseInt( scan.nextLine()));
        }
        int[] indexes = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        swapString(stringList, indexes[0], indexes[1]);

    }
    public static <T> void swapString(List<T> list, int index1, int index2){
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        for(T lis : list){
            System.out.println(lis.getClass().getName() + ": " + lis);
        }

    }

}
