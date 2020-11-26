package LoginPage;
import java.awt.*;
import java.awt.Container;
import javax.swing.*;
import javax.swing.ScrollPaneLayout.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;

public class Demat {
	JFrame pan;
	JTable tab;
	Demat(ResultSet rs)
	{
		pan=new JFrame("ScrollPaneLayout");
		DefaultTableModel model = new DefaultTableModel(); 
		tab = new JTable(model); 
		model.addColumn("Equity Holding"); 
		model.addColumn("Quantity");
		try
		{
			int i=0;
		while(rs.next())
		{
			String name=rs.getString("equityHolding");
			int x=rs.getInt("Quantity");
			System.out.println(name);
			System.out.println(x);
			model.insertRow(i,new Object[]{name, ""+x}); 
			i++;
		}
		JScrollPane sp=new JScrollPane(tab);
		pan.add(sp,BorderLayout.SOUTH);
		//pan.setLayout(new ScrollPaneLayout());
		}
		catch(Exception e)
		{
			System.out.println("Demat");
		}
		System.out.println("SET VSIBLE");
		pan.setSize(900,1400);
		pan.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
		pan.setVisible(true);
	}
	
}
