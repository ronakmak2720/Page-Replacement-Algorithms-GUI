package mywork;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class opr_sim {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
			
				try {
					opr_sim application = new opr_sim();
					application.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				
			}
		
	}

	/**
	 * Create the application.
	 */
	
	   private static final String TITLE = "OPR Simulator";
	   private static final String VIDEO_PATH = "E:\\Sem 5\\Operating System\\src\\images\\opr.mp4";
	   private  EmbeddedMediaPlayerComponent mediaPlayerComponent;
	   private JButton playButton;
	
	   public opr_sim() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
	      frame.setBounds(100, 100, 600, 400);
	      frame.setTitle(TITLE);
	     
	     
	      frame.addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            mediaPlayerComponent.release();
	           
	         }
	      });    	
	      JPanel contentPane = new JPanel();
	      contentPane.setLayout(new BorderLayout());   	 
	      contentPane.add(mediaPlayerComponent, BorderLayout.CENTER);

	      JPanel controlsPane = new JPanel();
	      playButton = new JButton("Play");
	      controlsPane.add(playButton);    	
	      contentPane.add(controlsPane, BorderLayout.SOUTH);
	      playButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 mediaPlayerComponent.mediaPlayer().media().startPaused(VIDEO_PATH); 
	            mediaPlayerComponent.mediaPlayer().controls().play();
	         }
	      });    	 
	      frame.setContentPane(contentPane);
	      frame.setVisible(true);
	   }

}
	


