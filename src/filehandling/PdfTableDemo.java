package filehandling;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfTableDemo {
    public static void main(String[] args) {
        {
            Document document = new Document();
            try
            {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Table.pdf"));
                document.open();
                PdfPTable table = new PdfPTable(3); // 3 columns.
                table.setWidthPercentage(100); //Width 100%
                table.setSpacingBefore(10f); //Space before table
                table.setSpacingAfter(10f); //Space after table
                //Set Column widths
                float[] columnWidths = {1f, 1f, 1f};
                table.setWidths(columnWidths);

                PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 1"));
                cell1.setBorderColor(BaseColor.BLUE);
                cell1.setPaddingLeft(10);
                cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);

                PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
                cell2.setBorderColor(BaseColor.GREEN);
                cell2.setPaddingLeft(10);
                cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);

                PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
                cell3.setBorderColor(BaseColor.RED);
                cell3.setPaddingLeft(10);
                cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);

                table.addCell(cell1);
                table.addCell(cell2);
                table.addCell(cell3);

                document.add(table);
                document.close();
                writer.close();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }   }
    }

