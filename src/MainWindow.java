import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class MainWindow {

	private JFrame frame;
	private JTextField textField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxB_6 = new JCheckBox("B7");
		chckbxB_6.setBounds(167, 329, 97, 23);
		frame.getContentPane().add(chckbxB_6);
		
		JCheckBox chckbxB = new JCheckBox("B1");
		chckbxB.setBounds(167, 72, 97, 23);
		frame.getContentPane().add(chckbxB);
		
		JCheckBox chckbxB_5 = new JCheckBox("B7");
		chckbxB_5.setBounds(167, 291, 97, 23);
		frame.getContentPane().add(chckbxB_5);
		
		JCheckBox chckbxB_2 = new JCheckBox("B3");
		chckbxB_2.setBounds(167, 160, 97, 23);
		frame.getContentPane().add(chckbxB_2);
		
		JCheckBox chckbxB_4 = new JCheckBox("B6");
		chckbxB_4.setBounds(167, 251, 97, 23);
		frame.getContentPane().add(chckbxB_4);
		
		JCheckBox chckbxB_8 = new JCheckBox("B9");
		chckbxB_8.setBounds(167, 434, 97, 23);
		frame.getContentPane().add(chckbxB_8);
		
		JCheckBox chckbxB_1 = new JCheckBox("B2");
		chckbxB_1.setBounds(167, 118, 97, 23);
		frame.getContentPane().add(chckbxB_1);
		
		JCheckBox chckbxB_3 = new JCheckBox("B4");
		chckbxB_3.setBounds(167, 205, 97, 23);
		frame.getContentPane().add(chckbxB_3);
		
		JCheckBox chckbxB_7 = new JCheckBox("B8");
		chckbxB_7.setBounds(167, 383, 97, 23);
		frame.getContentPane().add(chckbxB_7);
		
		JCheckBox chckbxB_9 = new JCheckBox("B10");
		chckbxB_9.setBounds(167, 483, 97, 23);
		frame.getContentPane().add(chckbxB_9);
		
		JCheckBox chckbxA_5 = new JCheckBox("A6");
		chckbxA_5.setBounds(46, 291, 97, 23);
		frame.getContentPane().add(chckbxA_5);
		
		JCheckBox chckbxA_2 = new JCheckBox("A3");
		chckbxA_2.setBounds(46, 160, 97, 23);
		frame.getContentPane().add(chckbxA_2);
		
		JCheckBox chckbxA_6 = new JCheckBox("A7");
		chckbxA_6.setBounds(46, 329, 97, 23);
		frame.getContentPane().add(chckbxA_6);
		
		JCheckBox chckbxA_4 = new JCheckBox("A5");
		chckbxA_4.setBounds(46, 251, 97, 23);
		frame.getContentPane().add(chckbxA_4);
		
		JCheckBox chckbxA_8 = new JCheckBox("A9");
		chckbxA_8.setBounds(46, 434, 97, 23);
		frame.getContentPane().add(chckbxA_8);
		
		JCheckBox chckbxA_3 = new JCheckBox("A4");
		chckbxA_3.setBounds(46, 205, 97, 23);
		frame.getContentPane().add(chckbxA_3);
		
		JCheckBox chckbxA_7 = new JCheckBox("A8");
		chckbxA_7.setBounds(46, 383, 97, 23);
		frame.getContentPane().add(chckbxA_7);
		
		JCheckBox chckbxA_1 = new JCheckBox("A2");
		chckbxA_1.setBounds(46, 118, 97, 23);
		frame.getContentPane().add(chckbxA_1);
		
		JCheckBox chckbxA_9 = new JCheckBox("A10");
		chckbxA_9.setBounds(46, 483, 97, 23);
		frame.getContentPane().add(chckbxA_9);
		
		JCheckBox chckbxA = new JCheckBox("A1");
		chckbxA.setAction(action);
		chckbxA.setBounds(46, 72, 97, 23);
		frame.getContentPane().add(chckbxA);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 704, 681);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
