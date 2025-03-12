import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frmMain = new JFrame("ComboBoxDemo");
        frmMain.setLayout(new FlowLayout());
        frmMain.setSize(640,480);
        JLabel lblHint = new JLabel("Scegli un colore: ");
        JLabel lblSelectedColor = new JLabel("... ");
        JComboBox<String> cmbColors;
        String[] colors = {"Rosso", "Blu", "Viola", "Rosa", "Giallo"};
        cmbColors = new JComboBox<>(colors);
        frmMain.add(lblHint);
        frmMain.add(cmbColors);
        frmMain.add(lblSelectedColor);





        cmbColors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) cmbColors.getSelectedItem();
                lblSelectedColor.setText(selectedColor);

            }
        });
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setVisible(true);
    }
}