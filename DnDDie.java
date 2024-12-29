import java.security.SecureRandom;
import java.awt.event.*;
import javax.swing.*;

public class DnDie {

    static Integer result;
    static int dieType;

    public static void main(String[] args){

        JFrame f=new JFrame("Dungeons & Dragons Dice");

        final JTextField itf=new JTextField("Hej");
        itf.setToolTipText("Which die you wanna use?:D");
        itf.setBounds(50,20, 50,20);
        itf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dieType = Integer.parseInt(itf.getText());
            }
        });

        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 50,20);

        JButton b=new JButton("Roll Die");
        b.setBounds(50,100,195,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                result = rollDie(dieType);
                tf.setText(result.toString());
            }
        });
        f.add(itf);
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static int rollDie(int i) {
        SecureRandom randomNumbers = new SecureRandom();
        return 1 + randomNumbers.nextInt(i);
    }
}
