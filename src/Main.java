import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    private JTextField pass;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        pass = new JTextField();
        pass.setSize(200, 50);
        pass.setLocation(400, 400);
        pass.setText("Password");
        c.add(pass);

        JButton button = new JButton("submit");
        button.setSize(200, 50);
        button.setLocation(400, 500);
        button.addActionListener(ex -> {
            String password = pass.getText();
            if (password.equals("e")) {
                System.exit(0);
            }
        });
        c.add(button);

        frame.setVisible(true);
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        gd.setFullScreenWindow(frame);
    }
}
