public class Main {

    public static void main(String[] args) {
    /*
	*
	* Burger Kralı Satış Uygulaması
      Bu uygulamanın amacı işletmenin hamburger satış işlemlerini gerçekleştirmesini sağlamaktır.
      Uygulama hamburger bilgilerini ve satış bilgilerini tutacaktır.
      Mağazada 3 çeşit hamburger bulunmaktadır.
      1)Sade Hamburger : Ekmek türü ve İçindeki Et çeşidi ve 4 tane extra bilgisi alabilir.
      Müşterinin istediği extra şeyler (sos, domates, peynir gibi) toplam fiyata dahil edilmelidir.

      2) Sağlıklı Burger : Bu burgerın ekmek türü kepeklidir. 6 taneye kadar ekstra ürün daha içerebilir.

      3) Baba Burger : Bu burger da patates kızartması ve içecek kendinden tanımlıdır. Ekstra ürün içeremez.

      Fiyatları kendiniz beliryebilirsiniz.
      Önemli olan bu yapıyı nesneye yönelimli programlama öğelerini kullanarak gerçekleştirebilmeniz..
*/
        Hamburger h1 = new Hamburger("Sade", "Beyaz Ekmek", "Kırmızı Et", 7.90);
        h1.ekleIlaveUrun1("Patates Kızartması", 3.30);
        h1.ekleIlaveUrun2("kola", 3.50);
        h1.ekleIlaveUrun3("sos", 1.20);
        h1.ekleIlaveUrun4("sogan", 0.20);
        System.out.println("TOPLAM TUTAR:" + h1.hamburgerBilgileri());

        SaglikliBurger sg = new SaglikliBurger("Beyaz", 4.90);
        sg.ekleIlaveUrun1("Patates Kızartması", 3.30);
        sg.ekleIlaveUrun2("kola", 3.50);
        sg.ekleIlaveUrun3("sos", 1.20);
        sg.ekleIlaveUrun4("sogan", 0.20);
        sg.ekleSaglikliUrun1("ton balıgı", 1.50);
        sg.ekleSaglikliUrun2("domates", 2.20);
        System.out.println("TOPLAM TUTAR:" + sg.hamburgerBilgileri());


        BabaBurger bg = new BabaBurger();
        bg.ekleIlaveUrun1("patates", 3.5);
        System.out.println("TOPLAM TUTAR:" + bg.hamburgerBilgileri());


    }
}
