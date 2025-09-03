package yenipabka;

import java.util.Scanner;

public class MuqayiseMentiqi {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();

        boolean yetkinlikYasindadir = age > 18;
        System.out.println("Yetkinlik yaşına çatıb?: " + yetkinlikYasindadir);

        boolean teqaudYasidir = age == 65;
        System.out.println("Təqaüd yaşıdır?: " + teqaudYasidir);
        boolean islemeYasindadir = (age > 18) && (age < 60);
        System.out.println("İşləmə yaşı aralığındadır?: " + islemeYasindadir);

    }

}





