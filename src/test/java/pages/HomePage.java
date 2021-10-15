package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import commons.Common;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage extends Common {

    public HomePage listarConta() {
        $$(".navbar-nav li").findBy(Condition.cssClass("dropdown")).click();
        $$(".dropdown-menu li").last().click();
        return this;
    }

    public HomePage adicionarConta(String conta) {
        $$(".navbar-nav li").findBy(Condition.cssClass("dropdown")).click();
        $$(".dropdown-menu li").first().click();
        $("#nome").setValue(conta);
        $(byText("Salvar")).click();
        return this;
    }

    public HomePage verificaDuplicado(String conta) {
        boolean delete = false;
        ElementsCollection td = $$("#tabelaContas tbody tr td");
        for (int c = 0; c <= td.size(); c++) {
            if (delete == true) {
                td.get(c).findAll(By.tagName("a")).last().click();
                break;
            }
            if (td.get(c).text().equals(conta)) {
                delete = true;
            }
        }
        return this;
    }
}
