package conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.ConnectionFactory;
import model.Editora;

public class EditoraDAO {

	private ConnectionFactory connection;

	public EditoraDAO() {
		this.connection = new ConnectionFactory();
	}

	public Editora buscarEditora(Long id) {
		Editora editora = new Editora();

		Connection conn = connection.conexao();

		try {
			String sql = "SELECT * FROM editora WHERE idEditora";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setLong(1, id);
			ResultSet resultado = prepareStatement.executeQuery();

			resultado.next();
			editora.setIdEditora(resultado.getLong("idEditora"));
			editora.setNome(resultado.getString("nome"));
			editora.setEmail(resultado.getString("email"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return editora;
	}

	public List<Editora> listarEditora() {

		List<Editora> editoras = new ArrayList<Editora>();

		Connection conn = connection.conexao();

		String sql = "SELECT * FROM editora WHERE idEditora";
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			conn.close();

			while (resultado.next()) {

				Editora editora = new Editora();
				editora.setIdEditora(resultado.getLong("idEditora"));
				editora.setNome(resultado.getString("nome"));
				editora.setEmail(resultado.getString("email"));
				editoras.add(editora);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return editoras;
	}

	public void alterarEditora(Editora editora) {

		Connection conn = connection.conexao();

		try {
			String sql = "update editora set nome = ?, email = ?, where idEditora = ?";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);

			prepareStatement.setString(1, editora.getNome());
			prepareStatement.setString(2, editora.getEmail());
			prepareStatement.setLong(3, editora.getIdEditora());
			prepareStatement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void salvarEditora(Editora editora) {
		String sql = "INSERT INTO editora (nome, email)" + "VALUES (? , ?)";

		Connection conn = connection.conexao();

		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, "Tec");
			prepareStatement.setString(2, "tec@gmail.com");
			prepareStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
