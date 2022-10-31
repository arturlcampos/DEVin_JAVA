package classes;

import repositorio.ListaPessoa;

import java.time.LocalDate;


public class Pessoa {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private LocalDate dataNascimento;
    private String cpf;
    private String endereco;

    private static Integer Contador = 0;
    private Integer Identificador;



    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String cpf, String endereco) {


        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = calculaIdade();
        this.Identificador = Contador++;
        ListaPessoa.adicionar(this);

    }

    public Pessoa() {

    }

    public Integer calculaIdade() {
        this.idade = LocalDate.now().getYear() - dataNascimento.getYear();
        return this.idade;

    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) { this.nome = nome; }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '|' +
                ", sobrenome'" + sobrenome + '\'' +
                ", idade='" + idade +
                ", dataNascimento='" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}