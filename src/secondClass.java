import java.util.Scanner;

public class secondClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int f = input.nextInt();
        int s = input.nextInt();
        int t = input.nextInt();
        if((f>s && f<t) || (f<s && f>t))
            System.out.println(f);
        else if((s>f && s<t) ||(s<f && s>t))
            System.out.println(s);
        else
            System.out.println(t);
    }
}
