package com.mental.abacus.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.mental.abacus.adaptor.DefaultAbacusABRow;
import com.mental.abacus.data.impl.DefaultAbacusABRowData;

public class DefaultAbacusBLImplemetation extends DefaultAbacusABRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();

	public Collection<Integer> generateARow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		Iterator<Integer> it1 = row1.iterator();
		Iterator<Integer> it2 = row2.iterator();
		while (it1.hasNext() && it2.hasNext()) {
			Integer i1 = it1.next();
			Integer i2 = it2.next();
			if (i1 > 7 && i2 > 7) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 9));
			} else {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 4));
			}
		}
		Collection<Integer> row4 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);

		return row;
	}

	public Collection<Integer> generateBRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (Integer item : row2) {
			if (item >= 6) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 4));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (Integer item : row3) {
			if (item >= 6) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 4));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		Iterator<Integer> it1 = row3.iterator();
		Iterator<Integer> it2 = row4.iterator();
		while (it1.hasNext() && it2.hasNext()) {
			Integer i1 = it1.next();
			Integer i2 = it2.next();
			if (i1 < 0 || i2 < 0) {
				row5.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			} else {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			}
		}

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);

		return row;
	}

	public Collection<Integer> generateCRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(15, 99, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (Integer item : row2) {
			if (item >= 6) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (Integer item : row3) {
			if (item >= 6) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);

		return row;
	}

	public Collection<Integer> generateDRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(15, 99, 25);
		Collection<Integer> row2 = new ArrayList<Integer>();
		for (Integer item : row1) {
			if (item >= 60) {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			} else {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(33, 69));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (Integer item : row2) {
			if (item > 10) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(40, 40));
			} else if (item > 5) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 9));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row4 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);
		Collection<Integer> row5 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);

		return row;
	}

	public Map<String, Collection<Integer>> getTables() {
		Map<String, Collection<Integer>> row = new HashMap<String, Collection<Integer>>();

		row.put("A", this.generateARow());
		row.put("B", this.generateBRow());
		row.put("C", this.generateCRow());
		row.put("D", this.generateDRow());

		return row;
	}

}
