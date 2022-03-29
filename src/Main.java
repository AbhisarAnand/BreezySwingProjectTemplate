import BreezySwing.*;

import javax.swing.*;

public class Main extends GBFrame {

    // Initialize GUI Elements
    GBPanel inputPanel = addPanel(1, 1, 1, 1);
    JLabel topLeftSpacer = inputPanel.addLabel(" ", 1, 1, 1, 1);
    JTextField inputField = inputPanel.addTextField("", 2, 2, 1, 1);
    JLabel bottomRightSpacer = inputPanel.addLabel(" ", 3, 3, 1, 1);

    GBPanel buttonFields = addPanel(2, 1, 1, 1);
    JButton outputButton = buttonFields.addButton("Output", 1, 2, 1, 1);

    /**
     * Main Method of the program
     */
    public static void main(String[] args) {
        JFrame frm = new Main();
        frm.setTitle(""); // TODO: Set the title of the window
        frm.setSize(600, 400);
        frm.setVisible(true);
    }

    /**
     * Action Listener for the button clicks
     *
     * @param buttonObj button that the user clicked
     */
    public void buttonClicked(JButton buttonObj) {
        if (buttonObj == outputButton) {
            String userInput = getInput();
            // TODO: Finish implementing the output button
        }
    }

    /**
     * Gets the input from the user
     *
     * @return (String) the input from the user
     */
    public String getInput() {
        return inputField.getText();
    }

    /**
     * Outputs the results of the program
     */
    private void outputResult(String result) {
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Show any error messages that occur during the program
     *
     * @param errorMessage Message to be displayed
     */
    private void showError(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
}