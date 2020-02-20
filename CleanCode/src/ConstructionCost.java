import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ConstructionCost {
	JFrame f;
	JButton b1;
	TextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4,l5,l6,ll;
	public void application()
	{
		f=new JFrame("Construction Cost");
		f.getContentPane().setBackground(Color.PINK);
		b1=new JButton("Submit");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		l1=new JLabel("Enter the material Standard:");
		l6=new JLabel("(Standard/Above/High)");
		l2=new JLabel("Total area of the house:");
		l5=new JLabel("(in Square Feet)");
		l3=new JLabel("Fully automated(Yes/No):");
		l4=new JLabel("Total Construction Cost:");
		ll=new JLabel("");
		f.setVisible(true);
		f.setSize(650,700);
		f.add(ll);
		ll.add(l1);
		ll.add(t1);
		ll.add(l6);
		ll.add(l2);
		ll.add(t2);
		ll.add(l5);
		ll.add(l3);
		ll.add(t3);
		ll.add(b1);
		ll.add(l4);
		ll.add(t4);
		l1.setBounds(130 ,70,170,50);
		l6.setBounds(130,90,200,50);
		t1.setBounds(300,70,150,50);
		l2.setBounds(150,150,150,50);
		t2.setBounds(300,150,150,50);
		l5.setBounds(150,170,150,50);
		l3.setBounds(150,230,150,50);
		t3.setBounds(300,230,150,50);
		b1.setBounds(30,300,150,50);
		l4.setBounds(150,430,150,50);
		t4.setBounds(300,430,150,50);
		b1.addActionListener((ActionListener) this);
	}
	public void actionPerformed(ActionEvent ae) {

		String std=t1.getText();
		int feet=Integer.parseInt(t2.getText());
		String automated=t3.getText();
		float cost=0;
		if(ae.getSource().equals(b1)) {
			if(std.contentEquals("Standard"))
			{
				cost = (feet*1200);
				String val=String.valueOf(cost);

				t4.setText(val);
			}
			else if(std.contentEquals("Above"))
			{
				cost = (feet*1500);
				String val=String.valueOf(cost);
				t4.setText(val);
			}
			else if(std.contentEquals("High") && automated.contentEquals("No"))
			{

				cost = (feet*1800);
				String val=String.valueOf(cost);
				t4.setText(val);
			}
			else if(std.contentEquals("High") && automated.contentEquals("Yes"))
			{
				cost = (feet*2500);
				String val=String.valueOf(cost);
				t4.setText(val);
			}

		}
		else
		{
			f.setVisible(false);
		}

	}
	public static void main(String args[])
	{
		ConstructionCost f=new ConstructionCost();
		f.application();
	}
}


