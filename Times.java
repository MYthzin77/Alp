import java.util.Scanner;
public class Times{
    int [] i = new int[4];
    Scanner tec = new Scanner(System.in);
    public void lista(){
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
        for(cont=0;cont < i.length; cont++){
            if(i[cont] = null)
            System.out.println("Valor vazio");
            else
            System.out.printf("\n %s", i[cont]);
        }
    }
}