import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OptionalDataException;
import java.util.ArrayList;

import static com.microsoft.schemas.vml.STEditAs.Enum.table;
import static java.lang.classfile.Attributes.record;
import static org.apache.poi.ss.util.SheetUtil.getCell;

public class PDFHandler {


    protected void makePDF(String filename, ArrayList<Student> students) {
        private String[] headers = {"학번", "이름", "성별", "국어", "영어", "수학", "선택",
                "합계", "평균", "성별등수", "학급등수"};
        Document document = new Document();
        try {
            FileOutputStream outputStream = new FileOutputStream(filename);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            PdfWriter.getInstance(document, bufferedOutputStream);
            document.open();
            BaseFont baseFont = BaseFont.createFont("C:\\Windows\\Fontds\\malgun.ttg", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(baseFont, 8);
            PdfPTable table = new PdfPTable(headers.length);
            title(document, baseFont, font, table);
            record(font, table, students);
            document.add(table);
            System.out.println("PDF 생성 완료");
        } catch (FileNotFoundException | DocumentException e) {
            System.out.println(e.getMessage());
        } finally {
            document.close();
        }
    }

    private void record(Font font, BaseFont baseFont, PdfPTable table, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            table.addCell(getCell(student.getStudentID(), font));
            table.addCell(getCell(student.getName(), font));
            table.addCell(getCell(student.getGender(), font));
            for (int j = 0; j < students.size(); j++) {
                table.addCell(getCell(String.valueOf(((student.getSubject(j).getScore()), font));
            table.addCell(getCell(String.valueOf(((student.sum()), font));
            table.addCell(getCell(String.format((".2f", student.average(),font)));
            ClassRoom classRoom = new ClassRoom(students);
            table.addCell(getCell(String.valueOf((classRoom.getGenderRank(student.getGender(), i)), font,
                    student.getGender().equals("여") ? BaseColor.PINK : BaseColor.GREEN));
            table.addCell(getCell(String.valueOf(classRoom)));
            }
        }
    }

    private void title(Document document, BaseFont baseFont, Font font, PdfPTable pdfPTable) {
        Font titleFont = new Font(baseFont,16,Font.BOLD);
        Paragraph title = new Paragraph("학생 성적표", titleFont);
        title.setAlignment(Paragraph.ALIGN_CENTER);
        try {
            document.add(title);
            document.add(new Paragraph("\n"));
            for (int i = 1; i < headers.length; i++) {
                table.addCell(getCell(headers[i], font, BaseColor.YELLOW));
            }
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }

    private PdfPCell getCell(String data, Font font, BaseColor color) {
        PdfPCell cell = new PdfPCell(new Phrase(data, font));
        cell.setBackgroundColor(color);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        return cell;
    }

    private PdfPCell getCell(String data, Font font, BaseColor color) {
        PdfPCell cell = new PdfPCell(new Phrase(data, font));
        cell.setBackgroundColor(color);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        return cell;
    }
}
