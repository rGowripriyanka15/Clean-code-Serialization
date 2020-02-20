import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class SimpleandCompound implements ActionListener {
	JFrame f;
	JButton b1;
	TextField t1,t2,t3,t4,t5;
	JLabel l1,l2,l3,l4,l5,ll;
	public void application()
	{
		f=new JFrame("Construction Cost");
		f.getContentPane().setBackground(Color.PINK);
		b1=new JButton("Submit");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		t5=new TextField(10);
		l1=new JLabel("Enter the principal amount:");
		l2=new JLabel("Rate of interest(in %):");
		l3=new JLabel("Enter the amount of time(in years):");
		l4=new JLabel("Simple Interest:");
		l5=new JLabel("Compound Interest");
		ll=new JLabel("");
		f.setVisible(true);
		f.setSize(650,700);
		f.add(ll);
		ll.add(l1);
		ll.add(t1);
		ll.add(l2);
		ll.add(t2);
		ll.add(l3);
		ll.add(t3);
		ll.add(b1);
		ll.add(l4);
		ll.add(t4);
		ll.add(l5);
		ll.add(t5);
		l1.setBounds(130 ,70,170,50);
		t1.setBounds(300,70,150,50);
		l2.setBounds(150,150,150,50);
		t2.setBounds(300,150,150,50);
		l3.setBounds(150,230,150,50);
		t3.setBounds(300,230,150,50);
		b1.setBounds(30,300,150,50);
		l4.setBounds(150,430,150,50);
		t4.setBounds(300,430,150,50);
		l5.setBounds(150,480,150,50);
		t5.setBounds(300,490,150,50);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {

		float p=Float.parseFloat(t1.getText());
		int r=Integer.parseInt(t2.getText());
		int t=Integer.parseInt(t3.getText());
		float SI;
		double CI;
		String val1,val2;
		if(ae.getSource().equals(b1)) {
			SI=(p*r*t)/100;
			CI=p * Math.pow(1 + (r / 100), t );
			val1=String.valueOf(SI);
			t4.setText(val1);
			val2=String.valueOf(CI);
			t5.setText(val2);

		}
		else
		{
			f.setVisible(false);
		}

	}
	public static void main(String args[])
	{
		SimpleandCompound sc=new SimpleandCompound();
		sc.application();
	}
}





