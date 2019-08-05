package com.desk.abacus.index;

import java.util.Collection;
import java.util.Map;

import com.desk.abacus.export.ExportExcel;
import com.desk.abacus.export.ExportPDF;
import com.desk.abacus.impl.DefaultAbacusAKImplemetation;
import com.desk.abacus.impl.DefaultAbacusBLImplemetation;
import com.desk.abacus.impl.DefaultAbacusCMImplemetation;
import com.desk.abacus.impl.DefaultAbacusDNImplemetation;
import com.desk.abacus.impl.DefaultAbacusEOImplemetation;
import com.desk.abacus.impl.DefaultAbacusFImplemetation;
import com.desk.abacus.impl.DefaultAbacusGImplemetation;
import com.desk.abacus.impl.DefaultAbacusGML1Implemetation;
import com.desk.abacus.impl.DefaultAbacusGML2Implemetation;
import com.desk.abacus.impl.DefaultAbacusGML3Implemetation;
import com.desk.abacus.impl.DefaultAbacusHImplemetation;
import com.desk.abacus.impl.DefaultAbacusIImplemetation;
import com.desk.abacus.impl.DefaultAbacusJImplemetation;

public class AbacusPaperGenerator {

	public static void main(String[] args) {
		try {
			new ExportExcel().exportExcelFile();

			Map<String, Collection<Integer>> ak = new DefaultAbacusAKImplemetation().getTables();
			new ExportPDF().exportPDFFile("A-K ZHUSUAN", "D:\\ABACUS\\Papers\\ak.pdf", ak, null);

			Map<String, Collection<Integer>> bl = new DefaultAbacusBLImplemetation().getTables();
			new ExportPDF().exportPDFFile("B-L MENTAL", "D:\\ABACUS\\Papers\\bl.pdf", bl, null);

			Map<String, Collection<Integer>> cm = new DefaultAbacusCMImplemetation().getTables();
			new ExportPDF().exportPDFFile("C-M MENTAL", "D:\\ABACUS\\Papers\\cm.pdf", cm, null);

			Map<String, Collection<Integer>> dn = new DefaultAbacusDNImplemetation().getTables();
			new ExportPDF().exportPDFFile("D-N MENTAL", "D:\\ABACUS\\Papers\\dn.pdf", dn, null);

			Map<String, Collection<Integer>> eo = new DefaultAbacusEOImplemetation().getTables();
			Map<Integer, Collection<String>> mulEO = new DefaultAbacusEOImplemetation().getMulTables(4);
			new ExportPDF().exportPDFFile("E-O", "D:\\ABACUS\\Papers\\eo.pdf", eo, mulEO);

			Map<String, Collection<Integer>> f = new DefaultAbacusFImplemetation().getTables();
			Map<Integer, Collection<String>> mulDivF = new DefaultAbacusFImplemetation().getMulDivTables();
			new ExportPDF().exportPDFFile("F-CATEGORY", "D:\\ABACUS\\Papers\\f.pdf", f, mulDivF);

			Map<String, Collection<Integer>> g = new DefaultAbacusGImplemetation().getTables();
			Map<Integer, Collection<String>> mulDivG = new DefaultAbacusGImplemetation().getMulDivTables();
			new ExportPDF().exportPDFFile("G-CATEGORY", "D:\\ABACUS\\Papers\\g.pdf", g, mulDivG);

			Map<String, Collection<Integer>> h = new DefaultAbacusHImplemetation().getTables();
			Map<Integer, Collection<String>> mulDivH = new DefaultAbacusHImplemetation().getMulDivTables();
			new ExportPDF().exportPDFFile("H-CATEGORY", "D:\\ABACUS\\Papers\\h.pdf", h, mulDivH);

			Map<String, Collection<Integer>> i = new DefaultAbacusIImplemetation().getTables();
			Map<Integer, Collection<String>> mulDivI = new DefaultAbacusIImplemetation().getMulDivTables();
			new ExportPDF().exportPDFFile("I-CATEGORY", "D:\\ABACUS\\Papers\\i.pdf", i, mulDivI);

			Map<String, Collection<Integer>> j = new DefaultAbacusJImplemetation().getTables();
			Map<Integer, Collection<String>> mulDivJ = new DefaultAbacusJImplemetation().getMulDivTables();
			new ExportPDF().exportPDFFile("J-CATEGORY", "D:\\ABACUS\\Papers\\j.pdf", j, mulDivJ);

			Map<String, Collection<Integer>> gm1 = new DefaultAbacusGML1Implemetation().getTables();
			Map<Integer, Collection<String>> mulDivGM1 = new DefaultAbacusGML1Implemetation().getMulDivTables();
			new ExportPDF().exportPDFFile("GM1-CATEGORY", "D:\\ABACUS\\Papers\\gml1.pdf", gm1, mulDivGM1);

			Map<String, Collection<Integer>> gm2 = new DefaultAbacusGML2Implemetation().getTables();
			Map<Integer, Collection<String>> mulDivGM2 = new DefaultAbacusGML2Implemetation().getMulDivTables();
			new ExportPDF().exportPDFFile("GM2-CATEGORY", "D:\\ABACUS\\Papers\\gml2.pdf", gm2, mulDivGM2);

			Map<String, Collection<Integer>> gm3 = new DefaultAbacusGML3Implemetation().getTables();
			Map<Integer, Collection<String>> mulDivGM3 = new DefaultAbacusGML3Implemetation().getMulDivTables();
			new ExportPDF().exportPDFFile("GM3-CATEGORY", "D:\\ABACUS\\Papers\\gml3.pdf", gm3, mulDivGM3);

			System.out.println("Generated....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
