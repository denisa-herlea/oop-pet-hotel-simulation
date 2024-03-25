package views;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.Specie;

public class SecondView extends JFrame{
	
	private JTextField numeTextField;
	private JTextField greutateTextField;
	
	private JComboBox comboBox;
	
	private JButton cazeazaButton;
	private JButton veziButton;
	private JButton spalaButton;
	private JButton plimbaButton;
	
	
	public SecondView() {
		
		this.setBounds(100, 100, 761, 507);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel inregAnimalLabel = new JLabel("Animal registration");
		inregAnimalLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		inregAnimalLabel.setBounds(280, 36, 234, 40);
		this.getContentPane().add(inregAnimalLabel);
		
		JLabel numeLabel = new JLabel("Name");
		numeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numeLabel.setBounds(72, 146, 85, 28);
		this.getContentPane().add(numeLabel);
		
		JLabel specieLabel = new JLabel("Species");
		specieLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		specieLabel.setBounds(72, 194, 85, 28);
		this.getContentPane().add(specieLabel);
		
		JLabel greutateLabel = new JLabel("Weight");
		greutateLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		greutateLabel.setBounds(72, 245, 85, 28);
		this.getContentPane().add(greutateLabel);
		
		numeTextField = new JTextField();
		numeTextField.setBounds(133, 146, 101, 26);
		this.getContentPane().add(numeTextField);
		numeTextField.setColumns(10);
		
		greutateTextField = new JTextField();
		greutateTextField.setBounds(133, 243, 101, 28);
		this.getContentPane().add(greutateTextField);
		greutateTextField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Specie.values()));
		comboBox.setBounds(133, 199, 101, 22);
		this.getContentPane().add(comboBox);
		
		cazeazaButton = new JButton("Accommodate");
		cazeazaButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cazeazaButton.setBounds(72, 338, 129, 23);
		this.getContentPane().add(cazeazaButton);
		
		veziButton = new JButton("SEE CURRENT ACCOMMODATION AND SERVICES PRICES");
		veziButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		veziButton.setBounds(232, 395, 298, 23);
		this.getContentPane().add(veziButton);
		
		spalaButton = new JButton("Wash");
		spalaButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spalaButton.setBounds(513, 199, 162, 23);
		this.getContentPane().add(spalaButton);
		
		plimbaButton = new JButton("Walk");
		plimbaButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		plimbaButton.setBounds(513, 250, 162, 23);
		this.getContentPane().add(plimbaButton);
		
		JLabel serviciiLabel = new JLabel("Extra Services");
		serviciiLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		serviciiLabel.setBounds(535, 153, 162, 14);
	    this.getContentPane().add(serviciiLabel);
	    
	    this.setVisible(true);
		
	}

	 public void showMessage (String message){
	        JOptionPane.showMessageDialog(this, message);
	    }
	 
	 public void addCazeazaListener(ActionListener action){cazeazaButton.addActionListener(action);}
	 public void addVeziListener(ActionListener action){veziButton.addActionListener(action);}
	 public void addSpalaListener(ActionListener action){spalaButton.addActionListener(action);}
	 public void addPlimbaListener(ActionListener action){plimbaButton.addActionListener(action);}
	 
	 public String getNumeField() {
	        return numeTextField.getText();
	    }
	 
	 public double getGreutateField() {
	        return Double.parseDouble(greutateTextField.getText());
	    }
	 
	 public Specie getSpecieComboBox() {
	        return Specie.valueOf(String.valueOf(comboBox.getSelectedItem()));
	    }
}
