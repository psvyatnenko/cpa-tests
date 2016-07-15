package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class RegAdvPage extends RegPage{

    //    RegADVPage locators and labels:
    public String regADVPageURL = mainPageURL + "registration#advertiser";
    public WebElement regADVPageRegADVLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/h4"));
    public String regADVPageRegADVLabelText = "Регистрация рекламодателя";
    public String regADVPageFieldsErrorLabelText = "Обязательноe поле";
    //    LoginField
    public WebElement regADVPageLoginFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[1]/label"));
    public String regADVPageLoginFieldLabelText = "Фамилия, Имя, Отчество:";
    public WebElement regADVPageLoginField = $(By.xpath(".//*[@id='name2']"));
    public String regADVPageLoginFieldPlaceholder = "Иванов Иван Иванович";
    public WebElement regADVPageLoginFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[1]/em"));
    //    EmailField
    public WebElement regADVPageEmailFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[2]/label"));
    public String regADVPageEmailFieldLabelText = "Электронная почта:";
    public WebElement regADVPageEmailField = $(By.xpath(".//*[@id='email2']"));
    public String regADVPageEmailFieldPlaceholder = "email@gmail.com";
    public WebElement regADVPageEmailFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[2]/em"));
    public String regADVPageEmailFieldErrorLabelText = "Неверный формат email адреса";
    //    PhoneField
    public WebElement regADVPagePhoneFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[3]/label"));
    public String regADVPagePhoneFieldLabelText = "Телефон для связи:";
    public WebElement regADVPagePhoneField = $(By.xpath(".//*[@id='phone']"));
    public String regADVPagePhoneFieldPlaceholder = "3809509992233";
    public WebElement regADVPagePhoneFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[3]/em"));
    public String regADVPagePhoneFieldErrorLabelText = "Неверный формат телефона";
    //    SkypeField
    public WebElement regADVPageSkypeFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[4]/label"));
    public String regADVPageSkypeFieldLabelText = "Skype:";
    public WebElement regADVPageSkypeField = $(By.xpath(".//*[@id='skype']"));
    public String regADVPageSkypeFieldPlaceholder = "skype";
    public WebElement regADVPageSkypeFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[4]/em"));
    public String regADVPageSkypeFieldErrorLabelText = "Неверный формат Skype логина";
    //    NameCompanyField
    public WebElement regADVPageNameCompanyFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[5]/label"));
    public String regADVPageNameCompanyFieldLabelText = "Название компании:";
    public WebElement regADVPageNameCompanyField = $(By.xpath(".//*[@id='company']"));
    public String regADVPageNameCompanyFieldPlaceholder = "Компании";
    public WebElement regADVPageNameCompanyFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[5]/em"));
    //    ProductField
    public WebElement regADVPageProductFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[6]/label"));
    public String regADVPageProductFieldLabelText = "Рекламируемый продукт (услуга):";
    public WebElement regADVPageProductField = $(By.xpath(".//*[@id='product']"));
    public String regADVPageProductFieldPlaceholder = "Ягоды Годжи";
    public WebElement regADVPageProductFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[6]/em"));
//    LandingField
    public WebElement regADVPageLandingFieldLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[7]/label"));
    public String regADVPageLandingFieldLabelText = "Адрес сайта (лэндинга):";
    public WebElement regADVPageLandingField = $(By.xpath(".//*[@id='website']"));
    public String regADVPageLandingFieldPlaceholder = "website.com";
    public WebElement regADVPageLandingFieldErrorLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[7]/em"));
//    TargetDropDawn
    public WebElement regADVPageTargetDropDawnLabel = $(By.xpath("html/body/div[3]/main/div/div[1]/div[2]/div[2]/form/div[8]/label"));
    public String regADVPageDropDawnLabelText = "Целевое действие:";
    public WebElement regADVPageDropDawn1 = $(By.xpath(".//*[@id='target-button']/span[2]"));
    public String regADVPageDropDawnText1 = "Оплаченный заказ";
    public WebElement regADVPageDropDawn2 = $(By.xpath(".//*[@id='ui-id-2']"));
    public String regADVPageDropDawnText2 = "Заполнение формы";
    public WebElement regADVPageDropDawn3 = $(By.xpath(".//*[@id='ui-id-3']"));
    public String regADVPageDropDawnText3 = "Просмотр видео";

    
    
    
    
    
}
