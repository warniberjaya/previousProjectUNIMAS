import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {

    private JButton add_rec = new JButton("Record");
    private JButton edit_rec = new JButton("Edit Record");
    private JButton search = new JButton("Search");
    private JButton view = new JButton("View Record");
    private JButton delete = new JButton("Delete Record");
    private JButton generate_rec = new JButton("Generate Record");
    private JButton exit = new JButton("Exit");

    public  MainMenu(){
        Layout();
    }

    public void Layout(){
        JFrame frame = new JFrame("MainMenu");
        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel,BoxLayout.Y_AXIS);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
        panel.setLayout(boxLayout);
        panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));
        add_rec.setBounds(130,50,100,40);
        edit_rec.setBounds(130, 100, 100, 40);
        search.setBounds(130, 150, 100, 40);
        view.setBounds(130, 200, 100, 40);
        delete.setBounds(130, 250, 100, 40);
        generate_rec.setBounds(130, 300, 100, 40);
        exit.setBounds(130, 350, 100, 40);

        add_rec.setMaximumSize(new Dimension(150, 30));
        edit_rec.setMaximumSize(new Dimension(150, 30));
        search.setMaximumSize(new Dimension(150, 30));
        view.setMaximumSize(new Dimension(150, 30));
        delete.setMaximumSize(new Dimension(150, 30));
        generate_rec.setMaximumSize(new Dimension(150, 30));
        exit.setMaximumSize(new Dimension(150, 30));


        panel.add(add_rec);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(edit_rec);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(search);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(view);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(delete);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(generate_rec);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(exit);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        //panel.setPreferredSize(new Dimension(400,500));
        //panel.setMaximumSize(new Dimension(100,500));

        /*add_rec.setBackground(Color.white);
        edit_rec.setBackground(Color.white);
        search.setBackground(Color.white);
        delete.setBackground(Color.white);
        view.setBackground(Color.white);
        generate_rec.setBackground(Color.white);
        exit.setBackground(Color.white);*/


        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(panel).setBackground(Color.white );
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 500);

        add_rec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Record rec = new Record();
                System.out.println("Record");
                frame.dispose();
            }
        });

        edit_rec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //put your reference class code here
            }
        });

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //put your reference class code here
            }
        });

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //put your reference class code here
               // View vie = new View();
               // System.out.println("View");
               // frame.dispose();
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //put your reference class code here
               DeleteRecord del = new DeleteRecord();
                System.out.println("Delete");
                frame.dispose();

            }
        });

        generate_rec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //put your reference class code here
            }
        });



        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }


}