package iSoccer.Employees;

public class Lawyer extends Employee {

    public Lawyer() {
        this.ocupation = "Advogado";
    }

    public Lawyer(String name, String cpf, Contact contact) {
        super(name, cpf,contact);
    }

}
