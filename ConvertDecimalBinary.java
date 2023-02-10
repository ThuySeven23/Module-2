package stack;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập một số nguyên: ");
        int soNguyen = sc.nextInt();
        
        while (soNguyen > 0){
            int soDu = soNguyen % 2;
            stack.push(soDu);
            soNguyen /= 2;
        }

        System.out.print("Sang số nhị phân: ");
        int n = stack.size();
        for (int i = 0; i < n ; i++) {
            System.out.print(stack.pop());
        }
        System.out.println();

        
        
        
        
        
    }
}
