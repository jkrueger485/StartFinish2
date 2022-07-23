import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Jul 21 21:57:29 CDT 2022
 */



/**
 * @author JC Krueger
 */
public class Main extends JFrame {
    public Main() {
        initComponents();

    }

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(()-> new Main().setVisible(true));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - JC Krueger
        panel1 = new StartFinish();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 395, 275);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - JC Krueger
    private StartFinish panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
