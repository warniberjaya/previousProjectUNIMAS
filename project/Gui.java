import javax.swing.*;
import java.awt.*;


	
public class Gui {
	/*public static void addCompenentsToPane(Container pane){
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

		//JButton newBtn, viewBtn, editBtn, delBtn, seaBtn, sumBtn;


		//label2 = new JLabel("Main Menu");
		btn("New Record",pane);
		btn ("View Record",pane);
		btn("Edit Record",pane);
		btn("Delete Record",pane);
		btn("Search Record",pane);
		btn("Summary Record",pane);


	}

	private static void btn(String text, Container container){
		JButton button = new JButton(text);
		//button.setAlignmentX(Component.CENTER_ALIGNMENT);
		container.add(button);
	}
		*/

	public static void main (String[] args){

		//create frame
		JFrame frame = new JFrame ("Catalog Palm Species");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setSize (900,700);

		//link to other file
		GuiPanel panel = new GuiPanel();
	


		//create top MenuBar
		JMenuBar mB = new JMenuBar();
		JMenu m1 = new JMenu ("File");
		JMenu m2 = new JMenu ("Help");
		JMenu m3 = new JMenu ("Summary");

		mB.add(m1);
		mB.add(m2);
		mB.add(m3);

		JMenuItem m20 = new JMenuItem("Close");
		JMenuItem m21 = new JMenuItem("View");
		JMenuItem m22 = new JMenuItem("Edit");
		JMenuItem m23 = new JMenuItem("Delete");

		m1.add(m20);
		m1.add(m21);
		m1.add(m22);
		m1.add(m23);


		//Label title
		ImageIcon iconTitle= new ImageIcon ("palm1.jpg");
		Image icon = iconTitle.getImage();
		Image newimg = icon.getScaledInstance(70,50, java.awt.Image.SCALE_SMOOTH);
		iconTitle = new ImageIcon(newimg);


		JLabel label1, label2, label3;

		label1 = new JLabel("Palm Species Catalog", iconTitle, SwingConstants.LEFT);
		label1.setHorizontalTextPosition (SwingConstants.RIGHT);
		label1.setVerticalTextPosition (SwingConstants.CENTER);
		

		JButton newBtn, viewBtn, editBtn, delBtn, seaBtn, sumBtn;


		label2 = new JLabel("Main Menu");
		newBtn = new JButton ("New Record");
		viewBtn = new JButton("View Record");
		editBtn = new JButton("Edit Record");
		delBtn = new JButton("Delete Record");
		seaBtn = new JButton("Search Record");
		sumBtn = new JButton("Summary Record");

		JButton btn = new JButton();

		btn.add(newBtn);
		btn.add(viewBtn);
		btn.add(editBtn);
		btn.add(delBtn);
		btn.add(seaBtn);
		btn.add(sumBtn);



		JPanel pnl = new JPanel();
		pnl.setBackground(Color.cyan);
		//pnl.setPreferredSize (new Dimension(20,25));
		pnl.add(label1);

//		JPanel p1 = new JPanel();
	//	p1.add(label2);

		// Adding Compenent to The frame
		frame.getContentPane().add(BorderLayout.NORTH, mB);
	//	frame.getContentPane().add(BorderLayout.WEST, label2);
		//addCompenentsToPane(frame.getContentPane());
		frame.getContentPane().add(panel);
		frame.getContentPane().add(pnl);
		//frame.getContentPane().add(p1);
		//frame.getContentPane().add(deletePanel);
		//frame.pack();
		frame.setVisible(true);

	

		
		


	}

}