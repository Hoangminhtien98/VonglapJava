package VongLapJava.BaiTap;

import java.util.Scanner;

public class DisplayPrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so ban muon gioi han: ");
        int limited = scanner.nextInt();
        System.out.println("Cac so nguyen to la: ");
        int number = 0;
        while (number < limited) {
            if (isPrime(number)){
                System.out.println(number + "; ");
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2){
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
