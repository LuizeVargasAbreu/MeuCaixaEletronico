
package meucaixaeletronico;
import javax.swing.JOptionPane;
public class MeuCaixaEletronico {

   
    public static void main(String[] args) {
          MinhaConta e = new MinhaConta();
          MeuBanco p = new MeuBanco();
          Cliente cliente = new Cliente ();

        String opçao = null;

        while (!"8".equals(opçao)) {

            JOptionPane.showMessageDialog(null, "Menu do Caixa Eletrônico\n"
                    + "1. Abrir conta\n"
                    + "2. Depositar\n"
                    + "3. Sacar\n"
                    + "4. Consultar saldo\n"
                    + "5. Resumo da Conta\n"
                    + "6. Verificar banco\n"
                    + "7. Fechar conta\n"
                    + "8. Sair do Menu\n");

            opçao = JOptionPane.showInputDialog("Digite a opção desejada: ");
            switch (opçao) {

                case "1": {
                    String nome, agencia, numero;
                    agencia = JOptionPane.showInputDialog("Agência: ");

                    nome = JOptionPane.showInputDialog("Nome do Corrrentista: ");

                    numero = JOptionPane.showInputDialog("Número da Conta: ");

                    e.abrirConta(agencia, nome, numero);
                    JOptionPane.showMessageDialog(null, "Sua conta foi aberta com sucesso!");
                    break;
                }

                case "2": {
                    Double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Depósito: "));
                    Boolean dep = e.depositar(valor);

                    if (dep == true) {
                        JOptionPane.showMessageDialog(null, "Depósito foi feito com sucesso.");

                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível depositar!");
                    }

                    break;
                }
                
                case "3": {
                    Double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
                    Boolean certo = e.sacar(saque);
                    if (certo == true) {
                        JOptionPane.showMessageDialog(null, "Saque feito com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível sacar esse valor.");
                    }

                    break;
                }
                
                case "4": {

                    JOptionPane.showMessageDialog(null, e.retornarSaldo());
                    break;
                }
                
                case "5": {
                    JOptionPane.showMessageDialog(null, "Agência: " + e.getAgencia());
                    JOptionPane.showMessageDialog(null, "Correntista: " + e.Correntista);
                    JOptionPane.showMessageDialog(null, "Número: " + e.num_conta);
                    JOptionPane.showMessageDialog(null, "Saldo: " + e.saldo);
                    break;
                }
                
                case "6": {
                    String num_banco;
                    num_banco = JOptionPane.showInputDialog("Número do Banco: ");

                    p.buscarBanco(num_banco);
                    JOptionPane.showMessageDialog(null, "Nome do Banco: " + p.nome_banco);

                    break;
                }
                
                case "7": {
                    e.fecharConta();
                    if (e.ativa == false) {
                        JOptionPane.showMessageDialog(null, "Sua conta foi desativada e fechada!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível fechar sua conta.");
                    }

                    break;
                }
                
                case "8": {
                    JOptionPane.showMessageDialog(null, "Sair");
                    break;
                }
                
                default: {
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                }

            }

        }
    
    }
}
