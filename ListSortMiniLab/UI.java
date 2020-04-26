import java.util.*;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

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
	
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    private int[] list;
    private int[] moreList;
	
	public UI()
	{
		int size = 26;
        list = new int[size];
        for (int i = 0; i < list.length; i++)
            list[i] = (int)(Math.random() * size) + 1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 631, 503);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(20, 26, 590, 386);
        contentPane.add(textArea);
        
        textArea.setText("Original:\n" + Arrays.toString(list) + "\n");
        
        JButton SelectionSort = new JButton("Selection Sort");
        SelectionSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	moreList = UISorts.SelectionSort(list);
            	
            	textArea.setText(textArea.getText() + "Selection Sort:\n" + Arrays.toString(moreList) + "\n");
            }
        });
        SelectionSort.setBounds(20, 414, 145, 29);
        contentPane.add(SelectionSort);

        
        JButton InsertionSort = new JButton("Insertion Sort");
        InsertionSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	moreList = UISorts.InsertionSort(list);
            	
            	textArea.setText(textArea.getText() + "Insertion Sort:\n" + Arrays.toString(moreList) + "\n");
            }
        });
        InsertionSort.setBounds(460, 414, 145, 29);
        contentPane.add(InsertionSort);
        
        JButton bubbleSort = new JButton("Bubble Sort");
        bubbleSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	moreList = UISorts.BubbleSort(list);
            	
            	textArea.setText(textArea.getText() + "Bubble Sort:\n" + Arrays.toString(moreList) + "\n");
            }
        });
        bubbleSort.setBounds(246, 414, 145, 29);
        contentPane.add(bubbleSort);
        
        
        
        JLabel title = new JLabel("Lists and Sorts");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBounds(259, 6, 99, 16);
        contentPane.add(title);
        
        JButton reset = new JButton("Reset");
        reset.setBounds(246, 446, 145, 29);
        contentPane.add(reset);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	int size = 26;
                list = new int[size];
                for (int i = 0; i < list.length; i++)
                    list[i] = (int)(Math.random() * size) + 1;
                
            	textArea.setText("Original:\n" + Arrays.toString(list) + "\n");
            }
        });
        
        
	}
}
