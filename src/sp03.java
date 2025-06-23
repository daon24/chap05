import java.util.Arrays;

public class sp03 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] tmp = new int[arr.length*2];

        for(int i=0; i<arr.length;i++){
            tmp[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));
        arr = tmp;
        System.out.println(Arrays.toString(arr));



    }
}
