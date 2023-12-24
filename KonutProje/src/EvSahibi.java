import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class EvSahibi extends Adres implements Olustur {
    //burada addresable sınıfını extends ederek  displayInfo metodunu kullandık(override ettik)
    //yine Createable interfaceni implement ederek create metodunu override ettik.
    private String Adi;
    private String SoyAd;
    //burada evSahibinin ismini ve soy ismini alacak değişkenleri tanımladık.
    private Bina bina;
    //bina özelliği, ev sahibinin sahip olduğu binayı, temsil eder
    private List<Daire> daireList;
    //burada evSahibini sahip olduğu daireleri temsil edecek(List<daire>) değişkeni tanımladık

    public EvSahibi(String Adi, String SoyAd, Bina bina) {
        super("");
        this.Adi= Adi;
        this.SoyAd= SoyAd;
        this.bina = bina;
        this.daireList = new ArrayList<>();
    }

    @Override
    public void olustur() {
        //create metodu ile evSahibinin bilgilreini alırız
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ev Sahibi Adi: ");
        Adi = scanner.nextLine();
        System.out.println("Ev Sahibi Soyadi: ");
        SoyAd= scanner.nextLine();
    }

    public void addApartmen(Daire daire) {
        //addApartmen metodu ile ev sahibine ait bir daireyi daireList listesine ekler ve daireleri apartman numarasına göre sıralarız.
        daireList.add(daire);
        Collections.sort(daireList);
    }

    @Override
    public void displayInfo() {
        //addApartmen metodu ile ev sahibine ait bir daireyi daireList listesine ekler ve daireleri apartman numarasına göre sıralarız.
        System.out.println("Ev Sahibi Adi: " + Adi+ " " + SoyAd);
        System.out.println("Ev Sahibi Oldugu Bina:");
        bina.displayInfo();

        System.out.println("\nEv Sahibinin Daireleri:");
        for (Daire daire : daireList) {
            daire.displayInfo();
        }
    }
}