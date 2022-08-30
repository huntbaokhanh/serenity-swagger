package swaglabs.model;

public enum SwaglabsUser {
    STANDARD_USER("standard_user", "secret_sauce");

    public final String userName;
    public final String passWord;

    SwaglabsUser(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
