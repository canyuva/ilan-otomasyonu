
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class Form2 extends javax.swing.JFrame {
    Veritabani vt;
// Form1'de yaptığımız gibi global değişkenler ve nesneler..
        ArrayList<Ilan> ilan = new ArrayList<>();
    ArrayList<Araba> araba = new ArrayList<>();
    ArrayList<Renk> renk = new ArrayList<>();
    ArrayList<Vites> vites = new ArrayList<>();
    ArrayList<Yakit> yakit = new ArrayList<>();
    ArrayList<Sehir> sehir = new ArrayList<>();
 
    int seciliRenk ;
    int seciliYakit;
    int seciliVites;
    int seciliSehir;
    
    public Form2() {
        try {
            this.vt = new Veritabani();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
        // Form1'deki gibi form açıldığında comboboxları doldurmak için methodları çağırdık.
        //  try-catch'in sebebi SQL Exception methodlar olması için hata kontrolü.
        
        actionListeners();
        
        try {
            gosterSehir();
        } catch (SQLException ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            gosterRenk();
        } catch (SQLException ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            gosterVites();
        } catch (SQLException ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            gosterYakit();
        } catch (SQLException ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ilanadi_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sehir_CB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        fiyat_min = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fiyat_max = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        yakit_CB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        vites_CB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tarih_CB = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        km_min = new javax.swing.JTextField();
        km_max = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        renk_CB = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fiyat_h = new javax.swing.JCheckBox();
        yakit_h = new javax.swing.JCheckBox();
        vites_h = new javax.swing.JCheckBox();
        sehir_h = new javax.swing.JCheckBox();
        marka_tf = new javax.swing.JTextField();
        model_tf = new javax.swing.JTextField();
        renk_h = new javax.swing.JCheckBox();
        km_h = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        liste = new javax.swing.JList<>();
        tarih_h = new javax.swing.JCheckBox();
        fiyat_CB = new javax.swing.JComboBox<>();
        isim_CB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("İlan Adına Göre Filtrele :");

        jLabel3.setText("Şehir :");

        sehir_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Fiyat Aralığı :");

        fiyat_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiyat_minActionPerformed(evt);
            }
        });

        jLabel5.setText("-");

        jLabel6.setText("Yakıt Türü :");

        yakit_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Vites Türü :");

        vites_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Marka :");

        jLabel9.setText("Model :");

        jLabel10.setText("Tarih Aralığı :");

        tarih_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Son 24 saat", "Son 1 hafta", "Son 1 ay" }));
        tarih_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarih_CBActionPerformed(evt);
            }
        });

        jLabel11.setText("Fiyata Göre :");

        jLabel12.setText("Km Aralığı :");

        jLabel13.setText("-");

        jLabel14.setText("Renk :");

        renk_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("İsme Göre :");

        jButton1.setBackground(new java.awt.Color(156, 255, 236));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(1, 1, 1));
        jButton1.setText("LİSTELE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fiyat_h.setSelected(true);
        fiyat_h.setText("Herhangi");

        yakit_h.setSelected(true);
        yakit_h.setText("Herhangi");

        vites_h.setSelected(true);
        vites_h.setText("Herhangi");

        sehir_h.setSelected(true);
        sehir_h.setText("Herhangi");

        renk_h.setSelected(true);
        renk_h.setText("Herhangi");

        km_h.setSelected(true);
        km_h.setText("Herhangi");

        liste.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(liste);

        tarih_h.setSelected(true);
        tarih_h.setText("Herhangi");

        fiyat_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herhangi", "Artan", "Azalan" }));

        isim_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herhangi", "A'dan Z'ye", "Z'den A'ya" }));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel1.setText("(min-max)");

        jLabel16.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel16.setText("(min-max)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fiyat_CB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(model_tf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marka_tf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vites_CB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tarih_CB, 0, 185, Short.MAX_VALUE)
                                    .addComponent(isim_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tarih_h)
                                    .addComponent(vites_h)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yakit_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yakit_h))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fiyat_min, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(km_min, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fiyat_max, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(km_max))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(km_h))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fiyat_h))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(renk_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(renk_h))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ilanadi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sehir_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sehir_h)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ilanadi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sehir_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sehir_h))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fiyat_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiyat_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiyat_h)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(km_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(km_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(km_h)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(renk_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(renk_h))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(yakit_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yakit_h))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(vites_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vites_h))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(marka_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(model_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tarih_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarih_h))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(fiyat_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel15)
                            .addComponent(isim_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("İlan Filtrele", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        /*------------------------------------------------
        Burada textfield'ların boş olup olmaması kontrolü var. Boşsa hata mesajı veriyor yoksa aşağıdaki
        doldurListe() fonksiyonuna gidiyor...
        -------------------------------------------------*/
        
        boolean doldur = true;
        
        if(fiyat_min.getText().equals("") || fiyat_max.getText().equals("") ){
            
            if(!fiyat_h.isSelected()){
                JOptionPane.showMessageDialog(new JFrame(), "Veri girişini eksik yaptınız!", "Dialog",JOptionPane.ERROR_MESSAGE);
                
                doldur = false;
            }

        }
        
        
        if(km_min.getText().equals("") || km_max.getText().equals("") ){
            
                
            
            if(!km_h.isSelected()){
                JOptionPane.showMessageDialog(new JFrame(), "Veri girişini eksik yaptınız!", "Dialog",JOptionPane.ERROR_MESSAGE);
                doldur = false;
            }
   
        }
        
        if(doldur == true){
            doldurListe();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fiyat_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiyat_minActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiyat_minActionPerformed

    private void tarih_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarih_CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarih_CBActionPerformed

    /*--------------------------------------------------------------
    
    Öncelikle WHERE ve ORDER BY anahtar anahtar kelimelerini bilmemiz gerek.
    Ayrıntı :
    https://www.w3schools.com/sql/sql_where.asp
    https://www.w3schools.com/sql/sql_orderby.asp
    
    WHERE ifadelerini neredeyse her kontrolde kullanıyoruz ve öncekine bağlı olarak önceki if'e girmişse
    program AND anahtar kelimesiyle birden çok filtre verebiliyoruz.
    
    Program Herhangi checkbox'ı işaretli mi veya değer girilecekse TextField boş mu diye kontrol edip
    değerlere göre filtre veriyoruz.
    
    ADIMLAR ŞU ŞEKİLDE :
    
    1- whereKontrol ve orderBy string değerlerini boş atıyoruz.
    2- İsme göre filtremeleme LIKE ifadesi kullanılır. Ayrıntı : https://www.w3schools.com/sql/sql_like.asp
    3- Öncesinde whereKontrol değiştiyse yani zaten bi takı aldıysa AND kelimesini de eklyoruz.
    4- checkbox işaretli mi diye kontrol ediyoruz. işaretli değilse bir filtre daha eklenecek demektir.
        secili... değişkenleri seçilen elemanın combobox'lardan id'lerini içeriyor.
        Örneğin tabloda Renk kırmızı ve RenkID'si 3 ise seciliRenk=3 olur. 
        Bu da WHERE ifadesinde o renkli arabaları çekmemize olanak sağlıyor.
    
    5- Fiyat ve KM aralık alması için küçük büyük işaretleri kullanılarak sorgu stringine ekleniyor.
    6- Tarih filtrelemesi :
        Date.valueOf(LocalDate.now().minusDays(1)).toString() ifadesi şimdiki zamanın,
        minusDays(1) ile bir gün öncesini
        minusDays(7) ile bir hafta öncesi
        minusDays(30) ile bir ay öncesinin tarihini alıp toString() ile string'e dönüştür.
        Ardından örneğin IlanTarihi="2018-05-07" ile bir hafta öncesinde eklenen ilanların değerleri gözükebilir.
    
    7- Artan/azalan ve A'dan Z'ye/Z'den A'ya filtrelemede ORDER BY ifadesi kullanılır.
        ASC sayısal değerde artan, yazısal olarak A'dan Z'ye sıralama yapar.
        DESC ise tam tersinde. 
    
    8-  Son olarak herhangi bi filtre yoksa WHERE veya ORDER BY anahtar kelimesi koyar.  
    
    NOT : "+=" ifadesi string'e sondan ekleme yapar.. 
        Yani filtre varsa WHERE veya ORDER BY koy ardından şartı sona ekleye ekleye toplu filtreleme yap.
    
        WHERE Ilan_Adi='acil' AND Araba_VitesTuruID=3 ORDER BY Ilan_Adi ASC
    
        Bu ifade doldurListe'ye parametre olarak gönderilir. O da veritabanındaki gosterIlan methoduna
        bu sorgu stringini parametre olarak gönderir şu şekilde bi ifade çıkar :
    
               SELECT * FROM Tbl_Ilan 
               LEFT JOIN Tbl_Araba ON Ilan_ArabaID=ArabaID 
               LEFT JOIN Tbl_Renk ON Araba_RenkID=RenkID 
               LEFT JOIN Tbl_Sehir ON Ilan_SehirID=SehirID 
               LEFT JOIN Tbl_VitesTuru ON Araba_VitesTuruID=VitesTuruID 
               LEFT JOIN Tbl_YakitTuru ON Araba_YakitTuruID=YakitTuruID 
               WHERE Ilan_Adi='acil' AND Araba_VitesTuruID=3 ORDER BY Ilan_Adi ASC
    
               ve bu da bizim filtrelememiz olur...
    
     
    
    --------------------------------------------------------------*/
    
    
    String filtreKontrol(){
        String whereKontrol="";
        String orderBy = "";
        
         if(!ilanadi_tf.getText().equals("")){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Ilan_Adi LIKE \"%"+ilanadi_tf.getText()+"%\"";
        }
        
        if(!sehir_h.isSelected()){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Ilan_SehirID="+seciliSehir;
        }
        if(!fiyat_h.isSelected()){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Ilan_Fiyat >= "+fiyat_min.getText();
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Ilan_Fiyat < "+fiyat_max.getText();
            
        }
        
        if(!km_h.isSelected()){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Ilan_Km >="+km_min.getText();
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Ilan_Km <"+km_max.getText();
        }
        
        if(!renk_h.isSelected()){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Araba_RenkID="+seciliRenk;
        }
        
        if(!yakit_h.isSelected()){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Araba_YakitTuruID="+seciliYakit;
        }
        
        if(!vites_h.isSelected()){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Araba_VitesTuruID="+seciliVites;
        }
        
        if(!marka_tf.getText().equals("")){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Araba_Marka=\""+marka_tf.getText()+"\"";
        }
        
        if(!model_tf.getText().equals("")){
            if(whereKontrol != "")  whereKontrol += " AND ";
            whereKontrol += "Araba_Model=\""+model_tf.getText()+"\"";
        }
        

        if(!tarih_h.isSelected()){
            if(whereKontrol != "")  whereKontrol += " AND ";

            switch(tarih_CB.getSelectedIndex()){
                case 0:
                    whereKontrol+="Ilan_Tarih=\""+Date.valueOf(LocalDate.now().minusDays(1)).toString()+"\"";
                    break;
                case 1:
                    whereKontrol+="Ilan_Tarih=\""+Date.valueOf(LocalDate.now().minusDays(7)).toString()+"\"";
                    break;
                case 2:
                    whereKontrol+="Ilan_Tarih=\""+Date.valueOf(LocalDate.now().minusDays(30)).toString()+"\"";
                    break;
            }
            
        }
            
            if(fiyat_CB.getSelectedIndex()!=0){
               
                
                switch(fiyat_CB.getSelectedIndex()){
                    case 1:
                        orderBy+=" Ilan_Fiyat ASC ";
                        break;
                    case 2:
                        orderBy+=" Ilan_Fiyat DESC ";
                        break;
                }
            }
            
            if(isim_CB.getSelectedIndex()!=0){
                if(orderBy!="") orderBy += " , "; 
                
                switch(isim_CB.getSelectedIndex()){
                    case 1:
                        orderBy+=" Ilan_Adi ASC ";
                        break;
                    case 2:
                        orderBy+=" Ilan_Adi DESC ";
                        break;
                }
            }
            
            if(whereKontrol!=""){
                whereKontrol = " WHERE "+whereKontrol;
            }
                
            if(orderBy!=""){
                orderBy = " ORDER BY "+orderBy;
            }
                
            
            
        
        
        System.out.println(whereKontrol + orderBy);
        
        return whereKontrol + orderBy;
        
    }
    
     void actionListeners(){
         
         // Form1'deki gibi combobox seçili elemanın id'sini değişkene atama işlemi...
        
        vites_CB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seciliVites = vites.get(vites_CB.getSelectedIndex()).getID();
                System.out.println(seciliVites);
            }
         });
        
        renk_CB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seciliRenk = renk.get(renk_CB.getSelectedIndex()).getID();
                System.out.println(seciliRenk);
            }
         });
         
         yakit_CB.addActionListener(new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent e) {
                seciliYakit = yakit.get(yakit_CB.getSelectedIndex()).getID();
                System.out.println(seciliYakit);
            }
         });
         
         sehir_CB.addActionListener(new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent e) {
                seciliSehir = sehir.get(sehir_CB.getSelectedIndex()).getID();
                System.out.println(seciliSehir);
            }
         });
         
   
    }

    
     /*---------------------------------------------------------------------------*/
     
       public String ArabaBilgileri(int ID) throws SQLException{
        Araba araba=vt.gosterIlanAraba(ID);//Veritabanından araba bilgilerini çekip ekrana yazdırıyoruz.
        String bilgi=
                araba.getMarka()+" "
                +araba.getModel()+" "
                +vt.gosterIlanRenk(araba.getRenkID()).getRenk()+" "
                +vt.gosterIlanVites(araba.getVitesID()).getVites()+" "
                +vt.gosterIlanYakit(araba.getYakitID()).getYakit();
        return bilgi;
    }
     
     
     /*---------------------------------------------------------------------------*/
     
    void gosterRenk() throws SQLException{     
        renk = vt.gosterRenk();
        DefaultComboBoxModel<String> cm=new DefaultComboBoxModel<>();
        for(Renk r:renk){
            cm.addElement(r.getRenk());
        }
        
        // Eklenen verileri combobox modeline atama işlemi yapılır.
        renk_CB.setModel(cm);
        
        
        seciliRenk = renk.get(0).getID();
  
        
    }
    
    
    void gosterVites() throws SQLException{
       
        vites = vt.gosterVites();
        DefaultComboBoxModel<String> cm=new DefaultComboBoxModel<>();
        for(Vites v:vites){
            cm.addElement(v.getVites());
        }
        
        vites_CB.setModel(cm);
        
        seciliVites = vites.get(0).getID();
        
    }
    
    
    void gosterSehir() throws SQLException{
        sehir = vt.gosterSehir();
        DefaultComboBoxModel<String> cm=new DefaultComboBoxModel<>();
        for(Sehir s:sehir){
            cm.addElement(s.getSehirAdi());
        }
        
        sehir_CB.setModel(cm);
        seciliSehir = sehir.get(0).getID();
     
        
    }
    
    void gosterYakit() throws SQLException{
        yakit = vt.gosterYakit();
        DefaultComboBoxModel<String> cm=new DefaultComboBoxModel<>();
        for(Yakit y:yakit){
            cm.addElement(y.getYakit());
        }
        
        yakit_CB.setModel(cm);
        seciliYakit = yakit.get(0).getID();
 
    }
    
    /*------------------------------------------------------
    
    doldurListe methodunun amacı veritabanına gosterIlan methoduna parametre olarak 
    filtreKontrol methodundan dönen string değerini yollamak.
    
    Ardından Formdaki Listeyi setModel ile doldurmak. ComboBox'taki olayın aynısı...
    
    ------------------------------------------------------*/
    
    void doldurListe(){
        DefaultListModel<String> list = new DefaultListModel<String>();
       
        try {
            ilan = vt.gosterIlan(filtreKontrol());
            araba = vt.gosterAraba();
        } catch (SQLException ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        for (Ilan i : ilan) {
            
            
            try {
                list.addElement("İlan Adı: "+i.getIlanAdi()+" | Fiyat : "+i.getFiyat()+
                        " | Km : "+i.getKm()+" | Tarih : "+i.getTarih()+" "+
                                " | Araba Bilgileri : "+ArabaBilgileri(i.getArabaID())+""
                                        + " | Şehir : "+vt.gosterIlanSehir(i.getSehirID()).getSehirAdi());
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

        
        
        liste.setModel(list);
        
    }
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> fiyat_CB;
    private javax.swing.JCheckBox fiyat_h;
    private javax.swing.JTextField fiyat_max;
    private javax.swing.JTextField fiyat_min;
    private javax.swing.JTextField ilanadi_tf;
    private javax.swing.JComboBox<String> isim_CB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox km_h;
    private javax.swing.JTextField km_max;
    private javax.swing.JTextField km_min;
    private javax.swing.JList<String> liste;
    private javax.swing.JTextField marka_tf;
    private javax.swing.JTextField model_tf;
    private javax.swing.JComboBox<String> renk_CB;
    private javax.swing.JCheckBox renk_h;
    private javax.swing.JComboBox<String> sehir_CB;
    private javax.swing.JCheckBox sehir_h;
    private javax.swing.JComboBox<String> tarih_CB;
    private javax.swing.JCheckBox tarih_h;
    private javax.swing.JComboBox<String> vites_CB;
    private javax.swing.JCheckBox vites_h;
    private javax.swing.JComboBox<String> yakit_CB;
    private javax.swing.JCheckBox yakit_h;
    // End of variables declaration//GEN-END:variables
}
