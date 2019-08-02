package com.desk.abacus.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.desk.abacus.adaptor.DefaultAbacusABRow;
import com.desk.abacus.data.impl.DefaultAbacusABRowData;
import com.desk.abacus.datas.AbacusDivRow;
import com.desk.abacus.datas.AbacusMulRow;

public class DefaultAbacusGImplemetation extends DefaultAbacusABRow implements AbacusMulRow, AbacusDivRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();

	public Collection<Integer> generateARow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(50, 99));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(500, 800));
			}
		}
		Collection<Integer> row2 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(10, 59));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(300, 700));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 5 == 0) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(20, 50));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(35, 75));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(50, 59));
			} else {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(339, 209));
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 5 != 0) {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(50, 99));
			} else {
				row5.add(this.defaultAbacusABRowData.positiveSingleDigit(45, 85));
			}
		}
		Collection<Integer> row6 = this.defaultAbacusABRowData.positiveSingle(60, 90, 25);
		Collection<Integer> row7 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row7.add(this.defaultAbacusABRowData.negativeSingleDigit(59, 59));
			} else {
				row7.add(this.defaultAbacusABRowData.negativeSingleDigit(330, 200));
			}
		}
		Collection<Integer> row8 = this.defaultAbacusABRowData.positiveSingle(30, 90, 25);
		Collection<Integer> row9 = this.defaultAbacusABRowData.positiveSingle(80, 90, 25);

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
	public Map<Integer, Integer> division(int dividentStart, int dividentEnd, int devisorStart, int devisorEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Integer> multiplication(int multiplicantStart, int multiplicantEnd, int multiplierStart,
			int multiplierEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Collection<Integer>> getTables() {
		Map<String, Collection<Integer>> row = new HashMap<String, Collection<Integer>>();

		row.put("A", this.generateARow());

		return row;
	}

}
