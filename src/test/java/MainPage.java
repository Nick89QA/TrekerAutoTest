import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

public class MainPage {
    @Test
     public void testVerification() {
        open("https://coderoad.ru");
        SelenideElement search = $(By.xpath("//input[@name='q']"));
          search.setValue("nick.pe3ch@gmail.com");

    }
}
