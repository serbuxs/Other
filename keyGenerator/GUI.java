import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI extends JFrame{
    private JButton btnGen;
    private JPanel rootPanel;
    private JLabel lblKey;
    private JTextField tfKey;
    private JLabel lblDesc;

    public GUI(){
        // for use the designer form
        add(rootPanel);

        setVisible(true);
        setTitle("Key Generator");
        //setMinimumSize();
        setSize(680,140);
        setMinimumSize(new Dimension(680, 140));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        btnGen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyGenerate a = new keyGenerate();
                try {
                    a.setKeyLen(64);
                    a.setStr("");
                    a.keyGenerate();
                    tfKey.setText(a.getStr());
                    lblKey.setText("Пароль готов!");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
}
