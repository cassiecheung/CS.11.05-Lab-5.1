import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ArrayUtility {

    public static void print(int[] array) {
        for (int x = 0; x < array.length; x++) {
            if(x!=0) System.out.print(", ");
            System.out.print(array[x]);
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum = sum + array[x];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum = sum + array[x];
        }
        double average = (double) sum/array.length;
        int spare = (int)(average * 100);
        double finalAverage = (double)spare/100;
        return finalAverage;
    }

    public static int minimum(int[] array) {
        int spare = 1000;
        for (int x = 0; x < array.length; x++) {
            if (array[x] < spare) {
                spare = array[x];
            }
        }
        return spare;
    }

    public static int maximum(int[] array) {
        int spare = -1000;
        for (int x = 0; x < array.length; x++) {
            if (array[x] > spare) {
                spare = array[x];
            }
        }
        return spare;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int x = 0; x < array.length; x++) {
            if (array[x] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] arrayReverse = new int[array.length];
        for (int x = array.length - 1; x >= 0; x--) {
            arrayReverse[array.length - x - 1] = array[x];
        }
        return arrayReverse;
    }

    public static void reverseTwo(int[] array) {
        for (int x = 0; x < array.length / 2; x++){
            int temp = array[x];
            array[x] = array[array.length-x-1];
            array[array.length-x-1] = temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int x = 0; x <array.length; x++){
            if (array[x] == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int x = 0; x < array.length; x++) {
            if (array[x].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int x = 0; x < array.length; x++) {
            array[x] = array[x] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int x = 0; x < array.length; x++) {
            array[x] = array[x] * n;
        }
    }

    public static String toString(int[] array) {
        String print = "";
        for (int x = 0; x < array.length; x++) {
            if (x == array.length - 1) {
                print = print + array[x];
                break;
            }
            print = print + array[x] + ", ";
        }
        return print;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++){
                if (x == y) continue;
                if (array[x] + array[y] == num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int keep = array[array.length-1];
        for (int x = array.length - 1; x >= 1; x--) {
            array[x] = array[x - 1];
        }
        array[0]=keep;
    }

    public static void shiftLeft(int[] array) {
        int keep = array[0];
        for (int x = 0; x < array.length - 1; x++) {
            array[x] = array[x + 1];
        }
        array[array.length - 1] = keep;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int x = 0; x < n; x++) {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int x = 0; x < n; x++) {
            shiftLeft(array);
        }
    }
}
