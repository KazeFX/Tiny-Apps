// A counter for my stream! :D

import java.awt.event.*;
import javax.swing.*;
public class KazeCounter {
    static Integer counter = 0;
    public static void main(String[] args) {

        JFrame f=new JFrame("Kaze Elden Ring Mistake Counter :D");

        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 50,20);

        JButton b=new JButton("Click for mistake");
        b.setBounds(50,100,195,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                counter+= 1;
                tf.setText(counter.toString());
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
