package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import CharacterSheet.CharacterRace;
import CharacterSheet.CharacterClass;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class RandomPathfinderCharacter {

	private JFrame frmCharacterGenerator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomPathfinderCharacter window = new RandomPathfinderCharacter();
					window.frmCharacterGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RandomPathfinderCharacter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCharacterGenerator = new JFrame();
		frmCharacterGenerator.setResizable(false);
		frmCharacterGenerator.getContentPane().setBackground(new Color(204, 204, 255));
		frmCharacterGenerator.setTitle("Character Generator");
		frmCharacterGenerator.setBounds(100, 100, 450, 300);
		frmCharacterGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCharacterGenerator.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		comboBox.setBounds(39, 49, 53, 21);
		frmCharacterGenerator.getContentPane().add(comboBox);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setForeground(new Color(0, 0, 0));
		lblLevel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		lblLevel.setBounds(52, 26, 45, 13);
		frmCharacterGenerator.getContentPane().add(lblLevel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(CharacterRace.values()));
		comboBox_1.setBounds(295, 49, 87, 21);
		frmCharacterGenerator.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(CharacterClass.values()));
		comboBox_2.setBounds(144, 51, 99, 21);
		frmCharacterGenerator.getContentPane().add(comboBox_2);
		
		JLabel lblRace = new JLabel("Race");
		lblRace.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		lblRace.setBounds(299, 26, 45, 13);
		frmCharacterGenerator.getContentPane().add(lblRace);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		lblClass.setBounds(152, 26, 45, 13);
		frmCharacterGenerator.getContentPane().add(lblClass);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(183, 115, 123, 21);
		frmCharacterGenerator.getContentPane().add(textArea);
		
		JLabel lblPlayerName = new JLabel("Player Name");
		lblPlayerName.setForeground(new Color(0, 0, 0));
		lblPlayerName.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 14));
		lblPlayerName.setBounds(74, 119, 99, 13);
		frmCharacterGenerator.getContentPane().add(lblPlayerName);
		
		JButton btnCreateNewCharacter = new JButton("Create New Character");
		btnCreateNewCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String playerName = textArea.getText();
					String level = comboBox.getSelectedItem().toString();
					String race = comboBox_1.getSelectedItem().toString();
					String charClass = comboBox_2.getSelectedItem().toString();
					String[] args = new String[]{playerName, level, race, charClass};
					CharacterGenerator.main.runSheetGenerator(args);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnCreateNewCharacter.setForeground(new Color(153, 0, 0));
		btnCreateNewCharacter.setBackground(new Color(102, 102, 102));
		btnCreateNewCharacter.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 11));
		btnCreateNewCharacter.setBounds(141, 176, 154, 36);
		frmCharacterGenerator.getContentPane().add(btnCreateNewCharacter);
	}
}
