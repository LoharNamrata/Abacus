package com.desk.abacus.index;

import java.util.Collection;
import java.util.Map;

import com.desk.abacus.export.ExportExcel;
import com.desk.abacus.export.ExportPDF;
import com.desk.abacus.impl.DefaultAbacusAKImplemetation;
import com.desk.abacus.impl.DefaultAbacusBLImplemetation;
import com.desk.abacus.impl.DefaultAbacusCMImplemetation;

public class AbacusPaperGenerator {

	public static void main(String[] args) {
		try {
			new ExportExcel().exportExcelFile();

			Map<String, Collection<Integer>> ak = new DefaultAbacusAKImplemetation().getTables();
			new ExportPDF().exportPDFFile("A-K ZHUSUAN", "D:\\ABACUS\\Papers\\ak.pdf", ak);

			Map<String, Collection<Integer>> bl = new DefaultAbacusBLImplemetation().getTables();
			System.out.print(bl);
			new ExportPDF().exportPDFFile("B-L ZHUSUAN", "D:\\ABACUS\\Papers\\bl.pdf", bl);

			Map<String, Collection<Integer>> cm = new DefaultAbacusCMImplemetation().getTables();
			System.out.print(cm);
			new ExportPDF().exportPDFFile("C-M ZHUSUAN", "D:\\ABACUS\\Papers\\cm.pdf", cm);

		} catch (Exception e) {
			System.out.print("Something went wrong : " + e);
			e.printStackTrace();
		}
	}

}
