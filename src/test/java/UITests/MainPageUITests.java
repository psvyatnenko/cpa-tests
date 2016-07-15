package UITests;

import Pages.MainPage;
import org.junit.Before;
import org.junit.Test;

public class MainPageUITests extends MainPage {

    @Before
    public void loadMainPage() {
//        Open MainPage:
        goToMainPage();
    }
    @Test
    public void assertMainPageTitle() {
        checkMainPageTitle();
        System.out.println("Test: assertMainPageTitle - PASSED");
    }
    @Test
    public void assertMainPageUrl() {
        checkMainPageUrl();
        System.out.println("Test: assertMainPageUrl - PASSED");
    }
    @Test
    public void assertMainPageLogo() {
        checkEveradLogo();
        System.out.println("Test: assertMainPageLogo - PASSED");
    }
    @Test
    public void assertWMLink() {
        checkWMLink();
        System.out.println("Test: assertWMLink - PASSED");
    }
    @Test
    public void assertADVLink() {
        checkADVLink();
        System.out.println("Test: assertADVLink - PASSED");
    }
    @Test
    public void assertAboutSystemLink() {
        checkAboutSystemLink();
        System.out.println("Test: assertAboutSystemLink - PASSED");
    }
    @Test
    public void assertContactLink() {
        checkContactLink();
        System.out.println("Test: assertContactLink - PASSED");
    }
    @Test
    public void assertEnterAndRegLink() {
        checkEnterAndRegButton();
        System.out.println("Test: assertEnterAndRegLink - PASSED");
    }
    @Test
    public void assertIamWMButton() {
        checkIamWMButton();
        System.out.println("Test: assertIamButton - PASSED");
    }
    @Test
    public void assertIamADVButton() {
        checkIamADVButton();
        System.out.println("Test: assertIamADVButton - PASSED");
    }
    @Test
    public void assertIamWMBannerText() {
        checkIamWMBannerText();
        System.out.println("Test: assertIamWMBannerText - PASSED");
    }
    @Test
    public void assertIamADVBannerText() {
        checkIamADVBannerText();
        System.out.println("Test: assertIamADVBannerText - PASSED");
    }
    @Test
    public void assertRegButton() {
        checkRegButton();
        System.out.println("Test: assertRegButton - PASSED");
    }

//    Images???

    @Test
    public void assertRegButtonFooter() {
        checkRegButtonFooter();
        System.out.println("Test: assertRegButtonFooter - PASSED");
    }
    @Test
    public void assertForWMLabel() {
        checkForWMLabel();
        System.out.println("Test: assertForWMLabel - PASSED");
    }
    @Test
    public void assertRulesLink() {
        checkRulesLink();
        System.out.println("Test: assertRulesLink - PASSED");
    }
    @Test
    public void assertForADVLabel() {
        checkForAdvLabel();
        System.out.println("Test: assertForADVLabel - PASSED");
    }
    @Test
    public void assertFAQLink() {
        checkFAQLink();
        System.out.println("Test: assertFAQLink - PASSED");
    }
    @Test
    public void assertAddProjectLink() {
        checkAddProjectLink();
        System.out.println("Test: assertAddProjectLink - PASSED");
    }
    @Test
    public void assertAboutCompanyLabel() {
        checkAboutCompanyLabel();
        System.out.println("Test: assertAboutCompanyLabel - PASSED");
    }
    @Test
    public void assertAboutUsLink() {
        checkAboutUsLink();
        System.out.println("Test: assertAboutUsLink - PASSED");
    }
    @Test
    public void assertContactsFooterLink() {
        checkContactsFooterLink();
        System.out.println("Test: assertContactsFooterLink - PASSED");
    }
    @Test
    public void assertPrivacyLink() {
        checkPrivacyLink();
        System.out.println("Test: assertPrivacyLink - PASSED");
    }

    @Test
    public void assertPostAddressLabel() {
        checkPostAddressLabel();
        System.out.println("Test: assertPostAddressLabel - PASSED");
    }
    @Test
    public void assertPostAddress() {
        checkPostAddress();
        System.out.println("Test: assertPostAddress - PASSED");
    }
    @Test
    public void assertWebManyAtestatLink() {
        checkWebManyAtestatLink();
        System.out.println("Test: assertWebManyAtestatLink - PASSED");
    }
    @Test
    public void assertMegaStockLink() {
        checkMegaStockLink();
        System.out.println("Test: assertCheckMegaStockLink - PASSED");
    }
    @Test
    public void assertCheckCheckAtestatLink() {
        checkCheckAtestatLink();
        System.out.println("Test: assertCheckAtestatLink - PASSED");
    }
    @Test
    public void assertPopup() {
        checkCheckAtestatLink();
        System.out.println("Test: assertCheckAtestatLink - PASSED");
    }
    @Test
    public void assertEnterAndRegPopup() {
        clickOnEnterAndRegButton();
        checkEnterAndRegPopup();
        System.out.println("Test: assertEnterAndRegPopup - PASSED");
    }
    @Test
    public void assertPopupHeader() {
        clickOnEnterAndRegButton();
        checkPopupHeader();
        System.out.println("Test: assertPopupHeader - PASSED");
    }
    @Test
    public void assertPopupClose() {
        clickOnEnterAndRegButton();
        checkPopupClose();
        System.out.println("Test: assertPopupClose - PASSED");
    }
    @Test
    public void assertPopupEmailField() {
        clickOnEnterAndRegButton();
        checkPopupEmailField();
        System.out.println("Test: assertPopupEmailField - PASSED");
    }
    @Test
    public void assertPopupPasswordField() {
        clickOnEnterAndRegButton();
        checkPopupPasswordField();
        System.out.println("Test: assertPopupPasswordField - PASSED");
    }
    @Test
    public void assertPopupRememberMeCheckBox() {
        clickOnEnterAndRegButton();
        checkPopupRememberMeCheckBoxIsNotChecked();
        clickPopupRememberMeCheckBox();
        checkPopupRememberMeCheckBoxIsChecked();
        System.out.println("Test: assertPopupRememberMeCheckBox - PASSED");
    }
    @Test
    public void assertPopupRememberMeLabel() {
        clickOnEnterAndRegButton();
        checkPopupRememberMeLabel();
        System.out.println("Test: assertPopupRememberMeLabel - PASSED");
    }
    @Test
    public void assertPopupForgotPasswordLink() {
        clickOnEnterAndRegButton();
        checkPopupForgotPasswordLink();
        System.out.println("Test: assertPopupForgotPasswordLink - PASSED");
    }
    @Test
    public void assertPopupEnterButton() {
        clickOnEnterAndRegButton();
        checkPopupEnterButton();
        System.out.println("Test: assertPopupEnterButton - PASSED");
    }
    @Test
    public void assertPopupEnterVKLogo() {
        clickOnEnterAndRegButton();
        checkPopupEnterVKLogo();
        System.out.println("Test: assertPopupEnterVKLogo - PASSED");
    }
    @Test
    public void assertPopupEnterFBLogo() {
        clickOnEnterAndRegButton();
        checkPopupEnterFBLogo();
        System.out.println("Test: assertPopupEnterFBLogo - PASSED");
    }
    @Test
    public void assertPopupCancelButton() {
        clickOnEnterAndRegButton();
        checkPopupCancelButton();
        System.out.println("Test: assertPopupCancelButton - PASSED");
    }
    @Test
    public void assertPopupWrongEmailOrPasswordLabel() {
        clickOnEnterAndRegButton();
        checkPopupWrongEmailOrPasswordLabelIsNotPresent();
        clickPopupEnterButton();
        checkPopupWrongEmailOrPasswordLabelIsPresent();
        System.out.println("Test: assertPopupWrongEmailOrPasswordLabel - PASSED");
    }
    @Test
    public void assertPopupDontHaveAccountLabel() {
        clickOnEnterAndRegButton();
        checkPopupDontHaveAccountLabel();
        System.out.println("Test: assertPopupDontHaveAccountLabel - PASSED");
    }
    @Test
    public void assertPopupRegButton() {
        clickOnEnterAndRegButton();
        checkPopupRegButton();
        System.out.println("Test: assertPopupRegButton - PASSED");
    }
    @Test
    public void assertPopupForgotPasswordEmailField() {
        clickOnEnterAndRegButton();
        clickOnPopupForgotPasswordLink();
        checkPopupForgotPasswordEmailField();
        System.out.println("Test: assertPopupForgotPasswordEmailField - PASSED");
    }
    @Test
    public void assertPopupForgotPasswordRestoreButton() {
        clickOnEnterAndRegButton();
        clickOnPopupForgotPasswordLink();
        checkPopupForgotPasswordRestoreButton();
        System.out.println("Test: assertPopupForgotPasswordRestoreButton - PASSED");
    }
    @Test
    public void assertPopupForgotPasswordWrongEmailLabel() {
        clickOnEnterAndRegButton();
        clickOnPopupForgotPasswordLink();
        checkPopupForgotPasswordWrongEmailLabelIsNotPresent();
        clickOnPopupForgotPasswordRestoreButton();
        checkPopupForgotPasswordWrongEmailLabelIsPresent();
        System.out.println("Test: assertPopupForgotPasswordRestoreButton - PASSED");
    }




}
