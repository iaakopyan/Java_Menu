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

        JMenu menu1 = new JMenu("Меню");                       //меню
        JMenuItem menuItem1=new JMenuItem("бла");                   //подменю
        JMenuItem menuItem2=new JMenuItem("блаблабла");

        JMenu menu2 = new JMenu("Помощь");
        JMenuItem menuItem3=new JMenuItem("Лень");
        JMenuItem menuItem4=new JMenuItem("Делать");
        JMenuItem menuItem5=new JMenuItem("Функции");

        setIconImage (new ImageIcon(getClass().getResource("images/ic.png")).getImage());               //тут ставлю иконки с сердечками
        menuItem1.setIcon(new ImageIcon(getClass().getResource("images/ic.png")));            // потому что на большее я не способна в рисовании
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

        // Создание текстовых полей
        firstField = new JTextField(15);
        firstField.setToolTipText("Кушать или спать?");
        final ImageIcon icon1 = new ImageIcon(getClass().getResource("images/eat.gif"));
        final ImageIcon icon2 = new ImageIcon(getClass().getResource("images/sleep.gif"));
        firstField.addActionListener(e ->{String a=firstField.getText().toLowerCase(); if(a.equals("кушать")){JOptionPane.showMessageDialog(Window.this,
                icon1, "Котик кушоет", JOptionPane.WARNING_MESSAGE);}
                                          else if(a.equals("спать")){JOptionPane.showMessageDialog(Window.this,
                icon2, "Котик спит", JOptionPane.WARNING_MESSAGE);} } );

        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(firstField);
        setContentPane(contents);
        String FIO = JOptionPane.showInputDialog("Как вас зовут?", "Имя");
        JOptionPane.showMessageDialog(null, FIO +", ваша задача ответить на данные вопросы");

        MyButton button = new MyButton("Вопрос 1");
        MyButton button2 = new MyButton("Вопрос 2");
        MyButton button3 = new MyButton("Вопрос 3");
        MyButton button4 = new MyButton("Вопрос 4");
        MyButton button5 = new MyButton("Вопрос 5");
        MyButton buttonEx = new MyButton("Выйти");
        MyButton buttonRan = new MyButton("");

        JFrame jFrame = new JFrame();
        button.setBounds(100,50,200,30);
            button.addActionListener(e-> {  int result = JOptionPane.showConfirmDialog(jFrame, "Да или нет?"); button.setText(PopUpJava.Popup(result));button.setEnabled(false);});
        button2.setBounds(100,100,200,30);
            button2.addActionListener(e ->{ int result = JOptionPane.showConfirmDialog(jFrame, "Вы любите котиков?"); button2.setText(PopUpJava.Popup(result));button2.setEnabled(false);});
        button3.setBounds(100,150,200,30);
            button3.addActionListener(e ->{ String result = JOptionPane.showInputDialog( jFrame,"Какой сейчас год?",2000); button3.setText(PopUpJava.Popup2(result));button3.setEnabled(false);});
        button4.setBounds(100,200,200,30);
            button4.addActionListener(e ->{ String result = JOptionPane.showInputDialog( jFrame,"Сколько будет 2*6/3-8*4?",0); button4.setText(PopUpJava.Popup4(result));button4.setEnabled(false);});
        button5.setBounds(100,250,200,30);
            button5.addActionListener(e ->{ int result = JOptionPane.showConfirmDialog(jFrame, "Поставите доп. баллы?", "(ДА)", JOptionPane.DEFAULT_OPTION); button5.setText(PopUpJava.Popup(result));button5.setEnabled(false);});
        buttonEx.setBounds(400,300,100,30);
            buttonEx.addActionListener(e -> { JOptionPane.showMessageDialog(null,FIO+", молодец. У тебя "+PopUpJava.Popup3()+" баллов."); System.exit(0);});
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
