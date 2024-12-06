import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JButton button, button1, button2;

    public Menu() {
        initComponents();
    }

    private void initComponents() {
        this.setTitle("Menu Page");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Input");
        button1 = new JButton("Search");
        button2 = new JButton("Delete");

        button.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);

        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);

        this.add(button, BorderLayout.WEST);
        this.add(button1, BorderLayout.CENTER);
        this.add(button2, BorderLayout.EAST);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Input":
                new FormInput();
                this.dispose();

                break;
            case "Search":
                new Search();
                this.dispose();

                break;
            case "Delete":
                this.dispose();
                break;
        }
    }
    
}
