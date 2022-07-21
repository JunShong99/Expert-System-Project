package EsAssignment4;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 * This class is for the purpose to recommend subjects for Semester 4 students.
 * @author Wei Jun Shong
 * @author Seow Ke Ni
 * @author Michelle Lee Miao Shang
 */

public class Semester4 extends JFrame {

    JButton b1, b2, b3;
    static String summery;
    public static String One;
    private int flag=1;
    int point=0;
    int standPoint1=0;
    int standPoint2=0;
    int standPoint3=0;
    int standPoint4=0;
    int standPoint5=0;
    int standPoint6=0;
    int standPoint7=0;
    int standPoint8=0;
    int standPoint9=0;
    int standPoint10=0;
    int standPoint11=0;
    int standPoint12=0;
    int standPoint13=0;
    int standPoint14=0;
    int standPoint15=0;
    int standPoint16=0;
    int standPoint17=0;
    int standPoint18=0;
    int standPoint19=0;
    int standPoint20=0;

    double nextPoint1=0;
    double nextPoint2=0;
    double nextPoint3=0;
    double nextPoint4=0;
    double nextPoint5=0;
    double nextPoint6=0;
    double nextPoint7=0;
    double nextPoint8=0;
    double nextPoint9=0;
    double nextPoint10=0;
    double nextPoint11=0;
    double nextPoint12=0;
    double nextPoint13=0;
    double nextPoint14=0;
    double nextPoint15=0;
    double nextPoint16=0;
    double nextPoint17=0;
    double nextPoint18=0;
    double nextPoint19=0;
    double nextPoint20=0;

    /**
     * This constructor displays buttons for Semester 4 students to key in their names, save and answer the question provided.
     */
    public Semester4() {

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel pTop = new JPanel();
        cp.add(pTop, BorderLayout.NORTH);

        JPanel pCenter = new JPanel();
        cp.add(pCenter, BorderLayout.CENTER);
        pCenter.setBackground(Color.WHITE);

        JLabel jl2 = new JLabel();
        pCenter.add(jl2);

        cp.setLayout(new BorderLayout());

        JPanel panelTop = new JPanel();
        cp.add(panelTop, BorderLayout.NORTH);

        JLabel label = new JLabel("Name");
        JTextField tf = new JTextField(20);

        panelTop.add(label);
        panelTop.add(tf);

        JPanel centreMid = new JPanel();
        centreMid.setLayout(new GridLayout(2,2));

        cp.add(centreMid,BorderLayout.CENTER);
        JPanel panelBottom = new JPanel();
        cp.add(panelBottom, BorderLayout.SOUTH);
        JButton button1 = new JButton("Save");
        JButton button2 = new JButton("Clear");
        JButton button3 = new JButton("Reset");
        JButton button4 = new JButton("Exit");
        centreMid.add(button1);
        centreMid.add(button2);
        centreMid.add(button3);
        centreMid.add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dialogButton = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (dialogButton == JOptionPane.YES_OPTION) {
                    if (e.getSource() == button1) {

                        One = tf.getText().trim();

                        if (!"".equals(tf)) {
                            summery = ("\n" + "Name" + "\n" + One);
                            String Data = Semester4.summery;
                            try {
                                BufferedWriter reader = new BufferedWriter(new FileWriter(new File("Name.txt"), true));
                                reader.write(Data);
                                reader.newLine();
                                reader.close();

                            } catch (IOException E) {
                                System.out.println("Error is " + E);
                            }
                            flag = 2;
                        }
                    }
                    if(tf.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter your name");
                        flag = 6;
                    }
                }
                else if (dialogButton == JOptionPane.NO_OPTION){

                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag==2) {
                    JOptionPane.showMessageDialog(null, "Please proceed to Next");
                }

                else {
                    try {
                        Document doc = tf.getDocument();
                        if (doc.getLength() > 0) {
                            doc.remove(doc.getLength() - 1, 1);
                        }
                    } catch (BadLocationException badLocationException) {
                        badLocationException.printStackTrace();
                    }
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("")){

                }
                else if (flag==2) {
                    JOptionPane.showMessageDialog(null, "Please proceed to Next");
                }
                else{
                    tf.setText("");
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel pBottom = new JPanel();

        cp.add(pBottom, BorderLayout.SOUTH);
        b1 = new JButton("Start");
        b2 = new JButton("Exit");
        b3 = new JButton("Back");
        pBottom.add(b1);
        pBottom.add(b2);
        pBottom.add(b3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    if(flag!=2){
                        JOptionPane.showMessageDialog(null, "Please save your name");
                    }

                    else if(tf.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter your name");
                    }

                    else if (!"".equals(tf)|| flag==2) {
                        dispose();


                        while(true) {
                            Object[] options = {"Yes",
                                    "No",
                                    "Why"};
                            int n = JOptionPane.showOptionDialog(null,
                                    "Have you taken Malaysian Nationhood Studies?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options,
                                    options[2]);

                            if (n == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n == JOptionPane.NO_OPTION) {
                                standPoint1=1;
                                break;
                            }

                            if (n == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Malaysian Nationhood Studies is a university core.");
                            }

                        }


                        while(true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n2 = JOptionPane.showOptionDialog(null,
                                    "Have you taken English core 1?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n2 == JOptionPane.YES_OPTION) {
                                point=1;
                                break;
                            }

                            if (n2 == JOptionPane.NO_OPTION) {
                                standPoint2=2;
                                break;
                            }

                            if (n2 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "English core 1 is a language core and a pre-requisite.");

                            }
                        }

                        if(point==1) {
                            while (true) {
                                Object[] options2 = {"Yes",
                                        "No",
                                        "Why"};
                                int n3 = JOptionPane.showOptionDialog(null,
                                        "Have you taken English core 2?",
                                        "Semester 4",
                                        JOptionPane.YES_NO_CANCEL_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        options2,
                                        options2[2]);

                                if (n3 == JOptionPane.YES_OPTION) {
                                    point = 2;
                                    break;
                                }

                                if (n3 == JOptionPane.NO_OPTION) {
                                    standPoint3=3;
                                    break;
                                }

                                if (n3 == JOptionPane.CANCEL_OPTION) {
                                    JOptionPane.showMessageDialog(null, "English core 2 is a language core and a pre-requisite.");

                                }
                            }
                        }

                        if(point==2) {
                            while (true) {
                                Object[] options2 = {"Yes",
                                        "No",
                                        "Why"};
                                int n4 = JOptionPane.showOptionDialog(null,
                                        "Have you taken English core 3?",
                                        "Semester 4",
                                        JOptionPane.YES_NO_CANCEL_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        options2,
                                        options2[2]);

                                if (n4 == JOptionPane.YES_OPTION) {
                                    break;
                                }

                                if (n4 == JOptionPane.NO_OPTION) {
                                    standPoint4=4;
                                    break;
                                }

                                if (n4 == JOptionPane.CANCEL_OPTION) {
                                    JOptionPane.showMessageDialog(null, "English core 3 is a language core.");
                                }
                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n5 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Science Thinking and Ethics?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n5 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n5 == JOptionPane.NO_OPTION) {
                                standPoint5=5;
                                break;
                            }

                            if (n5 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Science Thinking and Ethics is a university core.");

                            }
                        }



                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n6 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Data Structure and Algorithm Analysis?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n6 == JOptionPane.YES_OPTION) {
                                standPoint6=6;
                                break;
                            }

                            if (n6 == JOptionPane.NO_OPTION) {
                                standPoint7=7;
                                break;
                            }

                            if (n6 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Data Structure and Algorithm Analysis is a program core and a pre-requisite.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n7 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Computer System Organization?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n7 == JOptionPane.YES_OPTION) {
                                standPoint8=8;
                                break;
                            }

                            if (n7 == JOptionPane.NO_OPTION) {
                                standPoint9=9;
                                break;
                            }

                            if (n7 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Computer System Organization is a program core and a pre-requisite.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n8 = JOptionPane.showOptionDialog(null,
                                    "Have you taken System Analysis and Design?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n8 == JOptionPane.YES_OPTION) {
                                standPoint10 = 10;
                                break;
                            }

                            if (n8 == JOptionPane.NO_OPTION) {
                                standPoint11=11;
                                break;
                            }

                            if (n8 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "System Analysis and Design is a program core and a pre-requisite.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n9 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Mathematics for IT?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n9 == JOptionPane.YES_OPTION) {
                                standPoint12 = 12;
                                break;
                            }

                            if (n9 == JOptionPane.NO_OPTION) {
                                standPoint13=13;
                                break;
                            }

                            if (n9 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Mathematics for IT is a program core and a pre-requisite.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n12 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Logic Programming?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n12 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n12 == JOptionPane.NO_OPTION) {
                                standPoint14=14;
                                break;
                            }

                            if (n12 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Logic Programming is a majoring core.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n14 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Knowledge Discovery in Database?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n14 == JOptionPane.YES_OPTION) {
                                standPoint15=15;
                                break;
                            }

                            if (n14 == JOptionPane.NO_OPTION) {
                                standPoint16=16 ;
                                break;
                            }

                            if (n14 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Knowledge Discovery in Database is a majoring core and a pre-requisite.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n12 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Expert System?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n12 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n12 == JOptionPane.NO_OPTION) {
                                standPoint17=17;
                                break;
                            }

                            if (n12 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Expert System is a majoring core.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n11 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Statistics for IT?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n11 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n11 == JOptionPane.NO_OPTION) {
                                standPoint18=18;
                                break;
                            }

                            if (n11 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Statistics for IT is a program core.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n12 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Human Computer Interaction?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n12 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n12 == JOptionPane.NO_OPTION) {
                                standPoint19=19;
                                break;
                            }

                            if (n12 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Human Computer Interaction is a program core.");

                            }
                        }

                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n13 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Programming 2?",
                                    "Semester 4",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n13 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n13 == JOptionPane.NO_OPTION) {
                                standPoint20=20;
                                break;
                            }

                            if (n13 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Programming 2 is a program core.");

                            }
                        }





                        new Semester4(standPoint1,standPoint2,standPoint3, standPoint4, standPoint5,standPoint6, standPoint7, standPoint8, standPoint9, standPoint10, standPoint11,
                                standPoint12, standPoint13, standPoint14, standPoint15, standPoint16, standPoint17, standPoint18, standPoint19,standPoint20);
                        dispose();

                    }
                }
            }


        });


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame();
                dispose();
            }
        });

        /**
         * This image is used as the background for the Semester 4.
         */
        BufferedImage img = null;
        try {
            img = ImageIO.read(this.getClass().getResource("/Semester4.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ImageIcon icon4=new ImageIcon(img);
        JLabel label4 = new JLabel();
        label4.setIcon(icon4);
        label4.setBounds(1,90,1000,500);
        add(label4);


        setTitle("Semester4");
        setLayout(new FlowLayout());
        setResizable(false);
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    /**
     * This constructor is used to recommend subjects for Semester 4 students based on the questions answered by them.
     * @param standPoint1 Act as a mark if student chooses "No" or have not taken Malaysian Nationhood Studies.
     * @param standPoint2 Act as a mark if student chooses "No" or have not taken English Core 1.
     * @param standPoint3 Act as a mark if student chooses "No" or have not taken English Core 2.
     * @param standPoint4 Act as a mark if student chooses "No" or have not taken English Core 3.
     * @param standPoint5 Act as a mark if student chooses "No" or have not taken Science Thinking and Ethics.
     * @param standPoint6 Act as a mark if student chooses "Yes" or have taken Data Structure and Algorithm Analysis.
     * @param standPoint7 Act as a mark if student chooses "No" or have not taken Data Structure and Algorithm Analysis.
     * @param standPoint8 Act as a mark if student chooses "Yes" or have taken Computer System Organization.
     * @param standPoint9 Act as a mark if student chooses "No" or have not taken Computer System Organization.
     * @param standPoint10 Act as a mark if student chooses "Yes" or have taken System Analysis and Design.
     * @param standPoint11 Act as a mark if student chooses "No" or have not taken System Analysis and Design.
     * @param standPoint12 Act as a mark if student chooses "Yes" or have taken Mathematics for IT.
     * @param standPoint13 Act as a mark if student chooses "No" or have not taken Mathematics for IT.
     * @param standPoint14 Act as a mark if student chooses "No" or have not taken Logic Programming.
     * @param standPoint15 Act as a mark if student chooses "Yes" or have taken Knowledge Discovery in Database.
     * @param standPoint16 Act as a mark if student chooses "No" or have not taken Knowledge Discovery in Database.
     * @param standPoint17 Act as a mark if student chooses "No" or have not taken Expert System.
     * @param standPoint18 Act as a mark if student chooses "No" or have not taken Statistics for IT.
     * @param standPoint19 Act as a mark if student chooses "No" or have not taken Human Computer Interaction.
     * @param standPoint20 Act as a mark if student chooses "No" or have not Programming 2.
     */
    public Semester4(int standPoint1, int standPoint2, int standPoint3, int standPoint4, int standPoint5, int standPoint6, int standPoint7, int standPoint8, int standPoint9, int standPoint10, int standPoint11, int standPoint12, int standPoint13, int standPoint14, int standPoint15, int standPoint16, int standPoint17, int standPoint18, int standPoint19,int standPoint20) {

        if (standPoint1 == 1) {
            JLabel label1 = new JLabel("Malaysian Nationhood Studies is recommended.");
            label1.setBounds(10, 10, 500, 25);
            add(label1);
            nextPoint1=1;
        }
        if (standPoint2 == 2) {
            JLabel label2 = new JLabel("English core 1 is recommended.");
            label2.setBounds(10, 30, 500, 25);
            add(label2);
            nextPoint2=2;
        }
        if (standPoint3 == 3) {
            JLabel label3 = new JLabel("English core 2 is recommended.");
            label3.setBounds(10, 30, 500, 25);
            add(label3);
            nextPoint3=3;
        }
        if (standPoint4 == 4) {
            JLabel label4 = new JLabel("English core 3 is recommended.");
            label4.setBounds(10, 30, 500, 25);
            add(label4);
            nextPoint4=4;
        }
        if (standPoint5 == 5) {
            JLabel label5 = new JLabel("Science Thinking and Ethics is recommended.");
            label5.setBounds(10, 50, 500, 25);
            add(label5);
            nextPoint5=5;
        }

        if (standPoint6 == 6) {
            JLabel label6 = new JLabel("Database System and Information Retrieval is recommended.");
            label6.setBounds(10, 70, 500, 25);
            add(label6);
            nextPoint6=6;
        }
        if (standPoint7 == 7) {
            JLabel label7 = new JLabel("Data Structure and Algorithm Analysis is recommended.");
            label7.setBounds(10, 70, 500, 25);
            add(label7);
            nextPoint7=7;
        }

        if (standPoint8 == 8) {
            JLabel label8a = new JLabel("Operating System is recommended.");
            JLabel label8b = new JLabel("Basic Networking is recommended.");
            label8a.setBounds(10, 90, 500, 25);
            label8b.setBounds(10, 110, 500, 25);
            add(label8a);
            add(label8b);
            nextPoint8=8;
        }

        if (standPoint9 == 9) {
            JLabel label9 = new JLabel("Computer System Organization is recommended.");
            label9.setBounds(10, 90, 500, 25);
            add(label9);
            nextPoint9=9;
        }

        if (standPoint10 == 10) {
            JLabel label10 = new JLabel("Information Technology Project Management is recommended.");
            if(standPoint10 == 9) {
                label10.setBounds(10, 110, 500, 25);
            }
            else if(standPoint8 == 8){
                label10.setBounds(10, 130, 500, 25);
            }
            add(label10);
            nextPoint10=10;
        }

        if (standPoint11 == 11) {
            JLabel label11 = new JLabel("System Analysis and Design is recommended.");
            if(standPoint9 == 9) {
                label11.setBounds(10, 110, 500, 25);
            }
            else if(standPoint8 == 8){
                label11.setBounds(10, 130, 500, 25);
            }
            add(label11);
            nextPoint11=11;
        }


        if (standPoint12 == 12) {
            JLabel label12 = new JLabel("Discrete Structure is recommended.");
            if (standPoint9 == 9) {
                label12.setBounds(10, 130, 500, 25);
            } else if (standPoint8 == 8) {
                label12.setBounds(10, 150, 500, 25);
            }
            add(label12);
            nextPoint12 = 12;
        }

        if (standPoint13 == 13) {
            JLabel label13 = new JLabel("Mathematics for IT is recommended.");
            if(standPoint9 == 9) {
                label13.setBounds(10, 130, 500, 25);
            }
            else if(standPoint8 == 8){
                label13.setBounds(10, 150, 500, 25);
            }
            add(label13);
            nextPoint13=13;
        }


        if (standPoint14 == 14) {
            JLabel label14 = new JLabel("Logic Programming is recommended.");
            if(standPoint9 == 9) {
                label14.setBounds(10, 150, 500, 25);
            }
            else if(standPoint8 == 8){
                label14.setBounds(10, 170, 500, 25);
            }
            add(label14);
            nextPoint14=14;
        }

        if (standPoint15 == 15) {
            JLabel label15a = new JLabel("Neural Network is recommended.");
            JLabel label15b = new JLabel("Machine Learning is recommended.");
            if(standPoint9 == 9) {
                label15a.setBounds(10, 170, 500, 25);
                label15b.setBounds(10,190,500,25);
            }
            else if(standPoint8 == 8){
                label15a.setBounds(10, 190, 500, 25);
                label15b.setBounds(10, 210, 500, 25);
            }
            add(label15a);
            add(label15b);
            nextPoint15=15;
        }

        if (standPoint16 == 16) {
            JLabel label16 = new JLabel("Knowledge Discovery in Database is recommended.");
            if(standPoint9 == 9) {
                label16.setBounds(10, 170, 500, 25);
            }
            else if(standPoint8 == 8){
                label16.setBounds(10, 190, 500, 25);
            }
            add(label16);
            nextPoint16=16;
        }


        if (standPoint17 == 17) {
            JLabel label17 = new JLabel("Expert System is recommended.");
            if(standPoint9 == 9) {
                label17.setBounds(10, 210, 500, 25);
            }
            else if(standPoint8 == 8){
                label17.setBounds(10, 230, 500, 25);
            }
            add(label17);
            nextPoint17=17;
        }

        if (standPoint18 == 18) {
            JLabel label18 = new JLabel("Statistics for IT is recommended.");
            if(standPoint9 == 9) {
                label18.setBounds(10, 230,500,25);
            }
            else if(standPoint8 == 8){
                label18.setBounds(10, 250,500,25);
            }
            add(label18);
            nextPoint18=18;
        }
        if (standPoint19 == 19) {
            JLabel label19 = new JLabel("Human Computer Interaction is recommended.");
            if(standPoint9 == 9) {
                label19.setBounds(10, 250,500,25);
            }
            else if(standPoint8 == 8){
                label19.setBounds(10, 270, 500, 25);
            }
            add(label19);
            nextPoint19=19;
        }

        if (standPoint20 == 20) {
            JLabel label20 = new JLabel("Programming 2 is recommended.");
            if(standPoint9 == 9) {
                label20.setBounds(10, 270, 500, 25);
            }
            else if(standPoint8 == 8){
                label20.setBounds(10, 290, 500, 25);
            }
            add(label20);
            nextPoint20=20;
        }






        JButton button1 = new JButton("Back");
        button1.setBounds(350, 310, 80, 25);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                new MainFrame();

            }
        });
        add(button1);


        JButton button2 = new JButton("How");
        button2.setBounds(440, 310, 80, 25);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new Semester4(nextPoint1,nextPoint2,nextPoint3,nextPoint4,nextPoint5,nextPoint6,nextPoint7,nextPoint8,nextPoint9,nextPoint10, nextPoint11,nextPoint12, nextPoint13, nextPoint14, nextPoint15, nextPoint16, nextPoint17, nextPoint18, nextPoint19, nextPoint20);

            }
        });
        add(button2);



        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8, 6));
        mainContainer.setBackground(Color.WHITE);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.black));

        this.getContentPane().setBackground(Color.cyan);

        setTitle("Recommend");
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setSize(560,390);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);




    }


    /**
     * This constructor is used to justify the reason or "HOW" these subjects are recommended for Semester 4 students.
     * @param nextPoint1 Act as a mark if student chooses "No" for Malaysian Nationhood Studies and provide valid reason where student have not taken the university core.
     * @param nextPoint2 Act as a mark if student chooses "No" for English core 1 and provide valid reason where student have not taken the language core.
     * @param nextPoint3 Act as a mark if student chooses "Yes" for English core 1 and "No" for English core 2 and provide valid reason where student have taken English core 1 which is the pre-requisite for English core 2.
     * @param nextPoint4 Act as a mark if student chooses "Yes" for English core 1, "Yes" for English core 2 and "No" for English core 3 and provide valid reason where student have taken English core 2 which is the pre-requisite for English core 3.
     * @param nextPoint5 Act as a mark if student chooses "No" for Science Thinking and Ethics and provide valid reason where student have not taken the university core.
     * @param nextPoint6 Act as a mark if student chooses "Yes" for Data Structure and Algorithm Analysis and provide valid reason where student have taken Data Structure and Algorithm Analysis which is the pre-requisite for Database System and Information Retrieval.
     * @param nextPoint7 Act as a mark if student chooses "No" for Data Structure and Algorithm Analysis and provide valid reason where student have not taken the program core.
     * @param nextPoint8 Act as a mark if student chooses "Yes" for Computer System Organization and provide valid reason where student have taken Computer System Organization which is the pre-requisite for Operating System and Basic Networking.
     * @param nextPoint9 Act as a mark if student chooses "No" for Computer System Organization and provide valid reason where student have not taken the program core.
     * @param nextPoint10 Act as a mark if student chooses "Yes" for System Analysis and Design and provide valid reason where student have taken System Analysis and Design which is the pre-requisite for Information Technology Project Management.
     * @param nextPoint11 Act as a mark if student chooses "No" for System Analysis and Design and provide valid reason where student have not taken the program core.
     * @param nextPoint12 Act as a mark if student chooses "Yes" for Mathematics for IT and provide valid reason where student have taken Mathematics for IT which is the pre-requisite for Discrete Structure.
     * @param nextPoint13 Act as a mark if student chooses "No" for Mathematics for IT and provide valid reason where student have not taken the program core.
     * @param nextPoint14 Act as a mark if student chooses "No" for Logic Programming and provide valid reason where student have not taken the majoring core.
     * @param nextPoint15 Act as a mark if student chooses "Yes" for Knowledge Discovery in Database and provide valid reason where student have taken Knowledge Discovery in Database which is the pre-requisite for Neural Network and Machine Learning.
     * @param nextPoint16 Act as a mark if student chooses "No" for Knowledge Discovery in Database and provide valid reason where student have not taken the majoring core.
     * @param nextPoint17 Act as a mark if student chooses "No" for Expert System and provide valid reason where student have not taken the majoring core.
     * @param nextPoint18 Act as a mark if student chooses "No" for Statistics for IT and provide valid reason where student have not taken the program core.
     * @param nextPoint19 Act as a mark if student chooses "No" for Human Computer Interaction and provide valid reason where student have not taken the program core.
     * @param nextPoint20 Act as a mark if student chooses "No" for Programming 2 and provide valid reason where student have not taken the program core.
     */
    public Semester4(double nextPoint1,double nextPoint2,double nextPoint3,double nextPoint4,double nextPoint5,double nextPoint6,double nextPoint7,double nextPoint8,double nextPoint9,double nextPoint10,double nextPoint11,double nextPoint12,double nextPoint13,double nextPoint14,double nextPoint15,double nextPoint16,double nextPoint17,double nextPoint18, double nextPoint19, double nextPoint20) {

        if (nextPoint1 == 1) {
            JLabel label1 = new JLabel("Malaysian Nationhood Studies is recommended because you have not taken university core.");
            label1.setBounds(10, 10, 800, 25);
            add(label1);
        }
        if (nextPoint2 == 2) {
            JLabel label2 = new JLabel("English core 1 is recommended because you have not taken the language core.");
            label2.setBounds(10, 30, 800, 25);
            add(label2);
        }
        if (nextPoint3 == 3) {
            JLabel label3 = new JLabel("English core 2 is recommended because you have taken English core 1  which is the pre-requisite for English core 2.");
            label3.setBounds(10, 30, 800, 25);
            add(label3);
        }
        if (nextPoint4 == 4) {
            JLabel label4 = new JLabel("English core 3 is recommended because you have taken English core 2 which is the pre-requisite for English core 3.");
            label4.setBounds(10, 30, 800, 25);
            add(label4);
        }
        if (nextPoint5 == 5) {
            JLabel label5 = new JLabel("Science Thinking and Ethics is recommended because you have not taken the university core.");
            label5.setBounds(10, 50, 800, 25);
            add(label5);
        }
        if (nextPoint6 == 6) {
            JLabel label6 = new JLabel("Database System and Information Retrieval is recommended because you have taken Data Structure and Algorithm Analysis which is the pre-requisite.");
            label6.setBounds(10, 70, 1000, 25);
            add(label6);
        }

        if (nextPoint7 == 7) {
            JLabel label7 = new JLabel("Data Structure and Algorithm Analysis is recommended because you have not taken the program core.");
            label7.setBounds(10, 70, 800, 25);
            add(label7);
        }
        if (nextPoint8 == 8) {
            JLabel label8 = new JLabel("Operating System and Basic Networking is recommended because you have taken Computer System Organization which is the pre-requisite.");
            label8.setBounds(10, 90, 1000, 25);
            add(label8);
        }

        if (nextPoint9 == 9) {
            JLabel label9 = new JLabel("Computer System Organization is recommended because you have not taken the program core.");
            label9.setBounds(10, 90, 800, 25);
            add(label9);
        }

        if (nextPoint10 == 10) {
            JLabel label10 = new JLabel("Information Technology Project Management is recommended because you have taken System Analysis and Design which is the pre-requisite.");
            label10.setBounds(10, 110, 1000, 25);
            add(label10);
        }

        if (nextPoint11 == 11) {
            JLabel label11 = new JLabel("System Analysis and Design is recommended because you have not taken the program core.");
            label11.setBounds(10, 110, 800, 25);
            add(label11);
        }

        if (nextPoint12 == 12) {
            JLabel label12 = new JLabel("Discrete Structure is recommended because you have taken Mathematics for IT which is the pre-requisite.");
            label12.setBounds(10, 130, 800, 25);
            add(label12);
        }

        if (nextPoint13 == 13) {
            JLabel label13 = new JLabel("Mathematics for IT is recommended because you have not taken the program core.");
            label13.setBounds(10, 130, 800, 25);
            add(label13);
        }


        if (nextPoint14 == 14) {
            JLabel label14 = new JLabel("Logic Programming is recommended because you have not taken the majoring core.");
            label14.setBounds(10, 150, 1000, 25);
            add(label14);
        }

        if(nextPoint15 == 15){
            JLabel label15 = new JLabel("Neural Network and Machine Learning are recommended because you have taken Knowledge Discovery in Database which is the pre-requisite.");
            label15.setBounds(10, 170, 1000, 25);
            add(label15);
        }

        if(nextPoint16 == 16){
            JLabel label16 = new JLabel("Knowledge Discovery in Database is recommended because you have not taken the majoring core.");
            label16.setBounds(10, 170, 800, 25);
            add(label16);
        }


        if(nextPoint17 == 17){
            JLabel label17 = new JLabel("Expert System is recommended because you have not taken the majoring core.");
            label17.setBounds(10, 190, 800, 25);
            add(label17);
        }

        if (nextPoint18 == 18) {
            JLabel label18 = new JLabel("Statistics for IT is recommended because you have not taken the program core.");
            label18.setBounds(10, 210, 800, 25);
            add(label18);
        }

        if (nextPoint19 == 19) {
            JLabel label19 = new JLabel("Human Computer Interaction is recommended because you have not taken the program core.");
            label19.setBounds(10, 230, 800, 25);
            add(label19);
        }

        if (nextPoint20 == 20) {
            JLabel label20 = new JLabel("Programming 2 is recommended because you have not taken the program core.");
            label20.setBounds(10, 250, 800, 25);
            add(label20);
        }



        JButton button1 = new JButton("Exit");
        button1.setBounds(600, 310, 80, 25);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });
        add(button1);

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8, 6));
        mainContainer.setBackground(Color.WHITE);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.black));

        this.getContentPane().setBackground(Color.cyan);

        setTitle("How");
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setSize(900, 390);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


}