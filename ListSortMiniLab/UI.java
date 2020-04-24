import java.util.*;

import java.util.Scanner;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
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
    private JPanel contentPane;
	
	public UI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 631, 503);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 100, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnTestShort = new JButton("Sort");
        btnTestShort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                CircleQueueDriver.main(null);
            }
        });
        btnTestShort.setBounds(240, 424, 145, 29);
        contentPane.add(btnTestShort);
    
        JTextArea result;
        result = new JTextArea();
        result.setEditable(false);
        result.setColumns(10);
        result.setBounds(10, 77, 595, 328);
        contentPane.add(result);
		

	}
}
