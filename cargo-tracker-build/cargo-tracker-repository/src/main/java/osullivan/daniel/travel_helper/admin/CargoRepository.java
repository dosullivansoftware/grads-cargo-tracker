package osullivan.daniel.travel_helper.admin;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class CargoRepository {

	@PersistenceContext
	private EntityManager em;

	public Cargo findById(Long id) {
		try {
			return em.find(Cargo.class, id);
		} catch (Exception e) {
			throw new NoRecordFoundException(id);
		}
	}

}
