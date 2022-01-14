import java.util.Arrays;
import java.util.Scanner;

public class buyPleaseClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String lineInput = input.nextLine();
        String[] arr = lineInput.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int x = Integer.parseInt(arr[2]);
        int y = Integer.parseInt(arr[3]);
        System.out.println("total pens and pencils cost: "+(a*x + b*y));

    }
}
