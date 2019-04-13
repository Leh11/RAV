package iSoccer.Employees;
import java.util.Random;

public abstract class Employee {
    private String name;
    private int id;
    private String cpf;
    private Contact contact;
    protected String ocupation;

    Random r;
    public Employee() {
    }

    public void atrID() {
        r = new Random();
        this.id = r.nextInt();
    }

    public Employee(String name, String cpf, Contact contact){
        this.setName(name);
        this.setCpf(cpf);
        this.setContact(contact);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getOcupation() {
        return ocupation;
    }

}
