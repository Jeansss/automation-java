package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public LoginPage start() {
        open("/login");
        return this;
    }

    public LoginPage realizarLogin(String user, String pass) {
        $("#email").setValue(user);
        $("#senha").setValue(pass);
        $("button[type=submit]").click();
        return this;
    }
}
