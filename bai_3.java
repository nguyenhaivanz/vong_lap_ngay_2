package ngay_2;
import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args){
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so a: ");
        a = input.nextInt();
        System.out.println("nhap so b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b ==0){
            System.out.println("ko co uoc chung lon nhat: ");
        }
        while(a != b){
            if(a < b)
                a = a - b;
            else
                b = b - a;
            System.out.println("yeu to chung lon nhat: " + a);
            break;
        }
    }
}

