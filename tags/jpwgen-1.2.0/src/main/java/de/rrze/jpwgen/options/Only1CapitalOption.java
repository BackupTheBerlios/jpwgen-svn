package de.rrze.jpwgen.options;

import de.rrze.jpwgen.IPwGenCommandLineOptions;

/**
 * @autor Sheldon Fuchs
 * */
public class Only1CapitalOption implements IPwOption {
    public String getOptionName() {
	return IPwGenCommandLineOptions.CL_REGEX_ONLY_1_CAPITAL;
    }
}
