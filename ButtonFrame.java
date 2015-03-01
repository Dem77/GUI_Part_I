import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ButtonFrame extends JFrame
{
	private JButton plainJButton;
	private JButton fancyButton;
	
	public ButtonFrame ()
	{
		super ("Testing Buttons");
		setLayout (new FlowLayout());
		
		plainJButton = new JButton ("Plain Button");
		add (plainJButton);
		
		Icon icon1 = new ImageIcon ("src/1.png");
		Icon icon2 = new ImageIcon ("src/2.png");
		fancyButton = new JButton ("Fancy Button", icon1);
		fancyButton.setRolloverIcon(icon2);
		add (fancyButton);
		
		ButtonHandler handler = new ButtonHandler ();
		plainJButton.addActionListener(handler);
		fancyButton.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			JOptionPane.showMessageDialog (ButtonFrame.this, 
					String.format("You pressed: %s", event.getActionCommand()));
		}
	}
}
