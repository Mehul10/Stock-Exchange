package LoginPage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Dashboard {
	JFrame dash;
	String uzer;
	int y;
	String demat;

	Dashboard(String user) {
		uzer = user;
		String qry = "Select * from customer where user_id='" + user + "'";
		dash = new JFrame("Dashboard : " + user);
		dash.setSize(1500, 800);
		dash.setLayout(null);
		try {
			ResultSet p = Main.query(qry);
			while (p.next()) {
				String u = p.getString("name");
				y = p.getInt("balance");
				String email = p.getString("email");
				demat = p.getString("demat_id");
				JLabel em = new JLabel("Email ID :" + email);
				JLabel nam = new JLabel("Username : " + user);
				JLabel bal = new JLabel("Balance : " + y);
				JLabel dem = new JLabel("Demat ID :" + demat);
				JButton w = new JButton(new ImageIcon("./LoginPage/w2.jpg"));
				w.setLocation(50, 200);
				w.setSize(600, 500);
				w.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dash.setVisible(false);
						new Watch(uzer, demat, y);
					}
				});
				dash.add(w);
				JButton btn = new JButton(new ImageIcon("./LoginPage/open.jpg"));
				btn.setLocation(1100, 650);
				btn.setSize(180, 58);
				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String qi = "Select * from dematAccount Where demat_id='" + demat + "' AND Quantity <> 0";
						try {
							ResultSet rs = Main.query(qi);
							new Demat(rs);
						} catch (Exception et) {
							System.out.println("Can't fetch demat");
//						   et.getMessage();
//						   et.printStackTrace();
						}

					}
				});

				dem.setLocation(740, 430);
				em.setLocation(740, 280);
				nam.setLocation(740, 150);
				bal.setLocation(740, 240);
				em.setSize(400, 400);
				nam.setSize(300, 300);
				bal.setSize(300, 300);
				dem.setSize(300, 300);
				dem.setFont(new Font("Times New Roman", Font.PLAIN, 32));
				em.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				nam.setFont(new Font("Times New Roman", Font.PLAIN, 32));
				bal.setFont(new Font("Times New Roman", Font.PLAIN, 32));
				JLabel lg = new JLabel("Hi, " + u);
				lg.setFont(new Font("Times New Roman", Font.BOLD, 40));
				lg.setBounds(786, 24, 300, 300);
				dash.add(em);
				dash.add(dem);
				dash.add(lg);
				dash.add(nam);
				dash.add(btn);
				dash.add(bal);
			}

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			System.out.println("querry error on dashboard");
		}
		dash.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
		JLabel idx = new JLabel(new ImageIcon("./LoginPage/index.jpg"));
		idx.setBounds(8, 8, 570, 120);
		JButton af = new JButton(new ImageIcon("./LoginPage/add.jpg"));
		af.setBounds(1000, 8, 485, 115);
		af.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1 = JOptionPane.showInputDialog("Enter Amount ");
				int x = Integer.parseInt(str1);
				String qry = "Select * from customer where user_id='" + uzer + "'";
				try {
					ResultSet p = Main.query(qry);
					while (p.next()) {
						int y = p.getInt("balance");
						x = x + y;
						String q = "Update customer Set balance=" + x + ".00 where user_id='" + uzer + "'";
						Main.query1(q);
						JOptionPane.showMessageDialog(dash,"Funds Added.");
					}
				} catch (Exception ef) {
					System.out.println("Failed to add funds");
				}
				dash.setVisible(false);
				new Dashboard(uzer);
				
			}
		});

		JLabel icon = new JLabel(new ImageIcon("./LoginPage/kite.png"));
		icon.setBounds(720, 150, 45, 45);
		Color c = new Color(240, 255, 255);
		dash.getContentPane().setBackground(c);
		dash.add(af);
		dash.add(icon);
		dash.add(idx);
		dash.setVisible(true);
		dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
