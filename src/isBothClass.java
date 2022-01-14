import java.util.Scanner;

public class isBothClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("BOTH");
        }
        else if(a%5==0 || a%11==0){
            System.out.println("ONE");
        }
        else{
            System.out.println("NONE");
        }
    }
}
