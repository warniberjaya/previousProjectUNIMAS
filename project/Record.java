import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import static javax.swing.GroupLayout.Alignment.*;

public class Record {

    JFrame frame = new JFrame("Record");
    JPanel panel = new JPanel();

    private JButton Save_butt = new JButton("Save");
    private JButton Cancel_butt = new JButton("Cancel");
    private JButton file_butt = new JButton("Choose");

    private JTextField name = new JTextField();
    private JTextField species = new JTextField();
    private JTextField character = new JTextField();
    //private JTextField time = new JTextField();
    private JTextField location = new JTextField();
    private JTextField file_img = new JTextField();

    private JLabel label_name = new JLabel("Name");
    private JLabel label_species = new JLabel("Species");
    private JLabel label_character = new JLabel("Characteristic");
    private JLabel label_time = new JLabel("Time 24hrs(HH:MM)");
    private JLabel label_location = new JLabel("Location");
    private JLabel label_genus = new JLabel("Genus");
    private JLabel label_date = new JLabel("Date(dd/MM/YYYY)");
    private JLabel label_file = new JLabel("image");

    JFileChooser file_chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

    private WindowEvent event;
    SimpleDateFormat date_Format = new SimpleDateFormat("dd/MM/YYYY");
    SimpleDateFormat time_format = new SimpleDateFormat("hh:mm");
    private JFormattedTextField time = new JFormattedTextField();
    private JFormattedTextField date = new JFormattedTextField();




    private JComboBox box1;


    public Record() {
        layout2();
    }

    public void layout2(){

        //today.setName("Today");
        //date.setColumns(10);
        //date.setEditable(true);

        String[] genus = {"Astragalus","Bulbophyllum","Psychotria","Euphorbia","Carex","Begonia","Dendrobium","Acacia","Solanum","Senecio","Croton","Pleurothallis","Eugenia","Piper","Ardisia","Syzygium","Rhododendron","Miconia","Peperomia","Salvia","Erica","Impatiens","Cyperus","Phyllanthus","Allium","Epidendrum","Vernonia","Lepanthes","Anthurium","Diospyros","Ficus","Indigofera","Justicia","Silene","Oxalis","Crotalaria","Centaurea","Cassia","Eucalyptus","Oncidium","Galium","Cousinia","Ipomoeas","Dioscorea","Cyrtandra","Helichrysum","Ranunculus","Habenaria","Schefflera","Ixora","Berberis","Quercus","Pandanus","Panicum","Eria","Polygala","Potentilla","Oncosperma","Licuala","Areca","Pinanga"};
        box1 = new JComboBox(genus);

        //file_chooser file = new filechooser();
       // file_butt.addActionListener(file);



        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(label_name)
                        .addComponent(label_species)
                        .addComponent(label_character)
                        .addComponent(label_time)
                        .addComponent(label_location)
                        .addComponent(label_genus)
                        .addComponent(label_date)
                        .addComponent(label_file))

                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(name)
                        .addComponent(species)
                        .addComponent(character)
                        .addComponent(time)
                        .addComponent(location)
                        .addComponent(box1)
                        .addComponent(date)
                        .addComponent(file_img)

                        .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(Save_butt))
                        .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(Cancel_butt))))

                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(file_butt))
        );



        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_name)
                        .addComponent(name))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_species)
                        .addComponent(species))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_character)
                        .addComponent(character))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_time)
                        .addComponent(time))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_location)
                        .addComponent(location))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_genus)
                        .addComponent(box1))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_date)
                        .addComponent(date))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label_file)
                        .addComponent(file_img)
                        .addComponent(file_butt))

                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(Save_butt)
                        .addComponent(Cancel_butt))
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

        Save_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validate();
                 //if (){
                    try {
                        OptionPane_save(event);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                //}
            }
        });

        Cancel_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.dispose();
            }
        });

        file_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                file_chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                //System.out.println("image");
                FileNameExtensionFilter restrict = new FileNameExtensionFilter("images only", "png", "jpg", "gif");
                file_chooser.addChoosableFileFilter(restrict);

                int fc = file_chooser.showSaveDialog(null);
                if (fc == JFileChooser.APPROVE_OPTION) {
                    file_img.setText(file_chooser.getSelectedFile().getAbsolutePath());
                    System.out.println("Image path: " + file_img.getText());
                }
            }
        });

    }

    public void OptionPane_name(){
        JFrame name_panel = new JFrame("Error Message");
        name.setText(" ");
        JOptionPane.showMessageDialog(name_panel,"ERROR ON THE NAME INPUT");

    }

    public void OptionPane_spc(){
        JFrame spc_panel = new JFrame("Error Message");
        species.setText(" ");
        JOptionPane.showMessageDialog(spc_panel,"ERROR ON THE SPECIES INPUT");

    }

    public void OptionPane_date(){
        JFrame date_panel = new JFrame("Error Message");
        date.setText(" ");
        time.setText(" ");
        JOptionPane.showMessageDialog(date_panel,"ERROR ON THE DATE/TIME INPUT");

    }

    public void OptionPane_location(){
        JFrame loc_panel = new JFrame("Error Message");
        JOptionPane.showMessageDialog(loc_panel,"PLEASE ENTER INPUT ON LOCATION");
    }

    public void OptionPane_character(){
        JFrame character_panel = new JFrame("Error Message");
        JOptionPane.showMessageDialog(character_panel,"PLEASE ENTER INPUT ON CHARACTERISTIC");
    }


    public void OptionPane_save(WindowEvent e) throws IOException {
        JFrame save_panel = new JFrame();
        int a = JOptionPane.showConfirmDialog(save_panel,"Are You Sure?");
        if(a == JOptionPane.YES_OPTION){
            save_panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            filewriter();
            new MainMenu();
            frame.dispose();

        }
    }


    public void validate() {


        if (name.getText().matches("[a-zA-Z +]+")) {
            System.out.println("name: " + name.getText());

        } else {
            while (!name.getText().matches("[a-zA-Z +]+")) {
                OptionPane_name();
            }
        }


        if (species.getText().matches("[a-zA-Z +]+")) {
            System.out.println("Species: " + species.getText());

        } else {
            while (!species.getText().matches("[a-zA-Z +]+")) {
                OptionPane_spc();
            }
        }

        if (!character.getText().trim().isEmpty()) {
            System.out.println("Characteristic: " + character.getText());

        } else {
            OptionPane_character();
        }

        date_Format.setLenient(false);
        time_format.setLenient(false);
        try {
            date_Format.parse(date.getText().trim());
            time_format.parse(time.getText().trim());
            System.out.println("Date: " + date.getText());
            System.out.println("Time: " + time.getText());

        } catch (ParseException pe) {
            OptionPane_date();
        }

        if (!location.getText().trim().isEmpty()) {
            System.out.println("Location: " + location.getText());

        } else {
            OptionPane_location();
        }

        System.out.println("Genus: " + Objects.requireNonNull(box1.getSelectedItem()).toString());

    }



   public void filewriter() throws IOException {

       String str_record = (("Name: "+ name.getText()+"\n") + ("Species: " + species.getText()+"\n") + ("Characteristic: " +character.getText()+"\n")+ ("Date: "+ date.getText()+"\n") + ("Time: "+time.getText()+"\n") + ("Location: "+location.getText()+"\n") + ("Genus: "+ Objects.requireNonNull(box1.getSelectedItem()).toString()+"\n") + ("Images: " +file_img.getText()+"\n"));
       //(System.out.println("name: " + name.getText()) + System.out.println("Species: " + species.getText()) +System.out.println("Characteristic: " + character.getText()) +System.out.println("Date: " + date.getText()) +System.out.println("Time: " + time.getText()) +System.out.println("Location: " + location.getText()) +System.out.println("Genus: " + Objects.requireNonNull(box1.getSelectedItem()).toString()) +System.out.println("Image path: " + file_img.getText()));


       try {
               BufferedWriter writer = new BufferedWriter(new FileWriter(".\\Record.txt",true));
               //writer = new BufferedWriter(new FileWriter("Record.txt"));
          // for (int i = 0 ; )
               writer.write(str_record);
               writer.newLine();
               writer.flush();
               writer.close();
           } catch (IOException e) {
           e.printStackTrace();
       }
   }

   }