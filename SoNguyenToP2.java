package hien_thi_so_nguyen_to_nho_hon_100;

public class SoNguyenToP2 {
    public static void main(String[] args) {

        int count = 0;
        int numbers = 2;
        System.out.println("Cac so nguyen to duoc in ra nho hon 100: ");
        while (count < 100) {
            boolean check = true;
            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                if (numbers < 100){
                    System.out.print(numbers + " ");
                }
                count++;
            }
            numbers++;
        }

    }
}