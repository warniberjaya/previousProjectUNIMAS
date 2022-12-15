import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GuiPanel extends JPanel {

	public static void addCompenentsToPane(Container pane){
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
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		container.add(button);
	}









}