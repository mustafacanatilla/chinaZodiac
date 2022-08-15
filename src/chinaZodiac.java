import java.util.Scanner;

public class chinaZodiac {
    public static void main(String[] args) {

        int year;

        Scanner input =new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz:");
        year = input.nextInt();

        switch (year % 12){

            case 0:
                System.out.print("Çin Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz : Koyun");
                break;

        }
/*
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz:");
        year = input.nextInt();


        if (year % 12 == 0) {
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
        } else if (year % 12 == 1) {
            System.out.print("Çin Zodyağı Burcunuz : Horoz");
        } else if (year % 12 == 2) {
            System.out.print("Çin Zodyağı Burcunuz : Köpek");
        } else if (year % 12 == 3) {
            System.out.print("Çin Zodyağı Burcunuz : Domuz");
        } else if (year % 12 == 4) {
            System.out.print("Çin Zodyağı Burcunuz : Fare");
        } else if (year % 12 == 5) {
            System.out.print("Çin Zodyağı Burcunuz : Öküz");
        } else if (year % 12 == 6) {
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");
        } else if (year % 12 == 7) {
            System.out.print("Çin Zodyağı Burcunuz : Tavşan");
        } else if (year % 12 == 8) {
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");
        } else if (year % 12 == 9) {
            System.out.print("Çin Zodyağı Burcunuz : Yılan");
        } else if (year % 12 == 10) {
            System.out.print("Çin Zodyağı Burcunuz : At");
        } else if (year % 12 == 11) {
            System.out.print("Çin Zodyağı Burcunuz : Koyun");
        } else {
            System.out.println("Hatalı Giriş Yapıldı!");
        }*/
    }
}
