package topic_3_stack_calculator;


/**
 *
 * @author kent ryan pagongpong
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackCalculatorGUI extends JFrame implements ActionListener {
    private Stack<Integer> stack = new Stack<>();
    private JTextArea display;

    public StackCalculatorGUI() {
        // Set up the JFrame
        setTitle("Stack Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);

        // Display area for the stack (smaller size)
        display = new JTextArea(3, 20);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 16));
        display.setMargin(new Insets(10, 10, 10, 10)); // Margin inside the display area
        JScrollPane scrollPane = new JScrollPane(display);
        add(scrollPane, BorderLayout.NORTH);

        // Panel for buttons with spacing
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3, 10, 10)); // 10px horizontal and vertical gap
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Margin around the button panel

        // Number buttons (0-9)
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(new Font("Arial", Font.BOLD, 16));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Add button for zero separately to maintain layout order
        JButton zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Arial", Font.BOLD, 16));
        zeroButton.addActionListener(this);
        buttonPanel.add(zeroButton);

        // Operation buttons
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");

        JButton[] opButtons = {addButton, subtractButton, multiplyButton, divideButton};
        for (JButton button : opButtons) {
            button.setFont(new Font("Arial", Font.BOLD, 16));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789".contains(command)) {
            int number = Integer.parseInt(command);
            stack.push(number);
            displayStack();
        } else {
            switch (command) {
                case "+":
                    add();
                    break;
                case "-":
                    subtract();
                    break;
                case "*":
                    multiply();
                    break;
                case "/":
                    divide();
                    break;
            }
        }
    }

    private void add() {
        if (stack.size() < 2) {
            display.append("Need at least two numbers to add.\n");
            return;
        }
        int b = stack.pop();
        int a = stack.pop();
        int result = a + b;
        stack.push(result);
        display.append("Performed addition: " + a + " + " + b + " = " + result + "\n");
        displayStack();
    }

    private void subtract() {
        if (stack.size() < 2) {
            display.append("Need at least two numbers to subtract.\n");
            return;
        }
        int b = stack.pop();
        int a = stack.pop();
        int result = a - b;
        stack.push(result);
        display.append("Performed subtraction: " + a + " - " + b + " = " + result + "\n");
        displayStack();
    }

    private void multiply() {
        if (stack.size() < 2) {
            display.append("Need at least two numbers to multiply.\n");
            return;
        }
        int b = stack.pop();
        int a = stack.pop();
        int result = a * b;
        stack.push(result);
        display.append("Performed multiplication: " + a + " * " + b + " = " + result + "\n");
        displayStack();
    }

    private void divide() {
        if (stack.size() < 2) {
            display.append("Need at least two numbers to divide.\n");
            return;
        }
        int b = stack.pop();
        int a = stack.pop();
        if (b == 0) {
            display.append("Cannot divide by zero.\n");
            stack.push(a); // Push back the numbers if division is not possible
            stack.push(b);
            return;
        }
        int result = a / b;
        stack.push(result);
        display.append("Performed division: " + a + " / " + b + " = " + result + "\n");
        displayStack();
    }

    private void displayStack() {
        display.setText("Current Stack: " + stack + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StackCalculatorGUI calculator = new StackCalculatorGUI();
            calculator.setVisible(true);
        });
    }
}
