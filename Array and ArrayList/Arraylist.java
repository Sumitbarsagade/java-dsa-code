import java.util.ArrayList;

public class Arraylist<I extends Number> {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(10);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);


        System.out.println(list.contains(54));
        System.out.println(list.set(0,99));
        System.out.println(list.remove(7));
        System.out.println(list);
    }
}
