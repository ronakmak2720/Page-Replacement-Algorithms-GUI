package mywork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class simulator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4492573923251320860L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simulator frame = new simulator();
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
	public simulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1403, 882);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setAlignmentY(0.0f);
		contentPane.setAlignmentX(0.0f);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(19, 40, 60));
		panel.setAlignmentY(0.0f);
		panel.setAlignmentX(0.0f);
		
		JLabel label = new JLabel();
		
		label.setIcon(new ImageIcon(simulator.class.getResource("/images/simulator.png")));
		label.setBackground(Color.WHITE);
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel();
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Algo sim1 = new Algo();
				sim1.setVisible(true);
			}
		});
		label_1.setIcon(new ImageIcon(simulator.class.getResource("/images/algorithm.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_2 = new JLabel();
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Homepage fopen = new Homepage();
				fopen.setVisible(true);
			}
		});
		label_2.setIcon(new ImageIcon(simulator.class.getResource("/images/home.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(97)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(340, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton btnNewButton = new JButton("First-In-First-Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fifo_sim.main(null);
			}
		});
		
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setIconTextGap(2);
		btnNewButton.setVerticalTextPosition(SwingConstants.TOP);
		btnNewButton.setIcon(new ImageIcon(Algo.class.getResource("/images/queue.png")));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JButton btnNewButton_1 = new JButton("Least Recently Used");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lru_sim.main(null);
			}
		});
		
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setVerticalTextPosition(SwingConstants.TOP);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setIcon(new ImageIcon(Algo.class.getResource("/images/LRU.png")));
		btnNewButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		
		JLabel lblNewLabel = new JLabel("SIMULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 48));
		
		JButton btnNewButton_2 = new JButton("Optimal Page Replacement");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				opr_sim.main(null);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Algo.class.getResource("/images/optimal.png")));
		btnNewButton_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_2.setVerticalTextPosition(SwingConstants.TOP);
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addComponent(btnNewButton)
							.addGap(87)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
					.addGap(0))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(47)
					.addComponent(lblNewLabel)
					.addGap(71)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
					.addGap(338))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
}
