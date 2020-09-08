package GenericBox;

public class Box<T> {
    private T boxVar;

    public Box(T boxVar) {
        this.boxVar = boxVar;
    }

    @Override
    public String toString() {

        return this.boxVar.getClass().getName() + ":" + " " + this.boxVar;

    }
}
