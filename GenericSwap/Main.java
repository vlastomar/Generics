package GenericSwap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main<T, swapStrings> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number ; i++) {
            stringList.add(scan.nextLine());
        }
        String[] indexes = scan.nextLine().split("\\s+");
        int index1 = Integer.parseInt(indexes[0]);
        int index2 = Integer.parseInt(indexes[1]);
        swapString(stringList, index1, index2);

    }
    public static <T> void swapString(List<T> list, int index1, int index2){
        T temp;
        temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        for(T lis : list){
            System.out.println(lis.getClass().getName() + ": " + lis);
        }

    }

}
