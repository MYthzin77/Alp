import java.util.Scanner;
public class Gerenciador{
    Scanner tec = new Scanner(System.in);
    private Times [] t = new Times[5];
    
    public void menu(){
        Times t1 = new Times(1, "Santos");
        t[0] = t1;
        Times t2 = new Times(2, "Sao Paulo");
        t[1] = t2;
        Times t3 = new Times(3, "Corinthians");
        t[2] = t3;
        Times t4 = new Times(4, "Palmeiras");
        t[3] = t4;
        int escolha;
        System.out.println("1 - Adicionar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Listar");
        System.out.println("4 - Pesquisa");
        System.out.println("5 - Sair");
        escolha = tec.nextInt();

        switch(escolha){
            case 1:
                break;
            case 2:
            listar();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    public void listar(){
        int cont;
        for(cont=0;cont < t.length; cont++){
            if(t[cont] == null)
            System.out.println("Valor vazio");
            else
            System.out.printf("\n %s \n", t[cont].getNome());
        }
    }
}