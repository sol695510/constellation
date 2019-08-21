/*
 * Copyright 2010-2019 Australian Signals Directorate
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package au.gov.asd.tac.constellation.preferences;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import org.openide.awt.Mnemonics;
import org.openide.util.NbBundle;

/**
 * UI panel to define the session parameters
 *
 * @author algol
 */
final class ApplicationOptionsPanel extends javax.swing.JPanel {

    private final ApplicationOptionsPanelController controller;

    public ApplicationOptionsPanel(final ApplicationOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    public String getUserDirectory() {
        return userDirectoryText.getText();
    }

    public void setUserDirectory(final String userDirectory) {
        userDirectoryText.setText(userDirectory);
    }

    public boolean getAustosaveEnabled() {
        return autosaveCheckBox.isSelected();
    }

    public void setAutosaveEnabled(final boolean autosaveEnabled) {
        autosaveCheckBox.setSelected(autosaveEnabled);
        autosaveSpinner.setEnabled(autosaveEnabled);
    }

    public int getAustosaveFrequency() {
        return (Integer) autosaveSpinner.getModel().getValue();
    }

    public void setAutosaveFrequency(final int autosaveFrequency) {
        autosaveSpinner.getModel().setValue(autosaveFrequency);
    }

    public boolean getTutorialOnStartup() {
        return startupTutorialCheckbox.isSelected();
    }

    public void setTutorialOnStartup(final boolean tutorialOnStartup) {
        startupTutorialCheckbox.setSelected(tutorialOnStartup);
    }

    public boolean getFreezeGraph() {
        return freezeGraphCheckBox.isSelected();
    }

    public void setFreezeGraph(final boolean freezeGraph) {
        freezeGraphCheckBox.setSelected(freezeGraph);
    }

    public int getWebserverPort() {
        return (Integer) webserverPortSpinner.getModel().getValue();
    }

    public void setWebserverPort(final int webserverPort) {
        webserverPortSpinner.getModel().setValue(webserverPort);
    }

    public String getNotebookDirectory() {
        return notebookDirectoryText.getText();
    }

    public void setNotebookDirectory(final String notebookDirectory) {
        notebookDirectoryText.setText(notebookDirectory);
    }

    public String getRestDirectory() {
        return restDirectoryText.getText();
    }

    public void setRestDirectory(final String restDirectory) {
        restDirectoryText.setText(restDirectory);
    }

    public boolean getDownloadPythonClient() {
        return downloadPythonClientCheckBox.isSelected();
    }

    public void setDownloadPythonClient(final boolean downloadPythonClient) {
        downloadPythonClientCheckBox.setSelected(downloadPythonClient);
    }
    
    public boolean getRememberSaveLocation() {
        return rememberSaveLocationCheckBox.isSelected();
    }

    public void setRememberSaveLocation(final boolean rememberSaveLocation) {
        this.rememberSaveLocationCheckBox.setSelected(rememberSaveLocation);
    }
    
    public boolean getStartupWelcomeCheckbox(){
        return startupWelcomeCheckbox.isSelected();
    }
    
    public void setStartupWelcomeCheckbox(final boolean startupWelcomeCheckbox){
        this.startupWelcomeCheckbox.setSelected(startupWelcomeCheckbox);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userDirectoryLabel = new JLabel();
        userDirectoryText = new JTextField();
        userDirectoryButton = new JButton();
        autosavePanel = new JPanel();
        autosaveCheckBox = new JCheckBox();
        autosaveSpinner = new JSpinner();
        autosaveLabel = new JLabel();
        startupPanel = new JPanel();
        startupTutorialCheckbox = new JCheckBox();
        startupWelcomeCheckbox = new JCheckBox();
        displayPanel = new JPanel();
        freezeGraphCheckBox = new JCheckBox();
        webserverPanel = new JPanel();
        webserverPortLabel = new JLabel();
        webserverPortSpinner = new JSpinner();
        restDirectoryLabel = new JLabel();
        restDirectoryText = new JTextField();
        restDirectoryButton = new JButton();
        notebookPanel = new JPanel();
        notebookDirectoryLabel = new JLabel();
        notebookDirectoryText = new JTextField();
        notebookDirectoryButton = new JButton();
        downloadPythonClientCheckBox = new JCheckBox();
        saveLocationPanel = new JPanel();
        rememberSaveLocationCheckBox = new JCheckBox();

        Mnemonics.setLocalizedText(userDirectoryLabel, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.userDirectoryLabel.text")); // NOI18N

        userDirectoryText.setText(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.userDirectoryText.text")); // NOI18N

        Mnemonics.setLocalizedText(userDirectoryButton, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.userDirectoryButton.text")); // NOI18N
        userDirectoryButton.setMargin(new Insets(2, 0, 2, 0));
        userDirectoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                userDirectoryButtonActionPerformed(evt);
            }
        });

        autosavePanel.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.autosavePanel.border.title"))); // NOI18N

        Mnemonics.setLocalizedText(autosaveCheckBox, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.autosaveCheckBox.text")); // NOI18N
        autosaveCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                autosaveCheckBoxActionPerformed(evt);
            }
        });

        autosaveSpinner.setModel(new SpinnerNumberModel(10, 5, null, 1));

        Mnemonics.setLocalizedText(autosaveLabel, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.autosaveLabel.text")); // NOI18N

        GroupLayout autosavePanelLayout = new GroupLayout(autosavePanel);
        autosavePanel.setLayout(autosavePanelLayout);
        autosavePanelLayout.setHorizontalGroup(autosavePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(autosavePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(autosaveCheckBox)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autosaveSpinner, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autosaveLabel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        autosavePanelLayout.setVerticalGroup(autosavePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(autosavePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autosavePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(autosaveCheckBox)
                    .addComponent(autosaveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(autosaveLabel))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        startupPanel.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.startupPanel.border.title"))); // NOI18N

        Mnemonics.setLocalizedText(startupTutorialCheckbox, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.startupTutorialCheckbox.text")); // NOI18N

        Mnemonics.setLocalizedText(startupWelcomeCheckbox, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.startupWelcomeCheckbox.text")); // NOI18N

        GroupLayout startupPanelLayout = new GroupLayout(startupPanel);
        startupPanel.setLayout(startupPanelLayout);
        startupPanelLayout.setHorizontalGroup(startupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(startupPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(startupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(startupWelcomeCheckbox)
                    .addComponent(startupTutorialCheckbox))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        startupPanelLayout.setVerticalGroup(startupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(startupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startupTutorialCheckbox)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addComponent(startupWelcomeCheckbox))
        );

        displayPanel.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.displayPanel.border.title"))); // NOI18N

        Mnemonics.setLocalizedText(freezeGraphCheckBox, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.freezeGraphCheckBox.text")); // NOI18N
        freezeGraphCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                freezeGraphCheckBoxActionPerformed(evt);
            }
        });

        GroupLayout displayPanelLayout = new GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(displayPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(freezeGraphCheckBox)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        displayPanelLayout.setVerticalGroup(displayPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(freezeGraphCheckBox)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        webserverPanel.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.webserverPanel.border.title"))); // NOI18N

        Mnemonics.setLocalizedText(webserverPortLabel, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.webserverPortLabel.text")); // NOI18N

        Mnemonics.setLocalizedText(restDirectoryLabel, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.restDirectoryLabel.text")); // NOI18N

        restDirectoryText.setText(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.restDirectoryText.text")); // NOI18N

        Mnemonics.setLocalizedText(restDirectoryButton, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.restDirectoryButton.text")); // NOI18N
        restDirectoryButton.setMargin(new Insets(2, 0, 2, 0));
        restDirectoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                restDirectoryButtonActionPerformed(evt);
            }
        });

        GroupLayout webserverPanelLayout = new GroupLayout(webserverPanel);
        webserverPanel.setLayout(webserverPanelLayout);
        webserverPanelLayout.setHorizontalGroup(webserverPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(webserverPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(webserverPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(webserverPanelLayout.createSequentialGroup()
                        .addComponent(restDirectoryLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restDirectoryText, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                    .addGroup(webserverPanelLayout.createSequentialGroup()
                        .addComponent(webserverPortLabel)
                        .addGap(107, 107, 107)
                        .addComponent(webserverPortSpinner, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restDirectoryButton)
                .addGap(4, 4, 4))
        );
        webserverPanelLayout.setVerticalGroup(webserverPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(webserverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(webserverPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(webserverPortLabel)
                    .addComponent(webserverPortSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(webserverPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(restDirectoryLabel)
                    .addComponent(restDirectoryText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(restDirectoryButton))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        notebookPanel.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.notebookPanel.border.title_1"))); // NOI18N

        Mnemonics.setLocalizedText(notebookDirectoryLabel, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.notebookDirectoryLabel.text")); // NOI18N

        notebookDirectoryText.setText(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.notebookDirectoryText.text")); // NOI18N

        Mnemonics.setLocalizedText(notebookDirectoryButton, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.notebookDirectoryButton.text")); // NOI18N
        notebookDirectoryButton.setMargin(new Insets(2, 0, 2, 0));
        notebookDirectoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                notebookDirectoryButtonActionPerformed(evt);
            }
        });

        downloadPythonClientCheckBox.setSelected(true);
        Mnemonics.setLocalizedText(downloadPythonClientCheckBox, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.downloadPythonClientCheckBox.text")); // NOI18N

        GroupLayout notebookPanelLayout = new GroupLayout(notebookPanel);
        notebookPanel.setLayout(notebookPanelLayout);
        notebookPanelLayout.setHorizontalGroup(notebookPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(notebookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notebookPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(notebookPanelLayout.createSequentialGroup()
                        .addComponent(notebookDirectoryLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notebookDirectoryText)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notebookDirectoryButton))
                    .addGroup(notebookPanelLayout.createSequentialGroup()
                        .addComponent(downloadPythonClientCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        notebookPanelLayout.setVerticalGroup(notebookPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(notebookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notebookPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(notebookDirectoryLabel)
                    .addComponent(notebookDirectoryText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(notebookDirectoryButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downloadPythonClientCheckBox)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveLocationPanel.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.saveLocationPanel.border.title"))); // NOI18N

        rememberSaveLocationCheckBox.setSelected(true);
        Mnemonics.setLocalizedText(rememberSaveLocationCheckBox, NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.rememberSaveLocationCheckBox.text")); // NOI18N
        rememberSaveLocationCheckBox.setActionCommand(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.rememberSaveLocationCheckBox.actionCommand")); // NOI18N
        rememberSaveLocationCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rememberSaveLocationCheckBoxActionPerformed(evt);
            }
        });

        GroupLayout saveLocationPanelLayout = new GroupLayout(saveLocationPanel);
        saveLocationPanel.setLayout(saveLocationPanelLayout);
        saveLocationPanelLayout.setHorizontalGroup(saveLocationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(saveLocationPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rememberSaveLocationCheckBox)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        saveLocationPanelLayout.setVerticalGroup(saveLocationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(saveLocationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rememberSaveLocationCheckBox)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(startupPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(autosavePanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userDirectoryLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userDirectoryText)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userDirectoryButton))
                    .addComponent(displayPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(webserverPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notebookPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveLocationPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(userDirectoryLabel)
                    .addComponent(userDirectoryButton)
                    .addComponent(userDirectoryText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(autosavePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startupPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webserverPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notebookPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveLocationPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayPanel.getAccessibleContext().setAccessibleName(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.displayPanel.AccessibleContext.accessibleName")); // NOI18N
        notebookPanel.getAccessibleContext().setAccessibleName(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.notebookPanel.AccessibleContext.accessibleName")); // NOI18N
        saveLocationPanel.getAccessibleContext().setAccessibleName(NbBundle.getMessage(ApplicationOptionsPanel.class, "ApplicationOptionsPanel.saveLocationPanel.AccessibleContext.accessibleName")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void userDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_userDirectoryButtonActionPerformed
    {//GEN-HEADEREND:event_userDirectoryButtonActionPerformed
        final JFileChooser fc = new JFileChooser(System.getProperty("user.home"));
        final String dir = userDirectoryText.getText().trim();
        if (!dir.isEmpty()) {
            fc.setSelectedFile(new File(dir));
        }
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fc.showDialog(this, "Select CONSTELLATION directory") == JFileChooser.APPROVE_OPTION) {
            final String fnam = fc.getSelectedFile().getPath();
            userDirectoryText.setText(fnam);
        }
    }//GEN-LAST:event_userDirectoryButtonActionPerformed

    private void autosaveCheckBoxActionPerformed(ActionEvent evt)//GEN-FIRST:event_autosaveCheckBoxActionPerformed
    {//GEN-HEADEREND:event_autosaveCheckBoxActionPerformed
        autosaveSpinner.setEnabled(autosaveCheckBox.isSelected());
    }//GEN-LAST:event_autosaveCheckBoxActionPerformed

    private void freezeGraphCheckBoxActionPerformed(ActionEvent evt)//GEN-FIRST:event_freezeGraphCheckBoxActionPerformed
    {//GEN-HEADEREND:event_freezeGraphCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_freezeGraphCheckBoxActionPerformed

    private void notebookDirectoryButtonActionPerformed(ActionEvent evt)//GEN-FIRST:event_notebookDirectoryButtonActionPerformed
    {//GEN-HEADEREND:event_notebookDirectoryButtonActionPerformed
        final JFileChooser fc = new JFileChooser(System.getProperty("user.home"));
        final String dir = notebookDirectoryText.getText().trim();
        if (!dir.isEmpty()) {
            fc.setSelectedFile(new File(dir));
        }
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fc.showDialog(this, "Select Jupyter notebook directory") == JFileChooser.APPROVE_OPTION) {
            final String fnam = fc.getSelectedFile().getPath();
            notebookDirectoryText.setText(fnam);
        }
    }//GEN-LAST:event_notebookDirectoryButtonActionPerformed

    private void restDirectoryButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_restDirectoryButtonActionPerformed
        final JFileChooser fc = new JFileChooser(System.getProperty("user.home"));
        final String dir = restDirectoryText.getText().trim();
        if (!dir.isEmpty()) {
            fc.setSelectedFile(new File(dir));
        }
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fc.showDialog(this, "Select REST directory") == JFileChooser.APPROVE_OPTION) {
            final String fnam = fc.getSelectedFile().getPath();
            restDirectoryText.setText(fnam);
        }
    }//GEN-LAST:event_restDirectoryButtonActionPerformed

    private void rememberSaveLocationCheckBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rememberSaveLocationCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberSaveLocationCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCheckBox autosaveCheckBox;
    private JLabel autosaveLabel;
    private JPanel autosavePanel;
    private JSpinner autosaveSpinner;
    private JPanel displayPanel;
    private JCheckBox downloadPythonClientCheckBox;
    private JCheckBox freezeGraphCheckBox;
    private JButton notebookDirectoryButton;
    private JLabel notebookDirectoryLabel;
    private JTextField notebookDirectoryText;
    private JPanel notebookPanel;
    private JCheckBox rememberSaveLocationCheckBox;
    private JButton restDirectoryButton;
    private JLabel restDirectoryLabel;
    private JTextField restDirectoryText;
    private JPanel saveLocationPanel;
    private JPanel startupPanel;
    private JCheckBox startupTutorialCheckbox;
    private JCheckBox startupWelcomeCheckbox;
    private JButton userDirectoryButton;
    private JLabel userDirectoryLabel;
    private JTextField userDirectoryText;
    private JPanel webserverPanel;
    private JLabel webserverPortLabel;
    private JSpinner webserverPortSpinner;
    // End of variables declaration//GEN-END:variables
}
