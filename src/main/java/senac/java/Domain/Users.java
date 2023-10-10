package senac.java.Domain;

public class Users {
    public static String nome = "";
    public static String sobrenome = "";
    public static int idade = 0;
    public static String endereco = "";
    public static String email = "";
    public static String cpf = "";
    public static String senha = "";

    //CONSTRUTOR - criar um novo espaço em memória com o mesmo nome (SEM SOBREESCREVER)
    public Users() {

    }

    public Users(String nome, String sobrenome, int idade, String endereco, String email, String senha, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    //This - pegar de acordo com o lá de cima.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(Integer idade) {
        this.idade = idade;
        return 0;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String getCpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String getSenha) {
        this.senha = senha;
    }

}
