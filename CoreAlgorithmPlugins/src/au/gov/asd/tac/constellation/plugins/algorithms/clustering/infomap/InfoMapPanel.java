/*
 * Copyright 2010-2021 Australian Signals Directorate
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
package au.gov.asd.tac.constellation.plugins.algorithms.clustering.infomap;

import au.gov.asd.tac.constellation.plugins.algorithms.clustering.infomap.io.Config;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author algol
 */
public class InfoMapPanel extends javax.swing.JPanel {

    /**
     * Creates new form InfoMapPanel
     */
    public InfoMapPanel() {
        initComponents();
    }

    public Config getConfig() {
        final Config config = new Config();

        // Connection type.
        if (rbTransactions.isSelected()) {
            config.setConnectionType(Config.ConnectionType.TRANSACTIONS);
        } else if (rbEdges.isSelected()) {
            config.setConnectionType(Config.ConnectionType.EDGES);
        } else if (rbLinks.isSelected()) {
            config.setConnectionType(Config.ConnectionType.LINKS);
        }

        // Dynamic type.
        if (rbDirected.isSelected()) {
            config.setDirected(true);
        } else if (rbUndirdir.isSelected()) {
            config.setUndirdir(true);
        } else if (rbOutdirdir.isSelected()) {
            config.setOutdirdir(true);
        } else if (rbRawdir.isSelected()) {
            config.setRawdir(true);
        }

        config.setOptimizationLevel(cbOptLevel.getSelectedIndex());
        config.setFastHierarchicalSolution(cbHierarchical.getSelectedIndex());
        config.setNumTrials(((SpinnerNumberModel) sNumTrials.getModel()).getNumber().intValue());

        return config;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbLinks = new javax.swing.JRadioButton();
        rbEdges = new javax.swing.JRadioButton();
        rbTransactions = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbUndirected = new javax.swing.JRadioButton();
        rbDirected = new javax.swing.JRadioButton();
        rbUndirdir = new javax.swing.JRadioButton();
        rbOutdirdir = new javax.swing.JRadioButton();
        rbRawdir = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbOptLevel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbHierarchical = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sNumTrials = new javax.swing.JSpinner();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.jPanel1.border.title"))); // NOI18N

        rbLinks.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(rbLinks, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.rbLinks.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rbEdges, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.rbEdges.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rbTransactions, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.rbTransactions.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbLinks)
                .addGap(18, 18, 18)
                .addComponent(rbEdges)
                .addGap(18, 18, 18)
                .addComponent(rbTransactions)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbLinks)
                .addComponent(rbEdges)
                .addComponent(rbTransactions))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.jPanel2.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rbUndirected, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.rbUndirected.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rbDirected, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.rbDirected.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rbUndirdir, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.rbUndirdir.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rbOutdirdir, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.rbOutdirdir.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rbRawdir, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.rbRawdir.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbUndirected)
                    .addComponent(rbDirected)
                    .addComponent(rbUndirdir)
                    .addComponent(rbOutdirdir)
                    .addComponent(rbRawdir))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbUndirected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDirected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbUndirdir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOutdirdir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRawdir))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.jPanel3.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.jLabel1.text")); // NOI18N

        cbOptLevel.setModel(new DefaultComboBoxModel<String>(new String[]{"Full coarse-tune", "Fast coarse-tune", "No tuning", "No aggregation or tuning"}));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.jLabel2.text")); // NOI18N

        cbHierarchical.setModel(new DefaultComboBoxModel<String>(new String[]{"Normal", "Top modules fast", "All fast levels", "Skip recursive"}));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(InfoMapPanel.class, "InfoMapPanel.jLabel3.text")); // NOI18N

        sNumTrials.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOptLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sNumTrials)
                            .addComponent(cbHierarchical, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbOptLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbHierarchical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sNumTrials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbHierarchical;
    private javax.swing.JComboBox<String> cbOptLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbDirected;
    private javax.swing.JRadioButton rbEdges;
    private javax.swing.JRadioButton rbLinks;
    private javax.swing.JRadioButton rbOutdirdir;
    private javax.swing.JRadioButton rbRawdir;
    private javax.swing.JRadioButton rbTransactions;
    private javax.swing.JRadioButton rbUndirdir;
    private javax.swing.JRadioButton rbUndirected;
    private javax.swing.JSpinner sNumTrials;
    // End of variables declaration//GEN-END:variables
}
