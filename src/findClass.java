import java.util.Scanner;

public class findClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        int findOne = input.nextInt();
        int present = 0;
        for(int i=0; i<numbers; i++){
            int num = input.nextInt();
            if(num == findOne){
                present = 1;
            }
        }
        if (present == 1){
            System.out.println(present);
        }
        else{
            System.out.println(-1);
        }
        int a = 3;
        int b = 4;
        int c = 5;
        if(a*b%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
