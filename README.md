# İlan Otomasyonu

## Araba İlanları Otomasyonu

#### 1. Modül : Ekleme, Silme, Güncelleme

![Alt Text](https://cdn.pbrd.co/images/HlB52uU.gif)


#### 2. Modül : Filtreleme

![alt text](https://cdn.pbrd.co/images/HlB4qZB.gif)


### Çalıştırma

Gerekli :

* Java 8
* MySQL
* phpmyAdmin, Workbench vb.
* Connector/J 8.0.11


1. NetBeans'te File > Open Project ile açabilirsiniz.

2. IMPORT_DATABASE klasörünün içerisinde bulunan sql uzantılı dosyayı
phpmyAdmin'de Import sekmesinden uygulayabilirsiniz. Tablolar, sütunlar ve
verilerin hepsi beraberinde gelmiş olacak.

3. Veritabani.java'da MySQL'den aldığınız gerekli bilgileri girmeniz gereken bir kısım var :

```java

public void baglan()throws SQLException{            
            // mysql veritabanimiza gerekli bilgilerle baglaniyoruz
            con =(Connection)DriverManager.getConnection ("jdbc:mysql://localhost:3306/VERİTABANI_İSMİ?useUnicode=true&characterEncoding=utf-8","KULLANICI_ADI","ŞİFRE");
            System.out.println("Baglandı");
        }

```

4. MySQL JDBC Driver'ı eklemeniz gerekiyor :

![alt text](https://cdn.pbrd.co/images/HlBd1Ek.gif)
