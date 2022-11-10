package org.octy;

public class Person {
    
    private String firstname;
    private String lastname;
    
    private Adress address;
    public Person() {
        this.firstname = "Octy";
        this.lastname = "WOKPO";
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public Adress getAddress() {
        return address;
    }
    
    public void setAddress(Adress address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                '}';
    }
}
