import javax.swing.*;
import java.awt.*;

public class Window extends JFrame  {
    JTextField firstField;
    public static void main(String[]args) {

        new Window("Game");
    }
    Window(String name) {
        super(name);
        setSize(750,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("����");                       //����
        JMenuItem menuItem1=new JMenuItem("���");                   //�������
        JMenuItem menuItem2=new JMenuItem("���������");

        JMenu menu2 = new JMenu("������");
        JMenuItem menuItem3=new JMenuItem("����");
        JMenuItem menuItem4=new JMenuItem("������");
        JMenuItem menuItem5=new JMenuItem("�������");

        setIconImage (new ImageIcon(getClass().getResource("images/ic.png")).getImage());               //��� ������ ������ � ����������
        menuItem1.setIcon(new ImageIcon(getClass().getResource("images/ic.png")));            // ������ ��� �� ������� � �� �������� � ���������
        menuItem2.setIcon(new ImageIcon(getClass().getResource("images/ic.png")));
        menuItem3.setIcon(new ImageIcon(getClass().getResource("images/ic.png")));
        menuItem4.setIcon(new ImageIcon(getClass().getResource("images/ic.png")));
        menuItem5.setIcon(new ImageIcon(getClass().getResource("images/ic.png")));

        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu2.add(menuItem3);
        menu2.addSeparator();
        menu2.add(menuItem4);
        menu2.addSeparator();
        menu2.add(menuItem5);

        menuBar.add(menu1);
        menuBar.add(menu2);
        setJMenuBar(menuBar);

        // �������� ��������� �����
        firstField = new JTextField(15);
        firstField.setToolTipText("������ ��� �����?");
        final ImageIcon icon1 = new ImageIcon(getClass().getResource("images/eat.gif"));
        final ImageIcon icon2 = new ImageIcon(getClass().getResource("images/sleep.gif"));
        firstField.addActionListener(e ->{String a=firstField.getText().toLowerCase(); if(a.equals("������")){JOptionPane.showMessageDialog(Window.this,
                icon1, "����� ������", JOptionPane.WARNING_MESSAGE);}
                                          else if(a.equals("�����")){JOptionPane.showMessageDialog(Window.this,
                icon2, "����� ����", JOptionPane.WARNING_MESSAGE);} } );

        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(firstField);
        setContentPane(contents);
        String FIO = JOptionPane.showInputDialog("��� ��� �����?", "���");
        JOptionPane.showMessageDialog(null, FIO +", ���� ������ �������� �� ������ �������");

        MyButton button = new MyButton("������ 1");
        MyButton button2 = new MyButton("������ 2");
        MyButton button3 = new MyButton("������ 3");
        MyButton button4 = new MyButton("������ 4");
        MyButton button5 = new MyButton("������ 5");
        MyButton buttonEx = new MyButton("�����");
        MyButton buttonRan = new MyButton("");

        JFrame jFrame = new JFrame();
        button.setBounds(100,50,200,30);
            button.addActionListener(e-> {  int result = JOptionPane.showConfirmDialog(jFrame, "�� ��� ���?"); button.setText(PopUpJava.Popup(result));button.setEnabled(false);});
        button2.setBounds(100,100,200,30);
            button2.addActionListener(e ->{ int result = JOptionPane.showConfirmDialog(jFrame, "�� ������ �������?"); button2.setText(PopUpJava.Popup(result));button2.setEnabled(false);});
        button3.setBounds(100,150,200,30);
            button3.addActionListener(e ->{ String result = JOptionPane.showInputDialog( jFrame,"����� ������ ���?",2000); button3.setText(PopUpJava.Popup2(result));button3.setEnabled(false);});
        button4.setBounds(100,200,200,30);
            button4.addActionListener(e ->{ String result = JOptionPane.showInputDialog( jFrame,"������� ����� 2*6/3-8*4?",0); button4.setText(PopUpJava.Popup4(result));button4.setEnabled(false);});
        button5.setBounds(100,250,200,30);
            button5.addActionListener(e ->{ int result = JOptionPane.showConfirmDialog(jFrame, "��������� ���. �����?", "(��)", JOptionPane.DEFAULT_OPTION); button5.setText(PopUpJava.Popup(result));button5.setEnabled(false);});
        buttonEx.setBounds(400,300,100,30);
            buttonEx.addActionListener(e -> { JOptionPane.showMessageDialog(null,FIO+", �������. � ���� "+PopUpJava.Popup3()+" ������."); System.exit(0);});
        buttonRan.setBounds(500,400,50,50);
            buttonRan.addActionListener(e -> {int a=((int)(Math.random()*650)); int b=((int)(Math.random()*450)); buttonRan.setLocation(a,b);});
            buttonRan.setIcon(new ImageIcon(getClass().getResource("images/cat.gif")));
            
        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(buttonEx);
        add(buttonRan);
        
        setVisible(true);
    }
}
