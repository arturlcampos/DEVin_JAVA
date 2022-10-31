package classes;

import documento.Documento;
import repositorio.ListaFuncionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Colaborador {
        private List<Documento> documentos = new ArrayList<>();
   public Funcionario(String nome, String sobrenome, LocalDate dataNascimento, String cpf, String endereco) {
        super(nome, sobrenome, dataNascimento, cpf, endereco);
        ListaFuncionario.adicionar (this);
    }
    @Override
    public void adicionarDocumentos(Documento documento){
        documentos.add(documento);
        System.out.println("DOC FUNC");
        System.out.println(documento);
        System.out.println(documentos);
    }

    @Override
    public void adicionarDocumento(Documento documento) {

    }
}
