package flames_circular_linkedList;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class FrontPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton submitbutton = new JButton("Submit");
	JTextField mynamefield = new JTextField();
	JTextField hernamefield = new JTextField();
	JLabel mynameLabel = new JLabel("Your Name:");
	JLabel hernameLabel = new JLabel("Crush Name:");
	FrontPage(){
		frame.setTitle("Kaadhal kanini - Love Calcultor");
		mynameLabel.setBounds(50, 100, 75, 25);
		hernameLabel.setBounds(50, 150, 75, 25);
		mynamefield.setBounds(125, 100, 200, 25);
		hernamefield.setBounds(125, 150, 200, 25);
		submitbutton.setBounds(225,200,100,25);
		submitbutton.setFocusable(false);
		submitbutton.addActionListener(this);
		frame.add(mynameLabel);
		frame.add(hernameLabel);
		frame.add(mynamefield);
		frame.add(hernamefield);
		frame.add(submitbutton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==submitbutton) {
			String myname = mynamefield.getText();
			String hername = hernamefield.getText();
			String result = FlamesClass.doTraverse(myname,hername);
			ResultPage resultPage = new ResultPage(result);  
			
		}
	}

	
	
}
