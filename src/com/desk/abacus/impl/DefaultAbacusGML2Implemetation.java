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

public class DefaultAbacusGML2Implemetation extends DefaultAbacusABRow implements AbacusMulRow, AbacusDivRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();
	private DefaultAbacusMulRowData defaultAbacusMulRowData = new DefaultAbacusMulRowData();
	private DefaultAbacusDivRowData defaultAbacusDivRowData = new DefaultAbacusDivRowData();

	public Collection<Integer> generateARow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(0, 0));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(280, 890));
			}
		}
		Collection<Integer> row2 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(0, 0));
			} else {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(280, 890));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(0, 0));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(280, 890));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 == 0) {
					row4.add(this.defaultAbacusABRowData.positiveSingleDigit(5600, 8999));
				} else {
					row4.add(this.defaultAbacusABRowData.positiveSingleDigit(5200, 9490));
				}
			} else {
				if (i % 2 != 0) {
					row4.add(this.defaultAbacusABRowData.negativeSingleDigit(230, 640));
				} else {
					row4.add(this.defaultAbacusABRowData.positiveSingleDigit(430, 970));
				}
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 == 0) {
					row5.add(this.defaultAbacusABRowData.positiveSingleDigit(1245, 4750));
				} else {
					row5.add(this.defaultAbacusABRowData.positiveSingleDigit(2435, 5765));
				}
			} else {
				if (i % 2 != 0) {
					row5.add(this.defaultAbacusABRowData.positiveSingleDigit(445, 875));
				} else {
					row5.add(this.defaultAbacusABRowData.positiveSingleDigit(335, 565));
				}
			}
		}
		Collection<Integer> row6 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 == 0) {
					row6.add(this.defaultAbacusABRowData.positiveSingleDigit(6338, 9859));
				} else {
					row6.add(this.defaultAbacusABRowData.negativeSingleDigit(2238, 5659));
				}
			} else {
				if (i % 2 != 0) {
					row6.add(this.defaultAbacusABRowData.positiveSingleDigit(560, 699));
				} else {
					row6.add(this.defaultAbacusABRowData.negativeSingleDigit(260, 499));
				}
			}
		}
		Collection<Integer> row7 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 != 0) {
					row7.add(this.defaultAbacusABRowData.positiveSingleDigit(2338, 9859));
				} else {
					row7.add(this.defaultAbacusABRowData.negativeSingleDigit(3238, 5659));
				}
			} else {
				if (i % 2 == 0) {
					row7.add(this.defaultAbacusABRowData.positiveSingleDigit(560, 699));
				} else {
					row7.add(this.defaultAbacusABRowData.negativeSingleDigit(260, 499));
				}
			}
		}

		Collection<Integer> row8 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 != 0) {
					row8.add(this.defaultAbacusABRowData.positiveSingleDigit(5345, 8575));
				} else {
					row8.add(this.defaultAbacusABRowData.positiveSingleDigit(3135, 8365));
				}
			} else {
				if (i % 2 == 0) {
					row7.add(this.defaultAbacusABRowData.negativeSingleDigit(235, 455));
				} else {
					row7.add(this.defaultAbacusABRowData.positiveSingleDigit(255, 695));
				}
			}
		}
		Collection<Integer> row9 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 == 0) {
					row9.add(this.defaultAbacusABRowData.positiveSingleDigit(3135, 6365));
				} else {
					row9.add(this.defaultAbacusABRowData.positiveSingleDigit(4345, 7675));
				}
			} else {
				row9.add(this.defaultAbacusABRowData.positiveSingleDigit(555, 795));
			}
		}
		Collection<Integer> row10 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 == 0) {
					row10.add(this.defaultAbacusABRowData.positiveSingleDigit(5345, 9575));
				} else {
					row10.add(this.defaultAbacusABRowData.negativeSingleDigit(3135, 5365));
				}
			} else {
				if (i % 2 != 0) {
					row10.add(this.defaultAbacusABRowData.positiveSingleDigit(545, 975));
				} else {
					row10.add(this.defaultAbacusABRowData.negativeSingleDigit(235, 465));
				}
			}
		}

		Collection<Integer> row11 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 != 0) {
					row11.add(this.defaultAbacusABRowData.positiveSingleDigit(2135, 5365));
				} else {
					row11.add(this.defaultAbacusABRowData.positiveSingleDigit(3345, 8575));
				}
			} else {
				if (i % 2 == 0) {
					row11.add(this.defaultAbacusABRowData.positiveSingleDigit(235, 465));
				} else {
					row11.add(this.defaultAbacusABRowData.positiveSingleDigit(445, 875));
				}
			}
		}

		Collection<Integer> row12 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 == 0) {
					row12.add(this.defaultAbacusABRowData.negativeSingleDigit(3135, 5365));
				} else {
					row12.add(this.defaultAbacusABRowData.positiveSingleDigit(4345, 9575));
				}
			} else {
				if (i % 2 != 0) {
					row12.add(this.defaultAbacusABRowData.negativeSingleDigit(235, 465));
				} else {
					row12.add(this.defaultAbacusABRowData.positiveSingleDigit(445, 875));
				}
			}
		}
		Collection<Integer> row13 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 != 0) {
					row13.add(this.defaultAbacusABRowData.negativeSingleDigit(2135, 6365));
				} else {
					row13.add(this.defaultAbacusABRowData.positiveSingleDigit(4345, 6575));
				}
			} else {
				if (i % 2 == 0) {
					row13.add(this.defaultAbacusABRowData.negativeSingleDigit(235, 465));
				} else {
					row13.add(this.defaultAbacusABRowData.positiveSingleDigit(445, 875));
				}
			}
		}
		Collection<Integer> row14 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 == 0) {
					row14.add(this.defaultAbacusABRowData.negativeSingleDigit(1135, 5365));
				} else {
					row14.add(this.defaultAbacusABRowData.positiveSingleDigit(3345, 7575));
				}
			} else {
				if (i % 2 != 0) {
					row14.add(this.defaultAbacusABRowData.negativeSingleDigit(235, 465));
				} else {
					row14.add(this.defaultAbacusABRowData.positiveSingleDigit(445, 875));
				}
			}
		}
		Collection<Integer> row15 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 13) {
				if (i % 2 != 0) {
					row15.add(this.defaultAbacusABRowData.positiveSingleDigit(2135, 9365));
				} else {
					row15.add(this.defaultAbacusABRowData.positiveSingleDigit(1345, 6575));
				}
			} else {
				if (i % 2 == 0) {
					row15.add(this.defaultAbacusABRowData.positiveSingleDigit(235, 465));
				} else {
					row15.add(this.defaultAbacusABRowData.positiveSingleDigit(445, 875));
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
		row.addAll(row10);
		row.addAll(row11);
		row.addAll(row12);
		row.addAll(row13);
		row.addAll(row14);
		row.addAll(row15);

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

		Collection<String> mul1 = this.multiplication(120, 990, 462, 987);
		Collection<String> mul2 = this.multiplication(224, 680, 360, 994);
		Collection<String> mul3 = this.division(14890, 78906, 234, 980);
		Collection<String> mul4 = this.division(144556, 999000, 150, 960);

		mul.put(1, mul1);
		mul.put(2, mul2);
		mul.put(3, mul3);
		mul.put(4, mul4);

		return mul;
	}

}
