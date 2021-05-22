package tests;

import org.junit.jupiter.api.Test;
import tests.base.TestBase;


class MainTest extends TestBase {
    Test1 test1;


    //@ParameterizedTest
    @Test
    public void selenideSiteTest() {
        test1 = new Test1();

        test1.setData();
        test1.openPage();
        test1.fillForm();
        test1.checkForm();
    }
}