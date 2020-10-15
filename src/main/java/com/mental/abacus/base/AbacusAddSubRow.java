package com.mental.abacus.base;

import java.util.Collection;

public interface AbacusAddSubRow {
	public Collection<Integer> generateARow(int rows, int col);

	public Collection<Integer> generateBRow(int rows, int col);

	public Collection<Integer> generateCRow(int rows, int col);

	public Collection<Integer> generateDRow(int rows, int col);

	public Collection<Integer> generateResult(Collection<Integer> result, Collection<Integer> tables);

	public Collection<Integer> generateAddResult(Collection<Integer> tables);
}
