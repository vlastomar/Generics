package GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("A","C");
        System.out.println(stringScale.getHeavier());
        Scale<Integer> integerScale = new Scale<>(3 ,3);
        System.out.println(integerScale.getHeavier());
    }
}
