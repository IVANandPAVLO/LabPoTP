
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class module2 {

    public static void main(String[] args) {
        System.out.println("Hello!!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tasks: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error! It's not number");
            sc.close();
            return;
        }
        int[] arr;
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Enter line and n: ");
                System.out.println(repeat(sc.next(), sc.nextInt()));
                break;

            case 2:
                System.out.print("Enter size of array: ");
                arr = new int[sc.nextInt()];
                System.out.println("Enter array: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(differenceMaxMin(arr));
                break;

            case 3:
                System.out.print("Enter size of array: ");
                arr = new int[sc.nextInt()];
                System.out.println("Enter array: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(isAvgWhole(arr));
                break;

            case 4:
                System.out.print("Enter size of array: ");
                arr = new int[sc.nextInt()];
                System.out.println("Enter array: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(Arrays.toString(cumulativeSum(arr)));
                break;

            case 5:
                System.out.println("Enter 3 number: ");
                System.out.println(getDecimalPlaces(sc.next()));
                break;

            case 6:
                System.out.println("Enter number: ");
                System.out.println(Fibonacci(sc.nextInt()));
                break;

            case 7:
                System.out.println("Enter line: ");
                System.out.println(isValid(sc.next()));
                break;

            case 8:
                System.out.println("Enter 2 number: ");
                System.out.println(isStrangePair(sc.next(), sc.next()));
                break;

            case 9:
            System.out.println("Select 1-isPrefix,2-isSuffix");
                if (sc.nextInt()==1) {
                    System.out.println("Enter 2 lines: ");
                    System.out.println(isPrefix(sc.next(), sc.next()));
                } else  {
                    System.out.println("Enter 2 lines: ");
                    System.out.println(isSuffix(sc.next(), sc.next()));
                }
                break;

            case 10:
                System.out.println("Enter 1 number: ");
                System.out.println(boxSeq(sc.nextInt()));
                break;

            default:
                System.out.println("Error! There is no such task");
                break;

        }

        sc.close();
    }

    public static String repeat(String s, int n) {
        String srep = "";
        for (int j = 0; j < s.length(); j++)
            for (int i = 1; i <= n; i++)
                srep += Character.toString(s.charAt(j));
        return (srep);
    }

    public static int differenceMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        return (max - min);
    }

    public static boolean isAvgWhole(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            arr[0] += arr[i];
        return ((arr[0] % arr.length) == 0);
    }

    public static int[] cumulativeSum(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--)
            for (int j = i; j >= 1; j--)
                arr[i] += arr[j - 1];
        return (arr);
    }

    public static int getDecimalPlaces(String s) {

        return (s.indexOf(".") != -1 ? s.length()-s.indexOf(".")-1 : 0);
    }

    public static int Fibonacci(int a) {
        return (a>1 ? Fibonacci(a-1)+Fibonacci(a-2): 1);
    }

    public static boolean isValid(String s) {
        boolean otv;
       otv = s.length()==5 ? true : false;
        for (int i = 0; i < s.length(); i++) 
            if (!(((int)s.charAt(i)<=57)&&(48<=(int)s.charAt(i))))
                otv = false;
        return (otv);
    }

    public static boolean isStrangePair(String s1,String s2) {
        return ((s1.charAt(0) == s2.charAt(s2.length()-1)&&(s1.charAt(0) == s2.charAt(s2.length()-1))) ? true : false);
    }

    public static boolean isPrefix(String s1,String s2) {
        StringBuffer sb2 = new  StringBuffer(s2);
        sb2.deleteCharAt(s2.length()-1);
        s2 = new String(sb2);
        return (s1.startsWith(s2));
    }

    public static boolean isSuffix(String s1,String s2) {
        StringBuffer sb2 = new  StringBuffer(s2);
        sb2.deleteCharAt(0);
        s2 = new String(sb2);
        return (s1.endsWith(s2));
    }

    public static boolean abcmath(int a, int b, int c) {
        return ((b > 0 ? abcmath(a + a, b - 1, c) : a % c == 0));
    }

    public static int boxSeq(int a){
        int otv = 0;
        if (a == 0){
            return (otv);
        }else{
        for (int i = 1; i <=a ;i++)
            if(i%2!=0)
                otv += 3;
            else
                otv -= 1;
        }
        return (otv);
    }
}
