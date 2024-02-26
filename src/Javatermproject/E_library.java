package Javatermproject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class E_library implements ActionListener {
    public E_library()

    {

   JFrame jf = new JFrame("E-Library"); //Creating a Frame
    jf.setVisible(true);
    jf.setSize(800,600);//Setting size
    jf.setLocation(50,50);//Setting position
    jf.setLayout(null);// to place item in the frame is in fixed positions
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JPanel jp1=new JPanel();// Creating a panel
        jp1.setBackground(new Color(0,225,225));// setting panel background colour
        jp1.setBounds(0,0,800,700);// setting position of panel
        jp1.setLayout(null);
        jf.add(jp1);

    JButton b1 = new JButton("Admin");//Creating a button
    b1.addActionListener(new ActionListener() { //This represents an action takes place related to component
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame jf1 = new JFrame("Admin Login");
            jf1.setVisible(true);
            jf1.setSize(800,600);
            jf1.setLocation(50,50);
            jf1.setLayout(null);
            jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel jl1 = new JLabel("Username");
            jl1.setBounds(50,0,80,80);
            jf1.add(jl1);
            JTextField jt1 = new JTextField(15);
            jt1.setBounds(150,35,300,25);
            jf1.add(jt1);
            JLabel jl2 = new JLabel("Password");
            jl2.setBounds(50,50,80,80);
            jf1.add(jl2);
            JTextField jt2 = new JTextField(15);
            jt2.setBounds(150,85,300,25);
            jf1.add(jt2);
            JButton b3 = new JButton("login");
            jf1.add(b3);
            b3.setBounds(250,125,80,40);
            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String jt2Text = jt2.getText();
                    String jt1Text = jt1.getText();
                    if (jt1Text.equals("admin") && jt2Text.equals("admin")) {
                        Admin.main(new String[]{});
                    }
                    else { JOptionPane.showMessageDialog(jf1,"Login Error","failed", JOptionPane.ERROR_MESSAGE);

                    }

                    }
            });
        }
    });
        JButton b2 = new JButton("Librarian");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf1 = new JFrame("Librarian Login");
                jf1.setVisible(true);
                jf1.setSize(800,600);
                jf1.setLocation(50,50);
                jf1.setLayout(null);
                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel jl1 = new JLabel("Username");
                jl1.setBounds(50,0,80,80);
                jf1.add(jl1);
                JTextField jt1 = new JTextField(15);
                jt1.setBounds(150,35,300,25);
                jf1.add(jt1);
                JLabel jl2 = new JLabel("Password");
                jl2.setBounds(50,50,80,80);
                jf1.add(jl2);
                JTextField jt2 = new JTextField(15);
                jt2.setBounds(150,85,300,25);
                jf1.add(jt2);
                JButton b3 = new JButton("login");
                jf1.add(b3);
                b3.setBounds(250,125,80,40);
                b3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jt2Text = jt2.getText();
                        String jt1Text = jt1.getText();
                        if (jt1Text.equals("librarian") && jt2Text.equals("librarian")) {
                            new Librarian();
                        }
                        else { JOptionPane.showMessageDialog(jf1,"Login Error","failed", JOptionPane.ERROR_MESSAGE);

                        }

                    }
                });
            }
        });
        jf.add(b1);
        b1.setBounds(100,100,200,100);

        jf.add(b2);
        b2.setBounds(500,100,200,100);

    }




    @Override
        public void actionPerformed (ActionEvent e){

        }
        public static void main (String[]args){
            new E_library();
        }

}
