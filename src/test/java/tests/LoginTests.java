package tests;

import com.codeborne.selenide.Condition;
import commons.Common;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends Common {

    @Test
    public void login() {
        LoginPage session = new LoginPage();
        session.start().realizarLogin("Tesals@hot.com", "12345");
        this.alert().shouldHave(Condition.text("Bem vindo, Teste!"));
    }
}
