public class User {
    private String name;
    private String email;
    private String password;
    private boolean isActive;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isActive = true;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public void login() {
        if (isActive) {
            System.out.println("User " + name + " logged in.");
        } else {
            System.out.println("Account for " + name + " is suspended.");
        }
    }

    public void logout() {
        System.out.println("User " + name + " logged out.");
    }

    public void register() {
        System.out.println("User " + name + " registered.");
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password for " + name + " has been reset.");
    }

    public void suspendAccount() {
        isActive = false;
        System.out.println("Account for " + name + " suspended.");
    }

    public void activateAccount() {
        isActive = true;
        System.out.println("Account for " + name + " activated.");
    }
}
