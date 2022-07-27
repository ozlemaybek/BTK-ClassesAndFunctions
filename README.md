# BTK-ClassesAndFunctions

## Kotlin İle Android Mobil Uygulama Geliştirme Eğitimi Temel Seviye (BTK AKADEMİ) Notlarım

>"final" anahtar sözcüğü, değişkenin değerinin bir daha değiştirilmemesi için kullanılır.

>"public", tüm sınıflardan erişilebilir anlamına gelir.

>"this" içinde bulunduğumuz sınıfa referans verir.

>Kotlin'den önce:

![image](https://user-images.githubusercontent.com/109730490/180984851-32c92d48-d553-4f6f-9ef4-a880a11ea6ac.png)

>Kotlin ile gelen yeni özellik:

![image](https://user-images.githubusercontent.com/109730490/180985729-fcfd6a9a-107a-4764-bfb0-cb2db6abacd5.png)

>Kotlin'de 4 tane erişim seviyesi var:

- 1 ) public: Her yerden erişilebilir.

- 2 ) private: Sadece yazdığımız sınıf içinde kullanılabilir. Başka bir yerden erişilemez.

- 3 ) protected: Sınıf dosyasında başka bir sınıf varsa oradan erişilebilir.

- 4 ) internal: Sadece kendi modüllerimizin içinden erişilebilir. Yani proje içerisinde her yerden erişilebilir ancak harici bir kütüphane eklersek oradan erişilemez.

>Hiçbir şey ekelemdiysek default olarak public kabul edilir.

>Private bir değişkene sınıf dışından erişmenin yolu getter ve setter'lardır. Başka bir yazılımcının görebilmesini, bastırabilmesini ama değiştirememesini istiyorsam; getter'ı kullanırım ancak setter'ları yoruma alırım.

>Eğer bu hata mesajını alıyorsak null olan bir değere null değilmiş gibi davranıyoruz demektir:

![image](https://user-images.githubusercontent.com/109730490/181212596-f18722d0-378f-4013-8d7c-e4c06bd2f890.png)

#### Kaynaklar

- [BTK Akademi](https://www.btkakademi.gov.tr/portal/course/kotlin-ile-android-mobil-uygulama-gelistirme-egitimi-temel-seviye-10274)
