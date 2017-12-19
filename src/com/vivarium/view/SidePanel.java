package com.vivarium.view;

import com.vivarium.controller.SidePanelActionListener;
import com.vivarium.controller.VivariumController;

import javax.swing.*;

public class SidePanel extends JPanel{

    private String[] animalStrings = {"Bear","Blowfish","Bouquetin","Camel","Cow","Dog","Dragon","Eagle","Fish","FreshwaterFish","Rabbit","Trex","Wolf"};
    private String[] animalSex = {"Male","Female"};
    private SidePanelActionListener listener;

    public SidePanel(VivariumController vc) {
        super();
        listener = new SidePanelActionListener(this, vc);

        // Create ComboBox to select organism to spawn
        JComboBox organismList = new JComboBox(animalStrings);
        organismList.setSelectedIndex(0);
        organismList.setActionCommand("Choice");
        organismList.addActionListener(listener);
        add(organismList);

        // Create ComboBox to select sex
        JComboBox animalSexList = new JComboBox(animalSex);
        animalSexList.setSelectedIndex(0);
        animalSexList.setActionCommand("Sex");
        animalSexList.addActionListener(listener);
        add(animalSexList);

        // Create spawn button
        JButton spawnButton = new JButton("Spawn");
        spawnButton.setVerticalTextPosition(AbstractButton.CENTER);
        spawnButton.setHorizontalTextPosition(AbstractButton.CENTER);
        spawnButton.setActionCommand("Spawn");
        spawnButton.addActionListener(listener);
        add(spawnButton);
    }

}
