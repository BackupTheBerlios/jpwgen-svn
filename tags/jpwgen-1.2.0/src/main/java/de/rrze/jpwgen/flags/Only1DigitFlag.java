package de.rrze.jpwgen.flags;

import de.rrze.jpwgen.IPwGenRegEx;

public class Only1DigitFlag extends AbstractPwFlag
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Only1DigitFlag()
	{
		mask = IPwGenRegEx.REGEX_ONLY_1_DIGIT_FLAG;
	}

	public int mask(int flags)
	{
		int tmp = new AtLeast2DigitsFlag().unmask(flags);
		return super.mask(new PwNumeralsFlag().mask(tmp));
	}

}
