package view;

import javax.swing.JOptionPane;
import controller.Verificar_Ordem;

public class Principal {

	public static void main(String[] args) {
		Verificar_Ordem Controll_Ordem = new Verificar_Ordem();
		String dado = "";
		int tamanho = 0;
		while(true) {
			dado = JOptionPane.showInputDialog("Insira o numero ou digite 'sair' para sair");
			if (dado.equalsIgnoreCase("Sair")){
				Controll_Ordem.ChecarOrdem(tamanho);
				break;
			}else {
				Controll_Ordem.InserirDado(dado,tamanho);
			}
			tamanho++;
		}
	}

}
