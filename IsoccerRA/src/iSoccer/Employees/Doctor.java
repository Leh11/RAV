package iSoccer.Employees;

public class Doctor extends Employee {

    private String crm;
    public Doctor(){
        this.ocupation = "Medico";
    }

    public Doctor(String name, String cpf, Contact contact) {
        super(name, cpf, contact);
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }
}
