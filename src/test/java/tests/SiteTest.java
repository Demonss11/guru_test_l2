package tests;

import org.openqa.selenium.By;
import tests.base.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

class SiteTest extends TestBase {


    @Test
    public void selenideSiteTest() {

        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("abc");
        $("#lastName").setValue("abc");
        $("[for='gender-radio-1']").click();
        $("#userNumber").setValue("1234567890");
        $("#submit").click();
        $(".table-responsive").shouldHave(text("abc"));
    }
}