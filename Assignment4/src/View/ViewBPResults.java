/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package View;

import Model.Community;
import Model.Encounter;
import Model.Patient;
import Model.SystemModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hazel
 */
public class ViewBPResults extends javax.swing.JPanel {
    SystemModel sys;

    /** Creates new form DisplayBPStats
     * @param sys */
    public ViewBPResults(SystemModel sys) {
        initComponents();
       
        this.sys = sys;
        createCommunityList();
    }

    private void createCommunityList(){
        for(Community commObj: sys.getCity().getCommunities()){
            comComboBox.addItem(commObj.getName());
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        resultPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grp3Table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grp2Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        grp1Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ageGrp2Nim = new javax.swing.JTextField();
        ageGrp3Num = new javax.swing.JTextField();
        ageGrp1Num = new javax.swing.JTextField();
        viewStats = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Select Community:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Blood Pressure Results");

        resultPanel.setBackground(new java.awt.Color(0, 153, 153));

        grp3Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "House", "Patient Id", "BP Recorded"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(grp3Table);

        jLabel4.setText("Age Group 3 : 40 and above");

        grp2Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "House", "Patient Id", "BP Recorded"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(grp2Table);

        grp1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "House Id", "Patient Id", "BP Recorded"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(grp1Table);

        jLabel2.setText("Age Group 2:  18-40");

        jLabel3.setText("Age Group 1: 0-18");

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(ageGrp3Num, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ageGrp2Nim, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(resultPanelLayout.createSequentialGroup()
                                .addComponent(ageGrp1Num, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(618, 618, 618)
                                .addComponent(jLabel6))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6))
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageGrp1Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(ageGrp2Nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageGrp3Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        viewStats.setText("View Results");
        viewStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel9)))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(comComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(viewStats, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewStats, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStatsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm1 = (DefaultTableModel) grp1Table.getModel();
        dtm1.setRowCount(0);
        DefaultTableModel dtm2 = (DefaultTableModel) grp2Table.getModel();
        dtm2.setRowCount(0);
        DefaultTableModel dtm3 = (DefaultTableModel) grp3Table.getModel();
        dtm3.setRowCount(0);
        //Age groups 0-23 , 24-41, 41 and above
        String communitySelected = (String)comComboBox.getSelectedItem();
        JTable table = null;
        Object row [] = new Object[7];
        DefaultTableModel dtm = null;

        int grp1 = 0;
        int grp2 = 0;
        int grp3 = 0;

        for(Patient patient: sys.getPatientDirectory().getList()){
            int groupNum = 0;
            if(patient.getHouse().getCommunity().getName().equalsIgnoreCase(communitySelected)){
                int age = patient.getAge();
                if(0 < age && age < 18 ){
                    table = grp1Table;    groupNum = 1;
                }else if(17 < age && age < 40 ){
                    table = grp2Table;
                    groupNum =2;
                }else if(age > 40 ){
                    table = grp3Table;
                    groupNum = 3;
                }
                dtm = (DefaultTableModel) table.getModel();        

                row[0] = patient.getName();
                row[1] = patient.getAge();
                row[2] = patient.getHouse().getHouseNumber();
                row[3] = patient.getPatientId();
                
                Encounter visit = patient.getHistory().getLastEncounter();
                if(visit != null){
                double bp = visit.getVitalSign().getBloodPressure();
                row[4] = visit.getVitalSign().getBloodPressure();
               
                   
                   row[5] = String.valueOf(bp);
                    if(110 < bp && bp <=120){
                        row[6] = "NORMAL BP";
                    }else if(110 >= bp ){
                          row[6] = "ABNORMAL - LOW BP";
                    switch (groupNum) {
                        case 1:
                            grp1++;
                            break;
                        case 2:
                            grp2++;
                            break;
                        case 3:
                            grp3++;
                            break;
                    }
                    }else if(bp > 120){
                        row[6] = "ABNORMAL - HIGH BP";
                    switch (groupNum) {
                        case 1:
                            grp1++;
                            break;
                        case 2:
                            grp2++;
                            break;
                        case 3:
                            grp3++;
                            break;
                    }
 }
                }else{
                    row[4]= "NO BP RECORDED"; 
                }
                dtm.addRow(row);
            }     
        }     
        ageGrp1Num.setText("Abnormal Count: "+String.valueOf(grp1));
        ageGrp2Nim.setText("Abnormal Count: "+String.valueOf(grp2));
        ageGrp3Num.setText("Abnormal Count: "+String.valueOf(grp3));
    }//GEN-LAST:event_viewStatsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageGrp1Num;
    private javax.swing.JTextField ageGrp2Nim;
    private javax.swing.JTextField ageGrp3Num;
    private javax.swing.JComboBox<String> comComboBox;
    private javax.swing.JTable grp1Table;
    private javax.swing.JTable grp2Table;
    private javax.swing.JTable grp3Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JButton viewStats;
    // End of variables declaration//GEN-END:variables

}
