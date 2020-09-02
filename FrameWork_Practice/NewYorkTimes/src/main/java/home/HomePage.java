package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElements.*;

public class HomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = webLogoXP)
    public WebElement webLogo;

    @FindBy(how = How.XPATH, using = wordButtonXP)
    public WebElement wordButton;
    @FindBy(how = How.XPATH, using = wordButtonVerificationXP)
    public WebElement wordButtonVerification;

    @FindBy(how = How.XPATH, using = usButtonXP)
    public WebElement usButton;
    @FindBy(how = How.XPATH, using = usButtonVerificationXP)
    public WebElement usButtonVerification;

    @FindBy(how = How.XPATH, using = politicsButtonXP)
    public WebElement politicsButton;
    @FindBy(how = How.XPATH, using = politicsButtonVerificationXP)
    public WebElement politicsButtonVerification;

    @FindBy(how = How.XPATH, using = nybuttonXP)
    public WebElement nybutton;
    @FindBy(how = How.XPATH, using = nybuttonVerificationXP)
    public WebElement nybuttonverification;

    @FindBy(how = How.XPATH, using = businessButtonXP)
    public WebElement businessButton;
    @FindBy(how = How.XPATH, using = businessButtonVerificationXP)
    public WebElement businessButtonVerification;

    @FindBy(how = How.XPATH, using = opinionButtonXP)
    public WebElement opinionButton;
    @FindBy(how = How.XPATH, using = opinionButtonVerificationXP)
    public WebElement opinionButtonVerification;

    @FindBy(how = How.XPATH, using = techButtonXP)
    public WebElement techButton;
    @FindBy(how = How.XPATH, using = techButtonVerificationXP)
    public WebElement techButtonVerification;

    @FindBy(how = How.XPATH, using = scienceButtonXP)
    public WebElement scienceButton;
    @FindBy(how = How.XPATH, using = scienceButtonVerificationXP)
    public WebElement scienceButtonVerification;

    @FindBy(how = How.XPATH, using = healthButtonXP)
    public WebElement healthButton;
    @FindBy(how = How.XPATH, using = healthButtonVerificationXP)
    public WebElement healthButtonVerification;

    @FindBy(how = How.XPATH, using = sportButtonXP)
    public WebElement sportButton;
    @FindBy(how = How.XPATH, using = sportButtonVerificationXP)
    public WebElement sportButtonVerification;

    @FindBy(how = How.XPATH,using = artsButtonXP)
    public WebElement artButton;
    @FindBy(how = How.XPATH,using = artButtonVerificationXP)
    public WebElement artButtonVerification;

    @FindBy(how = How.XPATH,using = booksButtonXP)
    public WebElement booksButton;
    @FindBy(how = How.XPATH,using =  booksButtonVerificationXP)
    public WebElement booksButtonVerification;

    @FindBy(how = How.XPATH,using = styleXP)
    public WebElement style;
    @FindBy(how = How.XPATH,using = styleVerificationXP)
    public WebElement styleVerification;

    @FindBy(how = How.XPATH,using = foodXP)
    public WebElement food;
    @FindBy(how = How.XPATH,using = foodValidationXP)
    public WebElement foodValidation;

    @FindBy(how = How.XPATH,using = travelXP)
    public WebElement travel;
    @FindBy(how = How.XPATH,using = travelValidationXP)
    public WebElement travelValidation;

    @FindBy(how = How.XPATH,using = magazineXP)
    public WebElement magazine;
    @FindBy(how = How.XPATH,using = magazineValidationXP)
    public WebElement magazineValidation;

    @FindBy(how = How.XPATH,using = realEstateXP)
    public WebElement realEstate;
    @FindBy(how = How.XPATH,using = realEstateValidationXP)
    public WebElement realEstateValidation;

    @FindBy(how = How.XPATH,using = videoXP)
    public WebElement video;
    @FindBy(how = How.XPATH,using = videoValidationXP)
    public WebElement videoValidation;




    public void setWebLogo() {
        String actualText = webLogo.getTagName();
        String expectedText = "svg";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setWordButton() {
        wordButton.click();
        sleepFor(2);
    }

    public void setWordButtonVerification() {
        String actualText = wordButtonVerification.getText();
        String expectedText = "World News";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
        sleepFor(2);
    }

    public void setUsButton() {
        usButton.click();
        sleepFor(2);
    }

    public void setUsButtonVerification() {
        String actualText = usButtonVerification.getText();
        String expectedText = "U.S. News";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
        sleepFor(2);
    }

    public void setPoliticsButton() {
        politicsButton.click();
        sleepFor(2);
    }

    public void setPoliticsButtonVerification() {
        String actualText = politicsButtonVerification.getText();
        String expectedText = "Politics";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
        sleepFor(2);
    }

    public void setNyButton() {
        nybutton.click();
        sleepFor(2);
    }

    public void setNybuttonverification() {
        String actualText = nybuttonverification.getText();
        String expectedText = "New York";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
        sleepFor(2);
    }

    public void setBusinessButton() {
        businessButton.click();
    }

    public void setBusinessButtonVerification() {
        String actualText = businessButtonVerification.getText();
        String expectedText = "Business";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
        sleepFor(2);
    }

    public void setOpinionButton() {
        opinionButton.click();
        sleepFor(2);
    }

    public void setOpinionButtonVerification() {
        String actualText = opinionButtonVerification.getText();
        String expectedText = "Opinion";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
        sleepFor(2);
    }

    public void setTechButton() {
        techButton.click();
    }

    public void setTechButtonVerification() {
        String actualText = techButtonVerification.getText();
        String expectedText = "Technology";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setScienceButton() {
        scienceButton.click();
    }

    public void setScienceButtonVerification() {
        String actualText = scienceButtonVerification.getText();
        String expectedText = "Science";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setHealthButton() {
        healthButton.click();
        sleepFor(2);
    }

    public void setHealthButtonVerification() {
        String actualText = healthButtonVerification.getText();
        String expectedText = "Health";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }

    public void setSportButton() {
        sportButton.click();
        sleepFor(2);
    }

    public void setSportButtonVerification() {
        String actualText = sportButtonVerification.getText();
        String expectedText = "Sports";
        Assert.assertEquals(actualText, expectedText, "text doesn't match");
    }
    public void setArtButton(){
        artButton.click();
        String actualText=artButtonVerification.getText();
        String expectedText="Arts";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void setBooksButton(){
        booksButton.click();
        String actualText=booksButtonVerification.getText();
        String expectedText="Books";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void setStyle(){
        style.click();
        String actualText=styleVerification.getText();
        String expectedText="Style";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(4);
    }
    public void setFood(){
        food.click();
        String actualText=foodValidation.getText();
        String expectedText="Food";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(3);
    }
    public void setTravel(){
        travel.click();
        String actualText=travelValidation.getText();
        String expectedText="Travel";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void setMagazine(){
        magazine.click();
        String actualText=magazineValidation.getText();
        String expectedText="Convicted of Sex Crimes, but With No Victims";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void setRealEstate(){
        realEstate.click();
        String actualText=realEstateValidation.getText();
        String expectedText="Real Estate";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }
    public void setVideo(){
        video.click();
        String actualText=videoValidation.getText();
        String expectedText="A collection of the most-viewed New York Times videos.";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }


}



