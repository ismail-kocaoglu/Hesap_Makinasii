import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int a,b,secim;

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        a=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapılacak işlemi seçiniz: ");
        secim=input.nextInt();


        switch (secim){
            case 1:
                System.out.println("Sonuç="+(a+b));
                break;
            case 2:
                System.out.println("Sonuç="+(a-b));
                break;
            case 3:
                System.out.println("Sonuç="+(a*b));
                break;
            case 4:
                if (b!=0){
                    System.out.println("Sonuç="+(a/b));
                }else {

                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız!");

        }










        
        
        
        




    }



}
