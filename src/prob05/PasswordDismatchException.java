package prob05;

@SuppressWarnings("serial")
public class PasswordDismatchException extends Exception{
	public PasswordDismatchException() {
		super("password does not match");
	}
}
