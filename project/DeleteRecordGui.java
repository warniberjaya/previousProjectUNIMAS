import java.util.Scanner;
import java.util.LinkedList;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.awt.*;

public class DeleteRecordGui extends JFrame{
	
	JFrame frame = new JFrame("Delete Record");
	JPanel panel = new JPanel();

	private JLabel nameLabel			= new JLabel ("Name");
    private JLabel speciesLabel			= new JLabel("Species");
    private JLabel characterLabel		= new JLabel("Characteristic");
   // private JLabel timeLabel 			= new JLabel("Time 24hrs(HH:MM)");
    private JLabel locationLabel 		= new JLabel("Location");
    private JLabel genusLabel 			= new JLabel("Genus");
    private JLabel dateLabel 			= new JLabel("Date(dd/MM/YYYY)");
    //private JLwwabel fileLabel 			= new JLabel("image");

    private JTextField nameTextField 	= new JTextField();
    private JTextField speciesTextField = new JTextField();
    private JTextField character 		= new JTextField();
    //private JTextField time 			= new JTextField();
    //private JTextField location 		= new JTextField();
    private JTextField file_img 		= new JTextField();


    private JButton deleteButton 		= new JButton("Delete");
    private JButton exitButton		    = new JButton("Exit");

    private static Scanner x;
    //class instance data:
  //  private LinkedList<Record> recordLinkedList = new LinkedList<Record>();
    private int editIndex;


    public DeleteRecordGui ()
    {
    	
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

    }
    
    private boolean isRecordPlantLinkedList (String plStr )
    {
    	boolean inList = false;

    	for (Record rec : recordLinkedList)
    	{
    		if (stud.getName().compareToIgnoreCase (plStr) == 0)
    		{
    			inList = true;
    		}
    	}

    	return inList;

    }
	
	private void deletePlant ()
	{
		if (recordLinkedList.size() == 0)
		{
			JOptionPane.ShowMessageDialog (DeleteRecordGui.this, "Error: Database is empty.");
		}
		else if (isRecordPlantLinkedList (nameTextField.getText()) == false)
     	{
        	JOptionPane.showMessageDialog (DeleteRecordGUI.this, "Error: Record plant name is not in the database.");
    	}
    	else
    	{
        	 for (int s = 0; s < recordLinkedList.size(); s++)
         	{
            String currName = recordLinkedList.get (s).getName ();

            if (currName.compareToIgnoreCase (nameTextField.getText()) == 0)
            {
               recordLinkedList.remove (s);
            }
       	  }

         displayAll ();

         nameTextField.setText("");
         speciesTextField.setText("");
    	 }
  	}
  

    private void displayAll ()
  	{
    	recordTextArea.setText ("");

      	for (Record stud : recordLinkedList)
      	{
         recordTextArea.append (stud + "\n");
      	}
   	}

   	public static void main (String[] args)
   {
      DeleteRecordGUI app = new DeleteRecordGUI ();
      app.setVisible  (true);
      app.setSize     (500, 310);
      app.setLocation (200, 100);
      app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
   }



	}




