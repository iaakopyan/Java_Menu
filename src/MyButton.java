import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {
    MyButton(String name){
        super(name);
        setBackground(Color.pink);
        addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        JButton btn = (JButton) e.getSource();
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        btn.setBackground(new Color(red, green, blue));
    }
}


