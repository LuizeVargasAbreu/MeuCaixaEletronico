package meucaixaeletronico;

public class MinhaConta {

    private String agencia;
    private String correntista;
    private String num_conta;
    private Double saldo;
    private Boolean ativa;

    // Construtor da classe MinhaConta
    public MinhaConta() {
        //agencia = null;
        this.agencia = null;
        // correntista = null;
        this.correntista = null;
        //num_conta = null;
        this.num_conta = null;
        //saldo = null;
        this.saldo = null;
        //ativa = false;
        this.ativa = false;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
    

    public void abrirConta(String n_agencia, String nome_cor, String n_conta) {
        // this.agencia = agencia;
        agencia = n_agencia;
        num_conta = n_conta;
        correntista = nome_cor;
        saldo = 0.0;
        ativa = true;
    }

    public Boolean fecharConta() {
        if (saldo == 0.0) 
        {
            ativa = false;
            return true;
        } 
        else
        {
            return false;
        }
    }

    public Boolean sacar(Double valor) {
        if (ativa == true && valor <= saldo)
        {
            saldo = saldo - valor;
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public Double retornarSaldo() {
        return saldo;
    }

    public Boolean depositar(Double deposito) {
        if (ativa == true)
        {
            saldo = saldo + deposito;
            return true;
        }
        else
        {
            return false;
        }
    }
}
