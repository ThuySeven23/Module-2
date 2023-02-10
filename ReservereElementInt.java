package stack;

import java.util.Arrays;
import java.util.Stack;

public class ReservereElementInt {
    public static void main(String[] args) {
        Stack<Integer> numberInts = new Stack<>();
        int[] n = {1,2,6,8,9,10,12,15};
        for (int i = 0; i < n.length; i++) {
            numberInts.push(n[i]);
        }
        System.out.print("Mảng sau khi đảo ngược: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(numberInts.pop() + " ");
        }

    }
}
