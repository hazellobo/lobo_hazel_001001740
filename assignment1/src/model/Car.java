/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author hazel
 */
public class Car {
    private String brand;
    private String model;
    private String color;
    private String year;
    private String engineNo;
    private String seatsNo;
    private String licensePlates;
    private String ownerName;
    private String ownerTelephoneNo;
    private String ownerEmailAddresses;
    private String ownerDriverLicense;
    private String ownerSocialSecurityNo;
    private String ownerAddress;
    private String warrantyYear;
    private String photoPath;
    private ImageIcon photo;
    private ArrayList<Service> records;

    public ArrayList<Service> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Service> records) {
        this.records = records;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(String seatsNo) {
        this.seatsNo = seatsNo;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerTelephoneNo() {
        return ownerTelephoneNo;
    }

    public void setOwnerTelephoneNo(String ownerTelephoneNo) {
        this.ownerTelephoneNo = ownerTelephoneNo;
    }

    public String getOwnerEmailAddresses() {
        return ownerEmailAddresses;
    }

    public void setOwnerEmailAddresses(String ownerEmailAddresses) {
        this.ownerEmailAddresses = ownerEmailAddresses;
    }

    public String getOwnerDriverLicense() {
        return ownerDriverLicense;
    }

    public void setOwnerDriverLicense(String ownerDriverLicense) {
        this.ownerDriverLicense = ownerDriverLicense;
    }

    public String getOwnerSocialSecurityNo() {
        return ownerSocialSecurityNo;
    }

    public void setOwnerSocialSecurityNo(String ownerSocialSecurityNo) {
        this.ownerSocialSecurityNo = ownerSocialSecurityNo;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(String warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    public String getPhotoPath(){
        return photoPath;
    }
    
    public void setPhotoPath(String photoPath){
        this.photoPath=photoPath;
    }
    
}
