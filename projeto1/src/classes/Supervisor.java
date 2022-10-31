package classes;

import documento.Documento;
import repositorio.ListaSupervisor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Colaborador{

    private List<Documento> documentosAprovados = new ArrayList<>();
    private List<Documento> documentospendentes = new ArrayList<>();

    public Supervisor(String nome, String sobrenome, LocalDate dataNascimento, String cpf, String endereco) {
        super(nome, sobrenome, dataNascimento, cpf, endereco);
        ListaSupervisor.adicinar (this);
    }


    @Override
    public void adicionarDocumento(Documento documento) {
        documentospendentes.add(documento);
        System.out.println("DOC criado por SUP");
        System.out.println(documento);
        System.out.println(documentospendentes);
    }



}

