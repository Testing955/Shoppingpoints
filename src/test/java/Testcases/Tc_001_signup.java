package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import PageObject.Signupaccount;
import TestBase.Testbasepage;

public class Tc_001_signup extends Testbasepage
{
@Test
public void setup() throws InterruptedException
{
Signupaccount sa = new Signupaccount(driver);
sa.statrted();
sa.signupmodule();
sa.first(randomString().toUpperCase());
sa.last(randomString().toLowerCase());
sa.emailfield(randomString()+"@yopmail.com");
String password = randomAlphaNumeric();
sa.pwd(password);
sa.confpwd(password);
Thread.sleep(10000);
sa.create();
Thread.sleep(20000);
sa.sbuttons();
}

}
