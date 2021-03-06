import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
public class DragAndDrop {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
void dragAndDrop() {
        //открываем сайт
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //Проверяем квадраты
        $("#column-a").shouldHave(text("a"));
        $("#column-b").shouldHave(text("b"));

        //перетаскиваем
        $("#column-a").dragAndDropTo($("#column-b"));

        //проверяем что перетащилось
        $("#column-a").shouldHave(text("b"));
        $("#column-b").shouldHave(text("a"));
    }
}
