package osullivan.daniel.travel_helper.admin;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cargo extends BaseEntity {

	@OneToOne
	private Port origin;
	@OneToOne
	private Port destination;

	public Port getOrigin() {
		return origin;
	}

	public void setOrigin(Port origin) {
		this.origin = origin;
	}

	public Port getDestination() {
		return destination;
	}

	public void setDestination(Port destination) {
		this.destination = destination;
	}

}
