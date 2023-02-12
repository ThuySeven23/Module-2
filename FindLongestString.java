import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestString {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi: ");
        String str = new Scanner(System.in).nextLine();

        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)> linkedList.getLast()){
                linkedList.add(str.charAt(i));
            }
        }
        for (Character item : linkedList ) {
            System.out.print(item);
        }
    }
}
