package Runner;

import Base.Setup;
import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageRunner extends Setup {
    //HomePage homePage = new HomePage(driver);
    @Test
    public void homePageTest()
    {
        driver.get("https://dhiofur.texrootsourcing.com");
        HomePage homePage = new HomePage(driver);
        homePage.bookappointMent();

    }
}
