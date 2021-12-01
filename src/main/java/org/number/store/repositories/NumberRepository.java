package org.number.store.repositories;

import org.number.store.entities.NumberEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // implémenter les couches d'accès aux données (@Repository qui communique avec
			// la base de donnée
public interface NumberRepository extends CrudRepository<NumberEntity, Long> {

	NumberEntity findByNum(int num);

	NumberEntity findByNumId(String numId);

}
