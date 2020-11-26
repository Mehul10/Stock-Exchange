package LoginPage;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Loginpage implements ActionListener {
	JFrame frame;
	JTextField username;
	JPasswordField password;	
	public Loginpage() {
		frame = new JFrame("Login");
		frame.setSize(1500, 800);
		frame.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
		JLabel banner = new JLabel(new ImageIcon("./LoginPage/banner.png"));
		frame.setLayout(null);
		banner.setBounds(475, 10, 600, 600);
		banner.repaint();
		frame.add(banner);
		JLabel lg = new JLabel("LOGIN");
		lg.setFont(new Font("Times New Roman", Font.BOLD, 46));
		JLabel uname = new JLabel("Username");
		uname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		JLabel pass = new JLabel("Password");
		pass.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lg.setBounds(725, 400, 325, 50);
		frame.add(lg);
		uname.setBounds(525, 500, 275, 50);
		pass.setBounds(525, 570, 275, 50);
		username = new JTextField();
		username.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		username.setBounds(660, 500, 325, 50);
		password = new JPasswordField();
		password.setBounds(660, 570, 325, 50);
		JButton button = new JButton("Login");
		button.setBounds(740, 660, 100, 40);
		button.addActionListener(this);
		frame.add(button);
		frame.add(username);
		frame.add(password);
		frame.add(uname);
		frame.add(pass);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String name=username.getText();
		String pass=password.getText();	
		try
		{
			String Query2="select * from credentials where userName='"+name+"'";
			ResultSet p=Main.query(Query2);
			if (!p.isBeforeFirst() ) {    
				JOptionPane.showMessageDialog(frame,"    Username does not exist!");
			} 
			while(p.next())
			{
			String u=p.getString("password");	
			if(pass.equals(u))
			{
			frame.setVisible(false);
			p.close();
			new Dashboard(name);
			}
			else
			{
				JOptionPane.showMessageDialog(frame,"          Wrong Password!");
				p.close();
			}
			}
		}
		catch(Exception ex)
		{
			ex.getMessage();
			ex.printStackTrace();
			System.out.println("Login page error");
		}
		
	}

}
