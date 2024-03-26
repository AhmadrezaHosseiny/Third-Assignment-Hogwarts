import java.util.UUID;

public class Account {
    private String _username;
    // TODO: Passwords should hashed
    private String _password;
    private UUID _accountID;
    Account(String u, String p) {
        _accountID = UUID.randomUUID();
        _username = u;
        _password = p;
        Hogwarts.accounts.add(this);
    }
    public boolean validatePassword(String enteredPassword) {
        if (_password.equals(enteredPassword)) return true;
        return false;
    }
    public boolean validateUserName(String enteredUserName) {
        if (_username.equals(enteredUserName)) return true;
        return false;
    }

    //@Override
    public void changeUsername(String newUsername) {
        //TODO
    }

    //@Override
    public void changePassword(String newPassword) {
        //TODO
    }
    public void show() {
        System.out.println(_username + " " + _accountID.toString());
    }
}
