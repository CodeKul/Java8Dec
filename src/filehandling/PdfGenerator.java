package filehandling;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfGenerator {
    private static Font font3=new Font(Font.FontFamily.COURIER,20,Font.BOLDITALIC, BaseColor.GREEN);
    private static Font font1=new Font(Font.FontFamily.TIMES_ROMAN,20,Font.BOLDITALIC, BaseColor.BLUE);
    private static Font font2=new Font(Font.FontFamily.HELVETICA,20,Font.BOLDITALIC, BaseColor.RED);

    public static void main(String[] args) {
        Document document=new Document();
        try {
            PdfWriter.getInstance(document,new FileOutputStream("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/SamplePdf.pdf"));
            Paragraph p=new Paragraph("This is Sample Pdf",font1);
            p.setAlignment(Element.ALIGN_CENTER);
            p.setPaddingTop(50);
            Paragraph p1=new Paragraph("This is Sample Pdf",font2);
            p1.setAlignment(Element.ALIGN_LEFT);
            p1.setPaddingTop(50);
            Paragraph p2=new Paragraph("This is Sample Pdf",font3);
            p2.setAlignment(Element.ALIGN_RIGHT);
            p2.setPaddingTop(50);
            document.open();
            document.add(p);
            document.add(p1);
            document.add(p2);
            document.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
