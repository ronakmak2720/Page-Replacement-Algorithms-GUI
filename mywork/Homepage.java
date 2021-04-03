/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mywork;

import java.awt.event.MouseEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;


public class Homepage extends javax.swing.JFrame {


    private static final long serialVersionUID = 1L;

	
    public Homepage() {
		getContentPane().setMaximumSize(new Dimension(1080, 1080));
        
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setMaximumSize(new Dimension(500, 500));
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
       
        jLabel3 = new javax.swing.JLabel();
        jLabel3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        		simulator fopen = new simulator();
        		fopen.setVisible(true);
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.gray);

        jPanel2.setBackground(new java.awt.Color(247, 245, 246));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jPanel2.setName("Why ?"); // NOI18N
        jPanel2.setOpaque(false);

        jLabel5.setBackground(new java.awt.Color(247, 245, 246));
        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 62)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Page Replacement Algorithm ");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/think.png"))); // NOI18N
        jButton1.setText("What ?");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(50);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		What frame1 = new What();
        		frame1.setVisible(true);
        	}
        });
        
        jButton3.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        jButton3.setIcon(new ImageIcon(Homepage.class.getResource("/images/When.png"))); // NOI18N
        jButton3.setText("Why ?");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(50);
        jButton3.setMultiClickThreshhold(2L);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		Why frame2 = new Why();
        		frame2.setVisible(true);
        	}
        });

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        jButton2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		Where frame2 = new Where();
        		frame2.setVisible(true);
        	}
        });
        jButton2.setIcon(new ImageIcon(Homepage.class.getResource("/images/shelock.png"))); // NOI18N
        jButton2.setText("Where ?");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(35);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(39)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
        					.addGap(105)
        					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
        					.addGap(121)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(21)
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 1432, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(358, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(44)
        			.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(22)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel1.setBackground(new java.awt.Color(19, 40, 60));
        
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/algorithm.png"))); // NOI18N
        jLabel1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        		Algo framea = new Algo();
        		framea.setVisible(true);
        	}
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/simulator.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(80)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 1463, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(3932, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(32)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 769, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(929, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
   

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    
}
