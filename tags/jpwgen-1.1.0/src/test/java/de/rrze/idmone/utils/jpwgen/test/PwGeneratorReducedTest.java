package de.rrze.idmone.utils.jpwgen.test;

import org.apache.maven.surefire.shade.org.apache.commons.lang.time.StopWatch;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import de.rrze.idmone.utils.jpwgen.BlankRemover;
import de.rrze.idmone.utils.jpwgen.PwGenerator;

public class PwGeneratorReducedTest extends PwGeneratorTest
{

	@BeforeClass
	public void setUp()
	{
		System.out.println("======================== "
				+ this.getClass().getSimpleName()
				+ " ================================");
	}

	@AfterClass
	public void finish()
	{
		System.out.println("======================== "
				+ this.getClass().getSimpleName()
				+ " ================================");
	}

	@Test(groups =
	{ "default" }, invocationCount = 20)
	public void reducedSymbolsTest()
	{

		int numPasswords = 30;
		int passLength = 8;

		System.out
				.println("REDUCED SYMBOL TEST STARTED: Generating passwords:");
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		String flags = "-N " + numPasswords + " -M 500 -m 1 -s " + passLength
				+ " -z -r";

		flags = BlankRemover.itrim(flags);
		String[] ar = flags.split(" ");

		PwGenerator.getDefaultBlacklistFilter().addToBlacklist("qwerty");

		process(this.getClass().getSimpleName(), ar, numPasswords, passLength);

		stopWatch.stop();
		System.out.println("\nREDUCED SYMBOL TEST FINISHED Runtime:"
				+ stopWatch.toString() + "\n");
	}
}
