package Javatermproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame {
    public static void main(String[] args) {
        Admin n = new Admin();

    }
    public Admin () {
        JFrame frame = new JFrame("Admin Tab");
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setLocation(50,50);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.BLACK);
        mb.setSize(800,30);
        frame.add(mb);
        JMenu mb1;
        mb1 = new JMenu("Librarian");
        mb1.setForeground(Color.WHITE);
        mb.add(mb1);
        JMenu mb2;
        mb2 = new JMenu("Admin Options");
        mb2.setForeground(Color.WHITE);
        mb.add(mb2);
        JMenuItem mi1,mi2,mi3,mi4;
        mi1 = new JMenuItem("Add Librarian");
        mi2 = new JMenuItem("View Librarian");
        mi3 = new JMenuItem("Delete Librarian");
        mi4 = new JMenuItem("Logout");
        mb1.add(mi1); mb1.add(mi2); mb1.add(mi3); mb2.add(mi4);
        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_library.main(new String[]{});
            }
        });

        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf1 = new JFrame("Adding Librarian");
                jf1.setVisible(true);
                jf1.setSize(800,600);
                jf1.setLocation(50,50);
                jf1.setLayout(null);
                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel jl1 = new JLabel("Name");
                jl1.setBounds(50,0,80,80);
                jf1.add(jl1);
                JTextField jt1 = new JTextField(15);
                jt1.setBounds(150,35,300,25);
                jf1.add(jt1);
                JLabel jl2 = new JLabel("Phn Number");
                jl2.setBounds(50,50,80,80);
                jf1.add(jl2);
                JTextField jt2 = new JTextField(15);
                jt2.setBounds(150,85,300,25);
                jf1.add(jt2);
                JLabel jl3 = new JLabel("Email");
                jl3.setBounds(50,100,80,80);
                jf1.add(jl3);
                JTextField jt3 = new JTextField(15);
                jt3.setBounds(150,125,300,25);
                jf1.add(jt3);
                JLabel jl4 = new JLabel("Password");
                jl4.setBounds(50,150,80,80);
                jf1.add(jl4);
                JTextField jt4 = new JTextField(15);
                jt4.setBounds(150,180,300,25);
                jf1.add(jt4);
                JButton b1 = new JButton("Sign up");
                jf1.add(b1);
                b1.setBounds(320,225,80,40);
                JButton b2 = new JButton("Go Back");
                jf1.add(b2);
                b2.setBounds(200,225,100,40);
                b2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Admin.main(new String[]{});
                    }
                });
                b1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jt1Text = jt1.getText();
                        String jt2Text = jt2.getText();
                        String jt3Text = jt3.getText();
                        String jt4Text = jt4.getText();
                        if (jt2Text.length() == 10 && jt3Text.endsWith("@gmail.com") ){
                            getClass();
                            JOptionPane.showMessageDialog(jf1,"Successfully "+ jt1Text+" added as your Librarian");
                        }
                        else {
                                JOptionPane.showMessageDialog(jf1,"Sign Up failed,give Correct Details","Failed", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                });

            }

        });
        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf1 = new JFrame("Viewing Librarian");
                jf1.setVisible(true);
                jf1.setSize(800,600);
                jf1.setLocation(50,50);
                jf1.setLayout(null);
                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel jl1 = new JLabel("Name");
                jl1.setBounds(50,0,80,80);
                jf1.add(jl1);
                JTextField jt1 = new JTextField("Madhu Kumar",15);
                jt1.setBounds(150,35,300,25);
                jf1.add(jt1);
                JLabel jl2 = new JLabel("Phone Number");
                jl2.setBounds(50,50,80,80);
                jf1.add(jl2);
                JTextField jt2 = new JTextField("950****279",15);
                jt2.setBounds(150,85,300,25);
                jf1.add(jt2);
                JLabel jl3 = new JLabel("Email");
                jl3.setBounds(50,100,80,80);
                jf1.add(jl3);
                JTextField jt3 = new JTextField("mad*****@gmail.com",15);
                jt3.setBounds(150,125,300,25);
                jf1.add(jt3);
                JLabel jl4 = new JLabel("Password");
                jl4.setBounds(50,150,80,80);
                jf1.add(jl4);
                JTextField jt4 = new JTextField("*********",15);
                jt4.setBounds(150,180,300,25);
                jf1.add(jt4);
                JButton b1 = new JButton("OK");
                jf1.add(b1);
                b1.setBounds(250,225,80,40);
                b1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Admin.main(new String[]{});
                    }
                });

            }
        });
mi3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame jf1 = new JFrame("Deleting a Librarian");
        jf1.setVisible(true);
        jf1.setSize(800,600);
        jf1.setLocation(50,50);
        jf1.setLayout(null);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl1 = new JLabel("Name");
        jl1.setBounds(50,0,80,80);
        jf1.add(jl1);
        JTextField jt1 = new JTextField(15);
        jt1.setBounds(150,35,300,25);
        jf1.add(jt1);
        JButton b1 = new JButton("Delete");
        jf1.add(b1);
        b1.setBounds(250,225,80,40);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jt1Text = jt1.getText();
                JOptionPane.showMessageDialog(jf1,"Successfully Deleted "+ jt1Text+" as your Librarian");

            }
        });
    }
});


    }
    }