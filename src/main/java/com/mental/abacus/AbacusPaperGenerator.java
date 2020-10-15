package com.mental.abacus;

import java.util.Collection;
import java.util.Map;

import com.mental.abacus.export.ExportExcel;
import com.mental.abacus.export.ExportPDF;
import com.mental.abacus.impl.DefaultAbacusAKImplemetation;
import com.mental.abacus.impl.DefaultAbacusBLImplemetation;
import com.mental.abacus.impl.DefaultAbacusCMImplemetation;
import com.mental.abacus.impl.DefaultAbacusDNImplemetation;
import com.mental.abacus.impl.DefaultAbacusEOImplemetation;
import com.mental.abacus.impl.DefaultAbacusFImplemetation;
import com.mental.abacus.impl.DefaultAbacusGImplemetation;
import com.mental.abacus.impl.DefaultAbacusGML1Implemetation;
import com.mental.abacus.impl.DefaultAbacusGML2Implemetation;
import com.mental.abacus.impl.DefaultAbacusGML3Implemetation;
import com.mental.abacus.impl.DefaultAbacusHImplemetation;
import com.mental.abacus.impl.DefaultAbacusIImplemetation;
import com.mental.abacus.impl.DefaultAbacusJImplemetation;

public class AbacusPaperGenerator {

	public static void main(String[] args) {
		try {
			new ExportExcel().exportExcelFile();

			for (int a = 1; a <= 10; a++) {
				Map<String, Collection<Integer>> ak = new DefaultAbacusAKImplemetation().getTables();
				new ExportPDF().exportPDFFile("A-K ZHUSUAN", "D:\\Projects\\ABACUS\\Papers\\ak" + a + ".pdf", ak, null);

				Map<String, Collection<Integer>> bl = new DefaultAbacusBLImplemetation().getTables();
				new ExportPDF().exportPDFFile("B-L MENTAL", "D:\\Projects\\ABACUS\\Papers\\bl" + a + ".pdf", bl, null);

				Map<String, Collection<Integer>> cm = new DefaultAbacusCMImplemetation().getTables();
				new ExportPDF().exportPDFFile("C-M MENTAL", "D:\\Projects\\ABACUS\\Papers\\cm" + a + ".pdf", cm, null);

				Map<String, Collection<Integer>> dn = new DefaultAbacusDNImplemetation().getTables();
				new ExportPDF().exportPDFFile("D-N MENTAL", "D:\\Projects\\ABACUS\\Papers\\dn" + a + ".pdf", dn, null);

				Map<String, Collection<Integer>> eo = new DefaultAbacusEOImplemetation().getTables();
				Map<Integer, Collection<String>> mulEO = new DefaultAbacusEOImplemetation().getMulTables(4);
				new ExportPDF().exportPDFFile("E-O", "D:\\Projects\\ABACUS\\Papers\\eo" + a + ".pdf", eo, mulEO);

				Map<String, Collection<Integer>> f = new DefaultAbacusFImplemetation().getTables();
				Map<Integer, Collection<String>> mulDivF = new DefaultAbacusFImplemetation().getMulDivTables();
				new ExportPDF().exportPDFFile("F-CATEGORY", "D:\\Projects\\ABACUS\\Papers\\f" + a + ".pdf", f, mulDivF);

				Map<String, Collection<Integer>> g = new DefaultAbacusGImplemetation().getTables();
				Map<Integer, Collection<String>> mulDivG = new DefaultAbacusGImplemetation().getMulDivTables();
				new ExportPDF().exportPDFFile("G-CATEGORY", "D:\\Projects\\ABACUS\\Papers\\g" + a + ".pdf", g, mulDivG);

				Map<String, Collection<Integer>> h = new DefaultAbacusHImplemetation().getTables();
				Map<Integer, Collection<String>> mulDivH = new DefaultAbacusHImplemetation().getMulDivTables();
				new ExportPDF().exportPDFFile("H-CATEGORY", "D:\\Projects\\ABACUS\\Papers\\h" + a + ".pdf", h, mulDivH);

				Map<String, Collection<Integer>> i = new DefaultAbacusIImplemetation().getTables();
				Map<Integer, Collection<String>> mulDivI = new DefaultAbacusIImplemetation().getMulDivTables();
				new ExportPDF().exportPDFFile("I-CATEGORY", "D:\\Projects\\ABACUS\\Papers\\i" + a + ".pdf", i, mulDivI);

				Map<String, Collection<Integer>> j = new DefaultAbacusJImplemetation().getTables();
				Map<Integer, Collection<String>> mulDivJ = new DefaultAbacusJImplemetation().getMulDivTables();
				new ExportPDF().exportPDFFile("J-CATEGORY", "D:\\Projects\\ABACUS\\Papers\\j" + a + ".pdf", j, mulDivJ);

				Map<String, Collection<Integer>> gm1 = new DefaultAbacusGML1Implemetation().getTables();
				Map<Integer, Collection<String>> mulDivGM1 = new DefaultAbacusGML1Implemetation().getMulDivTables();
				new ExportPDF().exportPDFFile("GM1-CATEGORY", "D:\\Projects\\ABACUS\\Papers\\gml1" + a + ".pdf", gm1,
						mulDivGM1);

				Map<String, Collection<Integer>> gm2 = new DefaultAbacusGML2Implemetation().getTables();
				Map<Integer, Collection<String>> mulDivGM2 = new DefaultAbacusGML2Implemetation().getMulDivTables();
				new ExportPDF().exportPDFFile("GM2-CATEGORY", "D:\\Projects\\ABACUS\\Papers\\gml2" + a + ".pdf", gm2,
						mulDivGM2);

				Map<String, Collection<Integer>> gm3 = new DefaultAbacusGML3Implemetation().getTables();
				Map<Integer, Collection<String>> mulDivGM3 = new DefaultAbacusGML3Implemetation().getMulDivTables();
				new ExportPDF().exportPDFFile("GM3-CATEGORY", "D:\\Projects\\ABACUS\\Papers\\gml3" + a + ".pdf", gm3,
						mulDivGM3);

				System.out.println("Generated....");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
