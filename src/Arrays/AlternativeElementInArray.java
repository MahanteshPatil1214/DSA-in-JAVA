package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeElementInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(getAlternative(arr));

    }
    public static ArrayList<Integer> getAlternative(int arr[]){
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0)
                num.add(arr[i]);
            else
                continue;
        }
        return num;
    }
}
