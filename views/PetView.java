package views;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Specie;

public class PetView extends JFrame {
	  private JButton verifButton;
	  private JButton inregButton;
	  
	  private JComboBox comboBox;
	  
	  public JLabel yesLabel;
	  public JLabel noLabel;
	
	public PetView() {
		
		this.setBounds(100, 100, 740, 488);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("Hotel For Animals");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		nameLabel.setBounds(244, 59, 225, 31);
		this.getContentPane().add(nameLabel);
		
	    verifButton = new JButton("Check Availability");
		verifButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		verifButton.setBounds(232, 184, 225, 23);
		this.getContentPane().add(verifButton);
		
		inregButton = new JButton("Registration");
		inregButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		inregButton.setBounds(258, 370, 174, 23);
		this.getContentPane().add(inregButton);
		
		yesLabel = new JLabel("Yes, there is room!");
		yesLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		yesLabel.setBounds(512, 171, 137, 14);
		this.getContentPane().add(yesLabel);
		yesLabel.setVisible(false);
		
        noLabel = new JLabel("No, there is no room!");
		noLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		noLabel.setBounds(512, 189, 92, 14);
		this.getContentPane().add(noLabel);
		noLabel.setVisible(false);
		
	    comboBox = new JComboBox();
	    comboBox.setModel(new DefaultComboBoxModel(Specie.values()));
		comboBox.setBounds(70, 186, 137, 22);
		this.getContentPane().add(comboBox);
		
		this.setVisible(true);
		
	}
	
	public void showMessage (String message){
        JOptionPane.showMessageDialog(this, message);
    }
	
	 public void addInscriereListener(ActionListener action){inregButton.addActionListener(action);}
	 public void addVerificareListener(ActionListener action){verifButton.addActionListener(action);}

	 public Specie getSpecieComboBox() {
	        return Specie.valueOf(String.valueOf(comboBox.getSelectedItem()));
	    }
	 
}
