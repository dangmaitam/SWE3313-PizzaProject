import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PizzaProject extends JFrame {
    private JPanel mainPanel;
    private JButton profileButton;
    private JLabel logoImage;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JButton pizzaButton;
    private JButton sidesButton;
    private JButton beveragesButton;
    private JPanel pizzaPanel;
    private JButton sizeSelection;
    private JButton crustSelection;
    private JRadioButton panRadioButton;
    private JRadioButton regularRButton;
    private JRadioButton smallRButton;
    private JRadioButton largeRButton;
    private JRadioButton thinRButton;
    private JButton checkOutButton;
    private JRadioButton mediumRButton;
    private JPanel quantityTab;
    private JTextArea quantityTextField;
    private JLabel quantityText;
    private JRadioButton m1RButton;
    private JRadioButton m2RButton;
    private JRadioButton m3RButton;
    private JRadioButton t1RButton;
    private JRadioButton t2RButton;
    private JRadioButton t3RButton;
    private JRadioButton t4RButton;
    private JRadioButton t5RButton;
    private JRadioButton t6RButton;
    private JButton addQuantityButton;
    private JButton minusQuantityButton;

    static ArrayList<Pizza> userPizzaOrder = new ArrayList<Pizza>();

    public PizzaProject(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080,720));

        this.pack();

        //variables


        //makes quantity text field and buttons work
        final int[] quantity = {1};
        this.quantityTextField.setText(String.valueOf(quantity[0]));
        this.minusQuantityButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] -1;
                if (quantity[0]<1) {
                    quantity[0] = 1;
                }
                quantityTextField.setText(String.valueOf(quantity[0]));
            }
        });
        this.addQuantityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] +1;
                quantityTextField.setText(String.valueOf(quantity[0]));
            }
        });


        ButtonGroup sizeGroup = new ButtonGroup();
            sizeGroup.add(smallRButton);
            sizeGroup.add(mediumRButton);
            sizeGroup.add(largeRButton);
        ButtonGroup crustGroup = new ButtonGroup();
            crustGroup.add(thinRButton);
            crustGroup.add(regularRButton);
            crustGroup.add(panRadioButton);


        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPizzaOrder.add(saveOrder(quantity));

                for (int i=0; i<userPizzaOrder.size(); i++) {
                    System.out.println(userPizzaOrder.get(i));
                }
            }
        });
    }
    public Pizza saveOrder(int[] quantity) {
        //variables
        char size='n';
        char crust='n';
        int m1=0;
        int m2=0;
        int m3=0;
        int t1=0;
        int t2=0;
        int t3=0;
        int t4=0;
        int t5=0;
        int t6=0;
        int n = quantity[0];

        //Button Functionality
        if (smallRButton.isSelected()) {
            size = 's';
        }
        else if (mediumRButton.isSelected()) {
            size ='m';
        }
        else if (largeRButton.isSelected()) {
            size = 'l';
        }
        else {
            size = 'n';
        }
        if (thinRButton.isSelected()) {
            crust = 't';
        }
        else if (regularRButton.isSelected()) {
            crust = 'r';
        }
        else if (panRadioButton.isSelected()) {
            crust = 'p';
        }
        else {
            crust = 'n';
        }
        if (m1RButton.isSelected()) {
            m1 = 1;
        }
        if (m2RButton.isSelected()) {
            m2 = 1;
        }
        if (m3RButton.isSelected()) {
            m3 = 1;
        }
        if (t1RButton.isSelected()) {
            t1 = 1;
        }
        if (t2RButton.isSelected()) {
            t2 = 1;
        }
        if (t3RButton.isSelected()) {
            t3 = 1;
        }
        if (t4RButton.isSelected()) {
            t4= 1;
        }
        if (t5RButton.isSelected()) {
            t5 = 1;
        }
        if (t6RButton.isSelected()) {
            t6 = 1;
        }

        return new Pizza(size, crust, m1,m2,m3,t1,t2,t3,t4,t5,t6,n);
    }


    public static void main(String[] args) {

        JFrame frame = new PizzaProject("Pizza Creation");





    }
}

