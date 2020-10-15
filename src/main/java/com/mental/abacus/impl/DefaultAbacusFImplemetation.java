package com.mental.abacus.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.mental.abacus.adaptor.DefaultAbacusABRow;
import com.mental.abacus.data.impl.DefaultAbacusABRowData;
import com.mental.abacus.data.impl.DefaultAbacusDivRowData;
import com.mental.abacus.data.impl.DefaultAbacusMulRowData;
import com.mental.abacus.datas.AbacusDivRow;
import com.mental.abacus.datas.AbacusMulRow;

public class DefaultAbacusFImplemetation extends DefaultAbacusABRow implements AbacusMulRow, AbacusDivRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();
	private DefaultAbacusMulRowData defaultAbacusMulRowData = new DefaultAbacusMulRowData();
	private DefaultAbacusDivRowData defaultAbacusDivRowData = new DefaultAbacusDivRowData();

	public Collection<Integer> generateARow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(5, 9, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(6, 9, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 2 || i == 9 || i == 16 || i == 3) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 5));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 8 || i == 15 || i == 22 || i == 4 || i == 11 || i == 18) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 5));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 3 || i == 10 || i == 17 || i == 5) {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 3));
			} else {
				row5.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row6 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 7 || i == 14 || i == 21 || i == 9) {
				row6.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 5));
			} else {
				row6.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row7 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 4 || i == 11 || i == 18 || i == 23 || i == 24 || i == 25) {
				row7.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row7.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row8 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 6 || i == 13 || i == 20 || i == 22) {
				row8.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row8.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row9 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 23 || i == 24 || i == 25 || i == 8 || i == 15 || i == 22) {
				row9.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row9.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row10 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 5 || i == 12 || i == 19 || i == 8) {
				row10.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row10.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);
		row.addAll(row6);
		row.addAll(row7);
		row.addAll(row8);
		row.addAll(row9);
		row.addAll(row10);

		return row;

	}

	public Collection<Integer> generateBRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(55, 99, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(30, 70, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(40, 50));
			} else {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(10, 20));
			}
		}
		Collection<Integer> row4 = this.defaultAbacusABRowData.positiveSingle(55, 70, 25);
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(30, 60));
			} else {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(33, 50));
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

		Collection<Integer> row1 = this.defaultAbacusABRowData.positiveSingle(55, 99, 25);
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(30, 70, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(20, 40));
			} else {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(10, 20));
			}
		}
		Collection<Integer> row4 = this.defaultAbacusABRowData.positiveSingle(55, 70, 25);
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(30, 50));
			} else {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(50, 60));
			}
		}

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);

		return row;
	}

	@Override
	public Collection<String> division(int dividentStart, int dividentEnd, int devisorStart, int devisorEnd) {
		Collection<String> division = this.defaultAbacusDivRowData.division(dividentStart, dividentEnd, devisorStart,
				devisorEnd);
		return division;
	}

	public Map<String, Collection<Integer>> getTables() {
		Map<String, Collection<Integer>> row = new HashMap<String, Collection<Integer>>();

		row.put("A", this.generateARow());
		row.put("B", this.generateBRow());
		row.put("C", this.generateCRow());

		return row;
	}

	@Override
	public Collection<String> multiplication(int multiplicantStart, int multiplicantEnd, int multiplierStart,
			int multiplierEnd) {
		Collection<String> multiple = this.defaultAbacusMulRowData.multiplication(multiplicantStart, multiplicantEnd,
				multiplierStart, multiplierEnd);
		return multiple;
	}

	public Map<Integer, Collection<String>> getMulDivTables() {

		Map<Integer, Collection<String>> mul = new HashMap<Integer, Collection<String>>();

		Collection<String> mul1 = this.multiplication(35, 94, 2, 9);
		Collection<String> mul2 = this.multiplication(140, 990, 2, 9);
		Collection<String> mul3 = this.division(135, 984, 2, 9);
		Collection<String> mul4 = this.division(140, 990, 2, 9);

		mul.put(1, mul1);
		mul.put(2, mul2);
		mul.put(3, mul3);
		mul.put(4, mul4);

		return mul;
	}
}
