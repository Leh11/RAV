package iSoccer.Partiner;

import iSoccer.Employees.Contact;

public class Senior extends Partiner {
    public Senior() {
        this.category = "SENIOR";
        this.status = true;
    }

    public Senior(String name, String cpf, Contact contact, Address address) {
        super(name, cpf, contact, address);
    }

}
