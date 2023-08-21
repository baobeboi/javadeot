package javabai21_25;

import java.util.Scanner;

public class j25_do_while {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap vao n > 0 ");
            n = sc.nextInt();
        } while (n<=0);
    }
}
