package mywork;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fifo_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fifo_1 frame = new Fifo_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param input 
	 * @param frames 
	 */
	AlgorithmFunctions obj = new AlgorithmFunctions();
	private DefaultCategoryDataset createDataset(int frames, String input) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String series1 = "LRU";  
	    String series2 = "fifo";  
	    String series3 = "OPR";
	    
	    int temp = 0;
	    if((frames-3) >0) {
    		temp = frames-3;
    	}
    	else
    		temp = 1;
	    for(int i=0;i<8;i++) {
	    	 dataset.addValue(obj.LruFunction(temp, input), series1, String.valueOf(temp)); 
	    	 dataset.addValue(obj.FifoFunction(temp, input), series2, String.valueOf(temp)); 
	    	 dataset.addValue(obj.OprFunction(temp, input), series3, String.valueOf(temp)); 
	    	 temp++;
	    }
	    
		return dataset;
	}
	
	public Fifo_1() {
              setMinimumSize(new Dimension(1080, 850));
		
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
		label.setIcon(new ImageIcon(Fifo_1.class.getResource("/images/simulator.png")));
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
		label_1.setIcon(new ImageIcon(Fifo_1.class.getResource("/images/algorithm.png")));
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
		label_2.setIcon(new ImageIcon(Fifo_1.class.getResource("/images/home.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		scrollPane_1.setBorder(null);
		
		JLabel lblNewLabel_7 = new JLabel("\"1\" \r\n Page fault");
		lblNewLabel_7.setFocusable(false);
		lblNewLabel_7.setFocusTraversalKeysEnabled(false);
		lblNewLabel_7.setInheritsPopupMenu(false);
		lblNewLabel_7.setRequestFocusEnabled(false);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		
		JLabel lblPageHit = new JLabel("\"0\" \r\n Page Hit");
		lblPageHit.setVerifyInputWhenFocusTarget(false);
		lblPageHit.setFocusable(false);
		lblPageHit.setFocusTraversalKeysEnabled(false);
		lblPageHit.setInheritsPopupMenu(false);
		lblPageHit.setHorizontalAlignment(SwingConstants.CENTER);
		lblPageHit.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
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
							.addContainerGap(55, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(111)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
							.addComponent(lblPageHit, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addGap(160))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 964, Short.MAX_VALUE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPageHit, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_7)))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 812, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("First In First Out");
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
				int i=0,ct=0,num=0;
				String tempstr="";
				int frames = Integer.parseInt(textField.getText());
				String input = textField_1.getText();
				
				int[] farray = new int[frames];
				int[] pages = new int[input.length()];
				for(i=0;i<frames;i++)
				{
					farray[i]=-1;
				}
				
				i = 0;
				while(i<input.length()) {
					
					if(!Character.isWhitespace(input.charAt(i))) {
						tempstr+=input.charAt(i);
					}	
					else {
						pages[ct]=Integer.parseInt(tempstr);
						ct++;
						tempstr = "";
					}
					if(i == input.length()-1)
						pages[ct]=Integer.parseInt(tempstr);
					i++;
				}
				boolean flag = true;
				int pageHit =0;
				int length  = ct+1;
			    int arry[][] = new int[frames+1][length];
			   String processstr[][] = new String[frames+1][length];
			   String arraystr[] = new String[length];
				  for(i=0; i<length; i++)
			        {
			            flag = true;
			            int page = pages[i];
			            for(int j=0; j<frames; j++)
			            {
			                if(farray[j] == page)
			                {
			                	
			                    flag = false;
			                    pageHit++;
			                    for(j=0;j<frames;j++)
			                    {
			                    	arry[j][i] = farray[j];	
			                    }
			                    arry[frames][i] = 0;
			                    break;
			                }
			            }
			            if(num == frames)
			                num = 0;
			          
			            if(flag)
			            {
			                farray[num] = page;
			                for(int j=0;j<frames;j++)
			                {
			                arry[j][i] = farray[j];}
			                arry[frames][i] = 1;
			                num++;
			            }
				
			        }
				  for(i=0;i<frames+1;i++)
				  {
					  for(int j=0;j<length;j++)
					  {
						 if(i == frames) {
							 if(arry[i][j] == 1) {
									processstr[i][j] = String.valueOf("Fault");
								}
								else
									processstr[i][j] = String.valueOf("Hit");
						 }
						 else
							 processstr[i][j] = String.valueOf(arry[i][j]);
					  }
				  }
				  for(i=0;i<length;i++)
				  {
					  arraystr[i]= String.valueOf(pages[i]);
				  }
				  String pfault = String.valueOf(length - pageHit);
			      lblNewLabel_4.setText(pfault);
			       hit = (float)pageHit/length;
			       hit = hit*100;
			      DecimalFormat df = new DecimalFormat("#.##");
				     hitrate = df.format(hit);
				     hitrate = hitrate+"%";
				     lblNewLabel_6.setText(hitrate);
			      
				  DefaultTableModel dtm = new DefaultTableModel(processstr, arraystr);
					 table_1 = new JTable(dtm){
				         /**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public boolean editCellAt(int row, int column, java.util.EventObject e) {
				             return false;
				          }
				       };
				       table_1.setEnabled(false);
				       table_1.setRowSelectionAllowed(false);
					 
				    table_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
				    
				    if((frames+1) <=6)
				    	 table_1.setRowHeight(275/(frames+1));
				    else
				    	 table_1.setRowHeight(50 - (25/(frames+1)));
				    
				    /*int width = 50*length;
					int height = 50*frames;
					//scrollPane_1.setBounds(500, 400, width, height);
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
				
				int frames = Integer.parseInt(textField.getText());
				String input = textField_1.getText();
				
				//creating dataset
				DefaultCategoryDataset dataset = createDataset(frames,input);
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
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(182)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
										.addGap(0))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblNewLabel_5)
											.addComponent(lblNewLabel_3))
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2))
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGap(18)
											.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
											.addGap(76))
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblNewLabel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblNewLabel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
									.addGap(97))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(250)
							.addComponent(lblNewLabel)))
					.addGap(102))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel)
					.addGap(48)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(17)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
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
	int frames;
	float hit;
	boolean flag;
	int pageHit=0;
	String pfault="";
	String hitrate="";
	int farray[];
	int pages[];
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
	}


