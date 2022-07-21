package EsAssignment4;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is for the purpose to recommend subjects for Semester 2 students.
 * @author Wei Jun Shong
 * @author Seow Ke Ni
 * @author Michelle Lee Miao Shang
 */

public class Semester2 extends JFrame {


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


    /**
     * This constructor displays buttons for Semester 2 students to key in their names, save and answer the question provided.
     */
    public Semester2() {

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
                            String Data = Semester2.summery;
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
                                    "Semester 2",
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
                                    "Semester 2",
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
                                        "Semester 2",
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
                                    JOptionPane.showMessageDialog(null, "English core 2 is a language core.");

                                }
                            }
                        }



                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n4 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Science Thinking and Ethics?",
                                    "Semester 2",
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
                                JOptionPane.showMessageDialog(null, "Science Thinking and Ethics is a university core.");

                            }
                        }



                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n5 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Programming 1?",
                                    "Semester 2",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n5 == JOptionPane.YES_OPTION) {
                                standPoint5=5;
                                break;
                            }

                            if (n5 == JOptionPane.NO_OPTION) {
                                standPoint6=6;
                                break;
                            }

                            if (n5 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Programming 1 is a program core and a pre-requisite.");

                            }
                        }


                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n6 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Mathematics for IT?",
                                    "Semester 2",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n6 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n6 == JOptionPane.NO_OPTION) {
                                standPoint7=7;
                                break;
                            }

                            if (n6 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Mathematics for IT is a program core.");

                            }
                        }


                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n7 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Introduction to Artificial Intelligence?",
                                    "Semester 2",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n7 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n7 == JOptionPane.NO_OPTION) {
                                standPoint8=8;
                                break;
                            }

                            if (n7 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Introduction to Artificial Intelligence is a program core.");

                            }
                        }


                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n8 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Statistics for IT?",
                                    "Semester 2",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n8 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n8 == JOptionPane.NO_OPTION) {
                                standPoint9=9;
                                break;
                            }

                            if (n8 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Statistics for IT is a program core.");

                            }
                        }


                        while (true) {
                            Object[] options2 = {"Yes",
                                    "No",
                                    "Why"};
                            int n9 = JOptionPane.showOptionDialog(null,
                                    "Have you taken Human Computer Interaction?",
                                    "Semester 2",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options2,
                                    options2[2]);

                            if (n9 == JOptionPane.YES_OPTION) {
                                break;
                            }

                            if (n9 == JOptionPane.NO_OPTION) {
                                standPoint10=10;
                                break;
                            }

                            if (n9 == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Human Computer Interaction is a program core.");

                            }
                        }



                        new Semester2(standPoint1,standPoint2,standPoint3, standPoint4, standPoint5,
                                standPoint6, standPoint7, standPoint8, standPoint9, standPoint10);
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



        BufferedImage img = null;
        try {
            img = ImageIO.read(this.getClass().getResource("/Semester2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * This image is used as the background for the Semester 2.
         */
        ImageIcon icon2=new ImageIcon(img);
        JLabel label2 = new JLabel();
        label2.setIcon(icon2);
        label2.setBounds(1,90,1000,500);
        add(label2);





        setTitle("Semester2");
        setLayout(new FlowLayout());
        setResizable(false);
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    /**
     * This constructor is used to recommend subjects for Semester 2 students based on the questions answered by them.
     * @param standPoint1 Act as a mark if student chooses "No" or have not taken Malaysian Nationhood Studies.
     * @param standPoint2 Act as a mark if student chooses "No" or have not taken English Core 1.
     * @param standPoint3 Act as a mark if student chooses "No" or have not taken English Core 2.
     * @param standPoint4 Act as a mark if student chooses "No" or have not taken Science Thinking and Ethics.
     * @param standPoint5 Act as a mark if student chooses "Yes" or have taken Programming 1.
     * @param standPoint6 Act as a mark if student chooses "No" or have not taken Programming 1.
     * @param standPoint7 Act as a mark if student chooses "No" or have not taken Mathematics for IT.
     * @param standPoint8 Act as a mark if student chooses "No" or have not taken Introduction to Artificial Intelligence.
     * @param standPoint9 Act as a mark if student chooses "No" or have not taken Statistics for IT.
     * @param standPoint10 Act as a mark if student chooses "No" or have not taken Human Computer Interaction.
     */
    public Semester2(int standPoint1, int standPoint2, int standPoint3, int standPoint4, int standPoint5, int standPoint6, int standPoint7, int standPoint8, int standPoint9, int standPoint10) {

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
            JLabel label4 = new JLabel("Science Thinking and Ethics is recommended.");
            label4.setBounds(10, 50, 500, 25);
            add(label4);
            nextPoint4=4;
        }
        if (standPoint5 == 5) {
            JLabel label5a = new JLabel("Programming 2 is recommended.");
            JLabel label5b = new JLabel("Data Structure and Algorithm Analysis is recommended.");
            JLabel label5c = new JLabel("Computer System Organization is recommended.");
            JLabel label5d = new JLabel("System Analysis and Design is recommended.");
            label5a.setBounds(10, 70, 500, 25);
            label5b.setBounds(10, 90, 500, 25);
            label5c.setBounds(10, 110, 500, 25);
            label5d.setBounds(10, 130, 500, 25);
            add(label5a);
            add(label5b);
            add(label5c);
            add(label5d);
            nextPoint5=5;
        }
        if (standPoint6 == 6) {
            JLabel label6 = new JLabel("Programming 1 is recommended.");
            label6.setBounds(10, 70, 500, 25);
            add(label6);
            nextPoint6=6;
        }
        if (standPoint7 == 7) {
            JLabel label7 = new JLabel("Mathematics for IT is recommended.");
            if(standPoint6==6){
                label7.setBounds(10, 90, 500, 25);
            }
            else if(standPoint5==5){
                label7.setBounds(10, 150, 500, 25);
            }
            add(label7);
            nextPoint7=7;
        }
        if (standPoint8 == 8) {
            JLabel label8 = new JLabel("Introduction to Artificial Intelligence is recommended.");
            if(standPoint6 == 6) {
                label8.setBounds(10, 110, 500, 25);
            }
            else if(standPoint5 == 5) {
                label8.setBounds(10, 170, 500, 25);
            }
            add(label8);
            nextPoint8=8;
        }
        if (standPoint9 == 9) {
            JLabel label9 = new JLabel("Statistics for IT is recommended.");
            if (standPoint6 == 6) {
                label9.setBounds(10, 130, 500, 25);
            }
            else if(standPoint5 == 5) {
                label9.setBounds(10, 190, 500, 25);
            }
            add(label9);
            nextPoint9=9;
        }

        if (standPoint10 == 10) {
            JLabel label10 = new JLabel("Human Computer Interaction is recommended.");
            if(standPoint6 == 6) {
                label10.setBounds(10, 150, 500, 25);
            }
            else if(standPoint5 == 5){
                label10.setBounds(10, 210, 500, 25);
            }
            add(label10);
            nextPoint10=10;
        }

        JButton button1 = new JButton("Back");
        button1.setBounds(350, 270, 80, 25);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                new MainFrame();

            }
        });
        add(button1);


        JButton button2 = new JButton("How");
        button2.setBounds(440, 270, 80, 25);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new Semester2(nextPoint1,nextPoint2,nextPoint3,nextPoint4,nextPoint5,nextPoint6,nextPoint7,nextPoint8,nextPoint9,nextPoint10);

            }
        });
        add(button2);

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8, 6));
        mainContainer.setBackground(Color.WHITE);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));

        this.getContentPane().setBackground(Color.pink);


        setTitle("Recommend");
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setSize(560, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    /**
     * This constructor is used to justify the reason or "HOW" these subjects are recommended for Semester 2 students.
     * @param nextPoint1 Act as a mark if student chooses "No" for Malaysian Nationhood Studies and provide valid reason where student have not taken the university core
     * @param nextPoint2 Act as a mark if student chooses "No" for English core 1 and provide valid reason where student have not taken the language core.
     * @param nextPoint3 Act as a mark if student chooses "Yes" for English core 1 and "No" for English core 2 and provide valid reason where student have taken English core 1 which is the pre-requisite for English core 2.
     * @param nextPoint4 Act as a mark if student chooses "No" for Science Thinking and Ethics and provide valid reason where student have not taken the university core.
     * @param nextPoint5 Act as a mark if student chooses "Yes" for Programming 1 and provide valid reason where student have taken Programming 1 which is the pre-requisite for Programming 2,
     *                   Data Structure and Algorithm Analysis, Computer System Organization and System Analysis and Design.
     * @param nextPoint6 Act as a mark if student chooses "No" for Programming 1 and provide valid reason where student have not taken the program core.
     * @param nextPoint7 Act as a mark if student chooses "No" for Mathematics for IT and provide valid reason where student have not taken the program core.
     * @param nextPoint8 Act as a mark if student chooses "No" for Introduction to Artificial Intelligence and provide valid reason where student have not taken the program core.
     * @param nextPoint9 Act as a mark if student chooses "No" for Statistics for IT and provide valid reason where student have not taken the program core.
     * @param nextPoint10 Act as a mark if student chooses "No" for Human Computer Interaction and provide valid reason where student have not taken the program core.
     */
    public Semester2(double nextPoint1,double nextPoint2,double  nextPoint3,double nextPoint4,double nextPoint5,double nextPoint6,double  nextPoint7,double nextPoint8,double  nextPoint9,double nextPoint10) {

        if (nextPoint1 == 1) {
            JLabel label1 = new JLabel("Malaysian Nationhood Studies is recommended because you have not taken the university core.");
            label1.setBounds(10, 10, 800, 25);
            add(label1);
        }
        if (nextPoint2 == 2) {
            JLabel label2 = new JLabel("English core 1 is recommended because you have not taken the language core.");
            label2.setBounds(10, 30, 800, 25);
            add(label2);
        }
        if (nextPoint3 == 3) {
            JLabel label3 = new JLabel("English core 2 is recommended because you have taken English core 1 which is the pre-requisite for English core 2.");
            label3.setBounds(10, 30, 800, 25);
            add(label3);
        }
        if (nextPoint4 == 4) {
            JLabel label4 = new JLabel("Science Thinking and Ethics is recommended because you have not taken the university core.");
            label4.setBounds(10, 50, 800, 25);
            add(label4);
        }
        if (nextPoint5 == 5) {
            JLabel label5a = new JLabel("Programming 2, Data Structure and Algorithm Analysis, Computer System Organization and System Analysis and Design are ");
            JLabel label5b = new JLabel("recommended because you have taken Programming 1 which is the pre-requisite.");
            label5a.setBounds(10, 70, 800, 25);
            label5b.setBounds(10, 90, 800, 25);
            add(label5a);
            add(label5b);
        }
        if (nextPoint6 == 6) {
            JLabel label6 = new JLabel("Programming 1 is recommended because you have not taken the program core.");
            label6.setBounds(10, 70, 800, 25);
            add(label6);
        }
        if (nextPoint7 == 7) {
            JLabel label7 = new JLabel("Mathematics for IT is recommended because you have not taken the program core.");
            if(nextPoint6==6) {
                label7.setBounds(10, 90, 800, 25);
            }
            else if(nextPoint5==5){
                label7.setBounds(10, 110, 800, 25);
            }
            add(label7);
        }
        if (nextPoint8 == 8) {
            JLabel label8 = new JLabel("Introduction to Artificial Intelligence is recommended because you have not taken the program core.");
            if(nextPoint6==6) {
                label8.setBounds(10, 110, 800, 25);
            }
            else if(nextPoint5==5){
                label8.setBounds(10, 130, 800, 25);
            }
            add(label8);
        }
        if (nextPoint9 == 9) {
            JLabel label9 = new JLabel("Statistics for IT is recommended because you have not taken the program core.");
            if(nextPoint6==6) {
                label9.setBounds(10, 130, 800, 25);
            }
            else if(nextPoint5==5){
                label9.setBounds(10, 150, 800, 25);
            }
            add(label9);
        }
        if (nextPoint10 == 10) {
            JLabel label10 = new JLabel("Human Computer Interaction is recommended because you have not taken the program core.");
            if(nextPoint6==6) {
                label10.setBounds(10, 150, 800, 25);
            }
            else if(nextPoint5==5){
                label10.setBounds(10, 170, 800, 25);
            }
            add(label10);
        }

        JButton button1 = new JButton("Exit");
        button1.setBounds(600, 270, 80, 25);
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
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));

        this.getContentPane().setBackground(Color.pink);

        setTitle("How");
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setSize(800, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
