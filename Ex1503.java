import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ex1503 extends JFrame implements ActionListener {
	
	JButton btn1, btn2, btn3, btn4, btn5;
	Color color;
	
	Ex1503(){
		setTitle("대화상자 아이콘");
		setSize(400, 200);
		setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		add(panel);
		
		btn1 = new JButton("ERROR");
		btn2 = new JButton("INFORMATION");
		btn3 = new JButton("WARNING");
		btn4 = new JButton("QUESTION");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		color = btn1.getBackground();
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		setVisible(true);
		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		initButton();
		
		if(obj == btn1) {
			btn1.setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this,
					"JOpetionPane 대화상자", "ERORR", JOptionPane. ERROR_MESSAGE);
		}
		
		else if(obj == btn2) {
			btn1.setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this,
					"JOpetionPane 대화상자", "ERORR", JOptionPane. INFORMATION_MESSAGE);
		}
		
		else if(obj == btn3) {
			btn1.setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this,
					"JOpetionPane 대화상자", "ERORR", JOptionPane. WARNING_MESSAGE);
		}
		
		else if(obj == btn4) {
			btn1.setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this,
					"JOpetionPane 대화상자", "ERORR", JOptionPane. QUESTION_MESSAGE);
		}
		
	}
	
	
	public void initButton() {
		btn1.setBackground(color);
		btn2.setBackground(color);
		btn3.setBackground(color);
		btn4.setBackground(color);
		
	}
	public static void main(String[] args) {
		new Ex1503();

	}

}
