import javax.swing.*;

public class Ex1502 extends JFrame{
	
	public Ex1502() {
		setTitle("메뉴 만들기");
		setSize(400, 200);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Edit");
		JMenu m3 = new JMenu("Help");
		menuBar.add(m1);
		menuBar.add(m1);
		menuBar.add(m1);
		
		JMenuItem mf1 = new JMenuItem("New");
		JMenuItem mf2 = new JMenuItem("Open");
		m1.add(mf1);
		m1.add(mf1);
		
		JMenuItem me1 = new JMenuItem("Copy");
		JMenuItem me2 = new JMenuItem("Paste");
		m1.add(me1);
		m1.add(me1);
		
		setJMenuBar(menuBar);
		
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		

	}

}
