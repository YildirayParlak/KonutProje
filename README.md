# KonutProje
YAZILIM MÜHENDİSLİĞİ BÖLÜMÜ NESNEYE YÖNELİK PROGRAMLAMA DERSİ 2. KISA  SINAV 1. ÖDEVİ

##  Kodun Amacı:

Bu Java programının genel amacı, bir konut sistemini olusturmak ve bu sistemde bulunan çeşitli varlıklar arasındaki ilişkileri modellemektir. Programın ana işlevleri şunlarını içerir:

KONUT varlıklarının olusturulması :

Daireler, konutlar, binalar, kiracılar ve ev sahipleri gibi gayrimenkul varlıkları oluşturulur.

**Varlıklar Arası İlişkilerin Kurulması:**

- Konut nesneleri içinde bir daireyi barındırır.
- Ev sahibi, birden çok daireye sahip olabilir ve bu daireleri belirli bir sırayla tutar.
- Kiracılar ev sahiplerine ve binalara bağlanır.

**Bilgilerin Görüntülenmesi:**

- Oluşturulan varlıkların bilgileri ekrana yazdırılır..

**Kullanıcıdan Bilgi Alınması ve İşlem Yapılması:**

- Program,create metodu ile gereklli bilgileri alarak (daire, konut, bina, kiracı ve ev sahibi gibi )bilgileri alarak bu varlıkları oluşturur.

sonra Kullanıcıdan alınan bilgilerle varlıklar arasındaki ilişkiler kurulur.

**Sıralama ve Karşılaştırma:**

- Daireler apartman numaralarına göre sıralanabilir.

Program, KOnut sistemi üzerine bir simulasyon yaparak, farklı varlıklar arasındaki ilişkileri gösterir ve kullanıcıdan alınan bilgilerle bu ilişkileri kurar.

##Nasıl Kullanılacağı: 
bu programı kullanmak için bir java derleyicisine ihtiyacınız var 

sonra proje calıstırdığınızda ilk önce sizden daire adını isteyecek 

sonra apartman numarası,Konut Adresi,Bina Adresi,Kat Sayisi,Kiraci Adi,Kiraci Soyadi,Ev Sahibi Adi,Ev Sahibi Soyadi  bilgilrei alacak ondan sonra bütn bbu bilgileri

alt alta düzenli bir şekilde hepsini yazdıracak.

##Kodun Algoritması:

bu java kodu bir gayrimenkul yönetim sistemini simüle eden bir örnek uygulamadır

**`Createable`** interface’i: Bu arayüz, **`create`** adında bir metot içerir ve bu metot, implemente eden sınıfların bir nesne oluştururken kullanıcıdan gerekli bilgilerin almasını sağlar.örenğin:evsahibinin adını 

**`Adressable`** soyut sınıfı: Adres bilgisini içerir ve **`displayInfo`** adında soyut bir metot içerir. Bu metot ile bilgileri yazdırırız.

**`Daire`**, **`Konut`**, **`Bina`**, **`Kiraci`** ve **`EvSahibi`** sınıfları:

bu sınıflar **Adressable sınıfını extends eder.aynı zamanda `Createable` interface’ini implemente eder.**

Sınıflar, kendi özel bilgilerini (ad, soyad, apartman numarası vb.) içeren özelliklere sahiptir.

- **`displayInfo`** metodu, sınıfa özgü bilgileri ekrana yazdırarak bilgileri görüntüler.
- **`Daire`** sınıfı, **`Comparable<Daire>`** arayüzünü implemente eder ve apartman numaralarına göre sıralanabilir.

**`Main`** sınıfı::

**`Daire`**, **`Konut`**, **`Bina`**, **`Kiraci`** ve **`EvSahibi`** sınıflarından nesneler oluşturuz

- create** metotları çağrılarak kullanıcıdan giriş alınır ve nesneler oluşturulur.
- Nesneler arasında bağlantılar kurulur: Bir konutun içinde bir daire, bir ev sahibinin sahip olduğu daireler belirlenir.
- **`displayInfo`** metotları çağrılarak bilgiler ekrana yazdırılır.
