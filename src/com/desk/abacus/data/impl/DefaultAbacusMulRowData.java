package com.desk.abacus.data.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.desk.abacus.datas.AbacusMulRow;

public class DefaultAbacusMulRowData implements AbacusMulRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();

	@Override
	public Collection<String> multiplication(int multiplicantStart, int multiplicantEnd, int multiplierStart,
			int multiplierEnd) {

		Collection<String> multiple = new ArrayList<>();

		Collection<Integer> multiplicant = new ArrayList<Integer>();
		Collection<Integer> multiplier = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			multiplicant.add(this.defaultAbacusABRowData.positiveSingleDigit(multiplicantStart, multiplicantEnd));
			multiplier.add(this.defaultAbacusABRowData.positiveSingleDigit(multiplierStart, multiplierEnd));
		}

		Iterator<Integer> it1 = multiplicant.iterator();
		Iterator<Integer> it2 = multiplier.iterator();
		while (it1.hasNext() && it2.hasNext()) {
			multiple.add(it1.next() + " * " + it2.next());
		}
		return multiple;
	}

}
