/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommonUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import model.Car;
import model.CarCatalog;

/**
 *
 * @author hazel
 */
public class ReadExcel {    
    
    public void bulkUpload(String path, CarCatalog catalog,int count){
        String line = "";
        String splitBy = ",";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now=LocalDateTime.now();
            while ((line = br.readLine())!= null)
            {
                String[] car = line.split(splitBy);
                String brand = car[0];
                String model = car[1];
                String year = car[2];
                String seats = car[3];
                String city = car[4];
                String expiry = car[5];
                boolean avail = car[6].equalsIgnoreCase("Yes");
                
                
                Car c = new Car();
                c.setBrand(brand);
                c.setModel(model);
                c.setYear(year);
                c.setSeatsNo(seats);
                c.setCity(city);
                c.setExpiryDate(expiry);
                c.setAvailable(avail);
                c.setUpdatedTime(dtf.format(now));
                c.setSerialNo(count);
                catalog.getCarList().add(c);
                count++;
            }
        }catch(IOException e){
                e.printStackTrace();
        }
    }
}