import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI extends JFrame{
    private JButton btnGen;
    private JPanel rootPanel;
    private JLabel lblKey;

    public GUI(){
        // for use the designer form
        add(rootPanel);

        setVisible(true);
        setTitle("Key Generator");
        setSize(240,180);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        btnGen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyGenerate a = new keyGenerate();
                try {
                    a.setKeyLen(64);
                    a.setStr("");
                    a.keyGenerate();
                    lblKey.setText(a.getStr());
                    //lblKey.setText("Successfully written!");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
}
