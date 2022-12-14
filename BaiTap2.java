package doc_so_thanh_chu;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        System.out.println("Số bạn cần muốn đọc:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String variableNumber1 = new String();
        String variableNumber2 = new String();
        String variableNumber3 = new String();

        if (number >= 0 && number < 10) {
            switch (number)
            {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Out of ability");
            }
        }

        if (number >= 10 && number < 20){
            switch (number - 10){
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fiveteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        }

        if (number >= 20 && number < 100){

            switch (number / 10){
                case 2:
                    variableNumber1 = "twenty ";
                    break;
                case 3:
                    variableNumber1 = "thirty ";
                    break;
                case 4:
                    variableNumber1 = "fourty ";
                    break;
                case 5:
                    variableNumber1 = "fifty ";
                    break;
                case 6:
                    variableNumber1 = "sixty ";
                    break;
                case 7:
                    variableNumber1 = "seventy ";;
                    break;
                case 8:
                    variableNumber1 = "eighty ";
                    break;
                case 9:
                    variableNumber1 = "ninety ";
                    break;
            }
            //------------------------------------
            switch (number % 10){
                case 1:
                    variableNumber2 = "one";
                    break;
                case 2:
                    variableNumber2 = "two";
                    break;
                case 3:
                    variableNumber2 = "three";
                    break;
                case 4:
                    variableNumber2 = "four";
                    break;
                case 5:
                    variableNumber2 = "five";
                    break;
                case 6:
                    variableNumber2 = "six";
                    break;
                case 7:
                    variableNumber2 = "seven";
                    break;
                case 8:
                    variableNumber2 = "eight";
                    break;
                case 9:
                    variableNumber2 = "nine";
                    break;
            }
            System.out.print( variableNumber1 + variableNumber2 );
        }

        if (number >= 100) {
            switch (number / 100){
                case 1:
                    variableNumber1 = "one hundred and ";
                    break;
                case 2:
                    variableNumber1 = "two hundred and ";
                    break;
                case 3:
                    variableNumber1 = "three hundred and ";
                    break;
                case 4:
                    variableNumber1 = "four hundred and ";
                    break;
                case 5:
                    variableNumber1 = "five hundred and ";
                    break;
                case 6:
                    variableNumber1 = "six hundred and ";
                    break;
                case 7:
                    variableNumber1 = "seven hundred and ";
                    break;
                case 8:
                    variableNumber1 = "eight hundred and ";
                    break;
                case 9:
                    variableNumber1 = "nine hundred and ";
                    break;
            }
            //------------------------------------

            switch (number % 100 / 10){
                case 1:
                    switch (number % 100 % 10){
                        case 1:
                            variableNumber2 = "elven ";
                            break;
                        case 2:
                            variableNumber2 = "twelve ";
                            break;
                        case 3:
                            variableNumber2 = "thirteen ";
                            break;
                        case 4:
                            variableNumber2 = "fourteen ";
                            break;
                        case 5:
                            variableNumber2 = "fifteen ";
                            break;
                        case 6:
                            variableNumber2 = "sixteen ";
                            break;
                        case 7:
                            variableNumber2 = "seventeen ";
                            break;
                        case 8:
                            variableNumber2 = "eighteen ";
                            break;
                        case 9:
                            variableNumber2 = "nineteen ";
                            break;
                    }
                    break;
               case 2:
                    variableNumber2 = "twenty ";
                    break;
                case 3:
                    variableNumber2 = "thirty ";
                    break;
                case 4:
                    variableNumber2 = "fourty ";
                    break;
                case 5:
                    variableNumber2 = "fifty ";
                    break;
                case 6:
                    variableNumber2 = "sixty ";
                    break;
                case 7:
                    variableNumber2 = "seventy ";;
                    break;
                case 8:
                    variableNumber2 = "eighty ";
                    break;
                case 9:
                    variableNumber2 = "ninety ";
                    break;
            }
            //------------------------------------
            switch (number % 10){
                case 1:
                    variableNumber3 = "one";
                    break;
                case 2:
                    variableNumber3 = "two";
                    break;
                case 3:
                    variableNumber3 = "three";
                    break;
                case 4:
                    variableNumber3 = "four";
                    break;
                case 5:
                    variableNumber3 = "five";
                    break;
                case 6:
                    variableNumber3 = "six";
                    break;
                case 7:
                    variableNumber3 = "seven";
                    break;
                case 8:
                    variableNumber3 = "eight";
                    break;
                case 9:
                    variableNumber3 = "nine";
                    break;
            }
           if (number % 100 / 10 == 1)
           {
               System.out.println(variableNumber1 + variableNumber2);
           }
           else {
               System.out.println( variableNumber1 + variableNumber2 + variableNumber3 );
           }




        }
    }
}
