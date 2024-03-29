/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hazel
 */
public class House{
    String name;
    List<Person> family;
    Community community;
    
    public House(String name) {
        this.name = name;
        this.family = new ArrayList<>();
    }
    public List<Person> getFamily() {
        return family;
    }

    public String getHouseNumber() {
        return name;
    }

    public void setHouseNumber(String name) {
        this.name = name;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community c) {
        community = c;
    }
     
    public void setFamily(List<Person> family) {
        this.family = family;
    }
    
    public void addFamily(Person ...person){
        family.addAll(Arrays.asList(person));
    }
}