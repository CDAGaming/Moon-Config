package com.electronwill.nightconfig.core;

/**
 * @author TheElectronWill
 */
public class ConcurrentConfigSpec extends ConfigSpec {
	public ConcurrentConfigSpec() {
		super(Config.inMemoryUniversalConcurrent());
	}
}