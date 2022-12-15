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
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.GroupLayout.Alignment.*;


public class DeleteRecord extends Record {
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

    private JComboBox box1;
    private static Scanner x;


	public DeleteRecord(){

		removeRecord("name","species",1,",");

	}

	public void deleteLayout(){
		

		 String[] genus = {"Astragalus","Bulbophyllum","Psychotria","Euphorbia","Carex","Begonia","Dendrobium","Acacia","Solanum","Senecio","Croton","Pleurothallis","Eugenia","Piper","Ardisia","Syzygium","Rhododendron","Miconia","Peperomia","Salvia","Erica","Impatiens","Cyperus","Phyllanthus","Allium","Epidendrum","Vernonia","Lepanthes","Anthurium","Diospyros","Ficus","Indigofera","Justicia","Silene","Oxalis","Crotalaria","Centaurea","Cassia","Eucalyptus","Oncidium","Galium","Cousinia","Ipomoeas","Dioscorea","Cyrtandra","Helichrysum","Ranunculus","Habenaria","Schefflera","Ixora","Berberis","Quercus","Pandanus","Panicum","Eria","Polygala","Potentilla","Oncosperma","Licuala","Areca","Pinanga"};
        box1 = new JComboBox(genus);


        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);


        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(nameLabel)
                        .addComponent(speciesLabel)
                        .addComponent(characterLabel)
                     //   .addComponent(label_time)
                       // .addComponent(label_location)
                        .addComponent(genusLabel)
                    /*    .addComponent(label_date)
                        .addComponent(label_file)
                        */)

                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(name)
                        .addComponent(species)
                        .addComponent(character)
                     //   .addComponent(time)
                   //     .addComponent(location)
                     //   .addComponent(box1)
                      //  .addComponent(date)
                   //     .addComponent(file_img)

                        .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(deleteButton))
                        .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(cancelButton))))

               // .addGroup(layout.createParallelGroup(LEADING)
                 //       .addComponent(file_butt))
        );



        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(nameLabel)
                        .addComponent(name))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(speciesLabel)
                        .addComponent(species))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(characterLabel)
                        .addComponent(character))

   //             .addGroup(layout.createParallelGroup(BASELINE)
     //                   .addComponent(label_time)
       //                 .addComponent(time))

    //           .addGroup(layout.createParallelGroup(BASELINE)
      //                  .addComponent(label_location)
       //                 .addComponent(location))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(genusLabel)
                        .addComponent(box1))

       //         .addGroup(layout.createParallelGroup(BASELINE)
         //               .addComponent(label_date)
       //                 .addComponent(date))

         /*       .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_file)
                        .addComponent(file_img)
                        .addComponent(file_butt))
*/
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(deleteButton)
                        .addComponent(cancelButton))
        );

         panel.setBorder(new EmptyBorder(100,100,100,100));
        //panel.setPreferredSize(new Dimension(200,300));
        //panel.setBackground(Color.green);
        //panel.setBackground(Color.red);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(400,500));
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();

	}

	public static void removeRecord(String filepath, String removeTerm,int positionOfTerm, String delimiter){

		int position = positionOfTerm -1;
		String tempFile = "record.txt";
		File oldFile = new File(filepath);
		File newFile = new File(tempFile);

		String currentLine;
		String data[];

		try{
			FileWriter fw = new FileWriter (tempFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			FileReader fr = new FileReader(filepath);
			BufferedReader br = new BufferedReader(fr);

			while ((currentLine = br.readLine())!= null){

				data = currentLine.split(",");
				if(!data[position].equalsIgnoreCase(removeTerm))
				{
					pw.println(currentLine);
				}
			}

			pw.flush();
			fw.close();
			fr.close();
			br.close();
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