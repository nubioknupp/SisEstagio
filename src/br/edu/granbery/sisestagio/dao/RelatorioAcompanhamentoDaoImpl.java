package br.edu.granbery.sisestagio.dao;

import java.util.HashMap;
import java.util.List;

import br.edu.granbery.sisestagio.model.RelatorioAcompanhamento;

public class RelatorioAcompanhamentoDaoImpl extends
		GenericDaoImpl<RelatorioAcompanhamento, Long> implements
		RelatorioAcompanhamentoDao {

	@Override
	public List<RelatorioAcompanhamento> recuperaPorNome(String nome) {

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT bm FROM " + clazz.getName() + " bm");
		sql.append(" WHERE bm.nome LIKE :nome");

		HashMap<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("nome", "%" + nome + "%");

		return findByQueryAndParameters(sql.toString(), parameters);
	}

}
