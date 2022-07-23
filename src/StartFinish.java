import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class StartFinish extends JPanel {

    public Dimension center = new Dimension(1,1);
    public Dimension sf1 = new Dimension(0,0);
    public Dimension sf2 = new Dimension(2,2);
    public StartFinish() {
        initComponents();
        repaint();
    }



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(center.width-5, center.height-5, 10, 10);
        g.drawLine(sf1.width, sf1.height, sf2.width, sf2.height);

    }
    private void thisMouseDragged(MouseEvent e) {
        sf1.width = e.getX();
        sf1.height = e.getY();
        sf2.width = center.width - (sf1.width - center.width);
        sf2.height = center.height - (sf1.height - center.height);

        System.out.println("SF1 = (" + sf1.width + "," + sf1.height + ")");
        System.out.println("SF2 = (" + sf2.width + "," + sf2.height + ")");
        repaint();
    }
    private void thisMousePressed(MouseEvent e) {
        center = new Dimension(e.getX(), e.getY());
        repaint();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license

        //======== this ========
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                thisMouseDragged(e);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                thisMousePressed(e);
            }
        });
        setLayout(null);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
