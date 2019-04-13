package iSoccer.Employees;

public class PersonaTrainer extends Employee {
    public PersonaTrainer() {
        this.ocupation = "Preparador Fisico";
    }

    public PersonaTrainer(String name, String cpf, Contact contact) {
        super(name, cpf, contact);
    }
}
