package com.mental.abacus.data.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.mental.abacus.datas.AbacusABRow;

public class DefaultAbacusABRowData implements AbacusABRow {

	@Override
	public Collection<Integer> positiveSingle(int start, int end, int len) {
		Collection<Integer> randomNumber = new ArrayList<Integer>();
		for (int i = 1; i <= len; i++) {
			randomNumber.add((ThreadLocalRandom.current().nextInt(start, end + 1)));
		}
		return randomNumber;
	}

	@Override
	public Collection<Integer> negativeSingle(int num, int end, int len) {
		Collection<Integer> randomNumber = new ArrayList<Integer>();
		for (int i = 1; i <= len; i++) {
			randomNumber.add(-end + new Random().nextInt(num));
		}
		return randomNumber;
	}

	@Override
	public Collection<Integer> mixedSingle(int start, int end, int num, int len) {
		Collection<Integer> randomNumber = new ArrayList<Integer>();
		int leng = 0;
		if (len % 2 == 0) {
			leng = len / 2;
		} else {
			leng = (len / 2) + 1;
		}
		for (int i = 1; i <= leng; i++) {
			if (i == leng) {
				randomNumber.add((ThreadLocalRandom.current().nextInt(start, end + 1)));
			} else {
				randomNumber.add((ThreadLocalRandom.current().nextInt(start, end + 1)));
				randomNumber.add(-end + new Random().nextInt(num));
			}
		}
		return randomNumber;
	}

	@Override
	public Integer positiveSingleDigit(int start, int end) {
		return ThreadLocalRandom.current().nextInt(start, end + 1);
	}

	@Override
	public Integer negativeSingleDigit(int num, int end) {
		return -end + new Random().nextInt(num);
	}
}
