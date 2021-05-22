package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Test1 {
    private String fName;
    private String lName;
    private String sex;
    private String phone;

    public void setData(String firstName, String lastName, String gender, String phoneNumber){
        fName = firstName;
        lName = lastName;
        sex = gender;
        phone = phoneNumber;
    }



    public void fillForm() {

        $("#firstName").setValue(fName);
        $("#lastName").setValue(lName);

        if(sex.equals("Male")){
            $("[for='gender-radio-1']").click(); // Male
        } else if (sex.equals("Female")) {
            $("[for='gender-radio-2']").click(); // Female
        } else {
            $("[for='gender-radio-3']").click(); // Other
        }

        $("#userNumber").setValue(phone);
        $("#submit").click();
    }

    public void checkForm() {
        $(".table-responsive").shouldHave(
                text(fName),
                text(lName),
                text(sex),
                text(phone)
        );
    }
}
