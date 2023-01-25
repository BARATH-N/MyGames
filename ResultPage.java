package flames_circular_linkedList;
import java.awt.*;
import javax.swing.*;
public class ResultPage {
	
	JFrame frame = new JFrame();
	JLabel resultLabel = new JLabel();
	ResultPage(String  result){
		
       resultLabel.setBounds(0,0,200,35);	
	   resultLabel.setFont(new Font(null,Font.CENTER_BASELINE,25));
	   resultLabel.setText(result);
	   
	   frame.add(resultLabel);
	   
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(420, 420);
	   frame.setLayout(null);
	   frame.setVisible(true);
	
	}

	
}
