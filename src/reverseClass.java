import java.util.Arrays;
import java.util.Scanner;

public class reverseClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i=0;
        String nums = "";
        while (i<a){
            int order = input.nextInt();
            nums = nums + String.valueOf(order)+" ";


            i++;
        }
        String[] arr = nums.split(" ");
        int len = arr.length;
        int[] reverse = new int[len];
        for(int j=0; j<len; j++){
            reverse[j] = Integer.parseInt(arr[len-(j+1)]);
        }
        System.out.println(Arrays.toString(reverse));

    }
}
