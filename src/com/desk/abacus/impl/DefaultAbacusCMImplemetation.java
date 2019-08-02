package com.desk.abacus.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.desk.abacus.adaptor.DefaultAbacusABRow;
import com.desk.abacus.data.impl.DefaultAbacusABRowData;

public class DefaultAbacusCMImplemetation extends DefaultAbacusABRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();

	public Collection<Integer> generateARow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);
		Collection<Integer> row3 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 3));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(44, 95));
			}
		}
		Collection<Integer> row5 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);

		return row;
	}

	public Collection<Integer> generateBRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);
		Collection<Integer> row3 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 6 == 0 && i % 7 == 0) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 3));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(4, 9));
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 9 == 0 && i % 10 == 0 && i % 11 == 0 && i % 12 == 0) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 3));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(2, 9));
			}
		}
		Collection<Integer> row6 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 7 == 0) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 3));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 5));
			}
		}

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);
		row.addAll(row6);

		return row;
	}

	public Collection<Integer> generateCRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(15, 99, 25);
		Collection<Integer> row2 = new ArrayList<Integer>();
		for (Integer item : row1) {
			if (item >= 60) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(33, 69));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (Integer item : row2) {
			if (item > 10) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(50, 30));
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

	public Collection<Integer> generateDRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(60, 99, 25);
		Collection<Integer> row2 = new ArrayList<Integer>();
		for (Integer item : row1) {
			if (item >= 60) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(33, 69));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (Integer item : row2) {
			if (item > 10) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(50, 30));
			} else if (item > 5) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 9));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 3));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(4, 9));
			}
		}
		Collection<Integer> row5 = this.defaultAbacusABRowData.positiveSingle(1, 9, 25);
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(40, 20));
			} else {
				row5.add(this.defaultAbacusABRowData.positiveSingleDigit(40, 70));
			}
		}

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
