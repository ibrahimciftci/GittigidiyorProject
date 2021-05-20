public class Main {
    public static void main(String[] args) {
        ECommerce eCommerce = new ECommerce();
        eCommerce.start(); // www.gittigidiyor.com sitesi açılır. Anasayfanın açıldığı kontrol edilir.
        eCommerce.loginPage(); // Siteye login olunur
        eCommerce.login(); // Siteye login olunur
        eCommerce.close();
        eCommerce.productSearch(); // Arama kutucuğuna bilgisayar kelimesi girilir
        eCommerce.page2(); // Arama sonuçları sayfasından 2.sayfa açılır.  2.sayfanın açıldığı kontrol edilir
        eCommerce.randomProduct();  // Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir
        eCommerce.addToCart(); // Seçilen ürün sepete eklenir
        eCommerce.cart(); // Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılı
        eCommerce.increase(); // Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
        eCommerce.delete(); // Ürün sepetten silinerek sepetin boş olduğu kontrol edilir
    }
}

