package cpit280;

public class Parent {

    private String password, username, childUsername, email;
    private int numOfChildren;

    public Parent(String password, String username, String childUsername, int numOfChildren, String email) {
        this.password = password;
        this.username = username;
        this.childUsername = childUsername;
        this.numOfChildren = numOfChildren;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    Parent() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChildUsername() {
        return childUsername;
    }

    public void setChildUsername(String childUsername) {
        this.childUsername = childUsername;
    }

    @Override
    public String toString() {
        return "Parent{" + "password=" + password + ", username=" + username + ", childUsername=" + childUsername + ", numOfChildren=" + numOfChildren + '}';
    }

    
}
