package de.rrze.jpwgen.options;

import de.rrze.jpwgen.IPwGenCommandLineOptions;

/**
 *  @autor Sheldon Fuchs
 * */
public class AtLeast2DigitsOption implements IPwOption {
    public String getOptionName() {
	return IPwGenCommandLineOptions.CL_REGEX_AT_LEAST_2_DIGITS;
    }
}
