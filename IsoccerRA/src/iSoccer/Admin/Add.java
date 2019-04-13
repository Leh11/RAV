package iSoccer.Admin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Add {
    public static void starMenu(){
        System.out.println("==================================\n"+
                "= 0 - SAIR\n"+
                "= 1 - CADASTRAR EMPREGADO\n"+
                "= 2 - ADICIONAR RECURSO\n"+
                "= 3 - CADASTRAR  SOCIO\n"+
                "= 4 - GERENCIAR EQUIPA"+"\n"+
                "= 5 - GERENCIAR RECURSOS"+"\n"+
                "= 6 - INFORMACAO DE SOCIOS"+"\n"+
                "= 7 - MUDAR CONDICAO DE SOCIO"+"\n"+
        "==================================");
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Adm admin = Adm.getINSTANCE();
        int opcao = -1;
        String login;
        String senha;
        int x = 4;

        while (x-- != 0){
            System.out.print("Login: ");
            login = read.next();
            System.out.print("senha: ");
            senha = read.next();
            if ((login.equals(Adm.getLogin())) && (senha.equals(Adm.passWord()))) {
                do {
                    starMenu();
                    opcao = read.nextInt();
                    try {
                        switch (opcao) {
                            case 1:
                                admin.addEmployee();
                                break;
                            case 2:
                                admin.addResource();
                                break;
                            case 3:
                                admin.addPartiner();
                                break;
                            case 4:
                                admin.adminTime();
                                break;
                            case 5:
                                admin.adminResource();
                            case 6:
                                admin.partinerInformation();
                                break;
                            case 7:
                                admin.changePartinerStatus();
                                break;
                        }
                    } catch (InputMismatchException E) {
                        System.out.println("DIGITE INTEIRO");
                        read.next();
                    }
                } while (opcao != 0);
            } else {
                System.out.println("Login ou senha errada!!!"+
                        "Falta "+x+" tentativa");
            }
        }
    }
}
