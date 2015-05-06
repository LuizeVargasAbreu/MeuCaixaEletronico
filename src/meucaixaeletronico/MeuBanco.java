
package meucaixaeletronico;


public class MeuBanco {
     String num_banco;
    String nome_banco;
    
    void buscarBanco (String numero){
        switch (numero) {
            case "001":
                num_banco = numero;
                nome_banco = "Banco do Brasil";
                break;
            case "047":
                num_banco = numero;
                nome_banco = "Banco do Estado do Sergipe";
                break;
            case "037":
                num_banco = numero;
                nome_banco = "Banco do Estado do Pará";
                break;
            case "041":
                num_banco = numero;
                nome_banco = "Banco do Rio Grande do Sul";
                break;
            case "004":
                num_banco = numero;
                nome_banco = "Banco do Nordeste do Brasil";
                break;
            default:
                num_banco = null;
                nome_banco = null;
                break;
        }
    }
}
