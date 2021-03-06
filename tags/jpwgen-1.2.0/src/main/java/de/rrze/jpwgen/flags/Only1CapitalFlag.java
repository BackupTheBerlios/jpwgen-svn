package de.rrze.jpwgen.flags;

import de.rrze.jpwgen.IPwGenConstants;
import de.rrze.jpwgen.IPwGenRegEx;

public class Only1CapitalFlag extends AbstractPwFlag
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Only1CapitalFlag()
	{
		mask = IPwGenRegEx.REGEX_ONLY_1_CAPITAL_FLAG;
	}
	
	public int mask(int flags)
	{
		return super.mask(flags) | IPwGenConstants.PW_UPPERS;
	}
	
}
