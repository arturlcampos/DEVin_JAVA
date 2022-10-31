package classes;

import documento.Documento;
import repositorio.ListaGerente;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Supervisor {

    private List<Documento> documentosAprovados = new ArrayList<>();
    private List<Documento> documentospendentes = new ArrayList<>();

    public Gerente(String nome, String sobrenome, LocalDate dataNascimento, String cpf, String endereco) {
        super(nome, sobrenome, dataNascimento, cpf, endereco);
        ListaGerente.adicionar (this);
    }


    @Override
    public void adicionarDocumento(Documento documento) {
        documentospendentes.add(documento);
        System.out.println("DOC criado por GER");
        System.out.println(documento);
        System.out.println(documentospendentes);
    }



}

