package first;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

public class ClockGui
{
	private JFrame frmRemainderclock;
	private JTextField textField;
	private JLabel lblSetTheTimer;
	private JTextField textField_1;
	private JButton button;
	private JTextField textField_2;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockGui window = new ClockGui();
					window.frmRemainderclock.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClockGui() {
		initialize();
	}
	
//	TextLimit limit = new TextLimit(2); 
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmRemainderclock = new JFrame();
		frmRemainderclock.setResizable(false);
		frmRemainderclock.setTitle("Remainder Clock");
		frmRemainderclock.setBounds(100, 100, 876, 597);
		frmRemainderclock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		textField = new JTextField();
		textField.setBounds(113, 122, 228, 173);
		textField.setDocument(new TextLimit(2));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 75));
		textField.setColumns(10);
		textField.setText("00");
		
		lblSetTheTimer = new JLabel("Set the Timer");
		lblSetTheTimer.setBounds(103, 30, 536, 71);
		lblSetTheTimer.setHorizontalAlignment(SwingConstants.CENTER);
		lblSetTheTimer.setFont(new Font("Tahoma", Font.PLAIN, 54));
		
		textField_1 = new JTextField();
		textField_1.setBounds(425, 122, 228, 173);
		textField_1.setDocument(new TextLimit(2));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 75));
		textField_1.setColumns(10);
		textField_1.setText("00");
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBounds(190, 444, 167, 38);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		
		button = new JButton("Set");
		button.setBounds(380, 444, 167, 38);
		button.setFont(new Font("Tahoma", Font.PLAIN, 22));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String S1 = textField.getText();
				Integer inputHour = Integer.parseInt(S1);
				String S2 = textField_1.getText();
				Integer inputMinute = Integer.parseInt(S2);
				
				/*For Local or Instance Time for PC*/
				
				LocalTime time = LocalTime.now();
				
				
//				System.out.println(nowHour + " " + nowMinute);
//				System.out.println(inputHour +" "+ inputMinute);
			}
		});
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(366, 151, 46, 115);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Consolas", Font.BOLD, 75));
		textField_2.setEditable(false);
		textField_2.setText(":");
		textField_2.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 50));
		textArea.setBounds(259, 308, 418, 115);
		
		btnNewButton_1 = new JButton("Enter Message");
		btnNewButton_1.setBounds(111, 313, 130, 110);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setForeground(UIManager.getColor("info"));
		frmRemainderclock.getContentPane().setLayout(null);
		frmRemainderclock.getContentPane().add(lblSetTheTimer);
		frmRemainderclock.getContentPane().add(btnNewButton);
		frmRemainderclock.getContentPane().add(button);
		frmRemainderclock.getContentPane().add(btnNewButton_1);
		frmRemainderclock.getContentPane().add(textArea);
		frmRemainderclock.getContentPane().add(textField);
		frmRemainderclock.getContentPane().add(textField_2);
		frmRemainderclock.getContentPane().add(textField_1);
		
		JMenuBar menuBar = new JMenuBar();
		frmRemainderclock.setJMenuBar(menuBar);
		
		JMenu mnAbout = new JMenu("Help");
		menuBar.add(mnAbout);
		
	}
}
