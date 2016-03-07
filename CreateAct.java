

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.GroupLayout.Alignment.*;
import java.util.*;

public class CreateAct  {

protected JButton save;
protected JButton cancel;
private JPanel mainPanel;

    protected JComponent createAct() {
        return mainPanel;
    }

    public CreateAct() {
        initComponents();
        initLayout();
    }

    

    private void initComponents(){
    mainPanel    = new JPanel();
     save         = new JButton("Spara");
     cancel       = new JButton("Johan");

    }

    public void initLayout() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(layout);
            layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(cancel)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(save)
                .addContainerGap())
        );



}

}