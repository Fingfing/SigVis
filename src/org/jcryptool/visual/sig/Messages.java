package org.jcryptool.visual.sig;

import java.util.MissingResourceException;

import java.util.ResourceBundle;
/**
 * Holds the messages for the signature visualization
 *
 */
public class Messages {
	//Name of the files that contain the string values
	private static final String BUNDLE_NAME = "org.jcryptool.visual.sig.messages";

	//Create the object
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	 /**
     * Returns the value of the required key 
     *
     * @param key the key of the required value
     * @return the value (a string)
     */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
