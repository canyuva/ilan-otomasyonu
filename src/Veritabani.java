
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class Veritabani {
    
        // Connection sınıfından bağlantıyı kontrol etmek için nesne oluşturuyoruz.
    
         Connection con;
         
         // Nesne oluşturmak için gerekli yapıcı method
         
         public Veritabani(){
             
         }
         
        public void baglan()throws SQLException{            
            // mysql veritabanimiza gerekli bilgilerle baglaniyoruz
            con =(Connection)DriverManager.getConnection ("jdbc:mysql://localhost:3306/VERITABANI_ISMI?useUnicode=true&characterEncoding=utf-8","kullanici_adi","sifre");
            System.out.println("Baglandı");
        }
        
        public void baglantiYap() throws ClassNotFoundException{
            // Hangi baglanti driverini kullanilacagini seciyoruz
            Class.forName("com.mysql.jdbc.Connection");
        }
        
        public void baglantiyiKes()throws SQLException{            
            // bağlantıyı kesiyoruz..
            con.close();
            System.out.println("Bağlantı kesildi");
        }
        
        /*----------------------------------------------------------------
        
        Tabloya veri eklemek için INSERT INTO anahtar kelimesini kullanıyoruz. Ayrıntı:
        https://www.w3schools.com/sql/sql_insert.asp
        
         Sorguyu uygulamak için TextField'lardan gelen verileri sorguya eklememiz gerekli.
        Bunun için 2 yöntem var : 1.'si PreparedStatement 2.'si Statement.
        PreparedStatement'te TextFielddan çekilen verileri ayrı methodlarla sorguya ekliyoruz.
        Statement'te ise String değişkenine ""+tf.getText()"" gibi içine entegre ediyoruz.
        
        Akışı şu şekilde :
        1- Bağlantı kurulur baglan() ile. 
        2- Statement nesnesi ile MySQL'e göndereceğimiz sorguları değişkenin ExecuteUpdate methoduyla gönderiyoruz.
        Tabi parametre olarak nesne alıyoruz türüne göre.
        
        3- ExecuteUpdate bize kaç satırın etkilendiğini döndürür. Bunun için onu int
        değişkenine atıyoruz. Ve fonksiyonu onunla return ediyoruz.
        
        Ve her işlem sonunda bağlantıyı kesiyoruz.
        
        ----------------------------------------------------------------*/
        
        public int ekleIlan(Ilan ilan)throws SQLException{
            //1
            
            baglan();
            
            
            //2
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "INSERT INTO Tbl_Ilan(Ilan_Adi,Ilan_Fiyat,Ilan_Km,Ilan_Tarih,Ilan_ArabaID,Ilan_SehirID) "
                    + "VALUES('"+ilan.getIlanAdi()+"','"+ilan.getFiyat()+"','"+ilan.getKm()+"','"+
                    ilan.getTarih()+"','"+ilan.getArabaID()+"','"+ilan.getSehirID()+"')";
            
            
            //3 
            int res = stmt.executeUpdate(sorgu);
            

           System.out.println(sorgu);
           //4
           baglantiyiKes();         
            return res;
        }
        
        public int ekleAraba(Araba arb)throws SQLException{
            baglan();

            Statement stmt = (Statement) con.createStatement();
            String sorgu = "INSERT INTO Tbl_Araba(Araba_Marka,Araba_Model,Araba_RenkID,Araba_VitesTuruID,Araba_YakitTuruID) "
                    + "VALUES('"+arb.getMarka()+"','"+arb.getModel()+"','"+arb.getRenkID()+"','"+arb.getVitesID()+"','"+arb.getYakitID()+"')";
            
            int res = stmt.executeUpdate(sorgu);
            
           System.out.println(""+sorgu);
           
           baglantiyiKes();      
           return res;
        }
        
        public int ekleRenk(Renk renk) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "INSERT INTO Tbl_Renk(Renk) VALUES('"+renk.getRenk()+"')";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int ekleVites(Vites vites) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "INSERT INTO Tbl_VitesTuru(Vites_Turu) VALUES('"+vites.getVites()+"')";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int ekleYakit(Yakit yakit) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "INSERT INTO Tbl_YakitTuru(Yakit_Turu) VALUES('"+yakit.getYakit()+"')";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int ekleSehir(Sehir sehir) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "INSERT INTO Tbl_Sehir(Sehir) VALUES('"+sehir.getSehirAdi()+"')";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        /*-----------------------------------------------
        
        Veri güncellemesi UPDATE - SET anahtar kelimeleri ile yapılır. Ayrıntı :
        https://www.w3schools.com/sql/sql_update.asp
        
        Ekle yönteminin aynı yazım tarzı..
        
        
        ------------------------------------------------*/
        
        
        public int guncelleIlan(Ilan ilan,int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "UPDATE Tbl_Ilan SET Ilan_Adi='"+ilan.getIlanAdi()+"', Ilan_Fiyat='"+ilan.getFiyat()+"'"
                    + ", Ilan_Km='"+ilan.getKm()+"', Ilan_Tarih='"+ilan.getTarih()+"',"
            + "Ilan_ArabaID='"+ilan.getArabaID()+"', Ilan_SehirID='"+ilan.getSehirID()+"' WHERE IlanID='"+id+"'";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int guncelleAraba(Araba arb,int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "UPDATE Tbl_Araba SET Araba_Marka='"+arb.getMarka()+"', Araba_Model='"+arb.getModel()+"'"
                    + ", Araba_VitesTuruID='"+arb.getVitesID()+"', Araba_YakitTuruID='"+arb.getYakitID()+"',"
            + "Araba_RenkID='"+arb.getRenkID()+"' WHERE ArabaID='"+id+"'";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int guncelleRenk(Renk renk,int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "UPDATE Tbl_Renk SET Renk='"+renk.getRenk()+"' WHERE ArabaID='"+id+"'";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int guncelleYakit(Yakit yakit,int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "UPDATE Tbl_YakitTuru SET Yakit_Turu='"+yakit.getYakit()+"' WHERE YakitTuruID='"+id+"'";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int guncelleSehir(Sehir sehir,int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "UPDATE Tbl_Sehir SET Sehir='"+sehir.getSehirAdi()+"' WHERE SehirID='"+id+"'";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int guncelleVites(Vites vites,int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "UPDATE Tbl_VitesTuru SET Vites_Turu='"+vites.getVites()+"' WHERE VitesTuruID='"+id+"'";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        /*-----------------------------------------------
        
        Veri silinmesi DELETE FROM anahtar kelimeleri ile yapılır. Ayrıntı :
        https://www.w3schools.com/sql/sql_delete.asp
        
        Ekle yönteminin aynı yazım tarzı..
        
        
        ------------------------------------------------*/
        
        public int silIlan(int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "DELETE FROM Tbl_Ilan WHERE IlanID="+id+"";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int silAraba(int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "DELETE FROM Tbl_Araba WHERE ArabaID="+id+"";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int silVites(int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "DELETE FROM Tbl_VitesTuru WHERE VitesTuruID="+id+"";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int silYakit(int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "DELETE FROM Tbl_YakitTuru WHERE YakitTuruID="+id+"";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
                
        public int silRenk(int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "DELETE FROM Tbl_Renk WHERE RenkID="+id+"";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        public int silSehir(int id) throws SQLException{
            baglan();
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "DELETE FROM Tbl_Sehir WHERE SehirID="+id+"";
            
            int res = stmt.executeUpdate(sorgu);
            
            baglantiyiKes();
            return res;
        }
        
        /*-----------------------------------------------
        
        MYSQL veritabanından veri çekmek için SELECT * FROM ifadesi kullanılır.
        
        Burada ResultSet ile tabloların verilerini değişkene atıyoruz.
        Ardından while ile uygun türün yapıcı methodunu kullanıp overload ediyoruz.
        string ise getString int ise getInt ile tablonun veri türüne göre yazıyoruz ve
        içerisine tablodaki kolon adını yazıyoruz. Şart olarak rs.next() tablodaki veri 
        bitene kadar döndürüyor.
        
        Methodun dönüş tipi ArrayList'e atıyoruz gerek combobox'ta gerek jListte kolaylık
        açısından ve methodu bu tipte döndürüyoruz.
        
        -----------------------------------------------*/
        
        
        public ArrayList<Renk> gosterRenk()throws SQLException{
            System.out.println("çalıştı");
            baglan();
            
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "SELECT * FROM Tbl_Renk";
            ResultSet rs=stmt.executeQuery(sorgu);
            
            ArrayList<Renk> returnList=new ArrayList<>();
            
            while(rs.next()){
                Renk renk2 = new Renk(rs.getString("Renk"),rs.getInt("RenkID"));
              //  System.out.println(rs.getString("Renk"));
                returnList.add(renk2);
            }
            baglantiyiKes();
            return returnList;
            
        }
        
        public ArrayList<Sehir> gosterSehir()throws SQLException{
            System.out.println("çalıştı");
            baglan();
            
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "SELECT * FROM Tbl_Sehir";
            ResultSet rs=stmt.executeQuery(sorgu);
            
            ArrayList<Sehir> returnList=new ArrayList<>();
            
            while(rs.next()){
                Sehir sehir = new Sehir(rs.getString("Sehir"),rs.getInt("SehirID"));
               // System.out.println(rs.getString("Renk"));
                returnList.add(sehir);
            }
            baglantiyiKes();
            return returnList;
            
        }
       
        public ArrayList<Vites> gosterVites()throws SQLException{
            System.out.println("çalıştı");
            baglan();
            
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "SELECT * FROM Tbl_VitesTuru";
            ResultSet rs=stmt.executeQuery(sorgu);
            
            ArrayList<Vites> returnList=new ArrayList<>();
            
            while(rs.next()){
                Vites vites = new Vites(rs.getString("Vites_Turu"),rs.getInt("VitesTuruID"));
               // System.out.println(rs.getString("Renk"));
                returnList.add(vites);
            }
            baglantiyiKes();
            return returnList;
            
        }
        
        public ArrayList<Yakit> gosterYakit()throws SQLException{
            System.out.println("çalıştı");
            baglan();
            
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "SELECT * FROM Tbl_YakitTuru";
            ResultSet rs=stmt.executeQuery(sorgu);
            
            ArrayList<Yakit> returnList=new ArrayList<>();
            
            while(rs.next()){
                Yakit yakit = new Yakit(rs.getString("Yakit_Turu"),rs.getInt("YakitTuruID"));
               // System.out.println(rs.getString("Renk"));
                returnList.add(yakit);
            }
            baglantiyiKes();
            return returnList;
   
        }
        
        public ArrayList<Araba> gosterAraba()throws SQLException{
            System.out.println("çalıştı");
            baglan();
            
            Statement stmt = (Statement) con.createStatement();
            String sorgu = "SELECT * FROM Tbl_Araba";
            ResultSet rs=stmt.executeQuery(sorgu);
            
            ArrayList<Araba> returnList=new ArrayList<>();
            
            while(rs.next()){
                Araba araba = new Araba(rs.getInt("ArabaID"),rs.getString("Araba_Marka"),
                        rs.getString("Araba_Model"),rs.getInt("Araba_VitesTuruID"),rs.getInt("Araba_YakitTuruID"),
                        rs.getInt("Araba_RenkID"));
               // System.out.println(rs.getString("Renk"));
                returnList.add(araba);
            }
            baglantiyiKes();
            return returnList;
   
        }
        
        public ArrayList<Ilan> gosterIlan()throws SQLException {
            System.out.println("çalıştı");
            baglan();
            
            Statement stmt = (Statement) con.createStatement();
             String sorgu="SELECT * FROM Tbl_Ilan ";
            ResultSet rs=stmt.executeQuery(sorgu);
            
            ArrayList<Ilan> returnList=new ArrayList<>();
            
            while(rs.next()){
                Ilan ilan = new Ilan(rs.getInt("IlanID"),rs.getString("Ilan_Adi"),
                        rs.getInt("Ilan_Fiyat"),rs.getInt("Ilan_Km"),rs.getDate("Ilan_Tarih"),
                        rs.getInt("Ilan_ArabaID"),rs.getInt("Ilan_SehirID"));
               // System.out.println(rs.getString("Renk"));
                returnList.add(ilan);
            }
            baglantiyiKes();
            return returnList;
        }
        
        /*---------------------------------------------------
            
            Filtreleme olarak Ilan göstermek için LEFT JOIN .. ON ifadesini
            kullandım. Ayrıntı :
            https://www.w3schools.com/sql/sql_join_left.asp
        
            INNER JOIN kullanmama sebebim;
            Örneğin kırmızı bir arabamız var. Renk kategorisinden renk silindiği zaman
            Arabaları filtrelemede çekemiyorduk. Bunu LEFT JOIN ile çözdüm.
            +filtre ifadesi sorgu string'inde WHERE veya ORDER BY ifadesini eklemek için duruma göre
            eklenmesi durumunda parametre olarak aldığı filtreyi oraya yazıyor. filtre string'i de
            Form2'de gönderiyoruz. Kontrolleri orda mevcut.
            
            
            
        ---------------------------------------------------*/
        
        public ArrayList<Ilan> gosterIlan(String filtre)throws SQLException {
            System.out.println("çalıştı");
            baglan();
            
            
            Statement stmt = (Statement) con.createStatement();
             String sorgu="SELECT * FROM Tbl_Ilan "
               + "LEFT JOIN Tbl_Araba ON Ilan_ArabaID=ArabaID "
               + "LEFT JOIN Tbl_Renk ON Araba_RenkID=RenkID "
               + "LEFT JOIN Tbl_Sehir ON Ilan_SehirID=SehirID "
               + "LEFT JOIN Tbl_VitesTuru ON Araba_VitesTuruID=VitesTuruID "
               + "LEFT JOIN Tbl_YakitTuru ON Araba_YakitTuruID=YakitTuruID "+filtre;
              System.out.println(sorgu);
            ResultSet rs=stmt.executeQuery(sorgu);
            
            ArrayList<Ilan> returnList=new ArrayList<>();
            
            while(rs.next()){
                Ilan ilan = new Ilan(rs.getInt("IlanID"),rs.getString("Ilan_Adi"),
                        rs.getInt("Ilan_Fiyat"),rs.getInt("Ilan_Km"),rs.getDate("Ilan_Tarih"),
                        rs.getInt("Ilan_ArabaID"),rs.getInt("Ilan_SehirID"));
               // System.out.println(rs.getString("Renk"));
                returnList.add(ilan);
            }
           
            
            baglantiyiKes();
            return returnList;
        }
}
