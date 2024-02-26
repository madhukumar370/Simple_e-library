package Javatermproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Librarian extends JFrame {
    public static void main(String[] args) {
 Librarian n = new Librarian();
    }
    public Librarian (){
        JFrame frame = new JFrame("Librarian Tab");
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setLocation(50, 50);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.BLACK);
        mb.setSize(800, 30);
        frame.add(mb);
        JMenu mb1, mb2;
        mb1 = new JMenu("Book Options");
        mb1.setForeground(Color.WHITE);
        mb2 = new JMenu("Librarian Options");
        mb2.setForeground(Color.WHITE);
        mb.add(mb1); mb.add(mb2);
        JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
        mi1 = new JMenuItem("Add Book");
        mi2 = new JMenuItem("View Taken Books");
        mi3 = new JMenuItem("Returned Book");
        mi4 = new JMenuItem("Whitelisting the Book");
        mi5 = new JMenuItem("Logout");
        mi6 = new JMenuItem("Exit From Being Librarian");
        mb1.add(mi1);mb1.add(mi2);mb1.add(mi3);mb1.add(mi4);mb2.add(mi5);mb2.add(mi6);
        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf1 = new JFrame("Adding a Book");
                jf1.setVisible(true);
                jf1.setSize(800,600);
                jf1.setLocation(50,50);
                jf1.setLayout(null);
                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel jl1 = new JLabel("Name The Book");
                jl1.setBounds(50,0,80,80);
                jf1.add(jl1);
                JTextField jt1 = new JTextField(15);
                jt1.setBounds(150,35,300,25);
                jf1.add(jt1);
                JButton jb = new JButton("Add");
                jb.setBounds(250,120,80,20);
                jf1.add(jb);
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jt1Text = jt1.getText();
                        JOptionPane.showMessageDialog(jf1,"Successfully "+ jt1Text+" Book is Added");                    }
                });
            }
        });
        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf1 = new JFrame("Viewing the taken Book");
                jf1.setVisible(true);
                jf1.setSize(800,600);
                jf1.setLocation(50,50);
                jf1.setLayout(null);
                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel jl1 = new JLabel("Name of the Book");
                jl1.setBounds(50,0,80,80);
                jf1.add(jl1);
                JTextField jt1 = new JTextField("Java OPP",15);
                jt1.setBounds(150,35,300,25);
                jf1.add(jt1);
                JLabel jl2 = new JLabel("Name of the Book");
                jl2.setBounds(50,50,80,80);
                jf1.add(jl2);
                JTextField jt2 = new JTextField("Data Structures",15);
                jt2.setBounds(150,85,300,25);
                jf1.add(jt2);
                JButton jb = new JButton("Ok");
                jb.setBounds(250,120,80,20);
                jf1.add(jb);
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Librarian();
                    }
                });
            }
        });
        mi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf1 = new JFrame("Returning the taken Book");
                jf1.setVisible(true);
                jf1.setSize(800,600);
                jf1.setLocation(50,50);
                jf1.setLayout(null);
                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel jl1 = new JLabel("Name of the Book");
                jl1.setBounds(50,0,80,80);
                jf1.add(jl1);
                JTextField jt1 = new JTextField(15);
                jt1.setBounds(150,35,300,25);
                jf1.add(jt1);
                JButton jb = new JButton("Done");
                jb.setBounds(250,120,80,20);
                jf1.add(jb);
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jt1Text = jt1.getText();
                        JOptionPane.showMessageDialog(jf1,"The " + jt1Text + " is Returned");

                    }
                });
            }
        });
        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf1 = new JFrame("Whitelisting the taken Book");
                jf1.setVisible(true);
                jf1.setSize(800,600);
                jf1.setLocation(50,50);
                jf1.setLayout(null);
                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel jl1 = new JLabel("Name of the Book");
                jl1.setBounds(50,0,80,80);
                jf1.add(jl1);
                JTextField jt1 = new JTextField(15);
                jt1.setBounds(150,35,300,25);
                jf1.add(jt1);
                JButton jb = new JButton("Done");
                jb.setBounds(250,120,80,20);
                jf1.add(jb);
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jt1Text = jt1.getText();
                        JOptionPane.showMessageDialog(jf1,"The "+ jt1Text+ " book is successfully added to wishlist");
                    }
                });
            }
        });
        mi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_library.main(new String[]{});

            }
        });
        mi6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_library.main(new String[]{});
            }
        });



    }

}
