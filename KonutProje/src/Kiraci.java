import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Kiraci extends Adres implements Olustur {
    //burada addresable sınıfını extends ederek  displayInfo metodunu kullandık(override ettik)
    //yine Createable interfaceni implement ederek create metodunu override ettik.
    private String Adi;
    private String SoyAd;
    private String evSahibi;
    //burada kiracının ismini ve soy ismini ve evsahibi değişkenlerini tanımladık.
    // Bu özellikler, kiracının adını, soyadını ve ev sahibini temsil eder.


    public Kiraci(String Adi, String SoyAd, String evSahibi) {
        super("");
        this.Adi= Adi;
        this.SoyAd= SoyAd;
        this.evSahibi = evSahibi;

    }

    @Override
    public void olustur() {
        //create metodu ile kiracinin bilgilerini aldık
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiracı Adi: ");
        Adi= scanner.next();
        System.out.println("Kiraci Soyadi: ");
        SoyAd= scanner.next();

    }

    @Override
    public void displayInfo() {
        //burada ise displayInfo metodu ile bilgileri yazdırırız.
        System.out.println("Kiraci Adi: " + Adi+ " " + SoyAd);
    }
}