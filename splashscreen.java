package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;

public class splashscreen {
	
	public static void main(String[]args) throws InterruptedException {
	JWindow w=new JWindow(new JFrame());
	w.setSize(500, 500);
	w.setLocationRelativeTo(null);
	
	JLabel l1=new JLabel(new ImageIcon("C:\\Users\\kirtee\\eclipse-workspace\\javaGUI\\src\\javaGUI\\supermarketsplash.gif"));
	w.add(l1);
	
	JProgressBar pb= new JProgressBar();
	pb.setStringPainted(true);
	pb.setBackground(Color.BLUE);
	pb.setForeground(Color.cyan);
	w.add(BorderLayout.SOUTH,pb);
	w.setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/javaGUI/shopping-cart.png")));
	w.setVisible(true);
	for(int i=0;i<=100;i++) {
		Thread.sleep(100);
		pb.setValue(i);
		
	}
	if(pb.getValue()==100) {
		w.dispose();
	}
   Start_main second=new Start_main();
	second.setVisible(true);
}

}
