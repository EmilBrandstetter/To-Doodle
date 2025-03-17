import java.awt.Color;
// import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;
import javax.swing.*;
// import java.util.*;

public class app extends JFrame implements ActionListener{
	
	JPanel toDoApp = new JPanel();
	JPanel topMenu = new JPanel();
	JPanel tasks = new JPanel();
	JPanel topMenuContent = new JPanel();
	// JLabel label = new JLabel();
	JButton addTask = new JButton();
	JTextField newTask = new JTextField();
	Border border = new LineBorder(Color.RED);
	JMenu taskMenu = new JMenu();

	
	app()
	{
		topMenu.setLayout(new BoxLayout(topMenu, BoxLayout.Y_AXIS));
		topMenu.setBackground(new Color(80, 200, 120));
		topMenu.setPreferredSize(new Dimension(250, 50)); // Set preferred size
		topMenu.setMinimumSize(new Dimension(250, 50)); // Set minimum size
		topMenu.setMaximumSize(new Dimension(250, 50));

		topMenuContent.setLayout(new FlowLayout(FlowLayout.CENTER));
		topMenuContent.add(newTask);
		topMenuContent.add(addTask);
		topMenuContent.setOpaque(false);

		topMenu.add(Box.createVerticalGlue());
		topMenu.add(topMenuContent);
		topMenu.add(Box.createVerticalGlue());

		tasks.setBackground(new Color(255, 247, 230));
		tasks.setLayout(new BoxLayout(tasks, BoxLayout.Y_AXIS));

		newTask.setPreferredSize(new Dimension(85,30));
		newTask.setBackground(new Color(255, 209, 102));

		addTask.setText("Add Task");
		addTask.setFocusable(false);
		addTask.addActionListener(this);
		addTask.setBackground(new Color(90, 70, 200));
		addTask.setForeground(new Color(58, 58, 58));		
		// label.setText("The Label");
		// label.setHorizontalTextPosition(JLabel.CENTER);
		// label.setVerticalTextPosition(JLabel.CENTER);
			
		// topMenu.setBackground(Color.GREEN);
		
		// toDoApp.setLayout(new BoxLayout(toDoApp, BoxLayout.Y_AXIS));
		toDoApp.setLayout(new BorderLayout());
		toDoApp.add(topMenu, BorderLayout.NORTH);
		toDoApp.add(tasks, BorderLayout.CENTER);

		this.setTitle("The Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(toDoApp);
		this.setResizable(true);
		this.setBounds(0, 0, 500, 500);
		this.setMinimumSize(new Dimension(800,500));
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		
		
		
	}


    @Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==addTask)
		{	
			if(!newTask.getText().trim().isEmpty()) 
			{
			JLabel task = new JLabel(newTask.getText());
			tasks.add(task);
			this.setVisible(true);
			}
			else
			{
			JLabel error = new JLabel("Can't add empty task!");
			this.add(error);
			this.setVisible(true);
			}
		}
	}
	
}
