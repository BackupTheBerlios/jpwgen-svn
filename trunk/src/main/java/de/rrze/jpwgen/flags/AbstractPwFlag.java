package de.rrze.jpwgen.flags;

import de.rrze.jpwgen.IPwFlag;
import de.rrze.jpwgen.IPwProcessing;

public abstract class AbstractPwFlag implements IPwFlag, IPwProcessing {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected int mask = 0;

	public int mask(int flags) {
		return flags | mask;
	}

	public int unmask(int flags) {
		return flags & (~mask);
	}

	public int getMask() {
		return mask;
	}

	public boolean isMasked(int flags) {
		return (flags & mask) != 0;
	}
}
