import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitWiki {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void wiKi() {
      //открываем страницу selenide на github
       open("https://github.com/selenide/selenide");

      //Переходим на раздел WiKi
       $(".js-repo-nav").$(byText("Wiki")).click();

      //Проверяем, что в списке страниц есть страница SoftAssertion.
       $(".markdown-body").shouldHave(text("Soft assertions"));

      //открываем ее и проверяяем что внутри есть пример кода для JUnit5
       $(".markdown-body").find(byText("Soft assertions")).click();
       $(byText("Using JUnit5 extend test class:")).closest("div").shouldHave(text("@ExtendWith"));
    }


}
