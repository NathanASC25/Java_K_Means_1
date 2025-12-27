import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        ArrayList<Integer> group = new ArrayList<Integer>();
        group.add(10);
        group.add(20);
        newList.add(group);
        System.out.print("\n" + newList + "\n");
        System.out.print("\nX-Value: " + newList.get(0).get(0) + " Y-Value: " + newList.get(0).get(1) + "\n");
    }
}
