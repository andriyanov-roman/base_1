import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 25.12.2014.
 */
public class TryProgram {
    public static void main(final String[] args) {
        JFrame mainFrame = new JFrame("First Frame");
        mainFrame.setSize(400, 400);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new GridLayout(3, 1));

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        final JTextField textField = new JTextField("" , 13);
        panel.add(textField);

        final JLabel label = new JLabel("", JLabel.CENTER);
        label.setSize(100, 100);
        panel.add(label);

        JButton button = new JButton("Okss");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String[] array = textField.getText().split(",");
                String maxWord = array [0];
                for (int i = 0; i < array.length; i++) {
                    if (array[i].length() > maxWord.length()) {
                        maxWord = array[i];
                    }
                }
                label.setText(maxWord);
            }
        });
        panel.add(button);

        mainFrame.add(panel);
        mainFrame.setVisible(true);

    }
}
