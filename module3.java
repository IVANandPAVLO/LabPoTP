
import java.util.Scanner;

import java.lang.String;

public class module3 {

    public static void main(String[] args) {
        System.out.println("Hello!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tasks: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error! It's not number");
            sc.close();
            return;
        }
        int[] arr1;
        int[] arr2;
        switch (sc.nextInt()) {

            case 1:
                System.out.println("Enter 3 number: ");
                System.out.println(solutions(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                break;

            case 2:
                sc.nextLine();
                System.out.println("Enter Line: ");
                System.out.println(findZip(sc.nextLine()));
                break;

            case 3:
                System.out.println("Enter number: ");
                System.out.println(checkPerfect(sc.nextInt()));
                break;

            case 4:
                sc.nextLine();
                System.out.println("Enter line: ");
                System.out.println(flipEndChars(sc.nextLine()));
                break;

            case 5:
                sc.nextLine();
                System.out.println("Enter line: ");
                System.out.println(isValidHexCode(sc.nextLine()));
                break;

            case 6:
                System.out.print("Enter size of 1 array: ");
                arr1 = new int[sc.nextInt()];
                System.out.println("Enter array: ");
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = sc.nextInt();
                }
                System.out.print("Enter size of 2 array: ");
                arr2 = new int[sc.nextInt()];
                System.out.println("Enter array: ");
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = sc.nextInt();
                }

                System.out.println(same(arr1, arr2));
                break;

            case 7:
                System.out.println("Enter number: ");
                System.out.println(isKaprekar(sc.nextInt()));
                break;

            case 8:
                System.out.println("Enter line: ");
                System.out.println(longestZero(sc.next()));
                break;

            case 9:
                System.out.println("Enter number: ");
                System.out.println(nextPrime(sc.nextInt()));
                break;
            case 10:
                System.out.println("Enter 3 number: ");
                System.out.println(rightTriangle(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                break;

            default:
                System.out.println("Error! There is no such task");
                break;

        }

        sc.close();
    }

    public static int solutions(int a, int b, int c) {
        return (b * b - 4 * a * c == 0 ? 1 : (b * b - 4 * a * c > 0) ? 2 : 0);
    }

    public static int findZip(String s) {
        return (s.indexOf("zip", s.indexOf("zip") + 1));
    }

    public static boolean checkPerfect(int a) {
        int sum = 0;
        for (int i = a - 1; i >= 1; i--)
            if (a % i == 0)
                sum += i;

        return (sum == a);
    }

    public static String flipEndChars(String s) {
        String ss = "";
        if (s.length() == 1)
            return ("Incompatible.");
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return ("Two's a pair.");
        ss += s.charAt(s.length() - 1);
        for (int i = 1; i <= s.length() - 2; i++)
            ss += s.charAt(i);
        ss += s.charAt(0);
        return (ss);
    }

    public static boolean isValidHexCode(String s) {
        boolean otv = s.charAt(0) == '#' && s.length() == 7;
        for (int i = 1; i < s.length(); i++)
            if (((int) s.toUpperCase().charAt(i) < 48) || ((int) s.toUpperCase().charAt(i) > 70)
                    || (s.charAt(i) > 57 && s.charAt(i) < 56))
                otv = false;
        return (otv);
    }

    public static boolean same(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j <= i; j++) {
                if (i == j)
                    count++;
                if (arr1[i] == arr1[j])
                    break;

            }
        for (int i = 0; i < arr2.length; i++)
            for (int j = 0; j <= i; j++) {
                if (i == j)
                    count--;
                if (arr2[i] == arr2[j])
                    break;

            }

        return (count == 0);
    }

    public static boolean isKaprekar(int a) {

        return (a * a / (int) (Math.pow(10, (int) (String.valueOf(a * a).length() / 2.0 + 0.5)))
                + a * a % (int) (Math.pow(10, (int) (String.valueOf(a * a).length() / 2.0 + 0.5))) == a);
    }

    public static String longestZero(String s) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                count++;
            if (s.charAt(i) == '1')
                count = 0;
            if (count > max)
                max = count;
        }
        String otv = "";
        for (int i = 0; i < max; i++)
            otv += '0';
        return (otv);
    }

    public static int nextPrime(int a) {
        boolean flag;
        while (true) {
            flag = true;
            for (int i = a - 1; i > 1; i--)
                if (a % i == 0)
                    flag = false;
            if (flag)
                return (a);
            else
                a++;
        }
    }

    public static boolean rightTriangle(int a, int b, int c) {
        return (c * c == a * a + b * b || a * a == b * b + c * c || b * b == a * a + c * c);
    }
}
