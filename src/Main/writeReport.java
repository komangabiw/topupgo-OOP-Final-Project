/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

/**
 *
 * @author anoth
 */
public class writeReport {
    
    public static void writePDF(String topup, String userID, String metodePembayaran, String totalPembayaran){
    com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("D:\\report.pdf"));
            doc.open();
            Paragraph paragraph1 = new Paragraph("----------------------------------------------------\n");
            Paragraph paragraph2 = new Paragraph("Ringkasan Pesanan\n\n");
            Paragraph paragraph3 = new Paragraph(topup + "\n\n");
            Paragraph paragraph4 = new Paragraph("User ID                         :  " + userID + "\n");
            Paragraph paragraph5 = new Paragraph("Tanggal pemesanan    :  " + formattedDate + "\n");
            Paragraph paragraph6 = new Paragraph("Metode Pembayaran   :   " + metodePembayaran + "\n");
            Paragraph paragraph7 = new Paragraph("Status Pembayaran     :	  Sudah di proses\n");
            Paragraph paragraph8 = new Paragraph("Total Pembayaran       :   " + totalPembayaran + "\n");
            Paragraph paragraph9 = new Paragraph("Butuh bantuan? kunjungi Pusat Bantuan kami.\n");
            
            doc.add(paragraph1);
            doc.add(paragraph2); 
            doc.add(paragraph3); 
            doc.add(paragraph4); 
            doc.add(paragraph5); 
            doc.add(paragraph6); 
            doc.add(paragraph7); 
            doc.add(paragraph8); 
            doc.add(paragraph1); 
            doc.add(paragraph9); 
            doc.close();
        } catch (FileNotFoundException | DocumentException ex){
            Logger.getLogger(writeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void WriteExcel(){
        try{
            String sql = "SELECT * FROM transaksi";
            ResultSet cek = mainConnectionDB.con.createStatement().executeQuery(sql);
        
            while(cek.next()){
                String id = cek.getString("ID");
                String[] arrayUpdate = {id, cek.getString("username"), cek.getString("game_id"), cek.getString("game"), 
                    cek.getString("harga"), cek.getString("pilihanTopup"), cek.getString("pilihanPembayaran")};
                
                int parseID = Integer.parseInt(id);
                FileInputStream in = new FileInputStream("D:\\historyTransaction.xlsx");
                Workbook wb = WorkbookFactory.create(in);
                Sheet s = wb.getSheet("transaction");
                for (int i = 1; i <= arrayUpdate.length; i++){
                    s.createRow((parseID + 2) + i);
                    Row r = s.getRow((parseID + 2));
                    Cell c  = r.getCell(4 + i);
                    c = r.createCell(4 + i);
                    c.setCellValue(arrayUpdate[i - 1]);
                    FileOutputStream out = new FileOutputStream("D:\\historyTransaction.xlsx");
                    wb.write(out);
                }
            }
        } catch (IOException | EncryptedDocumentException | SQLException ex){
            Logger.getLogger(writeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
