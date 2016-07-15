package UITests;

import Pages.RegWMPage;
import org.junit.Before;
import org.junit.Test;


public class RegWMPageUITests extends RegWMPage{

    @Before
    public void loadRegWMPage() {
        goToRegWMPage();
    }
    @Test
    public void assertRegPageTitle() {
        checkMainPageTitle();
        System.out.println("Test: assertRegPageTitle - PASSED");
    }
    @Test
    public void assertRegWMPageUrl() {
        checkRegWMPageUrl();
        System.out.println("Test: assertRegWMPageUrl - PASSED");
    }
    @Test
    public void assertRegWMPageRegWMLabel() {
        checkRegWMPageRegWMLabel();
        System.out.println("Test: assertRegWMPageRegWMLabel - PASSED");
    }
//    UITests for LoginField:
    @Test
    public void assertRegWMPageLoginFieldLabel() {
        checkRegWMPageLoginFieldLabel();
        System.out.println("Test: assertRegWMPageLoginFieldLabel - PASSED");
    }
    @Test
    public void assertRegWMPageLoginField() {
        checkRegWMPageLoginField();
        System.out.println("Test: assertRegWMPageLoginField - PASSED");
    }
    @Test
    public void assertRegWMPageLoginFieldErrorLabel() {
        checkRegWMPageEmailFieldErrorLabelIsNotPresent();
        clickOnRegWMPageRegButton();
        checkRegWMPageEmailFieldErrorLabelIsPresent();
        System.out.println("Test: assertRegWMPageLoginFieldErrorLabel - PASSED");
    }
//    UITests for EmailField:
    @Test
    public void assertRegWMPageEmailFieldLabel() {
        checkRegWMPageEmailFieldLabel();
        System.out.println("Test: assertRegWMPageEmailFieldLabel - PASSED");
    }
    @Test
    public void assertRegWMPageEmailField() {
        checkRegWMPageEmailField();
        System.out.println("Test: assertRegWMPageEmailField - PASSED");
    }
    @Test
    public void assertRegWMPageEmailFieldErrorLabel() {
        checkRegWMPageEmailFieldErrorLabelIsNotPresent();
        clickOnRegWMPageRegButton();
        checkRegWMPageEmailFieldErrorLabelIsPresent();
        System.out.println("Test: assertRegWMPageEmailFieldErrorLabel - PASSED");
    }
//    UITests for PasswordField:
    @Test
    public void assertRegWMPagePasswordFieldLabel() {
        checkRegWMPagePasswordFieldLabel();
        System.out.println("Test: assertRegWMPagePasswordFieldLabel - PASSED");
    }
    @Test
    public void assertRegWMPagePasswordField() {
        checkRegWMPagePasswordField();
        System.out.println("Test: assertRegWMPagePasswordField - PASSED");
    }
    @Test
    public void assertRegWMPagePasswordFieldErrorLabel() {
        checkRegWMPagePasswordFieldErrorLabelIsNotPresent();
        clickOnRegWMPageRegButton();
        checkRegWMPagePasswordFieldErrorLabelIsPresent();
        System.out.println("Test: assertRegWMPagePasswordFieldErrorLabel - PASSED");
    }
//    UITests for RepeatPasswordField:
    @Test
    public void assertRegWMPageRepeatPasswordFieldLabel() {
        checkRegWMPageRepeatPasswordFieldLabel();
        System.out.println("Test: assertRegWMPageRepeatPasswordFieldLabel - PASSED");
    }
    @Test
    public void assertRegWMPageRepeatPasswordField() {
        checkRegWMPageRepeatPasswordField();
        System.out.println("Test: assertRegWMPageRepeatPasswordField - PASSED");
    }
    @Test
    public void assertRegWMPageRepeatPasswordFieldErrorLabel() {
        checkRegWMPageRepeatPasswordFieldErrorLabelIsNotPresent();
        clickOnRegWMPageRegButton();
        checkRegWMPageRepeatPasswordFieldErrorLabelIsPresent();
        System.out.println("Test: assertRegWMPageRepeatPasswordFieldErrorLabel - PASSED");
    }
//    UITests for SkypeField:
    @Test
    public void assertRegWMPageSkypeFieldLabel() {
        checkRegWMPageSkypeFieldLabel();
        System.out.println("Test: assertRegWMPageSkypeFieldLabel - PASSED");
    }
    @Test
    public void assertRegWMPageSkypeField() {
        checkRegWMPageSkypeField();
        System.out.println("Test: assertRegWMPageSkypeField - PASSED");
    }
//    UITests for WMRField:
    @Test
    public void assertRegWMPageWMRFieldLabel() {
        checkRegWMPageWMRFieldLabel();
        System.out.println("Test: assertRegWMPageWMRFieldLabel - PASSED");
    }
    @Test
    public void assertRegWMPageWMRField() {
        checkRegWMPageWMRField();
        System.out.println("Test: assertRegWMPageWMRField - PASSED");
    }
    @Test
    public void assertRegWMPageWMRFieldErrorLabel() {
        checkRegWMPageWMRFieldErrorLabelIsNotPresent();
        clickOnRegWMPageRegButton();
        checkRegWMPageWMRFieldErrorLabelIsPresent();
        System.out.println("Test: assertRegWMPageWMRFieldErrorLabel - PASSED");
    }
//    UITests for AgreeRulesCheckBox:
    @Test
    public void assertRegWMPageAgreeRulesCheckBox() {
        checkRegWMPageAgreeRulesCheckBoxIsChecked();
        clickOnRegWMPageAgreeRulesCheckBox();
        checkRegWMPageAgreeRulesCheckBoxIsUnchecked();
        System.out.println("Test: assertRegWMPageAgreeRulesCheckBox - PASSED");
    }
//    UITests for AgreeRulesLink:
    @Test
    public void assertRegWMPageAgreeRulesLink() {
        checkRegWMPageAgreeRulesLink();
        System.out.println("Test: assertRegWMPageAgreeRulesLink - PASSED");
    }
//    UITests for RegButton:
    @Test
    public void assertRegWMPageRegButton() {
        checkRegWMPageRegButton();
//        regWMPageAgreeRulesCheckBox.click();
//        checkRegWMPageRegButtonIsDisabled();
        System.out.println("Test: assertRegWMPageRegButton - PASSED");
}








}
