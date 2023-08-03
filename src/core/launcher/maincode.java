package core.launcher;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;

public class maincode{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maincode window = new maincode();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public maincode() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setBackground(new Color(0f, 0f, 0f, 0f));
		frame.setVisible(true);
		
		/* Button exit */
		JLabel labelbuttonexit = new JLabel("");
		labelbuttonexit.setIcon(new ImageIcon(maincode.class.getResource("/assets/exit.png")));
		labelbuttonexit.setBounds(709, 11, 21, 21);
		labelbuttonexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e){
				labelbuttonexit.setIcon(new ImageIcon(maincode.class.getResource("/assets/exit_focus.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				labelbuttonexit.setIcon(new ImageIcon(maincode.class.getResource("/assets/exit.png")));
			}
		});
		/* Button exit */
		/* Button minimize */
		JLabel labelbuttonmin = new JLabel("");
		labelbuttonmin.setBounds(681, 11, 21, 21);
		labelbuttonmin.setIcon(new ImageIcon(maincode.class.getResource("/assets/minimize.png")));
		labelbuttonmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				labelbuttonmin.setIcon(new ImageIcon(maincode.class.getResource("/assets/minimize_focus.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setExtendedState(Frame.ICONIFIED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				labelbuttonmin.setIcon(new ImageIcon(maincode.class.getResource("/assets/minimize.png")));
			}
		});
		/* Button minimize */
		/* Button repository */
		JLabel labelbuttongit = new JLabel("");
		labelbuttongit.setBounds(650, 11, 21, 21);
		labelbuttongit.setIcon(new ImageIcon(maincode.class.getResource("/assets/git.png")));
		labelbuttongit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				labelbuttongit.setIcon(new ImageIcon(maincode.class.getResource("/assets/git_focus.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
	            try {
	                desktop.browse(new URI("https://github.com/r0t1v"));
	            } catch (IOException | URISyntaxException v) {
	            	JOptionPane.showMessageDialog(null, "Error" + v.getMessage());
	            }
			}
			@Override
			public void mouseExited(MouseEvent e) {
				labelbuttongit.setIcon(new ImageIcon(maincode.class.getResource("/assets/git.png")));
			}
		});
		/* Button repository */
		/* Banner Images */
		
		/* Banner Images */
		/* Inner Buttons */
		JLabel inner1 = new JLabel("");
		JLabel inner2 = new JLabel("");
		JLabel inner3 = new JLabel("");
		JLabel inner4 = new JLabel("");
		inner1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		inner1.setBounds(256, 540, 16, 22);
		inner1.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner1.png")));
		inner1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inner1.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner1_pressed.png")));
				inner2.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner2.png")));
				inner3.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner3.png")));
				inner4.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner4.png")));
			}
		});
		inner2.setBounds(317, 540, 28, 22);
		inner2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		inner2.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner2.png")));
		inner2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inner1.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner1.png")));
				inner2.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner2_pressed.png")));
				inner3.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner3.png")));
				inner4.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner4.png")));
			}
		});
		inner3.setBounds(389, 540, 26, 22);
		inner3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		inner3.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner3.png")));
		inner3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inner1.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner1.png")));
				inner2.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner2.png")));
				inner3.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner3_pressed.png")));
				inner4.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner4.png")));
			}
		});
		inner4.setBounds(454, 540, 32, 22);
		inner4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		inner4.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner4.png")));
		inner4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inner1.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner1.png")));
				inner2.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner2.png")));
				inner3.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner3.png")));
				inner4.setIcon(new ImageIcon(maincode.class.getResource("/assets/inner4_pressed.png")));
			}
		});
		/* Inner Buttons */
		JLabel labelsliderbg = new JLabel("");
		labelsliderbg.setBounds(228, 529, 285, 46);
		labelsliderbg.setIcon(new ImageIcon(maincode.class.getResource("/assets/sliderbg.png")));
		
		JLabel labelfiles = new JLabel("Baixando atualizações");
		labelfiles.setForeground(Color.WHITE);
		labelfiles.setFont(new Font("Arial", Font.PLAIN, 12));
		labelfiles.setBounds(167, 613, 309, 14);
		
		JLabel labeldefault1 = new JLabel("Arquivo");
		labeldefault1.setForeground(Color.ORANGE);
		labeldefault1.setFont(new Font("Arial", Font.PLAIN, 12));
		labeldefault1.setBounds(37, 636, 46, 14);
		
		JLabel fileprogress = new JLabel("");
		fileprogress.setBounds(92, 639, 481, 9);
		fileprogress.setIcon(new ImageIcon(maincode.class.getResource("/assets/progressbar_archive.png")));

		JLabel labeldefault2 = new JLabel("Total");
		labeldefault2.setForeground(Color.ORANGE);
		labeldefault2.setFont(new Font("Arial", Font.PLAIN, 12));
		labeldefault2.setBounds(37, 661, 32, 23);

		JLabel totalprogress = new JLabel("");
		totalprogress.setBounds(92, 655, 481, 23);
		totalprogress.setIcon(new ImageIcon(maincode.class.getResource("/assets/progressbar_total.png")));
		
		JLabel btnentrar = new JLabel("");
		btnentrar.setBounds(597, 595, 133, 94);
		btnentrar.setIcon(new ImageIcon(maincode.class.getResource("/assets/entrar_default.png")));
		
		JLabel percent = new JLabel("100%");
		percent.setForeground(Color.ORANGE);
		percent.setFont(new Font("Arial", Font.PLAIN, 12));
		percent.setBounds(305, 655, 32, 23);
		
		
		frame.getContentPane().add(btnentrar);
		frame.getContentPane().add(percent);
		frame.getContentPane().add(totalprogress);
		frame.getContentPane().add(fileprogress);
		frame.getContentPane().add(labelfiles);
		frame.getContentPane().add(labeldefault2);
		frame.getContentPane().add(labeldefault1);
		frame.getContentPane().add(inner4);
		frame.getContentPane().add(inner3);
		frame.getContentPane().add(inner2);
		frame.getContentPane().add(inner1);
		frame.getContentPane().add(labelsliderbg);
		frame.getContentPane().add(labelbuttongit);
		frame.getContentPane().add(labelbuttonmin);
		frame.getContentPane().add(labelbuttonexit);
		JLabel backgroundlabel = new JLabel("");
		backgroundlabel.setIcon(new ImageIcon(maincode.class.getResource("/assets/LauncherBackground.png")));
		backgroundlabel.setBounds(0, 0, 740, 700);
		frame.getContentPane().add(backgroundlabel);
		
		
		
	
		
	
		

		

		

	}
}
