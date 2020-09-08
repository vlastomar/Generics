package CustomList;

import java.util.ArrayList;
import java.util.List;

public class Custom <T extends Comparable<T>>{
    private List<T> custom;

    public Custom(List<T> custom) {
        this.custom = custom;
    }
    public Custom(){
        this.custom = new ArrayList<>();
    }

    public void add(T element){
        custom.add(element);
    }



    public void remove(int index){
        custom.remove(index);
    }

    public boolean contains(T element){
        if (custom.contains(element)){
            return true;
        }else {
            return false;
        }
    }

    public void swap(int index1, int index2){
        T temp = custom.get(index1);
        custom.set(index1, custom.get(index2));
        custom.set(index2, temp);
    }

    public int countGreaterThan(T element){
        int count = 0;
        for(T lis : custom){
            if (lis.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        T temp = custom.get(0);
        for (int i = 1; i < custom.size() ; i++) {
            if (custom.get(i).compareTo(temp) > 0){
                temp = custom.get(i);
            }
        }
        return temp;
    }

    public T getMin(){
        T temp = custom.get(0);
        for (int i = 1; i < custom.size() ; i++) {
            if (custom.get(i).compareTo(temp) < 0){
                temp = custom.get(i);
            }
        }
        return temp;
    }

    public void print(){
        for (T cus : custom){
            System.out.println(cus);
        }
    }
}
