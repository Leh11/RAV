package iSoccer.Partiner;

import iSoccer.Employees.Contact;

public class Elite extends Partiner {
    public Elite() {
        this.category ="ELITE";
        this.status = true;
    }

    public Elite(String name, String cpf, Contact contact, Address address) {
        super(name, cpf, contact, address);
    }
}
