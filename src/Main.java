import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double km ;
        int yas;
        String cinsiyet;
        int  yolculukTipi;
        double kmBasi=0.10;
        double yindirim;
        double iucret;
        double yindirim2;
        double total;

        Scanner input = new Scanner(System.in);

        System.out.println("Uçacağınız Mesafeyi Giriniz: ");
        km = input.nextDouble();
        if (km<=0)
        {
            System.out.println("Km türünü pozitif giriniz.");
            System.out.println("Uçacağınız Mesafeyi Giriniz: ");
            km = input.nextDouble();
        }
        double ucret = km * kmBasi;
        System.out.println("Normal Tutar: "+(ucret));

        System.out.println( "Yaşınız: ");
        yas = input.nextInt();
        if (yas<0)
        {
            System.out.println("Yaşı pozitif giriniz.");
            System.out.println( "Yaşınız: ");
            yas = input.nextInt();
        }

        System.out.println("Cinsiyetiniz: -- (Erkek: E ) -- (Kadın: K)");
        cinsiyet = input.next();

        System.out.println("Yolculuk Tipiniz: -- (Tek Yön İse 1) -- (Gidiş Dönüş İse 2)");
        yolculukTipi= input.nextInt();
        if(yolculukTipi !=1 && yolculukTipi!=2)
        {
            System.out.println("Yanlış Girdiniz Tekrar Deneyiniz");
            System.out.println("Yolculuk Tipiniz: -- (Tek Yön İse 1) -- (Gidiş Dönüş İse 2)");
            yolculukTipi= input.nextInt();
        }


        switch (yolculukTipi) {
            case 2:


                if (yas < 12)
                {  yindirim = ucret*0.50;
                    iucret = ucret - yindirim;
                    yindirim2 = iucret*0.20;
                    total = (iucret-yindirim2)*2;
                    System.out.println("Ucretiniz: "+ total );
                }
                else if (yas >= 12 && yas <= 24)
                {   yindirim = ucret*0.10;
                    iucret = ucret - yindirim;
                    yindirim2 = iucret*0.20;
                    total = (iucret-yindirim2)*2;
                    System.out.println("Ucretiniz: " + total );
                }
                else if (yas > 65)
                {   yindirim = ucret*0.30;
                    iucret = ucret - yindirim;
                    yindirim2 = iucret*0.20;
                    total = (iucret-yindirim2)*2;
                    System.out.println("Ucretiniz: " + total );
                }
                else if (yas>42 &&yas<=65)
                {
                    System.out.println("Ucretiniz: "+ucret*0.20);
                }
                    break;

            case 1:
                if (yas < 12)
                {  yindirim = ucret*0.50;

                    iucret = ucret - yindirim;
                    System.out.println("Ucretiniz: "+ iucret );
                }
                else if (yas >= 12 && yas <= 24)
                {   yindirim = ucret*0.10;
                    iucret = ucret - yindirim;
                    System.out.println("Ucretiniz: " + iucret );
                }
                else if (yas > 65)
                {   yindirim = ucret*0.30;
                    iucret = ucret - yindirim;
                    System.out.println("Ucretiniz: " + iucret );
                }
                else if (yas>24 &&yas<=65)
                {
                    System.out.println("Ucretiniz: "+ucret);
                }
                break;
            default:
                System.out.println("Hata");
                break;


        }

    }
}