package com.mental.abacus.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Map;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ExportPDF {

	public void exportPDFFile(String paperName, String path, Map<String, Collection<Integer>> data,
			Map<Integer, Collection<String>> mulData) throws Exception {

		OutputStream file = new FileOutputStream(new File(path));
		Document document = new Document(PageSize.A3.rotate());
		PdfWriter.getInstance(document, file);

		document.open();// PDF document opened........
		document.add(Chunk.NEWLINE); // Something like in HTML :-)
		document.add(new Paragraph(paperName));

		// Now Insert Every Thing Into PDF Document
		float[] widths = { 36, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40,
				40, 40, 40 };
		int i = 1;
		for (Map.Entry<String, Collection<Integer>> entry : data.entrySet()) {
			PdfPTable row = printTable(i, i + 24, entry.getKey(), entry.getValue(), ((entry.getValue().size()) / 25));
			row.setTotalWidth(widths);
			document.add(row);
			i = i + 25;
		}

		float[] width1 = { 100, 100, 100, 100 };

		if (mulData != null) {

			document.add(new Paragraph("Multiplication"));
			document.add(Chunk.NEWLINE); // Something like in HTML :-)

			PdfPTable row = this.printMulTable(mulData);
			row.setTotalWidth(width1);
			document.add(row);
		}

		document.close();
		file.close();
	}

	public PdfPTable printTable(int start, int end, String alphabet, Collection<Integer> listNumbers, int rowLen) {

		// Inserting Table in PDF
		PdfPTable table = new PdfPTable(26);

		PdfPCell cell = new PdfPCell(new Paragraph(alphabet));
		cell.setRowspan(rowLen + 1);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setPadding(02.0f);
		cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(cell);
		// Number row...........
		for (int i = start; i <= end; i++) {
			PdfPCell cells = new PdfPCell(new Phrase(String.valueOf(i)));
			cells.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(cells);
		}
		// Actual number rows......
		for (Integer item : listNumbers) {
			if (item == 0) {
				table.addCell("");
			} else {
				table.addCell(item.toString());
			}
		}

		PdfPCell cell2 = new PdfPCell(new Paragraph("ANS"));
		cell2.setRowspan(1);
		cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell2.setPadding(05.0f);
		cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(cell2);
		// Answer row...........
		for (int i = 1; i <= 25; i++) {
			table.addCell(" ");
		}

		table.setWidthPercentage(98);
		table.setLockedWidth(true);
		table.setSpacingBefore(10.0f); // Space Before table starts, like margin-top in CSS
		table.setSpacingAfter(10.0f); // Space After table starts, like margin-Bottom in CSS

		return table;
	}

	public PdfPTable printMulTable(Map<Integer, Collection<String>> mulData) {

		PdfPTable table = new PdfPTable(4);
		table.setWidthPercentage(90);
		table.getDefaultCell().setBorder(0);

		for (Map.Entry<Integer, Collection<String>> entry : mulData.entrySet()) {

			PdfPTable mulCol = new PdfPTable(2);

			for (String val : entry.getValue()) {

				PdfPCell cell = new PdfPCell(new Paragraph(val));
				cell.setPadding(02.0f);
				mulCol.addCell(cell);

				PdfPCell cell1 = new PdfPCell(new Paragraph(" "));
				cell1.setPadding(02.0f);
				mulCol.addCell(cell1);
			}
			table.addCell(mulCol);
		}
		return table;
	}
}
