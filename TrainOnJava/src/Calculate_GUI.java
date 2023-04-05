import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class Calculate_GUI {
    public static void main(String[] args){
        generate();
    }
    public static void generate(){
        JFrame frame = getFrame();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel();
        JButton jButton1 = getButton("1");
        JButton jButton2 = getButton("2");
        JButton jButton3 = getButton("3");
        JButton jButton4 = getButton("4");
        JButton jButton5 = getButton("5");
        JButton jButton6 = getButton("6");
        JButton jButton7 = getButton("7");
        JButton jButton8 = getButton("8");
        JButton jButton9 = getButton("9");
        JButton jButton0 = getButton("0");
        jButton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jButton0.getText());
            }
        });
        frame.add(jPanel);
        jPanel.add(jLabel);
        jPanel.add(jButton0);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        jPanel.add(jButton6);
        jPanel.add(jButton7);
        jPanel.add(jButton8);
        jPanel.add(jButton9);
        jPanel.revalidate();
    }
    static JButton getButton(String a){
        JButton jButton = new JButton(a);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(a);
            }
        });
        return jButton;
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame("Calculate");
        jFrame.setVisible(true);
        jFrame.setBounds(50,50,250,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
