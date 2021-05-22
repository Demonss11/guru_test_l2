package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import tests.base.TestBase;

import static com.codeborne.selenide.Selenide.open;


class MainTest extends TestBase {
    Test1 test1;

    @BeforeEach
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
    @ParameterizedTest
    public void selenideSiteTest(String firstName, String lastName, String gender, String phoneNumber) {

        test1 = new Test1();

        test1.setData(firstName, lastName, gender, phoneNumber);
        test1.fillForm();
        test1.checkForm();
    }
}