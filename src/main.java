import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.*;



public class main extends JFrame{
	
	private String[] arr = new String[12];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public main() throws IOException {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		
		
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				q1 thing = new q1(arr);
				thing.setVisible(true);
			}
		});
		btnNewButton.setBounds(111, 228, 161, 53);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Discoball Survey");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(123, 118, 137, 53);
		getContentPane().add(lblNewLabel);
		
		
	
	
}
}