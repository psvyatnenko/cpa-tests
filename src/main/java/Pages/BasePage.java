package Pages;


import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BasePage {

    public void getSystemProperty() {
        System.setProperty("webdriver.chrome.driver", "C:\\Progs\\chromedriver_win32\\chromedriver.exe");
        //Doesn't matter chrome or Chrome as this is case insensitive.
        System.setProperty("selenide.browser", "Chrome");
        System.setProperty("selenide.timeouts", "6000");
    }

    public void pageRefresh(){
        getWebDriver().navigate().refresh();
    }
}
