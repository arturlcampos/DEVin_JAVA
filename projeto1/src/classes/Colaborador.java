package classes;
import documento.Documento;
import repositorio.ListaPessoa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class Colaborador extends Pessoa {
    private List<Documento> documentos =new ArrayList<>();

    public Colaborador(String nome, String sobrenome, LocalDate dataNascimento, String cpf, String endereco) {
        super(nome, sobrenome, dataNascimento, cpf, endereco);
        ListaPessoa.adicionar(this);
    }

    public void adicionarDocumentos(Documento documento) {
        documentos.add(documento);
        System.out.println("DocCriado!");
    }

    public abstract void adicionarDocumento(Documento documento);
}
