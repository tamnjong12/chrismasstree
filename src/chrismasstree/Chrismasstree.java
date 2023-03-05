package chrismasstree;
//APP
import java.util.Scanner;

/**
 *
 * @author Tamnjong Larry
 */
public class Chrismasstree {

    /**
     * @param args the command line arguments
     */
    static int spaceToGive(int value, int value2){
        int result = value -value2 / 2-1;
        return result;
    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String tree = "*";
        System.out.println("How many lines do you want?");

        int levels = obj.nextInt();
       

        for (int i = 0; i < levels * 2; i+=2) {

            for (int a = 0; a < i-1; a++) {
                System.out.print(tree);
            }
            System.out.println();
            for (int b = spaceToGive(levels, i); b > 0; b--) {
                System.out.print(" ");
            }

        }

    }

}
