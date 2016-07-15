package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;


public class MainPage extends BasePage {

//    MainPage locators and labels:

    public String mainPageURL = "http://web.cpa-dev.safesocks.ru/";
    public String mainPageTitle = "Рекламная сеть EverAD - лучшая партнерская (CPA) сеть по продаже товаров";
    public WebElement logo = $(By.xpath("html/body/div[3]/header/div[1]/a/img"));
//    locators and labels in header:
    public WebElement wmLink = $(By.xpath("html/body/div[3]/header/div[2]/ul/li[1]/a"));
    public String wmLinkText = "Вебмастеру";
    public WebElement advLink = $(By.xpath("html/body/div[3]/header/div[2]/ul/li[2]/a"));
    public String advLinkText = "Рекламодателю";
    public WebElement aboutSystemLink = $(By.xpath("html/body/div[3]/header/div[2]/ul/li[3]/a"));
    public String aboutSystemLinkText = "О системе";
    public WebElement contactLink = $(By.xpath("html/body/div[3]/header/div[2]/ul/li[4]/a"));
    public String contactLinkText = "Контакты";
    public WebElement enterAndRegButton = $(By.xpath("html/body/div[3]/header/div[3]/a"));
    public String enterAndRegButtonText = "Вход и регистрация";
//    locators and labels in iWMBlock:
    public WebElement iAmWMButton = $(By.xpath("html/body/div[3]/main/div[1]/div[1]/div[1]/a[1]"));
    public String iAmWMButtonText = "Я веб-мастер";
    public WebElement iAmWMBannerText1Locator = $(By.xpath("html/body/div[3]/main/div[1]/div[1]/div[1]/p/text()[1]"));
    public String iAmWMBannerText1 = "EverAD - это сеть партнёрских интернет-площадок и";
    public WebElement iAmWMBannerText2Locator = $(By.xpath("html/body/div[3]/main/div[1]/div[1]/div[1]/p/text()[2]"));
    public String iAmWMBannerText2 = "рекламных предложений с оплатой за действие.";
//    locators and labels in iADVBlock:
    public WebElement iAmAdvButton = $(By.xpath("html/body/div[3]/main/div[1]/div[1]/div[2]/a[1]"));
    public String iAmAdvButtonText = "Я рекламодатель";
    public WebElement iAmAdvBannerText1Locator = $(By.xpath("html/body/div[3]/main/div[1]/div[1]/div[2]/p/text()[1]"));
    public String iAmAdvBannerText1 = "Вы хотите увеличить свои продажи в интернете";
    public WebElement iAmAdvBannerText2Locator = $(By.xpath("html/body/div[3]/main/div[1]/div[1]/div[2]/p/text()[2]"));
    public String iAmAdvBannerText2 = "прямо сейчас? Напишите нам!";

    public WebElement regButton = $(By.xpath("html/body/div[3]/main/div[1]/a"));
    public WebElement regButtonFooter = $(By.xpath(".//*[@id='section5']/a"));
    public String regButtonText = "Зарегистрироваться";
//    locators and labels in footer:
    public WebElement forWMLabel = $(By.xpath("html/body/footer/div/div[1]/p"));
    public String forWMLabelText = "Для веб-мастеров";
    public WebElement rulesLink = $(By.xpath("html/body/footer/div/div[1]/ul/li[1]/a"));
    public String rulesLinkText = "Правила";
    public WebElement faqLink = $(By.xpath("html/body/footer/div/div[1]/ul/li[2]/a"));
    public String faqLinkText = "FAQ";
    public WebElement forAdvLabel = $(By.xpath("html/body/footer/div/div[2]/p"));
    public String forAdvLabelText = "Рекламодателям";
    public WebElement addProjectLink = $(By.xpath("html/body/footer/div/div[2]/ul/li/a"));
    public String addProjectLinkText = "Разместить проект";
    public WebElement companyLabel = $(By.xpath("html/body/footer/div/div[3]/p"));
    public String companyLabelText = "Компания";
    public WebElement aboutUsLink = $(By.xpath("html/body/footer/div/div[3]/ul/li[1]/a"));
    public String aboutUsLinkText = "О нас";
    public WebElement contactsFooterLink = $(By.xpath("html/body/footer/div/div[3]/ul/li[2]/a"));
    public String contactsFooterText = "Контакты";
    public WebElement privacyLink = $(By.xpath("html/body/footer/div/div[3]/ul/li[3]/a"));
    public String privacyLinkText = "Политика конфиденциальности";
    public WebElement postAddressLabel = $(By.xpath("html/body/footer/div/div[4]/p"));
    public String postAddressLabelText = "Почтовый адрес";
    public WebElement postAddressLocator1 = $(By.xpath("html/body/footer/div/div[4]/div/p[1]"));
    public String postAddressText1 = "Cariovision Trade Ltd. Geneva Place";
    public WebElement postAddressLocator2 = $(By.xpath("html/body/footer/div/div[4]/div/p[2]"));
    public String postAddressText2 = "Waterfront Drive, P.O. Box 3469, Road";
    public WebElement postAddressLocator3 = $(By.xpath("html/body/footer/div/div[4]/div/p[3]"));
    public String postAddressText3 = "Town, Tortola. BVI";
    public WebElement megaStockLink = $(By.xpath("html/body/footer/div/div[5]/ul/li[1]/a/img"));
    public WebElement webManyAtestatLink = $(By.xpath("html/body/footer/div/div[5]/ul/li[2]/a/img"));
    public WebElement checkAtestatLink = $(By.xpath("html/body/footer/div/div[5]/ul/li[2]/a/span"));
    public String checkAtestatLinkText = "Проверить аттестат";
    public WebElement enterAndRegPopup = $(By.xpath(".//*[@id='form_popup']"));

//   popUpElements:
    public WebElement popupHeader = $(By.xpath(".//*[@id='form_popup']/div[1]"));
    public String popupHeaderText = "Войти в аккаунт";
    public WebElement popupClose = $(By.xpath(".//*[@id='form_popup']/div[1]/a"));
    public WebElement popupEmailField = $(By.xpath(".//*[@id='login-container']/div/form/div[1]/div[1]/input"));
    public  String popupEmailFieldPlaceholderText = "Email";
    public WebElement popupPasswordField = $(By.xpath(".//*[@id='login-container']/div/form/div[1]/div[2]/input"));
    public  String popupPasswordFieldPlaceholderText = "Пароль";
    public WebElement popupRememberMeCheckBox = $(By.xpath(".//*[@id='login-container']/div/form/div[2]/label"));
    public WebElement popupRememberMeLabel = $(By.xpath(".//*[@id='login-container']/div/form/div[2]/label"));
    public String popupRememberMeLabelText = "Запомнить меня";
    public WebElement popupForgotPasswordLink = $(By.xpath(".//*[@id='login-container']/div/form/div[2]/a"));
    public String popupForgotPasswordLinkText = "Забыли пароль?";
    public WebElement popupEnterButton = $(By.xpath(".//*[@id='login-container']/div/form/div[2]/div/input[1]"));
    public String popupEnterButtonText = "Войти";
    public WebElement popupEnterVKLogo = $(By.xpath(".//*[@id='login-container']/div/form/div[2]/div/a[1]/i"));
    public WebElement popupEnterFBLogo = $(By.xpath(".//*[@id='login-container']/div/form/div[2]/div/a[2]/i"));
    public WebElement popupCancelButton = $(By.xpath(".//*[@id='login-container']/div/form/div[2]/div/input[2]"));
    public String popupCancelButtonText = "Отмена";
    public WebElement popupWrongEmailOrPasswordLabel = $(By.xpath(".//*[@id='login-container']/div/form/div[1]/p"));
    public String popupWrongEmailOrPasswordLabelText = "Неверный email или пароль";
    public WebElement popupDontHaveAccountLabel = $(By.xpath(".//*[@id='form_popup']/div[4]/p"));
    public String popupDontHaveAccountLabelText = "Нет аккаунта?";
    public WebElement popupRegButton = $(By.xpath(".//*[@id='form_popup']/div[4]/a"));
    public String popupRegButtonText = "Зарегистрироваться";
    public WebElement popupForgotPasswordLabel = $(By.xpath(".//*[@id='recover-password-container']/div/form/p"));
    public String popupForgotPasswordLabelText = "На заданный E-mail адрес, будет выслана ссылка." +
            " По которой вы сможете создать новый пароль по вашей учетной записи";
    public WebElement popupForgotPasswordEmailField =
            $(By.xpath(".//*[@id='recover-password-container']/div/form/div/input"));
    public WebElement popupForgotPasswordWrongEmailLabel =
            $(By.xpath(".//*[@id='recover-password-container']/div/form/div/em"));
    public String popupForgotPasswordWrongEmailLabelText = "Пользователь с таким E-mail адресом не найден";
    public WebElement popupForgotPasswordRestoreButton =
            $(By.xpath(".//*[@id='recover-password-container']/div/form/button"));
    public String popupForgotPasswordRestoreButtonText = "Восстановить";

    // methods MainPage:

    public void goToMainPage(){
        getSystemProperty();
        open(mainPageURL);
    }
    public MainPage clickOnLogo(){
        logo.click();
        return new MainPage();

    }
    public MainPage clickOnWMLink(){
        wmLink.click();
        return new MainPage();

    }
    public MainPage clickOnAdvLink(){
        advLink.click();
        return new MainPage();

    }
    public AboutSystemPage clickOnAboutSystemLink(){
        aboutSystemLink.click();
        return new AboutSystemPage();

    }

    public ContactPage clickOnContactLink(){
        contactLink.click();
        return new ContactPage();

    }

    public MainPage clickOnEnterAndRegButton(){
        enterAndRegButton.click();
        return new MainPage();

    }
    public MainPage clickOnIamWMButton(){
        iAmWMButton.click();
        return new MainPage();

    }
    public MainPage clickOnIamAdvButton(){
        iAmAdvButton.click();
        return new MainPage();

    }
    public RegPage clickOnRegButton(){
        regButton.click();
        return new RegPage();

    }
    public RegAdvPage clickOnAddProjectLink(){
        addProjectLink.click();
        return new RegAdvPage();
    }
    public RegPage clickOnRegButtonFooter(){
        regButtonFooter.click();
        return new RegPage();

    }
    public RulesPage clickOnRulesLink(){
        rulesLink.click();
        return new RulesPage();

    }
    public FAQPage clickOnFAQLink(){
        faqLink.click();
        return new FAQPage();

    }
    public AboutSystemPage clickOnAboutUsLink(){
        aboutUsLink.click();
        return new AboutSystemPage();

    }
    public ContactPage clickOnContactsFooterLink(){
        contactsFooterLink.click();
        return new ContactPage();

    }
    public PrivacyPage clickOnPrivacyLink(){
        privacyLink.click();
        return new PrivacyPage();

    }
    public void clickPopupEnterButton(){
        popupEnterButton.click();

    }
    public void clickOnPopupCancelButton(){
        popupCancelButton.click();
        return;

    }
    public void clickPopupRememberMeCheckBox(){
        popupRememberMeCheckBox.click();
        return;

    }
    public RegPage clickOnPopupRegButton(){
        popupRegButton.click();
        return new RegPage();

    }
    public MainPage clickOnPopupForgotPasswordLink(){
        popupForgotPasswordLink.click();
        return new MainPage();

    }
    public void clickOnPopupEnterVKLogo(){
        popupEnterVKLogo.click();
        return;
    }
    public void clickOnPopupEnterFBLogo(){
        popupEnterFBLogo.click();
        return;
    }
    public void clickOnPopupForgotPasswordRestoreButton(){
        popupForgotPasswordRestoreButton.click();
        return;
    }

    public MainPage closeEnterAndRegPopup(){
        popupClose.click();
        return new MainPage();
    }


//  Checks of elements:

    public void checkMainPageTitle(){
        assertEquals(title(),mainPageTitle);
    }
    public void checkMainPageUrl(){
        assertEquals(url(), mainPageURL);
    }
    public void checkEveradLogo(){
        $(logo).shouldBe(visible);
    }
    public void checkWMLink(){
        $(wmLink).shouldBe(visible).shouldHave(text(wmLinkText));
    }
    public void checkADVLink(){
        $(advLink).shouldBe(visible).shouldHave(text(advLinkText));
    }
    public void checkAboutSystemLink(){
        $(aboutSystemLink).shouldBe(visible).shouldHave(text(aboutSystemLinkText));
    }
    public void checkContactLink(){
        $(contactLink).shouldBe(visible).shouldHave(text(contactLinkText));
    }
    public void checkEnterAndRegButton(){
        $(enterAndRegButton).shouldBe(visible).shouldHave(text(enterAndRegButtonText));
    }
    public void checkIamWMButton(){
        $(iAmWMButton).shouldBe(visible).shouldHave(text(iAmWMButtonText));
    }
    public void checkIamADVButton(){
        $(iAmAdvButton).shouldBe(visible).shouldHave(text(iAmAdvButtonText));
    }
    public void checkIamWMBannerText(){
        $(iAmWMBannerText1Locator).shouldBe(visible).shouldHave(text(iAmWMBannerText1));
        $(iAmWMBannerText2Locator).shouldBe(visible).shouldHave(text(iAmWMBannerText2));
    }
    public void checkIamADVBannerText(){
        $(iAmAdvBannerText1Locator).shouldBe(visible).shouldHave(text(iAmAdvBannerText1));
        $(iAmAdvBannerText2Locator).shouldBe(visible).shouldHave(text(iAmAdvBannerText2));
    }
    public void checkRegButton(){
        $(regButton).shouldBe(visible).shouldHave(text(regButtonText));
    }

//    Images???

    public void checkRegButtonFooter(){
        $(regButtonFooter).shouldBe(visible).shouldHave(text(regButtonText));
    }
    public void checkForWMLabel(){
        $(forWMLabel).shouldBe(visible).shouldHave(text(forWMLabelText));
    }
    public void checkRulesLink(){
        $(rulesLink).shouldBe(visible).shouldHave(text(rulesLinkText));
    }
    public void checkFAQLink(){
        $(faqLink).shouldBe(visible).shouldHave(text(faqLinkText));
    }
    public void checkForAdvLabel(){
        $(forAdvLabel).shouldBe(visible).shouldHave(text(forAdvLabelText));
    }
    public void checkAddProjectLink(){
        $(addProjectLink).shouldBe(visible).shouldHave(text(addProjectLinkText));
    }
    public void checkAboutCompanyLabel(){
        $(companyLabel).shouldBe(visible).shouldHave(text(companyLabelText));
    }
    public void checkAboutUsLink(){
        $(aboutUsLink).shouldBe(visible).shouldHave(text(aboutUsLinkText));
    }
    public void checkContactsFooterLink(){
        $(contactsFooterLink).shouldBe(visible).shouldHave(text(contactsFooterText));
    }
    public void checkPrivacyLink(){
        $(privacyLink).shouldBe(visible).shouldHave(text(privacyLinkText));
    }
    public void checkPostAddressLabel(){
        $(postAddressLabel).shouldBe(visible).shouldHave(text(postAddressLabelText));
    }
    public void checkPostAddress(){
        $(postAddressLocator1).shouldBe(visible).shouldHave(text(postAddressText1));
        $(postAddressLocator2).shouldBe(visible).shouldHave(text(postAddressText2));
        $(postAddressLocator3).shouldBe(visible).shouldHave(text(postAddressText3));
    }
    public void checkEnterAndRegPopup(){
        $(enterAndRegPopup).shouldBe(visible);
    }
    public void checkPopupHeader(){
        $(popupHeader).shouldBe(visible).shouldHave(text(popupHeaderText));
    }
    public void checkPopupClose(){
        $(popupClose).shouldBe(visible);
    }
    public void checkPopupEmailField(){
        $(popupEmailField).shouldBe(visible).shouldBe(empty);
        assertEquals(popupEmailField.getAttribute("placeholder"), popupEmailFieldPlaceholderText);
    }
    public void checkPopupPasswordField(){
        $(popupPasswordField).shouldBe(visible).shouldBe(empty);
        assertEquals(popupPasswordField.getAttribute("placeholder"), popupPasswordFieldPlaceholderText);
    }
    public void checkPopupRememberMeCheckBoxIsNotChecked(){
        $(popupRememberMeCheckBox).shouldBe(visible).shouldNotBe(selected);
    }
    public void checkPopupRememberMeCheckBoxIsChecked(){
        $(popupRememberMeCheckBox).shouldBe(visible).shouldHave(attribute("checkbox", "checked"));
    }
    public void checkPopupRememberMeLabel(){
        $(popupRememberMeLabel).shouldBe(visible).shouldHave(text(popupRememberMeLabelText));
    }
    public void checkPopupForgotPasswordLink(){
        $(popupForgotPasswordLink).shouldBe(visible).shouldHave(text(popupForgotPasswordLinkText));
    }
    public void checkPopupEnterButton(){
        $(popupEnterButton).shouldBe(visible).shouldHave(value(popupEnterButtonText));
    }
    public void checkPopupEnterVKLogo(){
        $(popupEnterVKLogo).shouldBe(visible);
    }
    public void checkPopupEnterFBLogo(){
        $(popupEnterFBLogo).shouldBe(visible);
    }
    public void checkPopupCancelButton(){
        $(popupCancelButton).shouldBe(visible).shouldHave(value(popupCancelButtonText));
    }
    public void checkPopupWrongEmailOrPasswordLabelIsNotPresent(){
        $(popupForgotPasswordWrongEmailLabel).shouldNotBe(visible);
    }
    public void checkPopupWrongEmailOrPasswordLabelIsPresent(){
        $(popupWrongEmailOrPasswordLabel).shouldBe(visible).shouldHave(text(popupWrongEmailOrPasswordLabelText));
    }
    public void checkPopupDontHaveAccountLabel(){
        $(popupDontHaveAccountLabel).shouldBe(visible).shouldHave(text(popupDontHaveAccountLabelText));
    }
    public void checkPopupRegButton(){
        $(popupRegButton).shouldBe(visible).shouldHave(text(popupRegButtonText));
    }
    public void checkPopupForgotPasswordEmailField(){
        $(popupForgotPasswordEmailField).shouldBe(visible);
        assertEquals(popupPasswordField.getAttribute("placeholder"), popupPasswordFieldPlaceholderText);
    }
    public void checkPopupForgotPasswordRestoreButton(){
        $(popupForgotPasswordRestoreButton).shouldBe(visible).shouldHave(text(popupForgotPasswordRestoreButtonText));
    }
    public void checkPopupForgotPasswordWrongEmailLabelIsNotPresent(){
        $(popupForgotPasswordWrongEmailLabel).shouldNotBe(visible);
    }
    public void checkPopupForgotPasswordWrongEmailLabelIsPresent(){
        $(popupForgotPasswordWrongEmailLabel).shouldBe(visible).shouldHave(text(popupForgotPasswordWrongEmailLabelText));
    }

    public void checkMegaStockLink(){
        $(megaStockLink).shouldBe(visible);
    }
    public void checkWebManyAtestatLink(){
        $(webManyAtestatLink).shouldBe(visible);
    }
    public void checkCheckAtestatLink(){$(checkAtestatLink).shouldBe(visible).shouldHave(text(checkAtestatLinkText));
    }


}
