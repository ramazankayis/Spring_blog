package javase;

import java.util.Scanner;

public class HomeWork {
      /*
    27 Mart 2022 (1.DERS)
    interpreter nedir ?, compiler nedir ?
    JVM nedir ?
    JAR nedir  ? WAR nedir ?
    class nedir ? package nedir ?
    unicode character nedir ?
    Ascii character nedir ?
    Heap Memory , Stack Memory nedir ?
    Runtime (Çalışma zamanı) , compile(derleme zamanı)
     */


    //////////////////////////////////////////////////////////////
    //MATH
    // //Kullanıcıdan alınan 2 sayı için; Scanner
//    Toplama
//    Çıkarma
//    Çarpma
//    Bölme
//    1.sayı alt 2.sayı üst olacak üslü sayı pow
//    1.sayı mutlak değeri abs
//    2.sayınını karekökö  çıkan sayıyı yuvarlama sqrt , round

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen 1. sayı giriniz");
        int sayi = klavye.nextInt();

        System.out.println("Lütfen 2. sayı giriniz");
        int sayi2 = klavye.nextInt();
        int toplam = sayi + sayi2;
        double cıkarna = sayi - sayi2;
        double bolme = sayi / sayi2;
        double carpma = sayi * sayi2;

        System.out.println(" toplamı = " + toplam);
        System.out.println(" çıkarma = " + cıkarna);
        System.out.println(" bolme = " + bolme);
        System.out.println(" carpma = " + carpma);

        System.out.println("pow ="+ Math.pow(sayi,sayi2));
        System.out.println("abs = "+ Math.abs(toplam));
        System.out.println("karakoku = "+ Math.sqrt(toplam));
        System.out.println("yuvarlama = "+ Math.floor(bolme));

    }


}
