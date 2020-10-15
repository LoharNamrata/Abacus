package com.mental.abacus.data.impl;

import java.util.ArrayList;
import java.util.Collection;

import com.mental.abacus.datas.AbacusDivRow;

public class DefaultAbacusDivRowData implements AbacusDivRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();

	@Override
	public Collection<String> division(int dividentStart, int dividentEnd, int devisorStart, int devisorEnd) {

		Collection<String> divNo = new ArrayList<>();
		int len = 10;
		for (int i = 1; i >= 1; i++) {

			Integer first = this.defaultAbacusABRowData.positiveSingleDigit(dividentStart, dividentEnd);
			Integer second = this.defaultAbacusABRowData.positiveSingleDigit(devisorStart, devisorEnd);

			if (first % second == 0) {
				divNo.add(first + " / " + second);
				len--;
				if (len == 0) {
					break;
				}
			} else {
				continue;
			}
		}
		return divNo;
	}
}
