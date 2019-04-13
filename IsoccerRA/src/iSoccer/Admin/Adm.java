package iSoccer.Admin;

import iSoccer.BuilObject.*;
import iSoccer.Employees.*;
import iSoccer.Partiner.*;
import iSoccer.Resource.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Adm {
    private static Adm INSTANCE;
    private static String login = "admin19";
    private static String senha = "velha";
    Scanner read = new Scanner(System.in);
    private List<Employee> employeesList = new ArrayList<>();
    private List<Partiner> partinersList = new ArrayList<>();
    private List<Resource> resourcesList = new ArrayList<>();

    BuildObject buildObject = null;
    private Employee employee = null;
    private Resource resource = null;
    private Partiner partiner = null;
    private Contact contact = null;
    private Address address = null;

    private int id;
    private String ocupation;
    private String type;
    private int opcao;


    public static Adm getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Adm();
        }
        return INSTANCE;
    }

    public static String getLogin(){
        return login;
    }

    public static String passWord(){
        return senha;
    }

    protected void addEmployee() {
        buildObject = new BuildCO();
        contact = new Contact();
        System.out.println("INSCREVER NOVO FUNCIONARIO");
        System.out.print("Ocupacao Atual: ");
        ocupation = read.next();
        employee = buildObject.buildEmployee(ocupation.toUpperCase());
        if (employee == null) {
            System.out.println("Essa ocupacao ainda existe!!!");
        } else {
            System.out.print("Nome: ");
            employee.setName(read.next());
            System.out.print("CPF: ");
            employee.setCpf(read.next());
            System.out.print("Email: ");
            contact.setEmail(read.next());
            System.out.print("phone: ");
            contact.setPhone(read.next());
            employee.setContact(contact);
            if (employee instanceof Player) {
                System.out.print("Posicao do jogador: ");
                ((Player) employee).setPosition(read.next());
            } else if (employee instanceof Doctor) {
                System.out.print("CRM do medico: ");
                ((Doctor) employee).setCrm(read.next());
            }
            employeesList.add(employee);
            System.out.println("\nNovo empregado adicionado");
        }
    }


    protected void addResource() {
        BuildObject buildObject = new BuildCO();
        System.out.println("ADICIONAR NOVO RECURSO AO CLUBE");
        System.out.print("Tipo de Recurso: ");
        type = read.next();
        type = type.toUpperCase();
        resource = buildObject.buildResource(type);
        if (resource != null) {
            System.out.print("Qual e a capacidade de " + type + ": ");
            resource.setCapacity(read.nextInt());
            if (resource instanceof Arena) {
                System.out.print("Quantos lanchonetes? ");
                ((Arena) resource).setSnackBar(read.nextInt());
                System.out.print("Quantos Banheiros? ");
                ((Arena) resource).setqBathroom(read.nextInt());
            } else if (resource instanceof TrainningCenter) {
                System.out.print("Quantos Quartos? ");
                ((TrainningCenter) resource).setqRoom(read.nextInt());
                System.out.print("Quantos Banheiros? ");
                ((TrainningCenter) resource).setqBathroom(read.nextInt());
            }
            resourcesList.add(resource);
            System.out.println("Recurso Adicionado!");
        }
    }


    protected void addPartiner() {
        contact = new Contact();
        address = new Address();
        BuildObject buildObject = new BuildCO();
        System.out.println("CADASTRAR SOCIO!!!");
        System.out.println("Digite a categoria");
        type = read.next();
        partiner = buildObject.buildPartiner(type.toUpperCase());
        if (partiner != null){
            System.out.print("Nome: ");
            partiner.setName(read.next());
            System.out.print("CPF: ");
            partiner.setCpf(read.next());
            System.out.print("Valor da contribuicao: ");
            partiner.setContribuition(read.nextDouble());
            System.out.print("Email: ");
            contact.setEmail(read.next());
            System.out.print("Phone: ");
            contact.setPhone(read.next());
            System.out.print("Bairro: ");
            address.setNeight(read.next());
            System.out.print("N casa: ");
            address.setnHouse(read.next());
            partiner.setContact(contact);
            partiner.setAddress(address);
            partinersList.add(partiner);
            System.out.println("Socio adicionado!");
        }else {
            System.out.println("Nao existe a categoria de socio");
        }
    }

    protected void changePartinerStatus() {
        System.out.print("Digite ID de socio: ");
        id = read.nextInt();
        for (int i = 0; i < partinersList.size(); i++){
            if (id == partinersList.get(i).getId()){
                System.out.print("Situacao atual ");
                if (partinersList.get(i).getStatus()){
                    System.out.println("ADIPLENTE");
                    partinersList.get(i).changeSituation();
                    System.out.println("Situacao Alterada");
                }else {
                    System.out.println("INADIPLENTE");
                    partinersList.get(i).changeSituation();
                    System.out.println("Situacao Alterado");
                }
            }
        }
    }

    private void playerCondition(){
        System.out.print("Digite id do jogador: ");
        id = read.nextInt();
        for (int i = 0; i < employeesList.size(); i++){
            if("Jogador".equals(employeesList.get(i).getOcupation())){
                if (id == employeesList.get(i).getId()){
                    if (((Player)employeesList.get(i)).getStatus() == true){
                        System.out.println(employeesList.get(i).getName()+" esta em boas condicoes");
                    }else {
                        System.out.println(employeesList.get(i).getName()+" esta com problemas fisico");
                    }
                }

            }
        }
    }

    private void timeInformation(){
        if (employeesList.size() != 0) {
            for (int i = 0; i < employeesList.size(); i++) {
                if ((employeesList.get(i)) instanceof Manager) {
                    System.out.println("==================================\n"+
                            "TECNICO" + "\n" +
                            "Nome: " + employeesList.get(i).getName()+
                            "\n==================================");
                }
            }
            for (int i = 0; i < employeesList.size(); i++) {
                 if ((employeesList.get(i)) instanceof Player) {
                    System.out.println("Nome: " + employeesList.get(i).getName() +
                                    "\nPosicao: "+((Player)employeesList.get(i)).getPosition()+"\n");
                }
            }
            System.out.println("==================================");
        }
    }

    private void generalServic(){
        System.out.println("==================================\n"+
                "LISTA DOS FUNCIONARIOS COMPLETO");
        for (int i = 0 ; i < employeesList.size(); i++){
            System.out.println("Nome: " + employeesList.get(i).getName() +
                    "ID: "+employeesList.get(i).getId()+
                    "\nOcupacao: "+employeesList.get(i).getOcupation());
        }
        System.out.println("==================================");
    }

    private void trinningCenterInformation(){
        int c = 0;
        if (resourcesList.size() == 0){
            System.out.println("Lista de recurso vazia");
        }else {
            for (int i = 0; i < resourcesList.size(); i++) {
                if ("CENTRO TREINAMENTO".equals(resourcesList.get(i).getType())) {
                    System.out.print("Nome: " + resourcesList.get(i).getType() + "\n" +
                            "Capacidade: " + resourcesList.get(i).getCapacity() + "\n" +
                            "Numero de Banheiros: " + ((TrainningCenter) resourcesList.get(i)).getqBathroom() + "\n" +
                            "Numero de Dormitorios: " + ((TrainningCenter) resourcesList.get(i)).getqRoom() + "\n");
                    c = 1;
                }
            }
        }
        if (c != 1){
            System.out.println("Recurso indisponivel");
        }
    }

    private void busInformation(){
        int c  = 0;
        if (resourcesList.size() == 0){
            System.out.println("Lista de recurso vazia");
        }else {
            for (int i = 0; i < resourcesList.size(); i++) {
                if ("ONIBUS".equals(resourcesList.get(i).getType())) {
                    System.out.print("Capacidade: " + resourcesList.get(i).getCapacity() + "\n");
                    c = 1;
                }
            }
        }
        if (c != 1){
            System.out.println("Recurso indisponivel");
        }
    }


    private void arenaInformation(){
        int c = 0;
        if (resourcesList.size() == 0){
            System.out.println("Lista de recurso vazia");
        }else {
            for (int i = 0; i < partinersList.size(); i++) {
                if ("ARENA".equals(resourcesList.get(i).getType())) {
                    System.out.print("Nome: " + resourcesList.get(i).getType() + "\n" +
                            "Capacidade: " + resourcesList.get(i).getCapacity() + "\n" +
                            "Numero de Banheiros: " + ((Arena) resourcesList.get(i)).getqBathroom() + "\n" +
                            "Numero de Lanchonetes: " + ((Arena) resourcesList.get(i)).getqSnackBar() + "\n");
                    c = 1;
                }
            }
        }
        if (c != 1){
            System.out.println("Recurso indisponivel");
        }
    }

    private void availabResource(){
        int c = 0;
        System.out.print("Digite o tipo: ");
        type = read.next();
        for (int i = 0; i < resourcesList.size(); i++) {
            if (type.equals(resourcesList.get(i).getType())) {
                if (resourcesList.get(i).isStatus()) {
                    System.out.println(resourcesList.get(i).getType() + " disponivel");
                    c = 1;
                } else {
                    System.out.println(type + " indisponivel");
                    c = 1;
                }
            }
        }
        if (c != 1){
            System.out.println("Nao existe este tipo!!!");
        }
    }


    protected void partinerInformation(){
        int ad = 0, ina = 0;
        for (int i = 0; i < partinersList.size(); i++){
            if (partinersList.get(i).getStatus()){
                System.out.println("Nome: "+partinersList.get(i).getName()+"\n"+
                        "Phone: "+partinersList.get(i).getContact().getPhone()+"\n"+
                        "Email: "+partinersList.get(i).getContact().getEmail()+"\n"+
                        "Situacao: Adiplente");
                ad++;
            }else {
                System.out.println("Nome: "+partinersList.get(i).getName()+"\n"+
                        "Phone: "+partinersList.get(i).getContact().getPhone()+"\n"+
                        "Email: "+partinersList.get(i).getContact().getEmail()+"\n"+
                        "Situacao: Inadiplente");
                ina++;
            }
        }
        System.out.println("Quantididad adiplente: "+ad+
                "\nQuantidade inadiplente: "+ina);
    }


    public void adminTime(){
        do {
            try {
                System.out.println("==================================\n"+
                        "= 0 - VOLTAR \n= 1 - INFORMACAO DA EQUIPA TECNICA"+"\n= 2 - VER CONDICAO DO JOGADOR"+"\n= 3 - OUTROS FUNCIONARIOS\n"+
                        "==================================\n");
                opcao = read.nextInt();
                switch (opcao) {
                    case 1:
                        timeInformation();
                        break;
                    case 2:
                        playerCondition();
                        break;
                    case 3:
                        generalServic();
                        break;
                }
            }catch (InputMismatchException E){
                System.out.println("DIGITE UM INTEIRO!!!");
                read.next();
            }
        }while (opcao != 0);
        opcao = -1;
    }


    public void adminResource() {
        do {
            try {
                System.out.println("==================================\n"+
                        "= 0 - VOLTAR \n= 1 - INFORMACAO DO ONIBUS" + "\n= 2 - INFORMACAO DO CENTRO" + "\n= 3 - INFORMACAO DO ESTADIO" + "\n= 4 - DISPONIBILIDADE DE RECUSRSO\n"+
                        "==================================\n");
                opcao = read.nextInt();
                switch (opcao) {
                    case 1:
                        busInformation();
                        break;
                    case 2:
                        trinningCenterInformation();
                        break;
                    case 3:
                        arenaInformation();
                        break;
                    case 4:
                        availabResource();
                        break;
                }
            }catch (InputMismatchException E){
                System.out.println("DIGITE UM INTEIRO!!!");
                read.next();
            }
        } while (opcao != 0);
        opcao = -1;
    }
}
