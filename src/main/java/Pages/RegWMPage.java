package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class RegWMPage extends RegPage{

    //    RegWMPage locators and labels:

    public String regWMPageURL = mainPageURL + "registration#affiliate";
    public WebElement regWMPageRegWMLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/h4"));
    public String regWMPageRegWMLabelText = "Регистрация вебмастера";
    public String regWMPageFieldsErrorLabelText = "Обязательноe поле";
//    LoginField
    public WebElement regWMPageLoginFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[1]/label"));
    public String regWMPageLoginFieldLabelText = "Имя или никнейм:";
    public WebElement regWMPageLoginField = $(By.xpath(".//*[@id='name']"));
    public String regWMPageLoginFieldPlaceholder = "Логин";
    public WebElement regWMPageLoginFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[1]/em"));
//    EmailField
    public WebElement regWMPageEmailFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[2]/label"));
    public String regWMPageEmailFieldLabelText = "Электронная почта:";
    public WebElement regWMPageEmailField = $(By.xpath(".//*[@id='email']"));
    public String regWMPageEmailFieldPlaceholder = "Email";
    public WebElement regWMPageEmailFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[2]/em"));
    public String regWMPageEmailFieldErrorLabelText = "Неверный формат email адреса";
//    PasswordField
    public WebElement regWMPagePasswordFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[3]/label"));
    public String regWMPagePasswordFieldLabelText = "Пароль:";
    public WebElement regWMPagePasswordField = $(By.xpath(".//*[@id='password']"));
    public String regWMPagePasswordFieldPlaceholder = "Пароль";
    public WebElement regWMPagePasswordFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[3]/em"));
//    RepeatPasswordField
    public WebElement regWMPageRepeatPasswordFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[4]/label"));
    public String regWMPageRepeatPasswordFieldLabelText = "Пароль еще раз:";
    public WebElement regWMPageRepeatPasswordField = $(By.xpath(".//*[@id='repeat_password']"));
    public String regWMPageRepeatPasswordFieldPlaceholder = "Подтверждение пароля";
    public WebElement regWMPageRepeatPasswordFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[4]/em"));
//    SkypeField
    public WebElement regWMPageSkypeFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[5]/label"));
    public String regWMPageSkypeFieldLabelText = "Skype:";
    public WebElement regWMPageSkypeField = $(By.xpath(".//*[@id='skype']"));
    public String regWMPageSkypeFieldPlaceholder = "Ваш skype логин";
//    WMRField
    public WebElement regWMPageWMRFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[6]/label"));
    public String regWMPageWMRFieldLabelText = "WMR:";
    public WebElement regWMPageWMRField = $(By.xpath(".//*[@id='wmr']"));
    public String regWMPageWMRFieldPlaceholder = "Ваш кошелек WMR";
    public WebElement regWMPageWMRFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[6]/em"));
    public String regWMPageWMRFieldErrorLabelText = "Неверный формат WMR кошелька";
//    AgreeRulesCheckBox
    public WebElement regWMPageAgreeRulesCheckBox = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[7]/span"));
//    AgreeRulesLink
    public WebElement regWMPageAgreeRulesLink = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[7]/a"));
    public String regWMPageAgreeRulesLinkText = "Согласен с правилами сети EverAD";
//    RegButton
    public WebElement regWMPageRegButton = $(By.xpath("html/body/div[3]/main/div/div[1]/div[1]/div[2]/form/div[8]/input"));
    public String regWMPageRegButtonText = "Зарегистрироваться";

//    RegWMPage Methods:
    public void goToRegWMPage(){
        getSystemProperty();
        open(regWMPageURL);
    }
    public void clickOnRegWMPageRegButton(){
        regWMPageRegButton.click();
    }
    public void clickOnRegWMPageAgreeRulesCheckBox(){
        regWMPageAgreeRulesCheckBox.click();
    }
    public RulesPage clickOnRegWMPageAgreeRulesLink(){
        regWMPageAgreeRulesLink.click();
        return new RulesPage();
    }

//    RegWMPage checks:

    public void checkRegWMPageUrl(){
        assertEquals(url(), regWMPageURL);
    }
    public void checkRegWMPageRegWMLabel(){
        $(regWMPageRegWMLabel).shouldBe(visible).shouldHave(text(regWMPageRegWMLabelText));
    }
//    checks for LoginField:
    public void checkRegWMPageLoginFieldLabel(){
        $(regWMPageLoginFieldLabel).shouldHave(text(regWMPageLoginFieldLabelText));
    }
    public void checkRegWMPageLoginField(){
        $(regWMPageLoginField).shouldBe(visible).shouldBe(empty);
        assertEquals(regWMPageLoginField.getAttribute("placeholder"), regWMPageLoginFieldPlaceholder);
    }
    public void checkRegWMPageLoginFieldErrorLabelIsNotPresent(){
        $(regWMPageLoginFieldErrorLabel).shouldNotBe(visible);
    }
    public void checkRegWMPageLoginFieldErrorLabelIsPresent(){
        $(regWMPageLoginFieldErrorLabel).shouldBe(visible).shouldHave(text(regWMPageFieldsErrorLabelText));
    }

//    checks for EmailField:
    public void checkRegWMPageEmailFieldLabel(){
        $(regWMPageEmailFieldLabel).shouldHave(text(regWMPageEmailFieldLabelText));
    }
    public void checkRegWMPageEmailField(){
        $(regWMPageEmailField).shouldBe(visible).shouldBe(empty);
        assertEquals(regWMPageEmailField.getAttribute("placeholder"), regWMPageEmailFieldPlaceholder);
    }
    public void checkRegWMPageEmailFieldErrorLabelIsNotPresent(){
        $(regWMPageEmailFieldErrorLabel).shouldNotBe(visible);
    }
    public void checkRegWMPageEmailFieldErrorLabelIsPresent(){
        $(regWMPageEmailFieldErrorLabel).shouldBe(visible).shouldHave(text(regWMPageEmailFieldErrorLabelText));
    }

//    checks for PasswordField:
    public void checkRegWMPagePasswordFieldLabel(){
        $(regWMPagePasswordFieldLabel).shouldHave(text(regWMPagePasswordFieldLabelText));
    }
    public void checkRegWMPagePasswordField(){
        $(regWMPagePasswordField).shouldBe(visible).shouldBe(empty);
        assertEquals(regWMPagePasswordField.getAttribute("placeholder"), regWMPagePasswordFieldPlaceholder);
    }
    public void checkRegWMPagePasswordFieldErrorLabelIsNotPresent(){
        $(regWMPagePasswordFieldErrorLabel).shouldNotBe(visible);
    }
    public void checkRegWMPagePasswordFieldErrorLabelIsPresent(){
        $(regWMPagePasswordFieldErrorLabel).shouldBe(visible).shouldHave(text(regWMPageFieldsErrorLabelText));
    }

//    checks for RepeatPasswordField:
    public void checkRegWMPageRepeatPasswordFieldLabel(){
        $(regWMPageRepeatPasswordFieldLabel).shouldHave(text(regWMPageRepeatPasswordFieldLabelText));
    }
    public void checkRegWMPageRepeatPasswordField(){
        $(regWMPageRepeatPasswordField).shouldBe(visible).shouldBe(empty);
        assertEquals(regWMPageRepeatPasswordField.getAttribute("placeholder"), regWMPageRepeatPasswordFieldPlaceholder);
    }
    public void checkRegWMPageRepeatPasswordFieldErrorLabelIsNotPresent(){
        $(regWMPageRepeatPasswordFieldErrorLabel).shouldNotBe(visible);
    }
    public void checkRegWMPageRepeatPasswordFieldErrorLabelIsPresent(){
        $(regWMPageRepeatPasswordFieldErrorLabel).shouldBe(visible).shouldHave(text(regWMPageFieldsErrorLabelText));
    }

//    checks for SkypeField:
    public void checkRegWMPageSkypeFieldLabel(){
        $(regWMPageSkypeFieldLabel).shouldHave(text(regWMPageSkypeFieldLabelText));
    }
    public void checkRegWMPageSkypeField(){
        $(regWMPageSkypeField).shouldBe(visible).shouldBe(empty);
        assertEquals(regWMPageSkypeField.getAttribute("placeholder"), regWMPageSkypeFieldPlaceholder);
    }
//    checks for WMRField:
    public void checkRegWMPageWMRFieldLabel(){
        $(regWMPageWMRFieldLabel).shouldHave(text(regWMPageWMRFieldLabelText));
    }
    public void checkRegWMPageWMRField(){
        $(regWMPageWMRField).shouldBe(visible).shouldBe(empty);
        assertEquals(regWMPageWMRField.getAttribute("placeholder"), regWMPageWMRFieldPlaceholder);
    }
    public void checkRegWMPageWMRFieldErrorLabelIsNotPresent(){
        $(regWMPageWMRFieldErrorLabel).shouldNotBe(visible);
    }
    public void checkRegWMPageWMRFieldErrorLabelIsPresent(){
        $(regWMPageWMRFieldErrorLabel).shouldBe(visible).shouldHave(text(regWMPageWMRFieldErrorLabelText));
    }

//    checks for AgreeRulesCheckBox:
    public void checkRegWMPageAgreeRulesCheckBoxIsUnchecked(){
        $(regWMPageAgreeRulesCheckBox).shouldBe(visible);
        assertEquals(regWMPageAgreeRulesCheckBox.getAttribute("class"), "checkbox");
    }
    public void checkRegWMPageAgreeRulesCheckBoxIsChecked(){
        $(regWMPageAgreeRulesCheckBox).shouldBe(visible);
        assertEquals(regWMPageAgreeRulesCheckBox.getAttribute("class"), "checkbox checked");
    }
//    checks for AgreeRulesLink:
    public void checkRegWMPageAgreeRulesLink(){
        $(regWMPageAgreeRulesLink).shouldBe(visible).shouldHave(text(regWMPageAgreeRulesLinkText));
    }
//    checks for RegButton:
    public void checkRegWMPageRegButton(){
        $(regWMPageRegButton).shouldBe(visible).shouldHave(value(regWMPageRegButtonText));
    }
    public void checkRegWMPageRegButtonIsDisabled(){
        $(regWMPageRegButton).shouldBe(visible);
        assertEquals(regWMPageRegButton.getAttribute("disabled"), "");
    }
}
