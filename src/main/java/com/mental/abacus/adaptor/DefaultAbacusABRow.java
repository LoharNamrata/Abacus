package com.mental.abacus.adaptor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import com.mental.abacus.base.AbacusAddSubRow;

public class DefaultAbacusABRow implements AbacusAddSubRow {

	@Override
	public Collection<Integer> generateARow(int rows, int col) {
		return Collections.emptyList();
	}

	@Override
	public Collection<Integer> generateBRow(int rows, int col) {
		return Collections.emptyList();
	}

	@Override
	public Collection<Integer> generateCRow(int rows, int col) {
		return Collections.emptyList();
	}

	@Override
	public Collection<Integer> generateDRow(int rows, int col) {
		return Collections.emptyList();
	}

	@Override
	public Collection<Integer> generateResult(Collection<Integer> result, Collection<Integer> tables) {
		Collection<Integer> res = new ArrayList<>();

		Iterator<Integer> i1 = result.iterator();
		Iterator<Integer> i2 = tables.iterator();
		while (i1.hasNext() && i2.hasNext()) {
			Integer a1 = i1.next();
			Integer a2 = i2.next();

			Integer a3 = a1 + a2;
			if (a3 < 0) {
				a2 = a1 - 2;
				a3 = a1 + (-a2);
			}
			res.add(a3);
		}
		return res;
	}

	@Override
	public Collection<Integer> generateAddResult(Collection<Integer> tables) {
		return Collections.emptyList();
	}
}
