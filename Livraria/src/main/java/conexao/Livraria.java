package conexao;


import javax.swing.JOptionPane;

import model.Editora;

public class Livraria {

	public static void main(String[] args) {

		Editora ed = new Editora();
		EditoraDAO edDAO = new EditoraDAO();
		
		editora.setIdEditora(Long.parseLong(JOptionPane.showInputDialog("Informe o ID da editora: ")));
		
		editora.setIdEditora(JOptionPane.showInputDialog("Informe o nome da editora: "));
		
		editora.setIdEditora(JOptionPane.showInputDialog("Informe o e-mail da editora: "));

		//edDAO.alterarEditora(editora);
		
		edDAO.salvarEditora(editora);

		
	}
}
