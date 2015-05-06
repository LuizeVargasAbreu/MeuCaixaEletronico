package meucaixaeletronico;

public class Cliente {

    private Cliente cpf;
    private Cliente nome;
    private Cliente datanascimento;
    private Cliente endereco;
    private Boolean negativadospc;
    private Boolean negativadoserasa;
    private Cliente nomemae;
    private Cliente nomepai;

    public Cliente getCpf() {
        return cpf;
    }

    public void setCpf(Cliente cpf) {
        this.cpf = cpf;
    }

    public Cliente getNome() {
        return nome;
    }

    public void setNome(Cliente nome) {
        this.nome = nome;
    }

    public Cliente getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Cliente datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Cliente getEndereco() {
        return endereco;
    }

    public void setEndereco(Cliente endereco) {
        this.endereco = endereco;
    }

    public Boolean isNegativadospc() {
        return negativadospc;
    }

    public void setNegativadospc(Boolean negativadospc) {
        this.negativadospc = negativadospc;
    }

    public Boolean isNegativadoserasa() {
        return negativadoserasa;
    }

    public void setNegativadoserasa(Boolean negativadoserasa) {
        this.negativadoserasa = negativadoserasa;
    }

    public Cliente getNomemae() {
        return nomemae;
    }

    public void setNomemae(Cliente nomemae) {
        this.nomemae = nomemae;
    }

    public Cliente getNomepai() {
        return nomepai;
    }

    public void setNomepai(Cliente nomepai) {
        this.nomepai = nomepai;
    }

    public Cliente() {
        this.cpf = null;
        this.nome = null;
        this.datanascimento = null;
        this.endereco = null;
        this.negativadospc = false;
        this.negativadoserasa = false;
        this.nomemae = null;
        this.nomepai = null;

    }

    public Boolean Verificasaldo() {
        if (this.negativadoserasa == false && this.negativadospc == false)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
