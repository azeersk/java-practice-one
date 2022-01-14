import java.util.Scanner;

public class oddClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        while (a<=b){
            if(a%2!=0)
                System.out.print(a + " ");
            a++;
        }
    }
}
