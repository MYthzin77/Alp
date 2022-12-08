/*
programa que adiciona, pesquisa, altera e deleta nomes de times dentro de um vetor
criador Gustavo Carvalho e Danilo Lopes 
data de desenvolvimento: 04.12.2022
data de entrega: 08.12.2022
*/
import java.util.Scanner;
public class Gerenciador{
    Scanner tec = new Scanner(System.in);
	// area declaracao e inicializacao de atributos
    private Times [] t = new Times[12];
    
	//metodo menu
    public void menu(){
        
        Times t1 = new Times(1, "santos");
        t[0] = t1;
        Times t2 = new Times(2, "sao paulo");
        t[1] = t2;
        Times t3 = new Times(3, "corinthians");
        t[2] = t3;
        Times t4 = new Times(4, "palmeiras");
        t[3] = t4;
        int escolha = 0;
        do{
            System.out.println("\n1 - Adicionar"); 
            System.out.println("2 - Alterar");
            System.out.println("3 - Listar");
            System.out.println("4 - Pesquisa");
            System.out.println("5 - Remover");
            System.out.println("6 - Sair");

            escolha = tec.nextInt();

            
                switch(escolha){
                    case 1:
                    adicionar();
                        break;
                    case 2:
                    alterar();
                        break;
                    case 3:
                    listar();
                        break;
                    case 4:
                    pesquisar();
                        break;
                    case 5:
                        remover();
                        break;
                    case 6:
                        System.out.println("Finalizando aplicacao");
                        continue;
                    default:
                    System.out.println("Digite numero valido");
                    return;
                }
        }while( escolha != 6);
    }	
	// metodo adicionar le o nome e o codigo do time
    public void adicionar() {
        int i,vetorCheio = 1, codigo;
        String nome, resposta = "n";
        for(i=0;i < t.length; i++){
            if(t[i] == null)
                vetorCheio = 0;
        }

        if(vetorCheio != 0){
            System.out.println("Vetor cheio");
            return;
        }

        System.out.println("Qual eh o nome do time?");
        tec.nextLine();
        nome = tec.nextLine();

        System.out.println("Qual sera o codigo do time a ser cadastrado?");
        codigo = tec.nextInt();

        Times tValor = new Times(codigo, nome);
        for(i = 0; i<t.length; i= i+1){    

            if(t[i] != null){
                if(t[i].getcodigo() == codigo){
                    System.out.println("Este codigo ja existe");// se o time ja existir ele vem pra ca
                    return;
                    }
            }else{
                System.out.print("tem certeza que deseja cadastrar?");// pergunta se deseja realmente se cadastrar
                System.out.print("\n s - sim \n");
                System.out.print("\n n - nao\n");
                resposta = tec.next();
                    if(resposta.equals("s")){
                    t[i] = tValor;
                    System.out.println("Cadastrado");
                    return;
                }
            }   
        }
    }
    public void alterar(){  //metodo para alterar o nome do time 
        String novoNm;
        int valor, cont=0;
        System.out.println("Qual o codigo que sera alterado?");
        valor = tec.nextInt();

        for ( int i = 0 ; i < t.length ; i++){
            if( t[i] != null){
                Times t1 = t[i];
                if ( t1.getcodigo() == valor){
                    cont = 1;
                    break;
                }
            }
        }
        if(cont != 1){
            System.out.println("Esse codigo nao existe"); // se o codigo for existente ele vem pra ca
            return;
        }

        System.out.println("Qual sera o novo nome?");
        tec.nextLine();
        novoNm = tec.nextLine();
        for ( int i = 0 ; i < t.length ; i++){
            if( t[i] != null){
                Times t1 = t[i];
                if ( t1.getcodigo( ) == (valor)){
                    t[i].setnome(novoNm);
                    return;
                }
            }
        }
        System.out.println("Nao foi possivel achar");
    }       
    public void listar(){ //metodo listar serve para encontrar o nome do time
        int cont;
        for(cont=0;cont < t.length; cont++){
            if(t[cont] != null){
            System.out.printf("\n %1d- %S \n", t[cont].getcodigo(), t[cont].getNome());
            }
        }
    }
	//metodo pesquisar
    public void pesquisar(){
        int i, achou = 1;
        String pesquisa;
        System.out.println("Digite o nome ou letra a ser pesquisado");
        tec.nextLine();
        pesquisa = tec.nextLine();

        for(i=0;i<t.length;i++){
            if( t[i] != null){
                //pesquisa o nome
                if(t[i].getNome().equals(pesquisa)){
                    System.out.printf("\n%d - ", t[i].getcodigo());
                    System.out.println(t[i].getNome());
                    achou = 0;
                }else if(t[i].getNome().contains(pesquisa)){
                    System.out.printf("\n%d - ", t[i].getcodigo());
                    System.out.println(t[i].getNome());
                    achou = 0;
                }
            }
            continue;
        }
        if(achou != 0)
        System.out.println("Nao encontrado ");// se não for encontrado ele vem pra ca
    }
	//metodo remover codigo 
    public void remover(){
        int valor;
        System.out.println("Qual o codigo do time a ser removido?");
        valor = tec.nextInt();

        for ( int i = 0 ; i < t.length ; i++){
            if( t[i] != null){
                Times t1 = t[ i ];
                if ( t1.getcodigo( ) == valor){
                    t[i] = null;
					System.out.println("Valor removido"); 
                }
            }
        }
		        System.out.println("Nao foi possivel achar");
    }
}


