package osullivan.daniel.travel_helper.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cargo {

	@Id
	@Column
	private Long id;
	@OneToOne
	private Port origin;
	@OneToOne
	private Port destination;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
