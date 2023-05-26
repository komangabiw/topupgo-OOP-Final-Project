/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author TopUpGo
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        Image img = new ImageIcon(this.getClass().getResource("/icon/dm.png")).getImage();
        this.setIconImage(img);
        mainConnectionDB.koneksi();
        listGame.setVisible(false);
        sendMessage.setVisible(false);
        inputMessage.setVisible(false);
        jLabel41.setVisible(false);
        getContentPane().setBackground(new Color(125, 125, 255));
        slideshow1.initSlideshow(new SlideShow.Slide1(), new SlideShow.Slide2(), new SlideShow.Slide3(), new SlideShow.Slide4(), new SlideShow.Slide5());
    }
    //paket global  variabel
    Desktop browser = Desktop.getDesktop();
    
    public void cekTopup(){
        boolean cekTopup = false;
        int tombolke = 0;
        List<AbstractButton> listToogleButton = Collections.list(topup.getElements());
        for (AbstractButton button : listToogleButton) {
            tombolke++;
            if(button.isSelected()){ 
                System.out.println(button.isSelected());
                cekTopup = true;
                break;
            }
        }
        System.out.println(tombolke);
        System.out.println(cekTopup);
        
        if(detectGame.getText().equalsIgnoreCase("ml")){
            mainListGame castML = new mobileLegends(tombolke);
            if(castML instanceof mobileLegends){
                mobileLegends downcastML = (mobileLegends) castML;
            }
        } else if(detectGame.getText().equalsIgnoreCase("aov")){
            mainListGame castAOV = new arenaOfValor(tombolke);
            if(castAOV instanceof arenaOfValor){
                arenaOfValor downcastAOV = (arenaOfValor) castAOV;
            }
        } else if(detectGame.getText().equalsIgnoreCase("hdi")){
            mainListGame castHDI = new higgsDomino(tombolke);
            if(castHDI instanceof higgsDomino){
                higgsDomino downcastHDI = (higgsDomino) castHDI;
            }
        } else if(detectGame.getText().equalsIgnoreCase("stumble")){
            mainListGame castStumble = new stumbleGuys(tombolke);
            if(castStumble instanceof stumbleGuys){
                stumbleGuys downcastHDI = (stumbleGuys) castStumble;
            }
        } else if(detectGame.getText().equalsIgnoreCase("valo")){
            mainListGame castValo = new valorant(tombolke);
            if(castValo instanceof valorant){
                valorant downcastHDI = (valorant) castValo;
            }
        } else if(detectGame.getText().equalsIgnoreCase("ff")){
            mainListGame castFF = new freeFire(tombolke);
            if(castFF instanceof freeFire){
                freeFire downcastHDI = (freeFire) castFF;
            }
        }
    }
    
    public static void toHome(){
        mainMenu.setVisible(true);
        listGame.setVisible(false);
        sendMessage.setVisible(false);
        inputMessage.setVisible(false);
        jLabel41.setVisible(false);
        userID.setText("User ID");
        zoneID.setText("Zone ID (4 Digit)");
        inputMail.setText("   Email");
        pilihantopup.setText("");
        payment.setText("");
        hargatopup.setText("");
        inputMessage.setText("");
        topup.clearSelection();
        paymentButton.clearSelection();
    }
    
    //paket close di threads
    public static MainDialog.ConfirmTopup topupDialog;
    public void setConfirmTopup(MainDialog.ConfirmTopup confirmTopup){
        topupDialog = confirmTopup;
    }
    public static void closeTopup(){
        topupDialog.dispose();
    }
        
    public static boolean cekTombolTopup(){
        boolean cekTopup = false;
        //list buat cek udah milih topup
        List<AbstractButton> listToogleButton = Collections.list(topup.getElements());
        //cek button mana yg dipilih
        for (AbstractButton button : listToogleButton) {
            if(button.isSelected()){
                cekTopup = true;
                break;
            }
        }
        return cekTopup;
    } 
    
    boolean cekTombolPayment(){
        boolean cekPayment= false;

        //list buat cek udah milih topup
        List<AbstractButton> listToogleButton = Collections.list(paymentButton.getElements());
        //cek button mana yg dipilih
        for (AbstractButton button : listToogleButton) {
            if(button.isSelected()){
                cekPayment = true;
                break;
            }
        }
        return cekPayment;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentButton = new javax.swing.ButtonGroup();
        topup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        mainLogo = new javax.swing.JLabel();
        tagline = new javax.swing.JLabel();
        bahasa = new javax.swing.JLabel();
        loginButton = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        mainMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        slideKiriBanner = new javax.swing.JLabel();
        slideKananBanner = new javax.swing.JLabel();
        slideshow1 = new SlideShow.Slideshow();
        listGame = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        inputMail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        pilihantopup = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        hargatopup = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        bannerListGame = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        zoneID = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        showID = new javax.swing.JLabel();
        detectGame = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        topupButton1 = new javax.swing.JToggleButton();
        topupButton2 = new javax.swing.JToggleButton();
        topupButton3 = new javax.swing.JToggleButton();
        topupButton4 = new javax.swing.JToggleButton();
        topupButton5 = new javax.swing.JToggleButton();
        topupButton6 = new javax.swing.JToggleButton();
        topupButton7 = new javax.swing.JToggleButton();
        topupButton8 = new javax.swing.JToggleButton();
        topupButton9 = new javax.swing.JToggleButton();
        topupButton10 = new javax.swing.JToggleButton();
        footer = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        inputMessage = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        callUs = new javax.swing.JToggleButton();
        credit = new javax.swing.JToggleButton();
        linkTT = new javax.swing.JLabel();
        linkIG = new javax.swing.JLabel();
        linkFB = new javax.swing.JLabel();
        sendMessage = new javax.swing.JToggleButton();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TopupGo");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(40, 0, 49));

        header.setBackground(new java.awt.Color(40, 0, 49));

        mainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/coda.png"))); // NOI18N
        mainLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainLogoMouseClicked(evt);
            }
        });

        tagline.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tagline.setForeground(new java.awt.Color(255, 255, 255));
        tagline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tagline.setText("Aplikasi top-up tercepat dan terpercaya untuk pembelian kredit game kamu");
        tagline.setToolTipText("");

        bahasa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bahasa.setForeground(new java.awt.Color(255, 255, 255));
        bahasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bahasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/idFlag.png"))); // NOI18N
        bahasa.setText("   ID");
        bahasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bahasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bahasaMousePressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(98, 66, 252));
        loginButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setText("Masuk");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setOpaque(true);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLogo)
                .addGap(38, 38, 38)
                .addComponent(tagline, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bahasa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(tagline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bahasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainMenu.setBackground(new java.awt.Color(40, 0, 49));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/ml.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mobile Legends");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/aov.jpg"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/hdi.jpeg"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/Stumble.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/valo.jpg"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Arena of Valor");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Higgs Domino");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Stumble Guys");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Valorant");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/ff.jpg"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Free Fire");

        slideKiriBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slideKiriBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backTo.png"))); // NOI18N
        slideKiriBanner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slideKiriBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slideKiriBannerMouseClicked(evt);
            }
        });

        slideKananBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/forwardTo.png"))); // NOI18N
        slideKananBanner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slideKananBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slideKananBannerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(slideKiriBanner)
                                .addGap(84, 84, 84)
                                .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainMenuLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(slideKananBanner)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(slideKiriBanner))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(slideKananBanner))
                    .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6)
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14)))
        );

        listGame.setBackground(new java.awt.Color(40, 0, 49));

        jPanel4.setBackground(new java.awt.Color(40, 0, 49));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Beli !");

        inputMail.setBackground(new java.awt.Color(255, 255, 255));
        inputMail.setForeground(new java.awt.Color(0, 0, 0));
        inputMail.setText("   Email");
        inputMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputMailFocusLost(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Optional: Jika anda ingin bukti pembayaran, harap mengisi alamat emailnya");

        pilihantopup.setBackground(new java.awt.Color(0, 0, 0));
        pilihantopup.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pilihantopup.setForeground(new java.awt.Color(255, 255, 255));

        payment.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        payment.setForeground(new java.awt.Color(255, 255, 255));

        hargatopup.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hargatopup.setForeground(new java.awt.Color(255, 255, 255));

        jButton11.setBackground(new java.awt.Color(51, 17, 211));
        jButton11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Beli Sekarang");
        jButton11.setBorder(null);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pilihantopup, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                            .addComponent(hargatopup, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputMail))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputMail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hargatopup, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pilihantopup, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        bannerListGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/banner.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(40, 0, 49));

        jPanel6.setBackground(new java.awt.Color(40, 0, 49));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Pilih Pembayaran");

        paymentButton.add(jToggleButton5);
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment/dana.png"))); // NOI18N
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        paymentButton.add(jToggleButton6);
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment/ovo.png"))); // NOI18N
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        paymentButton.add(jToggleButton7);
        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment/bank.png"))); // NOI18N
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        paymentButton.add(jToggleButton8);
        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment/alfa.png"))); // NOI18N
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        paymentButton.add(jToggleButton9);
        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment/gopay.png"))); // NOI18N
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        paymentButton.add(jToggleButton10);
        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment/shopee.png"))); // NOI18N
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jToggleButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(40, 0, 49));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Masukkan USER ID");

        userID.setBackground(new java.awt.Color(255, 255, 255));
        userID.setForeground(new java.awt.Color(0, 0, 0));
        userID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userID.setText("User ID");
        userID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userIDFocusLost(evt);
            }
        });
        userID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDActionPerformed(evt);
            }
        });

        zoneID.setBackground(new java.awt.Color(255, 255, 255));
        zoneID.setForeground(new java.awt.Color(0, 0, 0));
        zoneID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        zoneID.setText("Zone ID (4 Digit)");
        zoneID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zoneIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zoneIDFocusLost(evt);
            }
        });

        showID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        showID.setForeground(new java.awt.Color(255, 255, 255));
        showID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/question.png"))); // NOI18N
        showID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showIDMouseExited(evt);
            }
        });

        detectGame.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        detectGame.setForeground(new java.awt.Color(40, 0, 49));
        detectGame.setText("ml");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detectGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zoneID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(showID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zoneID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detectGame, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(40, 0, 49));

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Pilih Nominal Top Up");

        topup.add(topupButton1);
        topupButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton1ActionPerformed(evt);
            }
        });

        topup.add(topupButton2);
        topupButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton2ActionPerformed(evt);
            }
        });

        topup.add(topupButton3);
        topupButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton3ActionPerformed(evt);
            }
        });

        topup.add(topupButton4);
        topupButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton4ActionPerformed(evt);
            }
        });

        topup.add(topupButton5);
        topupButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton5ActionPerformed(evt);
            }
        });

        topup.add(topupButton6);
        topupButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton6ActionPerformed(evt);
            }
        });

        topup.add(topupButton7);
        topupButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton7ActionPerformed(evt);
            }
        });

        topup.add(topupButton8);
        topupButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton8ActionPerformed(evt);
            }
        });

        topup.add(topupButton9);
        topupButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton9ActionPerformed(evt);
            }
        });

        topup.add(topupButton10);
        topupButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(topupButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(topupButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(topupButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(topupButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(topupButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(topupButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(topupButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(topupButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topupButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(topupButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topupButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(topupButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topupButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(topupButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(topupButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(topupButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topupButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topupButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(topupButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topupButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout listGameLayout = new javax.swing.GroupLayout(listGame);
        listGame.setLayout(listGameLayout);
        listGameLayout.setHorizontalGroup(
            listGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listGameLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bannerListGame, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        listGameLayout.setVerticalGroup(
            listGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listGameLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(listGameLayout.createSequentialGroup()
                .addComponent(bannerListGame, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(mainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(listGame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        footer.setBackground(new java.awt.Color(40, 0, 49));

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Butuh Bantuan?");

        inputMessage.setBackground(new java.awt.Color(255, 255, 255));
        inputMessage.setForeground(new java.awt.Color(0, 0, 0));

        jLabel41.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Masukkan pesan anda");

        callUs.setBackground(new java.awt.Color(40, 0, 49));
        callUs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        callUs.setForeground(new java.awt.Color(255, 255, 255));
        callUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chat.png"))); // NOI18N
        callUs.setText("Hubungi Kami");
        callUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        callUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                callUsMousePressed(evt);
            }
        });
        callUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(callUs, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(callUs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        credit.setBackground(new java.awt.Color(40, 0, 49));
        credit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        credit.setForeground(new java.awt.Color(255, 255, 255));
        credit.setText("Kredit");
        credit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });

        linkTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tiktok.png"))); // NOI18N
        linkTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkTTMouseClicked(evt);
            }
        });

        linkIG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ig.png"))); // NOI18N
        linkIG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkIG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkIGMouseClicked(evt);
            }
        });

        linkFB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fb.png"))); // NOI18N
        linkFB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkFB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkFBMouseClicked(evt);
            }
        });

        sendMessage.setBackground(new java.awt.Color(40, 0, 49));
        sendMessage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sendMessage.setForeground(new java.awt.Color(255, 255, 255));
        sendMessage.setText("Kirim");
        sendMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Dapatkan Berita Coda di:");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(linkFB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(linkIG)
                        .addGap(18, 18, 18)
                        .addComponent(linkTT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(linkFB, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(linkIG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linkTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(credit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainLogoMouseClicked
        toHome();
    }//GEN-LAST:event_mainLogoMouseClicked

    private void bahasaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bahasaMousePressed
        if(bahasa.getText().equalsIgnoreCase("   id")){
            bahasa.setText("  ENG");
            bahasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/engFlag.png")));
            tagline.setText("The safe & easy way to buy official game credits");
            jLabel26.setText("Enter User ID");
            jLabel27.setText("Select Recharge");
            jLabel29.setText("Select Payment");
            jLabel30.setText("Need help?");
            callUs.setText("   Contact Us  ");
            jLabel41.setText("Enter your message");
            sendMessage.setText("Send");
            jLabel31.setText("Stay updated with us:");
            jButton11.setText("Buy Now");
            jLabel17.setText("Buy!");
            credit.setText("Credits");
            loginButton.setText("Login");
            jLabel18.setText("Optional: If you want proof of payment, please fill in the email address");
            
        }else{
            bahasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/idFlag.png")));
            bahasa.setText("   ID");
            tagline.setText("Aplikasi top-up tercepat dan terpercaya untuk pembelian kredit game kamu");
            jLabel26.setText("Masukkan USER ID");
            jLabel27.setText("Pilih Nominal Top Up");
            jLabel29.setText("Pilih Pembayaran");
            jLabel30.setText("Butuh Bantuan?");
            callUs.setText("Hubungi Kami");
            jLabel41.setText("Masukkan pesan anda");
            sendMessage.setText("Kirim");
            jLabel31.setText("Dapatkan Berita Coda di:");
            jButton11.setText("Beli Sekarang");
            jLabel17.setText("Beli!");
            credit.setText("Kredit");
            loginButton.setText("Masuk");
            jLabel18.setText("Optional: Jika anda ingin bukti pembayaran, harap mengisi alamat emailnya");          
        }
    }//GEN-LAST:event_bahasaMousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        detectGame.setText("ml");
        mainMenu.setVisible(false);
        listGame.setVisible(true);
        zoneID.setVisible(true);
        
        bannerListGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/banner.png")));
        topupButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm1.png")));
        topupButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm2.png")));
        topupButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm3.png")));
        topupButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm4.png")));
        topupButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm5.png")));
        topupButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm6.png")));
        topupButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm7.png")));
        topupButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm8.png")));
        topupButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm9.png")));
        topupButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/dm10.png")));
    }//GEN-LAST:event_jLabel3MouseClicked

    private void slideKiriBannerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideKiriBannerMouseClicked
       
    }//GEN-LAST:event_slideKiriBannerMouseClicked

    private void slideKananBannerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideKananBannerMouseClicked
  
    }//GEN-LAST:event_slideKananBannerMouseClicked

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        payment.setText("DANA");
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        payment.setText("OVO");
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        payment.setText("BANK");
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        payment.setText("ALFAMART");
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        payment.setText("GOPAY");
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        payment.setText("SHOPEE");
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void showIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showIDMouseEntered
        switch (detectGame.getText())
        {
            case "ml" -> jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mlProperties/mlID.png")));
            case "aov" -> jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/aovID.png")));
            case "hdi" -> jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/hdiID.png")));
            case "stumble" -> jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/stumbleID.png")));
            case "valo" -> jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/valoID1.png")));
            case "ff" -> jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/ffID.png")));
        }
    }//GEN-LAST:event_showIDMouseEntered

    private void showIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showIDMouseExited
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transp.png")));
    }//GEN-LAST:event_showIDMouseExited

    private void topupButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton3ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton3ActionPerformed

    private void linkFBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkFBMouseClicked
        try {
            browser.browse(new URI("https://www.facebook.com/Codashop.IDofficial/"));
        } catch (IOException | URISyntaxException err) {
        }
    }//GEN-LAST:event_linkFBMouseClicked

    private void userIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        detectGame.setText("aov");
        mainMenu.setVisible(false);
        listGame.setVisible(true);
        zoneID.setVisible(false);
        
        bannerListGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/aovBanner.png")));
        topupButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher1.png")));
        topupButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher2.png")));
        topupButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher3.png")));
        topupButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher4.png")));
        topupButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher5.png")));
        topupButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher6.png")));
        topupButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher7.png")));
        topupButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher8.png")));
        topupButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher9.png")));
        topupButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aovProperties/voucher10.png")));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        detectGame.setText("hdi");
        mainMenu.setVisible(false);
        listGame.setVisible(true);
        zoneID.setVisible(false);
        
        bannerListGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/hdiBanner.png")));
        topupButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin1.png")));
        topupButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin2.png")));
        topupButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin3.png")));
        topupButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin4.png")));
        topupButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin5.png")));
        topupButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin6.png")));
        topupButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin7.png")));
        topupButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin8.png")));
        topupButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin9.png")));
        topupButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdiProperties/koin10.png")));       
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        detectGame.setText("stumble");
        mainMenu.setVisible(false);
        listGame.setVisible(true);
        zoneID.setVisible(false);
        
        bannerListGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/stumbleBanner.png")));
        topupButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems1.png")));
        topupButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems2.png")));
        topupButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems3.png")));
        topupButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems4.png")));
        topupButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems5.png")));
        topupButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems6.png")));
        topupButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems7.png")));
        topupButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems8.png")));
        topupButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems9.png")));
        topupButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stumbleProperties/gems10.png")));
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        detectGame.setText("valo");
        mainMenu.setVisible(false);
        listGame.setVisible(true);
        zoneID.setVisible(false);
        
        bannerListGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/valoBanner.png")));
        topupButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points1.png")));
        topupButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points2.png")));
        topupButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points3.png")));
        topupButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points4.png")));
        topupButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points5.png")));
        topupButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points6.png")));
        topupButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points7.png")));
        topupButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points8.png")));
        topupButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points9.png")));
        topupButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/valoProperties/points10.png")));
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        detectGame.setText("ff");
        mainMenu.setVisible(false);
        listGame.setVisible(true);
        zoneID.setVisible(false);
        
        bannerListGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/ffBanner.png")));
        topupButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond1.png")));
        topupButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond2.png")));
        topupButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond3.png")));
        topupButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond4.png")));
        topupButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond5.png")));
        topupButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond6.png")));
        topupButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond7.png")));
        topupButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond8.png")));
        topupButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond9.png")));
        topupButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ffProperties/diamond10.png")));
    }//GEN-LAST:event_jLabel14MouseClicked

    private void userIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIDFocusGained
        if(userID.getText().equals("User ID")){
            userID.setText("");
        }
    }//GEN-LAST:event_userIDFocusGained

    private void userIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIDFocusLost
        boolean cekAngka = true;
        for(int i = 0; i < userID.getText().length();i++){
            if( !Character.isDigit(userID.getText().charAt(i))){
                cekAngka = false;
                break;
            }
        }
        
        if(!cekAngka){
            JOptionPane.showMessageDialog(this, "userID hanya bisa di input oleh angka ");
            userID.setText("User ID");
        }
    }//GEN-LAST:event_userIDFocusLost

    private void zoneIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zoneIDFocusGained
        if(zoneID.getText().equals("Zone ID (4 Digit)")){
            zoneID.setText("");
        }
    }//GEN-LAST:event_zoneIDFocusGained

    private void zoneIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zoneIDFocusLost
        boolean cekAngka = true;
        for(int i = 0; i < zoneID.getText().length();i++){
            if( !Character.isDigit(zoneID.getText().charAt(i))){
                cekAngka = false;
                break;
            }
        }
        if(zoneID.getText().length() == 4){
            if(!cekAngka){
                JOptionPane.showMessageDialog(this, "userID hanya bisa di input oleh angka ");
                zoneID.setText("Zone ID (4 Digit)");
            }
        }else{
            zoneID.setText("Zone ID (4 Digit)");
            JOptionPane.showMessageDialog(this, "Zone ID harus terdiri dari 4 karakter");
        }
    }//GEN-LAST:event_zoneIDFocusLost

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditActionPerformed

    private void sendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageActionPerformed
        // TODO add your handling code here:
        String replace = inputMessage.getText().replaceAll(" ", "+");
        String link = "https://web.whatsapp.com/send/?phone=%2B6281386249421&text=" + replace + "&type=phone_number&app_absent=0";

        try {
            browser.browse(new URI(link));
        } catch (IOException | URISyntaxException err) {
        }
    }//GEN-LAST:event_sendMessageActionPerformed

    private void callUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_callUsActionPerformed

    private void callUsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_callUsMousePressed
        if(jLabel41.isVisible()){
            sendMessage.setVisible(false);
            inputMessage.setText("");
            inputMessage.setVisible(false);
            jLabel41.setVisible(false);
        }else{
            sendMessage.setVisible(true);
            inputMessage.setVisible(true);
            jLabel41.setVisible(true);
        }
    }//GEN-LAST:event_callUsMousePressed

    private void topupButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton2ActionPerformed
         cekTopup();        
    }//GEN-LAST:event_topupButton2ActionPerformed
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        MainDialog.ConfirmTopup tes = new MainDialog.ConfirmTopup(this, true);
        setConfirmTopup(tes);
        mainListGame cekGame = new mainListGame(detectGame.getText());
        MainDialog.ConfirmTopup.namaGame.setText(cekGame.getGameName());
        
        if(bahasa.getText().equalsIgnoreCase("   id")){
            MainDialog.ConfirmTopup.label1.setText("Detail Pesanan");
            MainDialog.ConfirmTopup.label2.setText("Mohon konfirmasi Pilihan anda sudah benar.");
            MainDialog.ConfirmTopup.label3.setText("Bayar Dengan:");
            MainDialog.ConfirmTopup.label4.setText("Harga:");
            MainDialog.ConfirmTopup.label5.setText("Total Pembayaran");
            MainDialog.ConfirmTopup.button1.setText("Konfirm");
            MainDialog.ConfirmTopup.button2.setText("Batalkan");
        }else{
            MainDialog.ConfirmTopup.label1.setText("Order Details");
            MainDialog.ConfirmTopup.label2.setText("Please confirm your selection is correct.");
            MainDialog.ConfirmTopup.label3.setText("Pay With:");
            MainDialog.ConfirmTopup.label4.setText("Price:");
            MainDialog.ConfirmTopup.label5.setText("Total payment");
            MainDialog.ConfirmTopup.button1.setText("Confirm");
            MainDialog.ConfirmTopup.button2.setText("Cancel"); 
        }
        
        if(detectGame.getText().equals("ml")){
           MainDialog.ConfirmTopup.id.setText(userID.getText() + "(" + zoneID.getText() + ")");
        }else{
           MainDialog.ConfirmTopup.id.setText(userID.getText());
        }
        MainDialog.ConfirmTopup.topupOption.setText(pilihantopup.getText());
        MainDialog.ConfirmTopup.paymentMethod.setText(payment.getText());
        MainDialog.ConfirmTopup.price.setText(hargatopup.getText());
        MainDialog.ConfirmTopup.lastPrice.setText(hargatopup.getText());
        boolean cekuserID = true;
        boolean cekzoneID = true;
        for(int i = 0; i < userID.getText().length();i++){
            if( !Character.isDigit(userID.getText().charAt(i))){
                cekuserID = false;
            }
        }
        for(int i = 0; i < userID.getText().length();i++){
            if( !Character.isDigit(userID.getText().charAt(i))){
                cekzoneID = false;
            }
        }
        System.out.println(cekuserID);
        System.out.println(cekzoneID);
        if(detectGame.getText().equals("ml")){
            if(userID.getText().equals("User ID")){
                JOptionPane.showMessageDialog(this, "Anda belum mengisi User ID");
            }else{
                if(cekuserID){
                    if(zoneID.getText().equalsIgnoreCase("Zone ID (4 Digit)")){
                    JOptionPane.showMessageDialog(this, "Anda belum mengisi Zone ID");
                    }else{
                        if(cekzoneID){
                            if(cekTombolTopup()){
                                if(cekTombolPayment()){
                                    tes.setVisible(true);  
                                }else{
                                    JOptionPane.showMessageDialog(this, "Anda belum memilih pembayaran");
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "Anda belum memilih jumlah topup");
                            }
                        }
                    }
                }
            }
        }else{
            if(userID.getText().equals("User ID")){
                JOptionPane.showMessageDialog(this, "Anda belum mengisi User ID");
            }else{
                if(cekuserID){
                    if(cekTombolTopup()){
                        if(cekTombolPayment()){
                            tes.setVisible(true);  
                        }else{
                            JOptionPane.showMessageDialog(this, "Anda belum memilih pembayaran");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Anda belum memilih jumlah topup");
                    }
                }
            }
        }   
    }//GEN-LAST:event_jButton11ActionPerformed

    private void inputMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMailFocusLost
        //cek @
        boolean cekEmail = false;
        for(int i = 0; i < inputMail.getText().length();i++){
            if(inputMail.getText().charAt(i) == '@'){
                cekEmail = true;
                break;
            }
        }
        if(!cekEmail){
            JOptionPane.showMessageDialog(this, "Domain tidak mengandung '@' ");
            inputMail.setText("   Email");
        }
    }//GEN-LAST:event_inputMailFocusLost

    private void topupButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton1ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton1ActionPerformed

    private void inputMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMailFocusGained
        if(inputMail.getText().equals("   Email")){
            inputMail.setText("");
        }
    }//GEN-LAST:event_inputMailFocusGained

    private void linkIGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkIGMouseClicked
        try {
            browser.browse(new URI("https://www.instagram.com/codashop.idofficial/?hl=id"));
        } catch (IOException | URISyntaxException err) {
        }
    }//GEN-LAST:event_linkIGMouseClicked

    private void linkTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkTTMouseClicked
        try {
            browser.browse(new URI("https://www.tiktok.com/@codashop_global?lang=en"));
        } catch (IOException | URISyntaxException err) {
        }
    }//GEN-LAST:event_linkTTMouseClicked

    private void topupButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton9ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton9ActionPerformed

    private void topupButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton10ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton10ActionPerformed

    private void topupButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton6ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton6ActionPerformed

    private void topupButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton7ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton7ActionPerformed

    private void topupButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton8ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton8ActionPerformed

    private void topupButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton4ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton4ActionPerformed

    private void topupButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupButton5ActionPerformed
        cekTopup();
    }//GEN-LAST:event_topupButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel bahasa;
    private javax.swing.JLabel bannerListGame;
    private javax.swing.JToggleButton callUs;
    private javax.swing.JToggleButton credit;
    private javax.swing.JLabel detectGame;
    private javax.swing.JPanel footer;
    public static javax.swing.JLabel hargatopup;
    private javax.swing.JPanel header;
    public static javax.swing.JTextField inputMail;
    public static javax.swing.JTextField inputMessage;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JLabel linkFB;
    private javax.swing.JLabel linkIG;
    private javax.swing.JLabel linkTT;
    public static javax.swing.JPanel listGame;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel mainLogo;
    public static javax.swing.JPanel mainMenu;
    private javax.swing.JPanel mainPanel;
    public static javax.swing.JLabel payment;
    public static javax.swing.ButtonGroup paymentButton;
    public static javax.swing.JLabel pilihantopup;
    public static javax.swing.JToggleButton sendMessage;
    private javax.swing.JLabel showID;
    private javax.swing.JLabel slideKananBanner;
    private javax.swing.JLabel slideKiriBanner;
    private SlideShow.Slideshow slideshow1;
    private javax.swing.JLabel tagline;
    public static javax.swing.ButtonGroup topup;
    public static javax.swing.JToggleButton topupButton1;
    public static javax.swing.JToggleButton topupButton10;
    public static javax.swing.JToggleButton topupButton2;
    public static javax.swing.JToggleButton topupButton3;
    public static javax.swing.JToggleButton topupButton4;
    public static javax.swing.JToggleButton topupButton5;
    public static javax.swing.JToggleButton topupButton6;
    public static javax.swing.JToggleButton topupButton7;
    public static javax.swing.JToggleButton topupButton8;
    public static javax.swing.JToggleButton topupButton9;
    public static javax.swing.JTextField userID;
    public static javax.swing.JTextField zoneID;
    // End of variables declaration//GEN-END:variables
}