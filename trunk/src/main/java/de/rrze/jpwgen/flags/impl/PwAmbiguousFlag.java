package de.rrze.jpwgen.flags.impl;

import de.rrze.jpwgen.IPwGenConstants;
import de.rrze.jpwgen.flags.AbstractPwFlag;

public class PwAmbiguousFlag extends AbstractPwFlag
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PwAmbiguousFlag()
	{
		mask = IPwGenConstants.PW_AMBIGUOUS;
	}
}