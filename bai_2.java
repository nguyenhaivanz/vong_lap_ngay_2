package ngay_2;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interesRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tien: ");
        money = input.nextDouble();
        System.out.println("nhap so thang: ");
        month = input.nextInt();
        System.out.println("nhap so lai theo nam: ");
        interesRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money* (interesRate/100)/12 *month;
            System.out.println("Total of interest: " + totalInterest);
        }

    }
}
