package iSoccer.Employees;

public class Cooker extends Employee{

    public Cooker() {
        this.ocupation = "Cozinheira";
    }

    public Cooker(String name, String cpf, Contact contact) {
        super(name, cpf, contact);
    }

}
