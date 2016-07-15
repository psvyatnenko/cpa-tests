package UITests;

import Pages.MainPage;
import org.junit.Test;

public class ContactPageUITests extends MainPage{



    @Test
    public void loadMainPage(){
//        Open MainPage:
        goToMainPage();
//        Check MainPage load:
        checkMainPageTitle();
        checkMainPageUrl();
    }
    @Test
    public void simpleCheck(){
//        Open MainPage:
        goToMainPage();
//        Check MainPage load:
        clickOnEnterAndRegButton();
        checkPopupEmailField();
    }
}
