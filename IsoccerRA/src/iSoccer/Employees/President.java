package iSoccer.Employees;

public class President extends Employee{
    public President() {
        this.ocupation = "Presidente";
    }

    public President(String name, String cpf, Contact contact){
        super(name, cpf, contact); }

}
