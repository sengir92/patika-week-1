import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print("Enter number: ");
        n = inp.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }



        for(int i = n -2; i >= 0; i--) {

            for(int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
                }
            for(int k= 0; k < (2*i+1); k++) {
                System.out.print("*");
                }
                System.out.println();
            }


        }


    }




