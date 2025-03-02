import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print length array: ");
        int len = scanner.nextInt();
        int[] array = new int[len];
        System.out.print("Print the array number for reverse: ");
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
            }
        int[] reversedArray = reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
        }
    public static int[] reverse(int[] array) {
        int len = array.length;
        int[] reversed = new int[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = array[len - 1 - i];
            }
        return reversed;
            }
    }
