package org.octy;

public class Adress {
    
    private String street;
    private int num;
    private int zipcode;
    private String town;
    
    public Adress() {
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public int getZipcode() {
        return zipcode;
    }
    
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getTown() {
        return town;
    }
    
    public void setTown(String town) {
        this.town = town;
    }
}
