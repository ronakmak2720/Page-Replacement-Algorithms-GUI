package mywork ;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;


import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class OPR_Algo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1285024360231087931L;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OPR_Algo window = new OPR_Algo();
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
	 * @param frames 
	 
	 */
	AlgorithmFunctions obj = new AlgorithmFunctions();
	private DefaultCategoryDataset createDataset(int frames, String getInput) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String series1 = "LRU";  
	    String series2 = "fifo";  
	    String series3 = "OPR_Algo";
	    
	    int temp = 0;
	    if((frames-3) >0) {
    		temp = frames-3;
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
	
	public OPR_Algo() {
		setAutoRequestFocus(false);
		setAlwaysOnTop(true);

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
		label.setIcon(new ImageIcon(OPR_Algo.class.getResource("/images/simulator.png")));
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
		label_1.setIcon(new ImageIcon(OPR_Algo.class.getResource("/images/algorithm.png")));
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
		label_2.setIcon(new ImageIcon(OPR_Algo.class.getResource("/images/home.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		scrollPane_1_1.setBorder(null);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addComponent(scrollPane_1_1, GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
							.addGap(73))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 962, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane_1_1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addGap(112))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 861, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("Optimal Page Replacement Algorithm");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 36));
		
		JLabel lblNewLabel_1 = new JLabel("No.of Frame:");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Input Page No.:");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_3 = new JLabel("Total Page Fault:");
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
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
				
				int ptr = 0, hit = 0, fault = 0,i=0,ct=0;
				boolean isFull = false;
				int buff[];
				int rfr_temp[];
				int layout[][];
				//System.out.println("Please enter the number of frames: ");
				int frames = Integer.parseInt(textField.getText());
				//System.out.println("Please enter the length of the reference string: ");
				String getInput = textField_1.getText();
				//System.out.println("get input:"+getInput);
				int str_len =getInput.length();
				rfr_temp = new int[str_len];
				String tempstr="";
				while(i<getInput.length()) {
					if(!Character.isWhitespace(getInput.charAt(i))) {
						tempstr+=getInput.charAt(i);
					}	
					else {
						rfr_temp[ct] = Integer.parseInt(tempstr);
						ct++;
						tempstr = "";
					}
					if(i == getInput.length()-1) {
						rfr_temp[ct] = Integer.parseInt(tempstr);
					}
					i++;
				}
				ct++;
				int[] rfr = new int[ct];
				int[] hitFaultArray = new int[ct];
				layout = new int[ct][frames];
				buff = new int[frames];
				for (int j = 0; j < frames; j++) {
					buff[j] = -1;
				}
				for (int j = 0; j < ct; j++) {
					hitFaultArray[j] = 0;
				}
				//System.out.println("reference string::");
				for ( i = 0; i < ct; i++) {
					rfr[i] = Integer.parseInt(String.valueOf(rfr_temp[i]));
					//System.out.println(rfr[i]);
				}
				System.out.println();
				for ( i = 0; i < ct; i++) {
					int temp = -1;
					for (int j = 0; j < frames; j++) {
						if (buff[j] == rfr[i]) {
							temp = j;
							hit++;
							break;
						}
					}
					if (temp == -1) {
						if (isFull) {
							int ind[] = new int[frames];
							boolean ind_temp[] = new boolean[frames];
							for (int j = i + 1; j < ct; j++) {
								for (int k = 0; k < frames; k++) {
									if ((rfr[j] == buff[k]) && (ind_temp[k] == false)) {
										ind[k] = j;
										ind_temp[k] = true;
										break;
									}
								}
							}
							int mx = ind[0];
							ptr = 0;
							if (mx == 0) {
								mx = 200;
							}
							for (int j = 0; j < frames; j++) {
								if (ind[j] == 0) {
									ind[j] = 200;
								}
								if (ind[j] > mx) {
									mx = ind[j];
									ptr = j;
								}
							}
						}
						buff[ptr] = rfr[i];
						fault++;
						hitFaultArray[i] = 1;
						if (!isFull) {
							ptr++;
							if (ptr == frames) {
								ptr = 0;
								isFull = true;
							}
						}
					}
					for (int j = 0; j < frames; j++) {
						layout[i][j] = buff[j];
					}
				}
				System.out.println("Table::");
				for (i = 0; i < frames; i++) {
					for (int j = 0; j < ct; j++) {
						System.out.printf("%3d ", layout[j][i]);
					}
					System.out.println();
				}
				System.out.println("hit/fault array::");
				for (int j = 0; j < ct; j++) {
					System.out.print(hitFaultArray[j] + " ");
				}
				
				System.out.println();
				double hitRatio = (double)hit/ct;
				
			    
				hitRatio = hitRatio*100;
				DecimalFormat df = new DecimalFormat("#.##");
				String hitRatiostr= df.format(hitRatio);
				hitRatiostr += "%";
				System.out.println("\nThe total number of hits are " + hit);
				System.out.println("The hit ratio is " + hitRatio);
				System.out.println("The total number of faults are " + fault);
				
				lblNewLabel_4.setText(String.valueOf(fault));
				lblNewLabel_6.setText(hitRatiostr);
				int t_rows=frames+1;
				String[][] processstr = new String[t_rows][ct];
				String[] arraystr = new String[ct];
				for(i=0;i<ct;i++) {
					
					for(int j=0;j<t_rows;j++) {
						if(j == (t_rows-1)) {
							//processstr[j][i] = String.valueOf(hitFaultArray[i]);
							if(hitFaultArray[i] == 1) {
								processstr[j][i] = String.valueOf("Fault");
							}
							else
								processstr[j][i] = String.valueOf("Hit");
						}
						else {
							processstr[j][i] = String.valueOf(layout[i][j]);
						}
					}
				}
					
					
					
				for(i=0;i<ct;i++) {
					arraystr[i] = String.valueOf(rfr[i]);
				}
				DefaultTableModel dtm = new DefaultTableModel(processstr, arraystr);
				table_1 = new JTable(dtm);
			    table_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
			    if(t_rows <=6)
			    	 table_1.setRowHeight(275/t_rows);
			    else
			    	 table_1.setRowHeight(50 - (25/t_rows));
			    /*int width = 850;
				int height = 300;
				int y_pos = 500 - (25*ct);
				//scrollPane_1_1.setBounds(y_pos, 450, width, height);
				//table_1.setBounds(50, 397, width, height);*/
				scrollPane_1_1.setViewportView(table_1);
				
					
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
		
		textField = new JTextField();
		textField.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Graph");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int frames = Integer.parseInt(textField.getText());
				String getInput = textField_1.getText();
				
				//creating dataset
				DefaultCategoryDataset dataset = createDataset(frames,getInput);
				//creating chart
				JFreeChart chart = ChartFactory.createLineChart("Page Replacement Algorithms", "Frames", "Page Faults", dataset);
				
				CategoryPlot plot = chart.getCategoryPlot();
				LineAndShapeRenderer renderer = new LineAndShapeRenderer();
				plot.setRenderer(renderer);
				renderer.setSeriesStroke(0, new BasicStroke(2.0f));
				renderer.setSeriesStroke(1, new BasicStroke(2.0f));
				renderer.setSeriesStroke(2, new BasicStroke(2.0f));
				renderer.setSeriesStroke(3, new BasicStroke(2.0f));
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
					.addGap(123)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(179)
									.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(52)
									.addComponent(lblNewLabel_3)))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
					.addGap(131))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(161)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addGap(152))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(173)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(204, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel)
					.addGap(49)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(34)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6))
					.addGap(16))
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
	int frames = 0;
    int pointer = 0;
    int numFault = 0;
    int ref_len;
    boolean isFull = false;
    int buffer[];
    boolean hit[];
    int fault[];
    int reference[];
    int mem_layout[][];
    String processtr[][];
    String reference_1[];
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
	String tempstr="";
	JScrollPane scrollPane_1;
}
