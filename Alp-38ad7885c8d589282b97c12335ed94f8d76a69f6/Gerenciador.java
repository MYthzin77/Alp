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
        int escolha = 0;
        do{
            System.out.println("1 - Adicionar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Listar");
            System.out.println("4 - Pesquisa");
            System.out.println("5 - Sair");
            escolha = tec.nextInt();

            
                switch(escolha){
                    case 1:
                    adicionar();
                        break;
                    case 2:
                        break;
                    case 3:
                    listar();
                        break;
                    case 4:
                        break;
                }
        }while( escolha != 5);
    }
    public void adicionar() {
        int i,contVetor=0, iAdd = -1, codigo;
        String nome;
        
        for(i=0;i < t.length; i++){
            if(t[i] != null)
        }
        System.out.println("Qual sera o codigo do time a ser cadastrado?");
        codigo = tec.nextInt();
        for(i = 0; i<t.length;i = i+1){
            if(t[i]!=null){
                if(t[i].getcodigo() == codigo){
                    System.out.println("Este nome ja existe");
                    nome = null;
                }else
                    System.out.println("Cadastrado com sucesso");
            }
        }

        System.out.println("Qual eh o nome do time?");
        tec.nextLine();
        nome = tec.nextLine();
        
        for(i = 0; i<t.length;i = i+1){
            if(t[i] !=null){

            if(t[i].getNome() == nome){
                System.out.println("Este nome ja existe");
                nome = null;

            }else
                System.out.println("Cadastrado com sucesso");
            }
        }
        
    }
  
        
    public void listar(){
        int cont;
        for(cont=0;cont < t.length; cont++){
            if(t[cont] != null){
            System.out.printf("\n %s \n", t[cont].getNome());
            }
        }
    }
}