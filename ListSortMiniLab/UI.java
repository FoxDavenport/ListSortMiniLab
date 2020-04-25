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
import java.awt.Scrollbar;
import javax.swing.JScrollPane;

public class UI extends JFrame
{
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UI frame = new UI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	
	private JTextField textField;
	private static final long serialVersionUID = 1L;
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
        
        JButton SelectionSort = new JButton("Selection Sort");
        SelectionSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {

            }
        });
        SelectionSort.setBounds(20, 424, 145, 29);
        SelectionSort.setVisible(false);
        contentPane.add(SelectionSort);

        
        JButton InsertionSort = new JButton("Insertion Sort");
        InsertionSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {

            }
        });
        InsertionSort.setBounds(460, 424, 145, 29);
        InsertionSort.setVisible(false);
        contentPane.add(InsertionSort);

        JTextArea textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        textArea.setEditable(false);
        scroll.setBounds(10, 27, 595, 386);
        contentPane.add(scroll);
        //Sorts is = new Sorts();
        //textArea.setText(is);
		

	}
}
