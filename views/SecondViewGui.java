package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SecondViewGui {

	private JFrame frame;
	private JTextField numeTextField;
	private JTextField greutateTextField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondViewGui window = new SecondViewGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SecondViewGui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 761, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel inregAnimalLabel = new JLabel("Animal registration");
		inregAnimalLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		inregAnimalLabel.setBounds(280, 36, 234, 40);
		frame.getContentPane().add(inregAnimalLabel);
		
		JLabel numeLabel = new JLabel("Name");
		numeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numeLabel.setBounds(72, 146, 85, 28);
		frame.getContentPane().add(numeLabel);
		
		JLabel specieLabel = new JLabel("Species");
		specieLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		specieLabel.setBounds(72, 194, 85, 28);
		frame.getContentPane().add(specieLabel);
		
		JLabel greutateLabel = new JLabel("Weight");
		greutateLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		greutateLabel.setBounds(72, 245, 85, 28);
		frame.getContentPane().add(greutateLabel);
		
		numeTextField = new JTextField();
		numeTextField.setBounds(133, 146, 101, 26);
		frame.getContentPane().add(numeTextField);
		numeTextField.setColumns(10);
		
		greutateTextField = new JTextField();
		greutateTextField.setBounds(133, 243, 101, 28);
		frame.getContentPane().add(greutateTextField);
		greutateTextField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(133, 199, 101, 22);
		frame.getContentPane().add(comboBox);
		
		JButton cazeazaButton = new JButton("Accommodate");
		cazeazaButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cazeazaButton.setBounds(72, 338, 129, 23);
		frame.getContentPane().add(cazeazaButton);
		
		JButton veziButton = new JButton("SEE CURRENT ACCOMMODATION AND SERVICES PRICES");
		veziButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		veziButton.setBounds(232, 395, 298, 23);
		frame.getContentPane().add(veziButton);
		
		JButton spalaButton = new JButton("Wash");
		spalaButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spalaButton.setBounds(513, 199, 162, 23);
		frame.getContentPane().add(spalaButton);
		
		JButton plimbaButton = new JButton("Walk");
		plimbaButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		plimbaButton.setBounds(513, 250, 162, 23);
		frame.getContentPane().add(plimbaButton);
		
		JLabel serviciiLabel = new JLabel("Extra Services");
		serviciiLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		serviciiLabel.setBounds(535, 153, 162, 14);
		frame.getContentPane().add(serviciiLabel);
	}
}
