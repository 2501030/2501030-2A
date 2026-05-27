import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import org.apache.poi.hdgf.chunks.Chunk;
import org.apache.poi.wp.usermodel.Paragraph;

import javax.swing.text.Document;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ItextHandler {

    protected void makePDF(Book[] books, String fileName) {
        try {
            Document document = new Document();
            FileOutputStream out = new FileOutputStream(fileName);
            PdfWriter.getInstance(document, out);
            XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
            dcoument.open();
            fontProvider.register("c:\\windows\\Fonts\\malgun.ttf", "MyFont");
            Font titleFont = font.getFont("MyFont", 18, Font.BOLD, BaseColor.BLACK);
            Font normalFont = font.getFont("MyFont", 12);

            Paragraph title =  new Paragraph("도서 납품서", titleFont);
            tiotle.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(tiotle);
            document.add(Chunk.NEWLINE);
            for (int i=0; i<books.length; i++) {
                document.add(new Paragraph("도서명 : " + books[i].getTitle(), normalFont));
                document.add(new Paragraph("수량 : " + books[i].getQty() + " 권", normalFont));
                document.add(new Paragraph(String.format("단가 : %,d 원", books[i].getPrice()), normalFont));
                String dqDara = books[i].getTitle() + " | ISBN : " + books[i].getIsbn();
                BarcodeQRCode qrcode = new BarcodeQRCode(dqDara,150,150,null);
                Image qrimage = qrcode.getImage();
                document.add(qrimage);
            }
            document.close();
            System.out.println("PDF 완성");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
