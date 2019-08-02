package com.desk.abacus.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.desk.abacus.adaptor.DefaultAbacusABRow;
import com.desk.abacus.data.impl.DefaultAbacusABRowData;

public class DefaultAbacusAKImplemetation extends DefaultAbacusABRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();

	public Collection<Integer> generateARow() {
		Collection<Integer> rowA = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);

		Collection<Integer> row2 = new ArrayList<Integer>();
		for (Integer item : row1) {
			if (item >= 6) {
				row2.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 4));
			} else {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (Integer item : row2) {
			if (item < 0) {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			} else {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 7));
			}
		}
		rowA.addAll(row1);
		rowA.addAll(row2);
		rowA.addAll(row3);

		return rowA;
	}

	public Collection<Integer> generateBRow() {
		Collection<Integer> rowB = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);
		Collection<Integer> row2 = new ArrayList<Integer>();
		for (Integer item : row1) {
			if (item >= 6) {
				row2.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 4));
			} else {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (Integer item : row2) {
			if (item < 0) {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			} else if (item >= 6) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 4));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		Iterator<Integer> it1 = row2.iterator();
		Iterator<Integer> it2 = row3.iterator();
		while (it1.hasNext() && it2.hasNext()) {
			Integer i1 = it1.next();
			Integer i2 = it2.next();
			if (i1 < 0 || i2 < 0) {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			} else {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 4));
			}
		}

		rowB.addAll(row1);
		rowB.addAll(row2);
		rowB.addAll(row3);
		rowB.addAll(row4);

		return rowB;
	}

	public Collection<Integer> generateCRow() {
		Collection<Integer> rowC = new ArrayList<Integer>();

		Collection<Integer> row1 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(55, 99));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(5, 9));
			}
		}
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);
		Collection<Integer> row3 = this.defaultAbacusABRowData.negativeSingle(9, 9, 25);
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(2, 9));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(44, 95));
			}
		}

		rowC.addAll(row1);
		rowC.addAll(row2);
		rowC.addAll(row3);
		rowC.addAll(row4);

		return rowC;
	}

	public Collection<Integer> generateDRow() {
		Collection<Integer> rowD = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(55, 99, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(5, 9, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 5 == 0) {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(4, 4));
			} else {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(30, 30));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (Integer item : row3) {
			if (item < -9) {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(4, 9));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(33, 66));
			}
		}

		rowD.addAll(row1);
		rowD.addAll(row2);
		rowD.addAll(row3);
		rowD.addAll(row4);

		return rowD;
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
