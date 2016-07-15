package UITests;


import Pages.MainPage;
import org.junit.Test;

public class FAQPageUITests extends MainPage{


    @Test
    public void loadMainPage(){
//        Open MainPage:
        goToMainPage();
//        Check MainPage load:
        checkMainPageTitle();
        checkMainPageUrl();
    }


}
