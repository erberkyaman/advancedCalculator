import java.util.Scanner;

public class advancedCalculator {
    static void addition(){
        int n,result=0,r;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
        r = input.nextInt();
        for (int i=1;i<=r;i++) {
        System.out.print(i+". Sayıyı Giriniz: ");
        n = input.nextInt();
        result+=n;
        }

        System.out.print("İşlem Sonucu : "+result);
    }

    static void subs(){
        int n,result=0,r;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
        r = input.nextInt();
        for (int i=1;i<=r;i++) {
            System.out.print(i+". Sayıyı Giriniz: ");
            n = input.nextInt();
            if(i==1) {
                result += n;
                continue;
            }

            result-=n;
        }

        System.out.print("İşlem Sonucu : "+result);
    }
    static void multi(){
        int n,result=1,r;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
        r = input.nextInt();
        for (int i=1;i<=r;i++) {
            System.out.print(i+". Sayıyı Giriniz: ");
            n = input.nextInt();

            result*=n;
        }

        System.out.print("İşlem Sonucu : "+result);
    }
    static void division(){
        double n,result=0.0;
        int r;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
        r = input.nextInt();
        for (int i=1;i<=r;i++) {
            System.out.print(i+". Sayıyı Giriniz: ");
            n = input.nextInt();
            if (n==0){
                System.out.print("0'la Bölme İşlemi Sağlanamaz");
            }

            result/=n;
        }

        System.out.print("İşlem Sonucu : "+result);
    }
    static void expo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri Giriniz :");
        int base = input.nextInt();
        System.out.print("Üs değeri Giriniz :");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.print("Sonuç : " + result);

    }
    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mod(){
        Scanner input= new Scanner(System.in);
        int n1,n2;
        System.out.print("1. Sayıyı Giriniz:");
        n1= input.nextInt();
        System.out.print("2. Sayıyı Giriniz:");
        n2= input.nextInt();
        System.out.println("Sonuç : " + n1%n2);
    }
    static void rectangle(){
        Scanner input= new Scanner(System.in);
        int n1,n2;
        System.out.print("1. Sayıyı Giriniz:");
        n1= input.nextInt();
        System.out.print("2. Sayıyı Giriniz:");
        n2= input.nextInt();
        System.out.println("Çevre : " + (2*(n1+n2)));
        System.out.println("Alanı : " + (n1*n2));
    }
    public static void main(String[] args) {
        int selection;

        Scanner input = new Scanner(System.in);
        do{
        System.out.println("****İşlem Seçimi Yapın****");
        System.out.println("0-Çıkış\n1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Üslü Sayı Hesaplama\n6-Faktoriyel Hesapalama\n7-Mod Alma\n8-Dikdörtgen Alan ve Çevre Hesaplama");
        selection=input.nextInt();


        switch (selection){
            case 0:
                break;
            case 1:
                addition();
                break;
            case 2:
                subs();
                break;
            case 3:
                multi();
                break;
            case 4:
                division();
                break;
            case 5:
                expo();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mod();
                break;
            case 8:
                rectangle();
                break;
            default:
                System.out.print("Hatalı İşlem Seçimi Yapıldı!");
        }
        }while (selection!=0);


    }
}
