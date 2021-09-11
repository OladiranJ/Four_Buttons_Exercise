import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FourButtons {
    private JPanel MainPanel;
    private JPanel topLeftPanel;
    private JPanel bottomLeftPanel;
    private JPanel topRightPanel;
    private JPanel bottomRightPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JLabel titleLabel;
    private JLabel buttonPushedLabel;
    private JTextField numberField;

    public FourButtons() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String num1 = Button1.getText();
                numberField.setText(num1);

            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String num2 = Button2.getText();
                numberField.setText(num2);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FourButtons");
        frame.setContentPane(new FourButtons().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
