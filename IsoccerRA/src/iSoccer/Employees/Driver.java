package iSoccer.Employees;

public class Driver extends Employee {
    public Driver() {
        this.ocupation = "Condutor";
    }

    public Driver(String name, String cpf, Contact contact) {
        super(name, cpf, contact);
    }
}
