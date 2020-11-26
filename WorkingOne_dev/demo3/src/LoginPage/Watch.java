package LoginPage;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Watch extends WindowAdapter implements ActionListener {

	static String userID, equityHolding;
	static JFrame frame;
	JButton buy1, buy2, buy3, buy4, buy5, buy6, buy7, buy8, buy9, buy10, buy11;
	JButton sell1, sell2, sell3, sell4, sell5, sell6, sell7, sell8, sell9, sell10, sell11;
	JLabel stock1;
	JLabel stock2;
	JLabel stock3;
	JLabel stock4;
	JLabel stock5;
	JLabel stock6;
	JLabel stock7;
	JLabel stock8;
	JLabel stock9;
	JLabel stock10;
	JLabel stock11;
	JLabel price11;
	JLabel price1;
	JLabel price2;
	JLabel price3;
	JLabel price4;
	JLabel price5;
	JLabel price6;
	JLabel price7;
	JLabel price8;
	JLabel price9;
	JLabel price10;
	static String demat;
	static int balance;
	static String user;

	public Watch(String us, String dem, int b) {
		user = us;
		demat = dem;
		balance = b;
		frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
		frame.setLayout(new BorderLayout());
		JLabel welcome = new JLabel("WatchList");
		welcome.setFont(new Font("Serif", Font.PLAIN, 54));
		frame.add(welcome, BorderLayout.NORTH);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(12, 2));
		buy1 = new JButton("Buy");
		buy1.setBackground(Color.GREEN);
		sell1 = new JButton("Sell");
		sell1.setBackground(Color.RED);
		buy2 = new JButton("Buy");
		buy2.setBackground(Color.GREEN);
		sell2 = new JButton("Sell");
		sell2.setBackground(Color.RED);
		buy3 = new JButton("Buy");
		buy3.setBackground(Color.GREEN);
		sell3 = new JButton("Sell");
		sell3.setBackground(Color.RED);
		buy4 = new JButton("Buy");
		buy4.setBackground(Color.GREEN);
		sell4 = new JButton("Sell");
		sell4.setBackground(Color.RED);
		buy5 = new JButton("Buy");
		buy5.setBackground(Color.GREEN);
		sell5 = new JButton("Sell");
		sell5.setBackground(Color.RED);
		buy6 = new JButton("Buy");
		buy6.setBackground(Color.GREEN);
		sell6 = new JButton("Sell");
		sell6.setBackground(Color.RED);
		buy7 = new JButton("Buy");
		buy7.setBackground(Color.GREEN);
		sell7 = new JButton("Sell");
		sell7.setBackground(Color.RED);
		buy8 = new JButton("Buy");
		buy8.setBackground(Color.GREEN);
		sell8 = new JButton("Sell");
		sell8.setBackground(Color.RED);
		buy9 = new JButton("Buy");
		buy9.setBackground(Color.GREEN);
		sell9 = new JButton("Sell");
		sell9.setBackground(Color.RED);
		buy10 = new JButton("Buy");
		buy10.setBackground(Color.GREEN);
		sell10 = new JButton("Sell");
		sell10.setBackground(Color.RED);
		buy11 = new JButton("Buy");
		buy11.setBackground(Color.GREEN);
		sell11 = new JButton("Sell");
		sell11.setBackground(Color.RED);
		JLabel bo = new JLabel("Buy");
		bo.setFont(new Font("Serif", Font.PLAIN, 54));
		JLabel s = new JLabel("Sell");
		s.setFont(new Font("Serif", Font.PLAIN, 54));
		p.add(bo);
		p.add(s);
		p.add(buy1);
		p.add(sell1);
		p.add(buy2);
		p.add(sell2);
		p.add(buy3);
		p.add(sell3);
		p.add(buy4);
		p.add(sell4);
		p.add(buy5);
		p.add(sell5);
		p.add(buy6);
		p.add(sell6);
		p.add(buy7);
		p.add(sell7);
		p.add(buy8);
		p.add(sell8);
		p.add(buy9);
		p.add(sell9);
		p.add(buy10);
		p.add(sell10);
		p.add(buy11);
		p.add(sell11);
		frame.add(p, BorderLayout.EAST);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(12, 2));
		JLabel head = new JLabel("Name of Stock");
		head.setFont(new Font("Serif", Font.PLAIN, 54));
		JLabel price = new JLabel("Price");
		price.setFont(new Font("Serif", Font.PLAIN, 54));
		stock1 = new JLabel("Ashok Leyland Ltd.");
		stock1.setFont(new Font("Serif", Font.PLAIN, 44));
		stock2 = new JLabel("Nestle India Ltd.");
		stock2.setFont(new Font("Serif", Font.PLAIN, 44));
		stock3 = new JLabel("Apollo Hospitals Enterprises Ltd");
		stock3.setFont(new Font("Serif", Font.PLAIN, 44));
		stock4 = new JLabel("Bajaj Finance Ltd.");
		stock4.setFont(new Font("Serif", Font.PLAIN, 44));
		stock5 = new JLabel("Bharat Electronics Ltd.");
		stock5.setFont(new Font("Serif", Font.PLAIN, 44));
		price1 = new JLabel("16604.75");
		price1.setFont(new Font("Serif", Font.PLAIN, 44));
		price2 = new JLabel("20347.35");
		price2.setFont(new Font("Serif", Font.PLAIN, 44));
		price3 = new JLabel("2033.40");
		price3.setFont(new Font("Serif", Font.PLAIN, 44));
		price4 = new JLabel("24208.55");
		price4.setFont(new Font("Serif", Font.PLAIN, 44));
		price5 = new JLabel("43567.90");
		price5.setFont(new Font("Serif", Font.PLAIN, 44));
		// Label price=new Label("Price"); price.setFont(new Font("Serif", Font.PLAIN,
		// 54));
		stock6 = new JLabel("Birla Corporation Ltd.");
		stock6.setFont(new Font("Serif", Font.PLAIN, 44));
		stock7 = new JLabel("Bharat Heavy Electricals Ltd");
		stock7.setFont(new Font("Serif", Font.PLAIN, 44));
		stock8 = new JLabel("Dixon Technologies Ltd");
		stock8.setFont(new Font("Serif", Font.PLAIN, 44));
		stock9 = new JLabel("HCL Technologies Ltd.");
		stock9.setFont(new Font("Serif", Font.PLAIN, 44));
		stock10 = new JLabel("Infosys Ltd.");
		stock10.setFont(new Font("Serif", Font.PLAIN, 44));
		stock11 = new JLabel("Orient Cement Ltd.");
		stock11.setFont(new Font("Serif", Font.PLAIN, 44));
		price6 = new JLabel("56734.78");
		price6.setFont(new Font("Serif", Font.PLAIN, 44));
		price7 = new JLabel("30114.40");
		price7.setFont(new Font("Serif", Font.PLAIN, 44));
		price8 = new JLabel("21900.90");
		price8.setFont(new Font("Serif", Font.PLAIN, 44));
		price9 = new JLabel("17899.67");
		price9.setFont(new Font("Serif", Font.PLAIN, 44));
		price10 = new JLabel("45789.00");
		price10.setFont(new Font("Serif", Font.PLAIN, 44));
		price11 = new JLabel("21986.90");
		price11.setFont(new Font("Serif", Font.PLAIN, 44));
		p1.add(head);
		p1.add(price);
		p1.add(stock1);
		p1.add(price1);
		p1.add(stock2);
		p1.add(price2);
		p1.add(stock3);
		p1.add(price3);
		p1.add(stock4);
		p1.add(price4);
		p1.add(stock5);
		p1.add(price5);
		p1.add(stock6);
		p1.add(price6);
		p1.add(stock7);
		p1.add(price7);
		p1.add(stock8);
		p1.add(price8);
		p1.add(stock9);
		p1.add(price9);
		p1.add(stock10);
		p1.add(price10);
		p1.add(stock11);
		p1.add(price11);

		frame.add(p1, BorderLayout.CENTER);
		frame.setVisible(true);
		// frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		sell1.addActionListener(this);
		sell2.addActionListener(this);
		sell3.addActionListener(this);
		sell4.addActionListener(this);
		sell5.addActionListener(this);
		sell6.addActionListener(this);
		sell7.addActionListener(this);
		sell8.addActionListener(this);
		sell9.addActionListener(this);
		sell10.addActionListener(this);
		sell11.addActionListener(this);
		buy1.addActionListener(this);
		buy2.addActionListener(this);
		buy3.addActionListener(this);
		buy4.addActionListener(this);
		buy5.addActionListener(this);
		buy6.addActionListener(this);
		buy7.addActionListener(this);
		buy8.addActionListener(this);
		buy9.addActionListener(this);
		buy10.addActionListener(this);
		buy11.addActionListener(this);

		frame.addWindowListener(this);
	}

	public void windowClosing(WindowEvent e) {
		frame.dispose();
		new Dashboard(user);
	}

	public static void buy(int qty, double price, String nam) {
		double margain = price * qty;
		if (margain > balance) {
			JOptionPane.showMessageDialog(frame, "Insufficiet balance");
		} else {
			String Query1 = "Select stk_id  from stocks where companyName='" + nam + "'";

			try {
				ResultSet rs = Main.query(Query1);
				String id;
				while (rs.next()) {
					id = rs.getString("stk_id");
					String Query2 = "update dematAccount set quantity=quantity+'" + qty + "' where equityHolding='" + id
							+ "' and demat_id='" + demat + "'";
					Main.query1(Query2);
					String Query3 = "update customer set balance=balance-" + margain + " where user_id='" + user + "'";
					Main.query1(Query3);
					JOptionPane.showMessageDialog(frame, "Bought " + qty + " unit(s).");
				}

			} catch (Exception err) {
				System.out.println("BUY ERROR");
			}
		}
	}

	public static void sell(int qty, double price, String nam) {
		double margain = price * qty;

		String Query1 = "Select stk_id  from stocks where companyName='" + nam + "'";

		try {
			ResultSet rs = Main.query(Query1);
			String id;
			while (rs.next()) {
				id = rs.getString("stk_id");
				String Query2 = "update dematAccount set quantity=quantity+'" + qty + "' where equityHolding='" + id
						+ "' and demat_id='" + demat + "'";
				Main.query1(Query2);
				String Query3 = "update customer set balance=balance+" + margain + " where user_id='" + user + "'";
				Main.query1(Query3);
				JOptionPane.showMessageDialog(frame, "Sold " + qty + " unit(s).");
			}

		} catch (Exception err) {
			System.out.println("BUY ERROR");
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buy1) {
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price1.getText();
			double pr = Double.parseDouble(p);
			String n = stock1.getText();
			buy(x, pr, n);

		}
		if (e.getSource() == buy2) {
			System.out.println("Buy button 2 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price2.getText();
			double pr = Double.parseDouble(p);
			String n = stock2.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy3) {
			System.out.println("Buy button 3 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price3.getText();
			double pr = Double.parseDouble(p);
			String n = stock3.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy4) {
			System.out.println("Buy button 4 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price4.getText();
			double pr = Double.parseDouble(p);
			String n = stock4.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy5) {
			System.out.println("Buy button 5 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price5.getText();
			double pr = Double.parseDouble(p);
			String n = stock5.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy6) {
			System.out.println("Buy button 6 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price6.getText();
			double pr = Double.parseDouble(p);
			String n = stock6.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy7) {
			System.out.println("Buy button 7 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price7.getText();
			double pr = Double.parseDouble(p);
			String n = stock7.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy8) {
			System.out.println("Buy button 8 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price8.getText();
			double pr = Double.parseDouble(p);
			String n = stock8.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy9) {
			System.out.println("Buy button 9 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price9.getText();
			double pr = Double.parseDouble(p);
			String n = stock9.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy10) {
			System.out.println("Buy button 10 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price10.getText();
			double pr = Double.parseDouble(p);
			String n = stock10.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == buy11) {
			System.out.println("Buy button 11 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price11.getText();
			double pr = Double.parseDouble(p);
			String n = stock11.getText();
			buy(x, pr, n);
		}
		if (e.getSource() == sell1) {
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price1.getText();
			double pr = Double.parseDouble(p);
			String n = stock1.getText();
			sell(x, pr, n);

		}
		if (e.getSource() == sell2) {
			System.out.println("Buy button 2 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price2.getText();
			double pr = Double.parseDouble(p);
			String n = stock2.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell3) {
			System.out.println("Buy button 3 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price3.getText();
			double pr = Double.parseDouble(p);
			String n = stock3.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell4) {
			System.out.println("Buy button 4 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price4.getText();
			double pr = Double.parseDouble(p);
			String n = stock4.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell5) {
			System.out.println("Buy button 5 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price5.getText();
			double pr = Double.parseDouble(p);
			String n = stock5.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell6) {
			System.out.println("Buy button 6 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price6.getText();
			double pr = Double.parseDouble(p);
			String n = stock6.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell7) {
			System.out.println("Buy button 7 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price7.getText();
			double pr = Double.parseDouble(p);
			String n = stock7.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell8) {
			System.out.println("Buy button 8 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price8.getText();
			double pr = Double.parseDouble(p);
			String n = stock8.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell9) {
			System.out.println("Buy button 9 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price9.getText();
			double pr = Double.parseDouble(p);
			String n = stock9.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell10) {
			System.out.println("Buy button 10 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price10.getText();
			double pr = Double.parseDouble(p);
			String n = stock10.getText();
			sell(x, pr, n);
		}
		if (e.getSource() == sell11) {
			System.out.println("Buy button 11 called");
			String str1 = JOptionPane.showInputDialog("Enter Quantity ");
			int x = Integer.parseInt(str1);
			String p = price11.getText();
			double pr = Double.parseDouble(p);
			String n = stock11.getText();
			sell(x, pr, n);
		}

	}

}
