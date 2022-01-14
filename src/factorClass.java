import java.util.Scanner;

public class factorClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 1;
        int timesOf = 0;
        while(count<=number){
            if(number%count == 0){
                System.out.print(count + " ");
                timesOf++;
            }
            count++;
        }
        System.out.println();
        System.out.print(timesOf);
    }
}
