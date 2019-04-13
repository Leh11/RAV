package iSoccer.Employees;

public class Manager extends Employee{

    public Manager() {
        this.ocupation = "Tecnico";
    }

    public Manager(String name, String cpf, Contact contact) {
        super(name, cpf, contact);
    }
}
