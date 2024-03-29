/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Community;
import Model.House;
import Model.Patient;
import Model.PatientDirectory;
import Model.SystemModel;
import CommonUtility.Validator;
import Model.Encounter;
import Model.VitalSign;
import java.time.LocalDateTime;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author hazel
 */
public class ManagePatients extends javax.swing.JPanel {
     SystemModel sys;
    /**
     * Creates new form ManagePatients
     */
    public ManagePatients( SystemModel sys) {
        initComponents();
        this.sys = sys;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientIdBox = new javax.swing.JTextField();
        lblTemperature1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grp1Table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        lblTemperature1.setText("Patient Id:");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Manage Patient Details");

        grp1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Name", "Age", "Address", "Temperature", "Blood Pressure", "Pulse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grp1Table.setRowHeight(20);
        jScrollPane3.setViewportView(grp1Table);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTemperature1)
                        .addGap(18, 18, 18)
                        .addComponent(patientIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature1)
                    .addComponent(patientIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Validator util = new Validator();
        String message="";
         if(!(util.isNotNullAndEmpty(patientIdBox.getText()) && util.isNumeric(patientIdBox.getText()))){
             message="Please enter valid Id";
         }
         if(!"".equals(message)){
               JOptionPane.showMessageDialog(this, message,"Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
                
         Patient patient = sys.getPatientDirectory().getPatient(patientIdBox.getText());
         if(patient != null){
             DefaultTableModel dtm1 = (DefaultTableModel) grp1Table.getModel();
             dtm1.setRowCount(0);
             Object row [] = new Object[7];
             row[0] = patient.getPatientId();
             row[1] = patient.getName();
             row[2] = patient.getAge();
             String patientHome = "House:"+patient.getHouse().getHouseNumber()+",Community: "+patient.getHouse().getCommunity().getName();
             JComboBox<String> comComboBox = new javax.swing.JComboBox<>();
             row[3] = patientHome;
             row[4]=patient.getHistory().getLastEncounter().getVitalSign().getTemperature();
             row[5]=patient.getHistory().getLastEncounter().getVitalSign().getBloodPressure();
             row[6]=patient.getHistory().getLastEncounter().getVitalSign().getPulse();
            
             for(Community comm: sys.getCity().getCommunities()){
                for(House h: comm.getHouses()){
                    String home = "House:"+h.getHouseNumber()+",Community: "+comm.getName();                    
                    comComboBox.addItem(home);                 
                }
             }  
             TableColumn sportColumn = grp1Table.getColumnModel().getColumn(3);
             sportColumn.setCellEditor(new DefaultCellEditor(comComboBox));
             dtm1.addRow(row);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:(
         if(!grp1Table.isRowSelected(0)){
            JOptionPane.showMessageDialog(this, "Please select record to update","Error", JOptionPane.ERROR_MESSAGE);
            return;
         }
        PatientDirectory patientList = sys.getPatientDirectory();
        Patient p = null;
        Validator util = new Validator();
        DefaultTableModel dtm1 = (DefaultTableModel) grp1Table.getModel();
        String patientId = (String)dtm1.getValueAt(0, 0);
        String name =(String) dtm1.getValueAt(0, 1);
        String age = (String) dtm1.getValueAt(0, 2);
        
        p = patientList.getPatient(patientId);
        String homeSelected = (String)dtm1.getValueAt(0, 3);
        
        String message = "";
        if(!(util.isNotNullAndEmpty(name) && util.isAlphabetic(name)))
                message = "Please enter a valid name."; 
        
        if(!(util.isNotNullAndEmpty(age) && util.isNumeric(age)))
            message = "Please enter a valid age.";   

        if(!"".equals(message)){
               JOptionPane.showMessageDialog(this, message,"Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
                
        p.setAge(age);
        p.setName(name);
        homeSelected = homeSelected.substring(6,7);
        p.setHouse(sys.getCity().getHouse(homeSelected));
        
        JOptionPane.showMessageDialog(null, "Patient Successfully Updated");
        dtm1.setRowCount(0);
        patientIdBox.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if(!grp1Table.isRowSelected(0)){
            JOptionPane.showMessageDialog(this, "Please select record to delete","Error", JOptionPane.ERROR_MESSAGE);
            return;
         }
        DefaultTableModel dtm1 = (DefaultTableModel) grp1Table.getModel();
        String patientId = (String)dtm1.getValueAt(0, 2);
        Patient p =  sys.getPatientDirectory().getPatient(patientId);
        sys.getPatientDirectory().getList().remove(p);
        JOptionPane.showMessageDialog(null, "Patient Successfully Deleted");
        dtm1.setRowCount(0);
        patientIdBox.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable grp1Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTemperature1;
    private javax.swing.JTextField patientIdBox;
    // End of variables declaration//GEN-END:variables
}
