import javax.swing.*;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class GUIDesign {
	JFrame f;
	JLabel jl,jl1;
	JTextField jt,jt1;
	JButton jb;
	GUIDesign()
	{
		f = new JFrame("Welcome to Swing");
		f.setSize(400, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jl = new JLabel("Enter Your Name : ");
		jl1 = new JLabel("Encrypted Text : ");
		jt = new JTextField(10);
		jt1 = new JTextField(10);
		jb = new JButton("Encrypt");
		
		jl.setBounds(20,20,150,50);
		jt.setBounds(190,30,100,30);
		jl1.setBounds(20,100,300,25);
		jt1.setBounds(190, 100, 100, 30);
		jb.setBounds(20, 200, 100, 30);
			
		f.add(jl);
		f.add(jt);
		f.add(jb);
		f.add(jl1);
		f.add(jt1);
		
		jb.addActionListener(new f1());

		f.setLayout(null);
		f.setVisible(true);

	}	


class f1 implements ActionListener{
	String c="";
	@Override
	
	public void actionPerformed(ActionEvent e) {
		//int num1=Integer.parseInt(jt.getText());
		//System.out.println(num1);
		//jt1.setText(num1+"");
		
		String str1=jt.getText();
		int key=5;
		char[] chars = str1.toCharArray();
		for(char c: chars) {
		 c+=key;
		 System.out.print(c);
		}
		jt1.setText(c);
	}
	
}
}

public class SwingDemo1 {
	public static void main(String args[]){
		{
			GUIDesign ob = new GUIDesign();
		}
	}
}
