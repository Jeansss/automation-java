package tests;

import com.codeborne.selenide.Condition;
import commons.Common;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomeTests extends Common {

    @BeforeMethod
    public void setupHome() {
        LoginPage session = new LoginPage();
        session.start().realizarLogin("Tesals@hot.com", "12345");
        this.alert().shouldHave(Condition.text("Bem vindo, Teste!"));
    }

    @Test
    public void adicionarConta() {
        HomePage home = new HomePage();
        home.listarConta()
                .verificaDuplicado("Testa");
        this.alert().shouldBe(Condition.text("Conta removida com sucesso!"));
               home.adicionarConta("Testa");
        this.alert().shouldBe(Condition.text("Conta adicionada com sucesso!"));
    }
}
