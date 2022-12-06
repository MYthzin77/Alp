public class Times {
    private String nome;
    private int codigo;
    public Times(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public int getcodigo() {
        return codigo;
    }
    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }
}
