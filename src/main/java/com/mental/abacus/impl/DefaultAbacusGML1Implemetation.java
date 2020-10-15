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

public class DefaultAbacusGML1Implemetation extends DefaultAbacusABRow implements AbacusMulRow, AbacusDivRow {

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
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(280, 890));
			}
		}
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(530, 990, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row3.add(this.defaultAbacusABRowData.positiveSingleDigit(560, 899));
				} else {
					row3.add(this.defaultAbacusABRowData.negativeSingleDigit(220, 449));
				}
			} else {
				if (i % 2 != 0) {
					row3.add(this.defaultAbacusABRowData.negativeSingleDigit(230, 640));
				} else {
					row3.add(this.defaultAbacusABRowData.positiveSingleDigit(430, 970));
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
					row4.add(this.defaultAbacusABRowData.positiveSingleDigit(445, 875));
				} else {
					row4.add(this.defaultAbacusABRowData.negativeSingleDigit(335, 565));
				}
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row5.add(this.defaultAbacusABRowData.positiveSingleDigit(338, 859));
				} else {
					row5.add(this.defaultAbacusABRowData.negativeSingleDigit(238, 659));
				}
			} else {
				if (i % 2 != 0) {
					row5.add(this.defaultAbacusABRowData.positiveSingleDigit(560, 699));
				} else {
					row5.add(this.defaultAbacusABRowData.negativeSingleDigit(260, 499));
				}
			}
		}
		Collection<Integer> row6 = this.defaultAbacusABRowData.positiveSingle(560, 990, 25);

		Collection<Integer> row7 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row7.add(this.defaultAbacusABRowData.positiveSingleDigit(345, 575));
				} else {
					row7.add(this.defaultAbacusABRowData.positiveSingleDigit(135, 365));
				}
			} else {
				if (i % 2 != 0) {
					row7.add(this.defaultAbacusABRowData.negativeSingleDigit(235, 455));
				} else {
					row7.add(this.defaultAbacusABRowData.positiveSingleDigit(255, 695));
				}
			}
		}
		Collection<Integer> row8 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row8.add(this.defaultAbacusABRowData.negativeSingleDigit(135, 365));
				} else {
					row8.add(this.defaultAbacusABRowData.positiveSingleDigit(345, 675));
				}
			} else {
				row8.add(this.defaultAbacusABRowData.positiveSingleDigit(555, 795));
			}
		}
		Collection<Integer> row9 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 == 0) {
					row9.add(this.defaultAbacusABRowData.positiveSingleDigit(345, 575));
				} else {
					row9.add(this.defaultAbacusABRowData.negativeSingleDigit(135, 365));
				}
			} else {
				if (i % 2 != 0) {
					row9.add(this.defaultAbacusABRowData.positiveSingleDigit(545, 975));
				} else {
					row9.add(this.defaultAbacusABRowData.negativeSingleDigit(235, 465));
				}
			}
		}

		Collection<Integer> row10 = this.defaultAbacusABRowData.positiveSingle(560, 990, 25);

		Collection<Integer> row11 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 12) {
				if (i % 2 != 0) {
					row11.add(this.defaultAbacusABRowData.negativeSingleDigit(135, 365));
				} else {
					row11.add(this.defaultAbacusABRowData.positiveSingleDigit(345, 575));
				}
			} else {
				if (i % 2 == 0) {
					row11.add(this.defaultAbacusABRowData.negativeSingleDigit(235, 465));
				} else {
					row11.add(this.defaultAbacusABRowData.positiveSingleDigit(445, 875));
				}
			}
		}

		Collection<Integer> row12 = this.defaultAbacusABRowData.positiveSingle(360, 990, 25);

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
		row.addAll(row11);
		row.addAll(row12);

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

		Collection<String> mul1 = this.multiplication(120, 990, 62, 87);
		Collection<String> mul2 = this.multiplication(224, 680, 36, 99);
		Collection<String> mul3 = this.division(13577, 94999, 256, 980);
		Collection<String> mul4 = this.division(24567, 99800, 338, 950);

		mul.put(1, mul1);
		mul.put(2, mul2);
		mul.put(3, mul3);
		mul.put(4, mul4);

		return mul;
	}

}
