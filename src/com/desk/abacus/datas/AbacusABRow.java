package com.desk.abacus.datas;

import java.util.Collection;

public interface AbacusABRow {

	Collection<Integer> positiveSingle(int start, int end, int len);

	Collection<Integer> negativeSingle(int num, int end, int len);

	Collection<Integer> mixedSingle(int start, int end, int num, int len);

	Integer positiveSingleDigit(int start, int end);

	Integer negativeSingleDigit(int num, int end);
}
