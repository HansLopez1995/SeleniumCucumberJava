package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    publish = true,
    tags = "@Grid"
    //tags = "@Grid and @Smoke"
)

public class Runner{
    @BeforeClass
    public static void pantallaCompleta(){
        BasePage.chromeFullScreen();
    }

    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
}