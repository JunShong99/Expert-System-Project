package EsAssignment4;


        import javax.imageio.ImageIO;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.image.BufferedImage;
        import java.io.IOException;

/**
 * This class is for the purpose to display the MainFrame for user to choose their current semester.
 * @author Wei Jun Shong
 * @author Seow Ke Ni
 * @author Michelle Lee Miao Shang
 */

public class MainFrame extends JFrame {

    private JButton b1, b2, b3, b4, b5;

    /**
     * This constructor displays the buttons for Semester 2, 3 amd 4.
     */
    public MainFrame() {

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8, 6));
        mainContainer.setBackground(Color.WHITE);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));

        b1 = new JButton("Semester 2");
        b1.setBackground(Color.pink);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Semester2();
                dispose();
            }
        });
        add(b1);

        b2 = new JButton("Semester 3");
        b2.setBackground(Color.yellow);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Semester3();
                dispose();
            }
        });
        add(b2);

        b3 = new JButton("Semester 4");
        b3.setBackground(Color.cyan);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Semester4();
                dispose();
            }
        });
        add(b3);

        /**
         * This image is used as the background for the Main Frame.
         */
        BufferedImage img = null;
        try {
            img = ImageIO.read(this.getClass().getResource("/MainFrame.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ImageIcon icon1=new ImageIcon(img);
        JLabel label1 = new JLabel();
        label1.setIcon(icon1);
        label1.setBounds(1,90,1000,500);
        add(label1);

        setTitle("Class Selection Student Advisor");
        setLayout(new FlowLayout());
        setResizable(false);
        setVisible(true);
        setSize(560, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        /**
         * Runs the program
         */
        new MainFrame();
    }
}
