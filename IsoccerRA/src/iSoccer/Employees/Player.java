package iSoccer.Employees;

public class Player extends Employee{
    private String position;
    private boolean status;

    public Player(){
        this.ocupation = "Jogador";
        status = true;
    }

    public Player(String name, String cpf, Contact contact) {
        super(name, cpf, contact);
    }


    public String getPosition(){
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean getStatus(){
        return status;
    }


    public void changeStatus(){
        if (status){
            status = false;
        }else {
            status = true;
        }
    }
}
