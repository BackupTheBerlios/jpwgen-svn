package de.rrze.jpwgen.options;

import de.rrze.jpwgen.IPwGenCommandLineOptions;

/**
 * @autor Sheldon Fuchs
 * */
public class PwCapitalizeOption implements IPwOption{

    public String getOptionName() {
	return IPwGenCommandLineOptions.CL_CAPITALIZE;
    }
}
