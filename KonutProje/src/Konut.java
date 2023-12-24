import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Konut extends Adres implements Olustur {
    //burada addresable sınıfını extends ederek  displayInfo metodunu kullandık(override ettik)
    //yine Createable interfaceni implement ederek create metodunu override ettik.
    private Daire daire;

    public Konut(String address) {
        // constructor bir konutun adresini alır ve üst sınıfa (yani, Adressable sınıfına) bu adresi ileterek bir konut nesnesini oluşturur.
        super(address);
    }

    @Override
    public void olustur() {
        //create metodu ile konutun adresini alırız
        Scanner scanner = new Scanner(System.in);
        System.out.println("Konut Adresi: ");
        address = scanner.next();
    }

    public void setDaire(Daire daire) {
        //setDaire metodunu kullanarak bir daire nesnesini alır ve konuta ait dairenin bu nesne olarak atanmasını sağlarız.
        this.daire = daire;
    }

    @Override
    public void displayInfo() {
        //displayInfo metodu ile konutun bilgilerini de yazdırırız
        System.out.println("Konut Adresi: " + address);
        if (daire != null) {
            //burada eğer bir daire tanımlanmışsa daireinin biligilerini yazdırırız.
            System.out.println("Daire Bilgisi:");
            daire.displayInfo();
        }
    }
}