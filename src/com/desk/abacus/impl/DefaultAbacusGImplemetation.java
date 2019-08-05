package com.desk.abacus.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.desk.abacus.adaptor.DefaultAbacusABRow;
import com.desk.abacus.data.impl.DefaultAbacusABRowData;
import com.desk.abacus.data.impl.DefaultAbacusDivRowData;
import com.desk.abacus.data.impl.DefaultAbacusMulRowData;
import com.desk.abacus.datas.AbacusDivRow;
import com.desk.abacus.datas.AbacusMulRow;

public class DefaultAbacusGImplemetation extends DefaultAbacusABRow implements AbacusMulRow, AbacusDivRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();
	private DefaultAbacusMulRowData defaultAbacusMulRowData = new DefaultAbacusMulRowData();
	private DefaultAbacusDivRowData defaultAbacusDivRowData = new DefaultAbacusDivRowData();

	public Collection<Integer> generateARow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(500, 990));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(0, 0));
			}
		}
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(30, 90, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row3.add(this.defaultAbacusABRowData.positiveSingleDigit(60, 99));
				} else {
					row3.add(this.defaultAbacusABRowData.negativeSingleDigit(20, 49));
				}
			} else {
				if (i % 2 != 0) {
					row3.add(this.defaultAbacusABRowData.negativeSingleDigit(30, 40));
				} else {
					row3.add(this.defaultAbacusABRowData.positiveSingleDigit(30, 70));
				}
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row4.add(this.defaultAbacusABRowData.negativeSingleDigit(245, 475));
				} else {
					row4.add(this.defaultAbacusABRowData.positiveSingleDigit(435, 765));
				}
			} else {
				if (i % 2 != 0) {
					row4.add(this.defaultAbacusABRowData.positiveSingleDigit(45, 75));
				} else {
					row4.add(this.defaultAbacusABRowData.negativeSingleDigit(35, 65));
				}
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row5.add(this.defaultAbacusABRowData.positiveSingleDigit(38, 59));
				} else {
					row5.add(this.defaultAbacusABRowData.negativeSingleDigit(38, 59));
				}
			} else {
				if (i % 2 != 0) {
					row5.add(this.defaultAbacusABRowData.positiveSingleDigit(60, 99));
				} else {
					row5.add(this.defaultAbacusABRowData.negativeSingleDigit(60, 99));
				}
			}
		}
		Collection<Integer> row6 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row6.add(this.defaultAbacusABRowData.positiveSingleDigit(45, 75));
				} else {
					row6.add(this.defaultAbacusABRowData.positiveSingleDigit(135, 365));
				}
			} else {
				if (i % 2 != 0) {
					row6.add(this.defaultAbacusABRowData.negativeSingleDigit(35, 55));
				} else {
					row6.add(this.defaultAbacusABRowData.positiveSingleDigit(55, 95));
				}
			}
		}
		Collection<Integer> row7 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row7.add(this.defaultAbacusABRowData.negativeSingleDigit(135, 365));
				} else {
					row7.add(this.defaultAbacusABRowData.positiveSingleDigit(45, 75));
				}
			} else {
				row7.add(this.defaultAbacusABRowData.positiveSingleDigit(55, 95));
			}
		}
		Collection<Integer> row8 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row8.add(this.defaultAbacusABRowData.positiveSingleDigit(345, 575));
				} else {
					row8.add(this.defaultAbacusABRowData.negativeSingleDigit(135, 365));
				}
			} else {
				if (i % 2 == 0) {
					row8.add(this.defaultAbacusABRowData.positiveSingleDigit(45, 75));
				} else {
					row8.add(this.defaultAbacusABRowData.negativeSingleDigit(35, 65));
				}
			}
		}

		Collection<Integer> row9 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row9.add(this.defaultAbacusABRowData.negativeSingleDigit(35, 65));
				} else {
					row9.add(this.defaultAbacusABRowData.positiveSingleDigit(45, 75));
				}
			} else {
				if (i % 2 == 0) {
					row9.add(this.defaultAbacusABRowData.negativeSingleDigit(35, 65));
				} else {
					row9.add(this.defaultAbacusABRowData.positiveSingleDigit(45, 75));
				}
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

		Collection<String> mul1 = this.multiplication(150, 850, 2, 9);
		Collection<String> mul2 = this.multiplication(440, 690, 2, 9);
		Collection<String> mul3 = this.division(135, 694, 2, 9);
		Collection<String> mul4 = this.division(140, 990, 2, 9);

		mul.put(1, mul1);
		mul.put(2, mul2);
		mul.put(3, mul3);
		mul.put(4, mul4);

		return mul;
	}

}
