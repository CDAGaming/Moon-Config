package com.electronwill.nightconfig.core.conversion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies that the value of a field must be a String that is contained in a certain array.
 *
 * @author TheElectronWill
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SpecStringInArray {
	/**
	 * @return the values that are allowed
	 */
	String[] value();

	/**
	 * @return {@code true} to ignore the case, {@code false} to check the case. Default is
	 * {@code false}.
	 */
	boolean ignoreCase() default false;
}