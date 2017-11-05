package br.com.tiagodeveloper.interfaces;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import br.com.tiagodeveloper.models.Contato;
@NoRepositoryBean
public interface CrudDoMau<E,ID> {

	public List<E> findAll();
	public Contato findOne(ID id);
}
