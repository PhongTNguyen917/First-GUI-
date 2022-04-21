import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI2 implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel secretPasswordLabel;
	
	
	

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame("Simiconductor");
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		// Creating a user label 
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25); 
		panel.add(userLabel);
		
		// Creating a text field to enter a user name
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		// Creating a password and label text field 
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField(30);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		// Creating login 
		button = new JButton("Click to login");
		button.setBounds(10, 80, 120, 25);
		button.addActionListener(new GUI2());
		panel.add(button);
		
	    secretPasswordLabel = new JLabel("");
		secretPasswordLabel.setBounds(10, 140, 350, 25);
		panel.add(secretPasswordLabel);
		
		
		
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + "," + password);
		
		if(user.equals("Elon Musk") && password.equals("teslaModelX2022")) 
			secretPasswordLabel.setText("Login successful!");
			else 
				secretPasswordLabel.setText("User name or password is incorrect");
		
	}

}
