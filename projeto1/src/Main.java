import classes.Colaborador;
import classes.Funcionario;
import classes.Pessoa;


import documento.Documento;
import repositorio.ListaPessoa;

import java.time.LocalDate;
import javax.swing.text.Document;

public class Main {
    public static void main(String[] args) {

        Colaborador colaborador = new Funcionario(
                "Artur", "Campos", LocalDate.of(1987, 2, 15), "0110053029", "Av Icaraí"
        ) {
        };


        System.out.println(ListaPessoa.retornar(0));
        colaborador.adicionarDocumentos(new Documento("Artur Campos")
        );
    }
}