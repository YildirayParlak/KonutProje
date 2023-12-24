import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Bina extends Adres implements Olustur {
    //burada addresable sınıfını extends ederek  displayInfo metodunu kullandık(override ettik)
    //yine Createable interfaceni implement ederek create metodunu override ettik.
    private int numberOfFloors;
    //burada binanın kac katlı oldugunu belirten değişkeni tanımlıyoruz.

    public Bina(String address, int numberOfFloors) {
        super(address);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void olustur() {
        //create metodu ile binanın biligileri alıyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bina Adresi: ");
        address = scanner.next();
        System.out.println("Kat Sayisi: ");
        numberOfFloors = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void displayInfo() {
        //burada ise displayInfo metodunu kullanarak binanın bilgilerini yazdırıyoruz.
        System.out.println("Bina Adresi: " + address);
        System.out.println("Kat Sayisi: " + numberOfFloors);
    }
}