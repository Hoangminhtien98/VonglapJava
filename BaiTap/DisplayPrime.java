package VongLapJava.BaiTap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong SNT muon hien thi: ");
        int quantity = scanner.nextInt();
        System.out.println("Cac so nguyen to do la: ");
        int count = 0;
        int number = 0;
        while (count < quantity){
            if (isPrime(number)) {
                System.out.println(number + "; ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number %i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
