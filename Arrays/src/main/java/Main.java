import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

//        int[] arrTest1 = new int[5];
//        arrTest1[0] = 4;
//        arrTest1[1] = 2;
//        arrTest1[2] = 4;
//        arrTest1[3] = 7;
//        arrTest1[4] = 1;
//
//        int[] arrTest2 = {1,4,1,4,4,1,1};

//        arrayForTest1(arrTest1);
//        System.out.println(arrayForTest2(arrTest2));
    }

    public static int[] arrayForTest1(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                for (int j = i + 1; j < arr.length; j++) {
                    list.add(arr[j]);
                }

                int[] arr2 = new int[list.size()];
                for (int k = 0; k < arr2.length; k++) {
                    arr2[k] = list.get(k);
                }
                System.out.println(Arrays.toString(arr2));
                return arr2;
            }
        }
        throw new RuntimeException();
    }

    public static boolean arrayForTest2 (int[] arr) {
        int oneCount = 0;
        int fourCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) oneCount++;
            if (arr[i] == 4) fourCount++;
            if (arr[i] != 1 && arr[i] != 4) return false;
        }
        if (oneCount == 0 || fourCount ==0) return false;
        return true;
    }

}
