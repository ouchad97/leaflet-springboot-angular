package org.rim.polyline.repositories;
 
import java.util.Date;

import org.rim.polyline.entities.PolylineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // implémenter les couches d'accès aux données (@Repository qui communique avec
			// la base de donnée )
public interface PolylineRepository extends CrudRepository<PolylineEntity, Long> {

	//PolylineEntity findTopByLatitude(double latitude); 
  
	PolylineEntity findTopByDeviceId(Integer deviceId); 
}
