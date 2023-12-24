public abstract class Adres {
    protected String address;

    public Adres(String address) {
        this.address = address;
    }
    //buradaki consctructora bir address atarız ve bu özelliği address özelliğine atarız
    //bu sayede bu sınıfı miras alanlar(extends) edenler (mesela Bina sınıfı) bu değişkene ulasarak binanın adresini atayabilir.
    public abstract void displayInfo();
    //buradaki displayInfo sayesinde bu sınıfı miras alanlar(extends) edenler bu metodu kullanarak kendi bilgilerini görüntülerler.

}