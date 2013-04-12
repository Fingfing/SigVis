//This class contains all the code required for the GUI

package org.jcryptool.visual.sig.ui.view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.jcryptool.visual.sig.Messages;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;

public class SigComposite extends Composite implements PaintListener{
	private Text txtHash;
	private Text txtGeneralDescription;
	private Text txtSignature;
	private Canvas canvas1;
//	private Canvas canvas2;

	//Generates all Elements of the GUI
	public SigComposite(Composite parent, int style, SigView view) {
		super(parent, style);
		
		txtGeneralDescription = new Text(this, SWT.MULTI);
    	txtGeneralDescription.setEditable(false);
		txtGeneralDescription.setBounds(10, 10, 699, 45);
		txtGeneralDescription.setText(Messages.SigComposite_description);
		
		Group grpSignatureGeneration = new Group(this, SWT.NONE);
		grpSignatureGeneration.setText(Messages.SigComposite_grpSignatureGeneration); 
		grpSignatureGeneration.setBounds(10, 61, 699, 529);
		
		Label lblHash = new Label(grpSignatureGeneration, SWT.NONE);
		lblHash.setBounds(34, 230, 136, 14);
		lblHash.setText(Messages.SigComposite_lblHash); 
		
		Button btnHash = new Button(grpSignatureGeneration, SWT.NONE);
		btnHash.setBounds(34, 164, 136, 60);
		btnHash.setText(Messages.SigComposite_btnHash);
		
		txtHash = new Text(grpSignatureGeneration, SWT.BORDER);
		txtHash.setBounds(34, 365, 136, 56);
		txtHash.setEditable(false);
		txtHash.setText("<Hash>");
		
		Button btnSignature = new Button(grpSignatureGeneration, SWT.NONE);
		btnSignature.setEnabled(false);
		btnSignature.setBounds(248, 365, 136, 60);
		btnSignature.setText(Messages.SigComposite_btnSignature);
		
		Group grpSignedDoc = new Group(grpSignatureGeneration, SWT.NONE);
		grpSignedDoc.setBounds(463, 207, 212, 261);
		grpSignedDoc.setText(Messages.SigComposite_grpSignedDoc); 
		
		txtSignature = new Text(grpSignedDoc, SWT.BORDER);
		txtSignature.setText(""); 
		txtSignature.setBounds(10, 144, 188, 56);
		
		Button btnOpenInEditor = new Button(grpSignedDoc, SWT.NONE);
		btnOpenInEditor.setBounds(10, 206, 109, 28);
		btnOpenInEditor.setText(Messages.SigComposite_btnOpenInEditor);
		
		TabFolder tabDescription = new TabFolder(grpSignatureGeneration, SWT.NONE);
		tabDescription.setBounds(187, 10, 488, 191);
		
		TabItem tbtmNewItem = new TabItem(tabDescription, SWT.NONE);
		tbtmNewItem.setText(Messages.SigComposite_tbtmNewItem_0); 
		
		TabItem tbtmNewItem_1 = new TabItem(tabDescription, SWT.NONE);
		tbtmNewItem_1.setText(Messages.SigComposite_tbtmNewItem_1); 
		
		TabItem tbtmNewItem_2 = new TabItem(tabDescription, SWT.NONE);
		tbtmNewItem_2.setText(Messages.SigComposite_tbtmNewItem_2); 
		
		Button btnReset = new Button(grpSignatureGeneration, SWT.NONE);
		btnReset.setBounds(581, 474, 94, 28);
		btnReset.setText(Messages.SigComposite_btnReset);
		
		Label lblProgress = new Label(grpSignatureGeneration, SWT.NONE);
		lblProgress.setBounds(492, 481, 83, 14);
		lblProgress.setText(Messages.SigComposite_lblProgress);  
		
		Label lblSignature = new Label(grpSignatureGeneration, SWT.NONE);
		lblSignature.setText(Messages.SigComposite_lblSignature);
		lblSignature.setBounds(248, 431, 136, 14);
		
		canvas1 = new Canvas(grpSignatureGeneration, SWT.NONE);
		canvas1.setBounds(70, 88, 64, 281);
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("strawberry.jpg"));
		} catch (IOException e) {
		}

		
		//canvas2 = new Canvas(grpSignatureGeneration, SWT.NONE);
		//canvas2.setBounds(165, 375, 301, 38);
		
		//Adding the PantListener to all the canvas so the arrows can be drawn
		canvas1.addPaintListener(this);
		//canvas2.addPaintListener(this);
 
	}

	/**
	 * This method paints the arrows used to indicate the steps. They are painted in light grey and are later changed
	 * to a darker grey (stepFinished()).
	 * 
	 * @param e 
	 */
	public void paintControl(PaintEvent e) {
		GC gc = e.gc;
		//Set the used colors
		Color grey = new Color(Display.getCurrent(), 140, 138, 140);
        Color lightGrey = new Color(Display.getCurrent(), 180, 177, 180);
        //Canvas1 - The horizontal part:
        //Get the size of the canvas area
        Rectangle clientArea = canvas1.getClientArea(); 
        int width = clientArea.width; 
        int height = clientArea.height; 
        gc.setBackground(lightGrey); 
        //Color the specified area
        gc.fillRectangle(width/2-10,0,20,height);
        
        //Canvas2 - The horizontal part:
        
        gc.dispose(); 
        
	}
}
