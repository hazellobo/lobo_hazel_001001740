/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author hazel
 */
public class VitalSignRecord {
    
    private ArrayList<VitalSign> vitalSignRecord;

    public VitalSignRecord() {
        vitalSignRecord = new ArrayList<>();
    }
    
    public ArrayList<VitalSign> getvitalSignRecord() {
        return vitalSignRecord;
    }

    public void setvitalSignRecord(ArrayList<VitalSign> vitalSignRecord) {
        this.vitalSignRecord = vitalSignRecord;
    }
    
    //adds VitalSigns to VitalSign Records
    public VitalSign addVitals(){
         VitalSign vs = new VitalSign();
         vitalSignRecord.add(vs);
         return vs;
     }   
     
    //deletes the selected vitalSign from VitalSignRecord
    public void deleteVitals(VitalSign v){
         vitalSignRecord.remove(v);
     }
     
     public void setVitals(int index, VitalSign v){
         vitalSignRecord.set(index, v);
     }
        
}
