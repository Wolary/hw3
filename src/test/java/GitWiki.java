import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

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

      //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertion
      //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

    }


}
