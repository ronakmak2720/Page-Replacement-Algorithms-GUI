package mywork;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BasicStroke;
import java.awt.Color;


import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JButton;

import java.util.ArrayList;

import javax.swing.SwingConstants;

import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JTable;
import javax.swing.JScrollPane;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class lru extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8974257654196993862L;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lru window = new lru();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param getInput 
	 * @param capacity 
	 
	 */
	AlgorithmFunctions obj = new AlgorithmFunctions();
	private DefaultCategoryDataset createDataset(int capacity, String getInput) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String series1 = "lru";  
	    String series2 = "FIFO";  
	    String series3 = "OPR";
	    int temp = 0;
	    if((capacity-3) >0) {
    		temp = capacity-3;
    	}
    	else
    		temp = 1;
	    for(int i=0;i<8;i++) {
	    	 dataset.addValue(obj.LruFunction(temp, getInput), series1, String.valueOf(temp)); 
	    	 dataset.addValue(obj.FifoFunction(temp, getInput), series2, String.valueOf(temp)); 
	    	 dataset.addValue(obj.OprFunction(temp, getInput), series3, String.valueOf(temp)); 
	    	 temp++;
	    }
	    
		return dataset;
	}
	
	public lru() {

		setMinimumSize(new Dimension(1080, 820));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(19, 40, 60));
		panel.setAlignmentY(0.0f);
		panel.setAlignmentX(0.0f);
		
		JLabel label = new JLabel();
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				simulator open = new simulator();
				open.setVisible(true);
			}
		});
		label.setIcon(new ImageIcon(lru.class.getResource("/images/simulator.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel();
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Algo open = new Algo();
				open.setVisible(true);
			}
		});
		label_1.setIcon(new ImageIcon(lru.class.getResource("/images/algorithm.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_2 = new JLabel();
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Homepage open = new Homepage();
				open.setVisible(true);
			}
		});
		label_2.setIcon(new ImageIcon(lru.class.getResource("/images/home.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		scrollPane_1.setBorder(null);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(59, Short.MAX_VALUE))
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 811, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("Least Recently Used");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 36));
		
		JLabel lblNewLabel_1 = new JLabel("No.of Frame:");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Input Page No.:");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_3 = new JLabel("Total Page Fault:");
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		textField = new JTextField();
		textField.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Hit Rate:");
		lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_6 = new JLabel("0%");
		lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		
		JButton btnNewButton = new JButton("Implement");
		btnNewButton.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mouseClicked(MouseEvent e) {
				int capacity = Integer.parseInt(textField.getText()); //no. of frames
				String getInput = textField_1.getText(); // gets the string input with spaces
				int i=0,ct=0;
				int n = capacity + 1;
				float hr1;
				String hr ="";
				String tempstr="";
				ArrayList<Integer> arrl = new ArrayList<>();
				while(i<getInput.length()) {
					if(!Character.isWhitespace(getInput.charAt(i))) {
						tempstr+=getInput.charAt(i);
					}	
					else {
						arrl.add(ct, Integer.parseInt(tempstr));
						ct++;
						tempstr = "";
					}
					if(i == getInput.length()-1)
						arrl.add(ct, Integer.parseInt(tempstr));
					i++;
				}
				//System.out.println(arrl);
				len = arrl.size();
				
				array = new int[len];
				for(i=0;i<len;i++) {
					array[i]=arrl.get(i);
				}
				int[][] process = new int[n][len];
				ArrayList<Integer> temp= new ArrayList<>();
				ct = 0;
				
				for(i=0;i<len;i++) {
					if(!temp.contains(array[i])) {
						if(temp.size()== capacity ) {
							temp.remove(0);
							temp.add(capacity-1, array[i]);
						}
						else {
							temp.add(ct, array[i]);
						}
					    page_fault = true;
						ct++;
					}
					else {
						temp.remove((Object)array[i]);
						temp.add(temp.size(), array[i]);
						page_fault = false;
					}
					for(int j=0;j<n;j++) {
						if(temp.size()<n) {
							if(j==temp.size())
								break;
						}
						process[j][i] = temp.get(j);
						if(page_fault == true)
						{
							process[n-1][i] = 1;
						}
						else
						{
							process[n-1][i] = 0;
						}
					}
				}
			     hr1 = (float)ct/len;
			     hr1 = 1 - hr1;
			    
			     hr1 = hr1*100;
			     DecimalFormat df = new DecimalFormat("#.##");
			     hr = df.format(hr1);
			     hr = hr+"%";
				lblNewLabel_4.setText(String.valueOf(ct));
				lblNewLabel_6.setText(hr);
				String[][] processstr = new String[n][len];
				String[] arraystr = new String[len];
				for(int j=0;j<n;j++) {
					for(i=0;i<len;i++) {
						if(j == (n-1)) {
							if(process[j][i] == 1) {
								processstr[j][i] = String.valueOf("Fault");
							}
							else
								processstr[j][i] = String.valueOf("Hit");
						}
						else
							processstr[j][i] = String.valueOf(process[j][i]);
					}
				}
				for(i=0;i<len;i++) {
					arraystr[i] = String.valueOf(array[i]);
				}
				DefaultTableModel dtm = new DefaultTableModel(processstr, arraystr);
				table_1 = new JTable(dtm);
			    table_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
			    if(n <=6)
			    	 table_1.setRowHeight(275/n);
			    else
			    	 table_1.setRowHeight(50 - (25/n));
			    
			    /*int width = 50*len;
				int height = 50*n;
				//scrollPane_1.setBounds(500, 450, width, height);
				//table_1.setBounds(50, 397, width, height);*/
				scrollPane_1.setViewportView(table_1);
				
			
			}
			
				
		});
		
		
	
	
		
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("0");
				textField_1.setText("0");
				lblNewLabel_4.setText("0");
				lblNewLabel_6.setText("0%");
				table_1.setVisible(false);
				table_1.setTableHeader(null);
				
			}
		});
		btnNewButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JButton btnNewButton_2 = new JButton("Graph");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int capacity = Integer.parseInt(textField.getText()); //no. of frames
				String getInput = textField_1.getText(); // gets the string input with spaces
				
				//creating dataset
				DefaultCategoryDataset dataset = createDataset(capacity,getInput);
				//creating chart
				JFreeChart chart = ChartFactory.createLineChart("Page Replacement Algorithms", "Frames", "Page Faults", dataset);
				
				CategoryPlot plot = chart.getCategoryPlot();
				LineAndShapeRenderer renderer = new LineAndShapeRenderer();
				plot.setRenderer(renderer);
				renderer.setSeriesStroke(0, new BasicStroke(3.0f));
				renderer.setSeriesStroke(1, new BasicStroke(3.0f));
				renderer.setSeriesStroke(2, new BasicStroke(3.0f));
				plot.setBackgroundPaint(Color.DARK_GRAY);
				plot.setRangeGridlinesVisible(true);
			    plot.setRangeGridlinePaint(Color.BLACK);
			    plot.setDomainGridlinesVisible(true);
			    plot.setDomainGridlinePaint(Color.BLACK);
			    
				ChartFrame frame = new ChartFrame("Page Replacement Algorithm",chart);
				frame.setVisible(true);
				frame.setSize(800, 600);
				frame.setAlwaysOnTop(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(241)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
					.addGap(485))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(182)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_5)
									.addComponent(lblNewLabel_3))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(190)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1))
							.addGap(10)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))))
					.addGap(389))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(42)
					.addComponent(lblNewLabel)
					.addGap(51)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6))
					.addGap(22))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout groupLayout_1 = new GroupLayout(panel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(106)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(groupLayout_1);
		getContentPane().setLayout(groupLayout);
		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	int capacity;
	int len=0;
	int n=0;
	int[] array;
	boolean page_fault = false;
	int[][] process;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
}