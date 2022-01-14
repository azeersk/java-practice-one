import java.util.Scanner;

public class divisibleClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%5==0 || a%6==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
