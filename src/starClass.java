import java.util.Scanner;

public class starClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = 5, count=1;
        while (count<=a) {
            System.out.println("  ".repeat(a - count) + " *".repeat(count));
            count++;

        }
        System.out.println();
        int natural = input.nextInt();
        int naturalSum = 0;
        for(int i=0; i<=natural; i++){
            naturalSum = naturalSum + i;
        }
        System.out.println(naturalSum);
    }
}
