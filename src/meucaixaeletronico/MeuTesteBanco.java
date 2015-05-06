
package meucaixaeletronico;

import javax.swing.JOptionPane;

public class MeuTesteBanco {

    
    public static void main(String[] args) {
            MeuBanco p = new MeuBanco ();
                    p.buscarBanco("001");
                    JOptionPane.showMessageDialog(null, p.nome_banco);
    }
    }

