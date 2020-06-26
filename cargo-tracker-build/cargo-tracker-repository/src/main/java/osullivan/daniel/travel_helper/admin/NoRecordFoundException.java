package osullivan.daniel.travel_helper.admin;

public class NoRecordFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoRecordFoundException(Long id) {
		super(String.valueOf(id));
	}

}
