import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tests {

        private WebDriver driver;

        @BeforeClass
        public void beforeClass() {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\3200g\\IdeaProjects\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        }

        @BeforeMethod
        public void refreshStranice () {

            driver.get("https://testsheepnz.github.io/BasicCalculator.html");
            JavascriptExecutor j = (JavascriptExecutor) driver;
            j.executeScript("window.scrollBy(0,900)");
        }

        @Test
        public void sabiranjePozitivnih () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("3");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Add");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 5;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);


        }

        @Test
        public void sabiranjeNegativnih () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("-2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("-3");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Add");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = -5;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void sabiranjeSaNulom () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("0");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("3");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Add");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 3;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);


        }

        @Test
        public void sabiranjeVelikihBrojeva () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("10000000");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("10000000");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Add");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 20000000;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);


        }

        @Test
        public void oduzimanjePozitivnih () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("1");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Subtract");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 1;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void oduzimanjeNegativnih () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("-2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("-1");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Subtract");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = -1;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void oduzimanjeNulom () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("0");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Subtract");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 2;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }
        @Test
        public void oduzimanjeUmanjenikNula () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("0");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("2");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Subtract");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = -2;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }


        @Test
        public void mnozenjePozitivnih () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("3");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Multiply");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 6;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void mnozenjeNegativnih () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("-2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("-3");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Multiply");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 6;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void mnozenjeNulom () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("0");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Multiply");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 0;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void mnozenjeVelikihBrojeva () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("2222222");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("111");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Multiply");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 246666642;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void deljenjePozitivnih () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("1");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Divide");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 2;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void deljenjeNegativnih () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("-2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("-1");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Divide");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 2;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @Test
        public void deljenjeNulom () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("2");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("0");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Divide");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            WebElement errorMessage = driver.findElement(By.id("errorMsgField"));
            Assert.assertTrue(errorMessage.isDisplayed());

            System.out.println(errorMessage.getText());

        }

        @Test
        public void deljenjeVelikihBrojeva () {

            WebElement prvoPolje = driver.findElement(By.id("number1Field"));
            prvoPolje.sendKeys("444444444");

            WebElement drugoPolje = driver.findElement(By.id("number2Field"));
            drugoPolje.sendKeys("2");

            WebElement operacija = driver.findElement(By.id("selectOperationDropdown"));

            Select selektuj = new Select(operacija);
            selektuj.selectByVisibleText("Divide");

            WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
            calculateBtn.click();

            int ocekivaniRezultat = 222222222;

            WebElement rezultat = driver.findElement(By.id("numberAnswerField"));

            int praviRezultat = Integer.parseInt(rezultat.getAttribute("value"));

            Assert.assertEquals(ocekivaniRezultat, praviRezultat);
            System.out.println(praviRezultat);

        }

        @AfterClass
        public void afterClass() {
            driver.quit();

        }

    }

