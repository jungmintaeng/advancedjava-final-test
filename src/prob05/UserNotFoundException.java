package prob05;

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception{
	public UserNotFoundException() {
		super("user not founded");
	}
}
