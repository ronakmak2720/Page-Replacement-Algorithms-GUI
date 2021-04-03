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

public class Where extends JFrame {

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
	public Where() {
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
		label.setIcon(new ImageIcon(Where.class.getResource("/images/simulator.png")));
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
		label_1.setIcon(new ImageIcon(Where.class.getResource("/images/algorithm.png")));
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
		label_2.setIcon(new ImageIcon(Where.class.getResource("/images/home.png")));
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
		
		JLabel lblNewLabel = new JLabel("Where else do we use Page Replacement Algorithm?\r\n\r\n\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 36));
		
		JTextArea txtrInAComputer = new JTextArea();
		txtrInAComputer.setAlignmentY(Component.TOP_ALIGNMENT);
		txtrInAComputer.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtrInAComputer.setLineWrap(true);
		txtrInAComputer.setWrapStyleWord(true);
		txtrInAComputer.setText("The conservative impleemntation of the Page Replacement Algorithm is for checking page fault, meeting the demand of fast page fetching and replacement by the usage of virtual memory.\r\n\r\nUse in techniques for Hardrware with no Reference Bit :-\r\nApart from this conservative page replacement algorithm work and believe that each page has a reference bit. But, some hardwares don't have one reference bit for the pages appearing and thus pages may be selected for working set removal in an essentially random fashion, with the expectation that if a poor choice is made, a future reference may retrieve that page from the Free or Modified list before it is removed from physical memory. A page referenced this way will be removed from the Free or Modified list and placed back into a process working set. The Modified Page List additionally provides an opportunity to write pages out to backing store in groups of more than one page, increasing efficiency. These pages can then be placed on the Free Page List. The sequence of pages that works its way to the head of the Free Page List resembles the results of a LRU or NRU mechanism and the overall effect has similarities to the Second-Chance algorithm described earlier.\r\n\r\nPage Cache in Linux :-\r\nThe Page Caching works on the concept and manipulation of small pages and huge pages in linux. The pages are divided into two sets an active set and the passive set. And the fetching and transferring is done between these sets of page caches\r\n");
		txtrInAComputer.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		txtrInAComputer.setEditable(false);
		txtrInAComputer.setBorder(null);
		txtrInAComputer.setBackground(new Color(214,217,223));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(txtrInAComputer, GroupLayout.PREFERRED_SIZE, 937, Short.MAX_VALUE)
							.addGap(20))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(61)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(txtrInAComputer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
