package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class RegPage extends MainPage{


    //    RegPage locators and labels:
    public String regPageURL = "http://web.cpa-dev.safesocks.ru/";
    public WebElement regPageIamWMButton = $(By.xpath("html/body/div[3]/main/div/ul/li[1]/a"));
    public String regPageIamWMButtonText = "Вебмастер";
    public WebElement regPageIamADVButton = $(By.xpath("html/body/div[3]/main/div/ul/li[2]/a"));
    public String regPageIamADVButtonText = "Рекламодатель";




}
