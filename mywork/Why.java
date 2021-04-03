package mywork;


import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Font;


import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Why extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					What frame = new What();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Why() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1095, 794);
		contentPane = new JPanel();
		contentPane.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBackground(new Color(19, 40, 60));
		panel.setAlignmentY(0.0f);
		
		JLabel label = new JLabel();
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				simulator open = new simulator();
				open.setVisible(true);
			}
		});
		label.setIcon(new ImageIcon(Why.class.getResource("/images/simulator.png")));
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
		label_1.setIcon(new ImageIcon(Why.class.getResource("/images/algorithm.png")));
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
		label_2.setIcon(new ImageIcon(Why.class.getResource("/images/home.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 94, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 901, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(106)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(510, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel = new JLabel("Why do we need Page Replacement Algorithm?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 36));
		
		
		JTextArea txtrInAComputer = new JTextArea();
		txtrInAComputer.setAlignmentY(Component.TOP_ALIGNMENT);
		txtrInAComputer.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtrInAComputer.setLineWrap(true);
		txtrInAComputer.setWrapStyleWord(true);
		txtrInAComputer.setText("Since actual physical memory is much smaller than virtual memory, page faults happen. In case of page fault, Operating System might have to replace one of the existing pages with the newly needed page. Different page replacement algorithms suggest different ways to decide which page to replace. The target for all algorithms is to reduce the number of page faults.\r\n\r\nThere are three kinds of Page Replacement Algorithm :-\r\n\r\n1. First In First Out (FIFO) \u2013\r\nThis is the simplest page replacement algorithm. In this algorithm, the operating system keeps track of all pages in the memory in a queue, the oldest page is in the front of the queue. When a page needs to be replaced page in the front of the queue is selected for removal.\r\n\r\n2. Optimal Page replacement (OPR)  \u2013\r\nIn this algorithm, pages are replaced which would not be used for the longest duration of time in the future.\r\n\r\n3. Least Recently Used \u2013\r\nIn this algorithm page will be replaced which is least recently used.");
		txtrInAComputer.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		txtrInAComputer.setEditable(false);
		txtrInAComputer.setBorder(null);
		txtrInAComputer.setBackground(new Color(214,217,223));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(txtrInAComputer, GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel)))
					.addGap(20))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(59)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(txtrInAComputer))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
