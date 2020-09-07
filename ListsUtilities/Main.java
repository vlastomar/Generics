package ListsUtilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,18,-1);
        Integer maxInt = ListUtils.getMax(integers);
        Integer minInt = ListUtils.getMin(integers);
        System.out.println(maxInt);
        System.out.println(minInt);
        List<String> strings = List.of("lflt", "rtyu",  "we");
        String maxS = ListUtils.getMax(strings);
        String minS = ListUtils.getMin(strings);
        System.out.println(maxS);
        System.out.println(minS);
    }



}
