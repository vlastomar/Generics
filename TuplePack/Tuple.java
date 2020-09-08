package TuplePack;

public class Tuple<T, F> {
   private T item1;
   private F item2;

    public Tuple(T item1, F item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public F getItem2() {
        return item2;
    }

    public void setItem2(F item2) {
        this.item2 = item2;
    }

    public void print(T item1, F item2){
        System.out.println(String.format(item1 + " -> " + item2));
    }
}
