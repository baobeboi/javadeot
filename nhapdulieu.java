package javabai8;

import java.util.Scanner;

public class nhapdulieu {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);quan trong
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho va ten");
        String hoVaTen = sc.nextLine();
        System.out.println("nhap tuoi cua ban");
        int age = sc.nextInt();
        System.out.println("----");
        System.out.println("ho va ten" + hoVaTen);
        System.out.println("tuoi cua ban" + age);

    }
}
