import java.util.*;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame
{
	private JTextField textField;
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public UI()
	{
		setResizable(false);
		setBounds(50, 50, 600, 400);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Sort");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				CircleQueueDriver.main(null);
			}
		});
		btnNewButton.setBounds(10, 329, 574, 31);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 574, 307);
		getContentPane().add(textField);
		textField.setColumns(10);
		

	}
}
