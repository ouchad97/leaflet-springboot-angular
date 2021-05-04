package org.basma.store.repositories;

import org.basma.store.entities.CategorieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<CategorieEntity, Long> {

	CategorieEntity findByTitreCategorie(String titreCategorie);

	CategorieEntity findByCategorieId(String categorieId);

	CategorieEntity findByIdCategorie(int idCategorie);
}