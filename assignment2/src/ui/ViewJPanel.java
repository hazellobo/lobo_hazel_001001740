/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarCatalog;
import static ui.CreateJPanel.isAlphaNumeric;
import static ui.CreateJPanel.isAlphabetic;
import static ui.CreateJPanel.isNumeric;
import static ui.CreateJPanel.isValidDate;

/**
 *
 * @author hazel
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel1
     */
    CarCatalog catalog;
    public ViewJPanel(CarCatalog catalog) {
        initComponents();
        this.catalog=catalog;
        displayCarDetails();
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
        chkAvail = new javax.swing.JCheckBox();
        txtCity = new javax.swing.JTextField();
        lblSeatsNo1 = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        txtExpiryDate = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        lblExpiryDate = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtYear = new javax.swing.JTextField();
        txtSeatsNo = new javax.swing.JTextField();
        lblSeatsNo = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblTimeStamp = new javax.swing.JLabel();
        lblLastUpdate = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        lblTableCount = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();

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

        chkAvail.setBackground(new java.awt.Color(153, 153, 153));
        chkAvail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkAvail.setText("Availability");
        chkAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAvailActionPerformed(evt);
            }
        });

        txtCity.setName("seatsNo"); // NOI18N

        lblSeatsNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSeatsNo1.setText("City");

        lblBrand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBrand.setText("Brand");

        txtExpiryDate.setName("seatsNo"); // NOI18N

        lblModel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblModel.setText("Model");

        lblExpiryDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblExpiryDate.setText("Expiry Date");

        txtBrand.setName("brand"); // NOI18N
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Cars");

        txtModel.setName("model"); // NOI18N
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtYear.setName("year"); // NOI18N
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        txtSeatsNo.setName("seatsNo"); // NOI18N
        txtSeatsNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsNoActionPerformed(evt);
            }
        });

        lblSeatsNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSeatsNo.setText("Seat No.");

        lblYear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblYear.setText("Manufacture Year");

        lblLastUpdate.setText("Last Update");

        lblCount.setText("Count");

        lblTitle1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Update Cars");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSeatsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSeatsNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeatsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkAvail)
                                .addGap(122, 122, 122)
                                .addComponent(btnUpdate))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLastUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTableCount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBrand, txtCity, txtExpiryDate, txtModel, txtSeatsNo, txtYear});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLastUpdate)
                    .addComponent(lblTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCount)
                    .addComponent(lblTableCount, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeatsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeatsNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeatsNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAvail)
                    .addComponent(btnUpdate))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAvailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAvailActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tblCarDetails.getModel();
        if(tblCarDetails.getSelectedRowCount()==1){
            int serial = (int) tblModel.getValueAt(tblCarDetails.getSelectedRow(), 0);        
            String brand=txtBrand.getText();
            String model=txtModel.getText();
            String year=txtYear.getText();
            String seats=txtSeatsNo.getText();
            String city=txtCity.getText();
            String expire=txtExpiryDate.getText();
            boolean available=chkAvail.isSelected();

            
        if("".equals(seats) || "".equals(brand) || "".equals(model)
                || "".equals(year) || "".equals(city) || "".equals(expire)
                || "".equals(available)){
            JOptionPane.showMessageDialog(this,"Error! Please enter all details");
            return;
        }
        
        if(!isAlphaNumeric(brand.trim())){
           JOptionPane.showMessageDialog(this,"Error! Please enter valid brand");
           return;
        }
        
        if(!isAlphaNumeric(model.trim())){
           JOptionPane.showMessageDialog(this,"Error! Please enter valid model");
           return;
        }
        
        if(year.length()!=4 || !isNumeric(year)){
           JOptionPane.showMessageDialog(this,"Error! Please enter valid year");
           return;
        }
        
        if(!isNumeric((seats)) || "0".equals(seats)){
           JOptionPane.showMessageDialog(this,"Error! Please enter valid seat number");
           return;
        }
        
        if(!isAlphabetic(city)){
            JOptionPane.showMessageDialog(this,"Error! Please enter valid city");
           return;
        }
        
        if(!isValidDate(expire)){
            JOptionPane.showMessageDialog(this,"Error! Please enter valid date");
           return;
        }
        
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now=LocalDateTime.now();
            
            Car car=catalog.addNewCar();
            car.setSerialNo(serial);
            car.setBrand(brand);
            car.setModel(model);
            car.setYear(year);
            car.setSeatsNo(seats);
            car.setCity(city);
            car.setExpiryDate(expire);
            car.setAvailable(available);
            car.setUpdatedTime(dtf.format(now));
            catalog.setLastUpdateTime(dtf.format(now));
            
            tblModel.setValueAt(brand, tblCarDetails.getSelectedRow(), 1);
            tblModel.setValueAt(model, tblCarDetails.getSelectedRow(), 2);
            tblModel.setValueAt(year, tblCarDetails.getSelectedRow(), 3);
            tblModel.setValueAt(seats, tblCarDetails.getSelectedRow(), 4);
            tblModel.setValueAt(city, tblCarDetails.getSelectedRow(), 5);
            tblModel.setValueAt(expire, tblCarDetails.getSelectedRow(), 6);
            tblModel.setValueAt(available, tblCarDetails.getSelectedRow(), 7);
            tblModel.setValueAt(dtf.format(now), tblCarDetails.getSelectedRow(), 8);
            lblTableCount.setText(String.valueOf(tblCarDetails.getRowCount()));
            lblTimeStamp.setText(dtf.format(now));
            
            JOptionPane.showMessageDialog(this, "Success! Car details updated successfully");
       }else{
           if(tblCarDetails.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this, "Error! No details available");
           }else{
               JOptionPane.showMessageDialog(this, "Error! Please select row to update");
           }
       }
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtSeatsNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsNoActionPerformed

    private void tblCarDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarDetailsMouseClicked
        // TODO add your handling code here:
       DefaultTableModel tblModel=(DefaultTableModel) tblCarDetails.getModel();
       String brand=tblModel.getValueAt(tblCarDetails.getSelectedRow(), 1).toString();
       String model=tblModel.getValueAt(tblCarDetails.getSelectedRow(), 2).toString();
       String year=tblModel.getValueAt(tblCarDetails.getSelectedRow(), 3).toString();
       String seatNo=tblModel.getValueAt(tblCarDetails.getSelectedRow(), 4).toString();
       String city=tblModel.getValueAt(tblCarDetails.getSelectedRow(), 5).toString();
       String expireDate=tblModel.getValueAt(tblCarDetails.getSelectedRow(), 6).toString();
       
       txtBrand.setText(brand);
       txtModel.setText(model);
       txtYear.setText(year);
       txtSeatsNo.setText(seatNo);
       txtCity.setText(city);
       txtExpiryDate.setText(expireDate);
       chkAvail.setSelected((boolean) tblModel.getValueAt(tblCarDetails.getSelectedRow(),7));
    }//GEN-LAST:event_tblCarDetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkAvail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblExpiryDate;
    private javax.swing.JLabel lblLastUpdate;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSeatsNo;
    private javax.swing.JLabel lblSeatsNo1;
    private javax.swing.JLabel lblTableCount;
    private javax.swing.JLabel lblTimeStamp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTable tblCarDetails;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpiryDate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSeatsNo;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
    private void displayCarDetails() {
           DefaultTableModel model=(DefaultTableModel) tblCarDetails.getModel();
           ArrayList<Car> carList=catalog.getCarList();
           model.setRowCount(0);
           Object rowData[] =new Object[9];
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
           lblTimeStamp.setText(catalog.getLastUpdateTime());
           lblTableCount.setText(String.valueOf(tblCarDetails.getRowCount()));
       }
}