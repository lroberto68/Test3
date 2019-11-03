import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;


public class MainForm {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private Person p=new Person();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
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
	public MainForm() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Ok");

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(65, 141, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
				
			}
		});
		btnNewButton.setBounds(288, 36, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(65, 39, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
	}
	
	private void btnNewButtonActionPerformed(ActionEvent e){
		try{
			p.setEta(Integer.parseInt(textField.getText()));
			lblNewLabel.setText(Integer.toString(p.getEta()));
		}
		catch(Exception e1){
			JOptionPane.showMessageDialog(null,"il valore inserito non è intero, numerico","errore",JOptionPane.ERROR_MESSAGE);
			//e1.printStackTrace();
		}
	}
}
