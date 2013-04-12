package org.jcryptool.visual.sig;

import java.util.MissingResourceException;

import java.util.ResourceBundle;

import org.eclipse.osgi.util.NLS;
/**
 * Holds the messages for the signature visualization
 *
 */
public class Messages {
	//Name of the files that contain the string values
	private static final String BUNDLE_NAME = "org.jcryptool.visual.sig.messages";
	public static String SigComposite_grpSignatureGeneration;
	public static String SigComposite_grpSignedDoc;
	public static String SigComposite_lblHash;
	public static String SigComposite_lblSignature;
	public static String SigComposite_lblProgress;
	public static String SigComposite_tbtmNewItem_0;
	public static String SigComposite_tbtmNewItem_1;
	public static String SigComposite_tbtmNewItem_2;		
	public static String SigComposite_txtSignature;
	public static String SigComposite_btnSignature;
	public static String SigComposite_btnHash;
	public static String SigComposite_btnOpenInEditor;
	public static String SigComposite_btnReset;
	public static String SigComposite_description;
	public static String SigComposite_group_box_name;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	
	private Messages() {
	}
	//Create the object
	
//	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
//
//	private Messages() {
//	}
//
//	 /**
//     * Returns the value of the required key 
//     *
//     * @param key the key of the required value
//     * @return the value (a string)
//     */
//	public static String getString(String key) {
//		try {
//			return RESOURCE_BUNDLE.getString(key);
//		} catch (MissingResourceException e) {
//			return '!' + key + '!';
//		}
//	
//	}
}
