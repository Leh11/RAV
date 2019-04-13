package iSoccer.Partiner;

import iSoccer.Employees.Contact;

public class Junior extends Partiner {
    public Junior() {
        this.category = "JUNIOR";
        this.status = true;
    }

    public Junior(String name, String cpf, Contact contact, Address address) {
        super(name, cpf, contact, address);
    }
}
