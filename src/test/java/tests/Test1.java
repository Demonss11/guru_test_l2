package tests;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test1 {
    Map<String,String> dataMap = new HashMap<String,String>();

    public void setData(){
        dataMap.put("firstName", "Dmitriy");
        dataMap.put("lastName", "Belousov");
        dataMap.put("Male", "[for='gender-radio-1']");
        dataMap.put("phoneNumber", "1234567890");
    }


    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    public void fillForm() {

        $("#firstName").setValue(dataMap.get("firstName"));
        $("#lastName").setValue(dataMap.get("lastName"));
        $("[for='gender-radio-1']").click(); // Male
        $("#userNumber").setValue(dataMap.get("phoneNumber"));
        $("#submit").click();
    }

    public void checkForm() {
        $(".table-responsive").shouldHave(
                text(dataMap.get("firstName")),
                text(dataMap.get("lastName")),
                text("Male"),
                text(dataMap.get("phoneNumber"))
        );
    }
}
