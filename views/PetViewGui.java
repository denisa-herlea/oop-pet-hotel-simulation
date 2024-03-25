package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class PetViewGui {

	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetViewGui window = new PetViewGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PetViewGui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 740, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("Hotel For Animals");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		nameLabel.setBounds(244, 59, 225, 31);
		frame.getContentPane().add(nameLabel);
		
		JButton verifButton = new JButton("Check Availability");
		verifButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		verifButton.setBounds(232, 184, 225, 23);
		frame.getContentPane().add(verifButton);
		
		JButton inregButton = new JButton("Registration");
		inregButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		inregButton.setBounds(258, 370, 174, 23);
		frame.getContentPane().add(inregButton);
		
		JLabel yesLabel = new JLabel("Yes, there is room!");
		yesLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		yesLabel.setBounds(512, 171, 137, 14);
		frame.getContentPane().add(yesLabel);
		
		JLabel noLabel = new JLabel("No, there is no room!");
		noLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		noLabel.setBounds(512, 189, 92, 14);
		frame.getContentPane().add(noLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(70, 186, 137, 22);
		frame.getContentPane().add(comboBox);
	}
}
