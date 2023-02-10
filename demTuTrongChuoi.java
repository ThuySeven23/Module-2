package stack;

import java.util.*;

public class demTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì: ");
        String string = sc.nextLine().toLowerCase();
        String[] newString = string.split(" ");
        System.out.println(Arrays.toString(newString));

        Map<String , Integer> stringIntegerMap = new TreeMap<>();
        int i = 0;
        while (i < newString.length){
           if (stringIntegerMap.containsKey(newString[i])){
               stringIntegerMap.put(newString[i] , stringIntegerMap.get(newString[i]) + 1);
           }else {
                stringIntegerMap.put(newString[i] , 1);
           }
           i++;
        }
        System.out.println(stringIntegerMap);


    }
}
