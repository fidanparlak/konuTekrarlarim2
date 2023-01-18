package day01;

import java.util.Scanner;

public class C10_While_Sifre {
    //  Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
    // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
    // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin

    // - ilk harf kucuk harf olmali
    // - son karakter rakam olmali
    // - sifre bosluk icermemeli
    // - uzunlugu en az 10 karakter olmali

    // sifre kontrolunu bir method'da yapip true / false dondurun
    // main method'da donen sonucu kontrol edip
    // "basari ile olusturuldu" yazincaya kadar
    // sifreyi tekrar tekrar isteyin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        boolean tekrarSifreIste= true;
            String sifre="";

            while (tekrarSifreIste){

                System.out.println("Lutfen sifrenizi giriniz");

                sifre= scan.nextLine();

                if (sifreKontrolEt(sifre)){ // sifre kontrolu true donerse sifre basarili demektir
                    System.out.println("Sifre basari ile olusturuldu");
                    // break;
                    tekrarSifreIste=false; // break veya bu kod yazilabilir
                }

            }

}


    private static boolean sifreKontrolEt(String sifre) {

        int flag = 0;

        // - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            // ilk harf kucuk degilse hatayi yazdir
            // sifre.charAt(0)<'a' || sifre.charAt(0)>'z'
            System.out.println("Ilk harf kucuk harf olmali");
            flag++; // bir ceza puani aldi
        }

        // - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            // son karakter rakam degilse rapor yazdir
            System.out.println("Son karakter rakam olmali");
            flag++;
        }
        // - sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }
        // - uzunlugu en az 10 karakter olmali

        if (!(sifre.length() >= 10)) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }

            if (flag==0){
                return true;
            }else{
                return false;
            }


        }
    }
