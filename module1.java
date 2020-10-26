
import java.util.Arrays;
import java.util.Scanner;

public class module1 {

    public static void main(String[] args) {
        System.out.println("Hello!!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tasks: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error! It's not number");
            sc.close();
            return;
        }
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Enter 2 number: ");
                System.out.println(remainder(sc.nextFloat(), sc.nextFloat()));
                break;

            case 2:
                System.out.println("Enter 2 number: ");
                System.out.println(triArea(sc.nextFloat(), sc.nextFloat()));
                break;

            case 3:
                System.out.println("Enter 3 number: ");
                System.out.println(animals(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                break;

            case 4:
                System.out.println("Enter 3 number: ");
                System.out.println(profitableGamble(sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
                break;

            case 5:
                System.out.println("Enter 3 number: ");
                System.out.println(operation(sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
                break;

            case 6:
                System.out.println("Enter simvol: ");
                System.out.println(ctoa(sc.next().charAt(0)));
                break;

            case 7:
                System.out.println("Enter number: ");
                System.out.println(addUpTo(sc.nextInt()));
                break;

            case 8:
                System.out.println("Enter 2 number: ");
                System.out.println(nextEdge(sc.nextInt(), sc.nextInt()));
                break;

            case 9:
                System.out.print("Enter size of array: ");
                double[] arr = new double[sc.nextInt()];
                System.out.println("Enter array: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(sumOfCubes(arr));
                break;

            case 10:
                System.out.println("Enter 3 number: ");
                System.out.println(abcmath(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                break;

            default:
                System.out.println("Error! There is no such task");
                break;

        }

        sc.close();
    }

    public static int remainder(float a, float b) {
        return Math.round(a % b);
    }

    public static int triArea(float a, float b) {
        return Math.round(a * b / 2);
    }

    public static int animals(int a, int b, int c) {
        return (a * 2 + (b + c) * 4);
    }

    public static boolean profitableGamble(float prob, float prize, float pay) {
        return (prob * prize > pay);
    }

    public static String operation(float N, float a, float b) {
        return ((a + b == N) ? "added": (a - b == N) ? "subtracted" : (a * b == N) ? "multiple" : (a * b == N) ? "split" : "none");
    }

    public static int ctoa(char sym) {
        return (int) sym;
    }

    public static int addUpTo(int a) {
        return (a >= 1 ? a + addUpTo(a - 1) : 0);
    }

    public static long nextEdge(int a, int b) {
        return (long) (Math.sqrt(b * b + a * a - 2 * b * a * Math.cos(179)));
    }

    public static long sumOfCubes(double[] arr) {
        return (Math.round(arr.length > 1 ? sumOfCubes(Arrays.copyOf(arr, arr.length - 1)) + Math.pow(arr[arr.length - 1], 3): Math.pow(arr[arr.length - 1], 3)));
    }

    public static boolean abcmath(int a, int b, int c) {
        return ((b > 0 ? abcmath(a + a, b - 1, c) : a % c == 0));
    }

}
