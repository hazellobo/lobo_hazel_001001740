/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarCatalog;
import static ui.CreateJPanel.isAlphaNumeric;
import static ui.CreateJPanel.isAlphabetic;
import static ui.CreateJPanel.isNumeric;

/**
 *
 * @author hazel
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    CarCatalog catalog;

    public SearchJPanel(CarCatalog catalog) {
        initComponents();
        this.catalog=catalog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarDetails = new javax.swing.JTable();
        drp = new javax.swing.JComboBox<>();
        txtDrp = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        txtMax = new javax.swing.JTextField();
        lblExpired = new javax.swing.JLabel();
        btnDrp = new javax.swing.JButton();
        btnAvail = new javax.swing.JButton();
        lblAvail = new javax.swing.JLabel();
        btnExpired = new javax.swing.JButton();
        btnSeats = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        lblTableCount = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        btnFirstAvail = new javax.swing.JButton();
        lblAvail1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        tblCarDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Brand", "Model", "Manufacture Year", "Seats No", "City", "Expiry Date", "Availability", "Updated Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarDetails);

        drp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Location", "Manufacturer", "Manufacture Year", "Model Number", "Serial Number" }));
        drp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpActionPerformed(evt);
            }
        });

        txtDrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrpActionPerformed(evt);
            }
        });

        lblSeats.setText("Seats");

        lblMin.setText("Min");

        lblMax.setText("Max");

        txtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinActionPerformed(evt);
            }
        });

        lblExpired.setText("Expired Certificates");

        btnDrp.setText("Search");
        btnDrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrpActionPerformed(evt);
            }
        });

        btnAvail.setText("Search");
        btnAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailActionPerformed(evt);
            }
        });

        lblAvail.setText("Available Cars");

        btnExpired.setText("Search");
        btnExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpiredActionPerformed(evt);
            }
        });

        btnSeats.setText("Search");
        btnSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeatsActionPerformed(evt);
            }
        });

        lblCount.setText("Count");

        lblTitle1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Filter Criteria");

        lblTitle2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Search Cars");

        btnFirstAvail.setText("Search");
        btnFirstAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailActionPerformed(evt);
            }
        });

        lblAvail1.setText("First available car");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCount)
                .addGap(36, 36, 36)
                .addComponent(lblTableCount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSeats)
                                .addGap(18, 18, 18)
                                .addComponent(lblMin)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMax)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSeats))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(drp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDrp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDrp))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAvail1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFirstAvail)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAvail)
                                        .addGap(51, 51, 51)
                                        .addComponent(btnAvail))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblExpired)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExpired)))
                                .addGap(104, 104, 104)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAvail1)
                            .addComponent(btnFirstAvail))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(drp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDrp))
                            .addGap(46, 46, 46)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAvail)
                            .addComponent(btnAvail))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExpired)
                            .addComponent(btnExpired))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(lblMin)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMax)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeats))
                .addGap(23, 23, 23)
                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCount)
                    .addComponent(lblTableCount, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblCarDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarDetailsMouseClicked

    }//GEN-LAST:event_tblCarDetailsMouseClicked

    private void btnDrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrpActionPerformed
        if(txtDrp.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"Error! Please enter dropdown text value");
        }
        ArrayList<Car> carList=catalog.getCarList();
        ArrayList<Car> searchList=new ArrayList<>();
        
        String drpSelected=drp.getSelectedItem().toString();
        for(Car car: carList) {
            
            if(drpSelected.equals("Location")) {
            String city = txtDrp.getText();
            if(!isAlphabetic(city)){
                JOptionPane.showMessageDialog(this,"Error! Please enter valid location");
                return;
            }
            if(city.trim().equalsIgnoreCase(car.getCity())){
            searchList.add(car);
                }
            }
            
            if(drpSelected.equalsIgnoreCase("Manufacturer")){
               String brand = txtDrp.getText();
               if(!isAlphaNumeric(brand.trim())){
                JOptionPane.showMessageDialog(this,"Error! Please enter valid manufacturer");
                return;
                }
                if(brand.trim().equalsIgnoreCase(car.getBrand())){
                searchList.add(car);
                }
           }

            if(drpSelected.equals("Manufacture Year")) {
                String year = txtDrp.getText();
                if(year.length()!=4 || !isNumeric(year)){
                    JOptionPane.showMessageDialog(this,"Error! Please enter valid year");
                    return;
                 }
                if(year.trim().equalsIgnoreCase(car.getYear())){
                searchList.add(car);
                }
            }

            if(drpSelected.equals("Model Number")) {
            String model = txtDrp.getText();
            if(!isAlphaNumeric(model.trim())){
                JOptionPane.showMessageDialog(this,"Error! Please enter valid model");
                return;
             }
            if(model.trim().equalsIgnoreCase(car.getModel())){
            searchList.add(car);
                }
            }
            
            if(drpSelected.equals("Serial Number")) {
            String serial = txtDrp.getText();
            if(!isNumeric(serial.trim())){
                JOptionPane.showMessageDialog(this,"Error! Please enter valid serial No");
                return;
             }
            if(serial.trim().equalsIgnoreCase(String.valueOf(car.getSerialNo()))){
            searchList.add(car);
                }
            }
        }
            displayCarDetails(searchList);     
    }//GEN-LAST:event_btnDrpActionPerformed

    private void btnAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailActionPerformed
        ArrayList<Car> carList=catalog.getCarList();
        ArrayList<Car> searchList=new ArrayList<>();
        for(Car car: carList){
            if(car.isAvailable()){
                searchList.add(car);
            }
        }
        displayCarDetails(searchList);   
    }//GEN-LAST:event_btnAvailActionPerformed

    private void btnExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpiredActionPerformed
        ArrayList<Car> carList=catalog.getCarList();
        ArrayList<Car> searchList=new ArrayList<>();
        
        Date currentDate=new Date();
        DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String currentStrDate = sdf.format(currentDate);
        System.out.println("today: " + currentStrDate);

        for(Car car: carList){
            try {
                if(sdf.parse(car.getExpiryDate()).compareTo(sdf.parse(currentStrDate))<0
                        || sdf.parse(car.getExpiryDate()).compareTo(sdf.parse(currentStrDate))==0){
                    searchList.add(car);
                }
            } catch (ParseException ex) {
                Logger.getLogger(SearchJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        displayCarDetails(searchList);
    }//GEN-LAST:event_btnExpiredActionPerformed
      
    private void btnSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeatsActionPerformed
        if(txtMin.getText().equalsIgnoreCase("")|| txtMax.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"Error! Min/Max fields cannot be empty");
            return;
        }else if(!CreateJPanel.isNumeric(txtMin.getText()) 
                ||!CreateJPanel.isNumeric(txtMax.getText())){
            JOptionPane.showMessageDialog(this,"Error! Min/Max fields should be numeric");
            return;
        }
            
        ArrayList<Car> carList = catalog.getCarList();
        ArrayList<Car> searchList = new ArrayList<>();
        
        String min = txtMin.getText();
        String max = txtMax.getText();
        
        for (Car car : carList){
            int seatNo=Integer.parseInt(car.getSeatsNo());
            if (seatNo >= Integer.parseInt(min) 
                    && seatNo <= Integer.parseInt(max)){
                searchList.add(car);
            }
        }
        displayCarDetails(searchList);
                   
    }//GEN-LAST:event_btnSeatsActionPerformed

    private void drpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drpActionPerformed

    private void txtMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinActionPerformed

    private void btnFirstAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailActionPerformed
        ArrayList<Car> carList=catalog.getCarList();
        ArrayList<Car> searchList=new ArrayList<>();
        for(Car car: carList){
            if(car.isAvailable()){
                searchList.add(car);
                break;
            }
        }
        displayCarDetails(searchList);
    }//GEN-LAST:event_btnFirstAvailActionPerformed

    private void txtDrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrpActionPerformed

    private void displayCarDetails(ArrayList<Car> carList) {
           DefaultTableModel model=(DefaultTableModel) tblCarDetails.getModel();
           Object rowData[] =new Object[9];
           model.setRowCount(0);
           for(Car car: carList){
               rowData[0]=car.getSerialNo();
               rowData[1]=car.getBrand();
               rowData[2]=car.getModel();
               rowData[3]=car.getYear();
               rowData[4]=car.getSeatsNo();
               rowData[5]=car.getCity();
               rowData[6]=car.getExpiryDate();
               rowData[7]=car.isAvailable();
               rowData[8]=car.getUpdatedTime();
               model.addRow(rowData);
           }
           lblTableCount.setText(String.valueOf(tblCarDetails.getRowCount()));
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvail;
    private javax.swing.JButton btnDrp;
    private javax.swing.JButton btnExpired;
    private javax.swing.JButton btnFirstAvail;
    private javax.swing.JButton btnSeats;
    private javax.swing.JComboBox<String> drp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvail;
    private javax.swing.JLabel lblAvail1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblExpired;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblTableCount;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JTable tblCarDetails;
    private javax.swing.JTextField txtDrp;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
