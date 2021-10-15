package commons;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class Common {

    @BeforeMethod
    public void initialConfig() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://srbarriga.herokuapp.com";
        Configuration.timeout = 10000;
    }

    public SelenideElement alert() {
        return $(".alert.alert-success");
    }
}
