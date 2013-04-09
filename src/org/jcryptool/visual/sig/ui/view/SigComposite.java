package org.jcryptool.visual.sig.ui.view;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class SigComposite extends Composite implements PaintListener{
	private Text txtHash;

	public SigComposite(Composite parent, int style, SigView view) {
		super(parent, style);
		
		txtHash = new Text(this, SWT.BORDER);
		txtHash.setEditable(false);
		txtHash.setText("Hash");
		txtHash.setBounds(28, 371, 136, 19);
		
		Button btnHash = new Button(this, SWT.NONE);
		btnHash.setBounds(28, 293, 136, 62);
		btnHash.setText("Hashfunktion");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintControl(PaintEvent e) {
		// TODO Auto-generated method stub
		
	}
}
