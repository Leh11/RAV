package iSoccer.Partiner;

import iSoccer.Employees.Contact;
import iSoccer.Employees.Employee;

public class Partiner extends Employee {

    private Address address;
    private double contribuition;
    protected boolean status;
    protected String category;
    private Contact contact;

    public Partiner() {
    }

    public Partiner(String name, String cpf, Contact contact, Address address) {
        super(name, cpf, contact);
        setAddress(address);
    }

    public void changeSituation(){
        if (status){
            status = true;
        }else {
            status = false;
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getContribuition() {
        return contribuition;
    }

    public void setContribuition(double contribuition) {
        this.contribuition = contribuition;
    }

    public boolean getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
