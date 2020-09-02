package homeTest;

import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    HomePage homepage;

    @BeforeMethod
    public void init() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }
//
//    @Test(priority =19 )
//    public void setWebLogoTest() {
//        homepage.setWebLogo();
//    }
//    @Test(priority =20 )
//    public void setWordButtonTest(){
//        homepage.setWordButton();
//    }
//
//    @Test(priority = 21)
//    public void  setWordButtonVerificationTest(){
//        setWordButtonTest();
//        homepage.setWordButtonVerification();
//    }
//    @Test(priority = 22)
//    public void setUsButtonTest(){
//        homepage.setUsButton();
//    }
//
//    @Test(priority = 23)
//    public void setUsButtonVerificationTest(){
//        setUsButtonTest();
//        homepage.setUsButtonVerification();
//    }
//    @Test(priority = 24)
//    public void setPoliticsButtonTest(){
//        homepage.setPoliticsButton();
//    }
//
//    @Test(priority = 25)
//    public void setPoliticsButtonVerificationTest(){
//        setPoliticsButtonTest();
//        homepage.setPoliticsButtonVerification();
//    }
//    @Test(priority = 26)
//    public void setNyButtonTest(){
//        homepage.setNyButton();
//    }
//
//    @Test(priority = 27)
//    public void setNybuttonverificationTest(){
//        setNyButtonTest();
//        homepage.setNybuttonverification();
//    }
//    @Test(priority = 28)
//    public void setBusinessButtonTest(){
//        homepage.setBusinessButton();
//    }
//
//    @Test(priority =29 )
//    public void setBusinessButtonVerificationTest(){
//        setBusinessButtonTest();
//        homepage.setBusinessButtonVerification();
//    }
//    @Test(priority = 30)
//    public void setOpinionButtonTest(){
//        homepage.setOpinionButton();
//    }
//
//    @Test(priority = 31)
//    public void setOpinionButtonVerificationTest(){
//        setOpinionButtonTest();
//        homepage.setOpinionButtonVerification();
//    }
//    @Test(priority = 32)
//    public void setTechButtonTest(){
//        homepage.setTechButton();
//    }
//
//    @Test(priority = 33)
//    public void setTechButtonVerificationTest(){
//        setTechButtonTest();
//        homepage.setTechButtonVerification();
//    }
//    @Test(priority = 34)
//    public void setScienceButtonTest(){
//        homepage.setScienceButton();
//    }
//
//    @Test(priority = 35)
//    public void setScienceButtonVerificationTest(){
//        setScienceButtonTest();
//        homepage.setScienceButtonVerification();
//    }
//    @Test(priority = 36)
//    public void setHealthButtonTest(){
//        homepage.setHealthButton();
//    }
//
//    @Test(priority = 37)
//    public void setHealthButtonVerificationTest(){
//        setHealthButtonTest();
//        homepage.setHealthButtonVerification();
//    }
//    @Test(priority =38 )
//    public void setSportButtonTest(){
//        homepage.setSportButton();
//    }
//
//    @Test(priority = 39)
//    public void setSportButtonVerificationTest(){
//        setSportButtonTest();
//        homepage.setSportButtonVerification();
//    }
//    @Test(priority = 40)
//    public void setArtButtonTest(){
//        homepage.setArtButton();
//    }
//    @Test(priority = 41)
//    public void setBooksButtonTest(){
//        homepage.setBooksButton();
////    }
//    @Test(priority = 42)
//    public void setStyleTest(){
//        homepage.setStyle();
//    }
//    @Test(priority = 43)
//    public void setFoodTest(){
//        homepage.setFood();
//    }
//    @Test(priority = 44)
//    public void setTravelTest(){
//        homepage.setTravel();
//    }
//    @Test(priority = 45)
//    public void setMagazineTest(){
//        homepage.setMagazine();
//    }
//    @Test(priority = 46)
//    public void setRealEstateTest(){
//        homepage.setRealEstate();
//    }
    @Test(priority = 47)
    public void setVideoTest(){
        homepage.setVideo();
    }


}

