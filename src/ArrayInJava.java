import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInJava {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(0,2);
        arrList.add(3);
        System.out.println(arrList);
    }

}
