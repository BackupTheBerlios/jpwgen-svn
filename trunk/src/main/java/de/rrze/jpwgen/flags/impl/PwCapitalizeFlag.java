package de.rrze.jpwgen.flags.impl;

import de.rrze.jpwgen.flags.AbstractPwFlag;

public class PwCapitalizeFlag extends AbstractPwFlag {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PwCapitalizeFlag() {
		mask = PW_UPPERS;
	}

	public int unmask(int flags) {
		return new Only1CapitalFlag().unmask(super.unmask(flags));
	}
}
