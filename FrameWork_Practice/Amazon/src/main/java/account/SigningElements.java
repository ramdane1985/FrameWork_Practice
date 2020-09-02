package account;

import java.util.DoubleSummaryStatistics;

public class SigningElements {
    //Signing class
    public static final String signingButtonXP="//span[contains(text(),'Hello, Sign in')]";
    public static final String userFieldlXP="//input[@id='ap_email']";
    public static final String continueButtonXP="//input[@id='continue']";
    public static final String continueButtonValidation="a-alert-heading";

    //Account class
    public static final String createAccountButtonID="createAccountSubmit";
    public static final String customerNameXP="//input[@id='ap_customer_name']";
    public static final String customerEmailCSS="#ap_email";
    public static final String customerPassWord1XP=" //input[@id='ap_password']";
    public static final String customerPassWord2CSS="#ap_password_check";
    public static final String amazonAccountXP=" //input[@id='continue']";
    public static final String emailVerificationXP=" //div[@id='footer']//a[1]";

    //3 Account Action class
    public static final String SigningActionXP ="//span[@class='nav-action-inner']";






}
