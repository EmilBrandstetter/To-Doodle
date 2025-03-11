import java.awt.Color;
// import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;
import javax.swing.*;
// import java.util.*;

public class app extends JFrame implements ActionListener{
	
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
	Border border = new LineBorder(Color.green);

	
	app()
	{
		
		
		button.setText("The Button");
		button.setFocusable(false);
		button.addActionListener(this);
				
		label.setText("The Label");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
			
		panel.setBackground(Color.GREEN);
		panel.add(label);
		panel.add(button);
		panel.setBounds(0, 0, 500, 500);		
		
		this.setTitle("The Title");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setResizable(false);
		this.setBounds(0, 0, 100, 100);
		this.setVisible(true);

		
		
		
	}


    @Override
	public void actionPerformed(ActionEvent e) {

		int x = 1;
		if(e.getSource()==button)
		{	
			if(x==0) 
			{
			button.setText("Click here:");
			label.setText(" You clicked the button! :) ");
			this.pack();
			this.setVisible(true);
			x=1;
			}
			else
			{
				button.setVisible(false);
				label.setText("You can now close the window");
				this.setResizable(true);
				this.pack();
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
	}
	
}
