package guitime;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GuiTime
{
	private JFrame frame;
	private JLabel lblMessage;
	private JTextField textField;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GuiTime window = new GuiTime();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public GuiTime()
	{
		initialize();
	}

	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Show Message");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//JOptionPane.showMessageDialog(null, "Hi Mr. Medvitz");
				lblMessage.setText("Hey Mr. Medvitz");
			}
		});
		btnNewButton.setBounds(6, 223, 149, 43);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(6, 6, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblMessage = new JLabel("Message");
		lblMessage.setBounds(6, 33, 130, 16);
		frame.getContentPane().add(lblMessage);
	}
}
