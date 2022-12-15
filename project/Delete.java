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

public class Delete extends JFrame {

	JFrame frame = new JFrame("Delete Record");
	JPanel panel = new JPanel();

	private JLabel nameLabel			= new JLabel ("Name");
    private JLabel speciesLabel			= new JLabel("Species");
    private JLabel characterLabel		= new JLabel("Characteristic");
    private JLabel timeLabel 			= new JLabel("Time 24hrs(HH:MM)");
    private JLabel locationLabel 		= new JLabel("Location");
    private JLabel genusLabel 			= new JLabel("Genus");
    private JLabel dateLabel 			= new JLabel("Date(dd/MM/YYYY)");
    //private JLabel fileLabel 			= new JLabel("image");

    private JTextField name 			= new JTextField();
    private JTextField species 			= new JTextField();
    private JTextField character 		= new JTextField();
    //private JTextField time 			= new JTextField();
    //private JTextField location 		= new JTextField();
    private JTextField file_img 		= new JTextField();


    private JButton deleteButton 			= new JButton("Delete");
    private JButton cancelButton		= new JButton("Cancel");

    private static Scanner x;

    //private WindowEvent event;
   // SimpleDateFormat date_Format 		= new SimpleDateFormat("dd/MM/YYYY");
  //  SimpleDateFormat time_format 		= new SimpleDateFormat("hh:mm");
  //  private JFormattedTextField time 	= new JFormattedTextField();
   // private JFormattedTextField date 	= new JFormattedTextField();


 //   public Delete(){

    	
   

	
//



	public static void delete(){

	//	String filepath = "record.txt";
	//	String removeTerm = "name species";

	//	removeRecord(filepath,removeTerm);

	}


	

	public static void removeRecord(String filepath, String removeTerm)
	{
		String tempFile = "record.txt";
		File oldFile = new File(filepath);
		File newFile = new File(tempFile);
		String name = ""; String species = ""; String characteristic = "";

		//String currentLine;
		//String data[];

		try{
			FileWriter fw = new FileWriter (tempFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n");
			//FileReader fr = new FileReader(filepath);
			//BufferedReader br = new BufferedReader(fr);


			/*while ((currentLine = br.readLine())!= null){

				data = currentLine.split(",");
				if(!data[position].equalsIgnoreCase(removeTerm))
				{
					pw.println(currentLine);
				}
			}*/

			while (x.hasNext())
			{
				name = x.next();
				species = x.next();
				characteristic = x.next();
				if(!name.equals(removeTerm))
				{
					pw.println(name + "," + species + "," + characteristic );
				}
			}

			x.close();
			pw.flush();
			fw.close();
		//	fr.close();
		//	br.close();
			bw.close();
			fw.close();

			oldFile.delete();
			File dump = new File(filepath);
			newFile.renameTo(dump);
		}
		catch(Exception e){

		}
		
	}

	//Layout for DeleteRecord

	/*public DeleteRecord(){

		setLayout(new BorderLayout());

		setBackground(Color.cyan);

		JLabel l1 = new JLabel("Delete Record");

		add(l1, BorderLayout.NORTH);


	}*/
	
}