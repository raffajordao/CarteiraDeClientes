package e.ra_jo.carteiradeclientes.dominio.entidades;

import java.io.Serializable;

public class Cliente implements Serializable {

    public int Codigo;
    public String nome;
    public String endereco;
    public String email;
    public String telefone;

    public Cliente(){
        Codigo = 0;
    }


}
