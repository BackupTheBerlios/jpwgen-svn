package de.rrze.idmone.utils.jpwgen.options;

import de.rrze.idmone.utils.jpwgen.IPwGenCommandLineOptions;

/**
 * @autor Sheldon Fuchs
 * */
public class StartsNoSmallLetterOption implements IPwOption {
    public String getOptionName() {
	return IPwGenCommandLineOptions.CL_REGEX_STARTS_NO_SMALL_LETTER;
    }
}
