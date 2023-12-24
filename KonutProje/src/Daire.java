import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Daire extends Adres implements Olustur, Comparable<Daire> {
    //burada addresable sınıfını extends ederek  displayInfo metodunu kullandık(override ettik)
    //yine Createable interfaceni implement ederek create metodunu override ettik.
    //yine Comparable<Daire> arabirimini implemente ettik. Bu, compareTo metodunu tanımlamasını gerektirir.
    // bu metod, Daire nesnelerini karşılaştırmak ve sıralamak için kullandık.
    private String isim;
    private int apartmanNumber;
    //burada daireinin adını ve apartman numarası atayacağımız değişkenleri tanımladık

    public Daire(String isim, int apartmanNumber) {
        super("");
        this.isim= isim;
        this.apartmanNumber = apartmanNumber;
    }

    @Override
    public void olustur() {
        //burada create metodu ile kullanıcıdan daire adını ve apartman numarasını alırız
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daire Adi: ");
        isim= scanner.next();
        System.out.println("Apartman Numarasi: ");
        apartmanNumber = scanner.nextInt();
    }

    @Override
    public void displayInfo() {
        //burada displayInfo metodunu kullanarak daire adını ve apartman numarasını ekrana yazdırırız ve bu sayede bilgilerini görüntüleriz.
        System.out.println("Daire Adi: " + isim);
        System.out.println("Apartman Numarasi: " + apartmanNumber);
    }

    @Override
    public int compareTo(Daire daire) {
        //compareTo metodonu kullanarak apartman numaralarına göre karşılaştırma yapar.
        return Integer.compare(this.apartmanNumber, daire.apartmanNumber);
    }
}