package lkwid;

@SuppressWarnings("serial") 
public class ClosedProjectException extends Exception {

	public ClosedProjectException() {
		super("Cannot register vote. Project is closed");
	}
	
	public ClosedProjectException(String message) {
		super(message);
	}		
}
