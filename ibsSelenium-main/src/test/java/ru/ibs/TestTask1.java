//package ru.ibs.tests;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class Test_HW_1 {
//    WebDriver driver;
//    WebDriverWait driverWait;
//
//    @BeforeAll
//    public void before(){
//        // Шаг 1
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://training.appline.ru/user/login");
//        driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//form[@id='login-form']"))));
//    }
//
//    @Test
//    public void test(){
//        // Шаг 2
//        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("Irina Filippova");
//        driver.findElement(By.xpath("//input[@name='_password']")).sendKeys("testing");
//        driver.findElement(By.xpath("//button[@name='_submit']")).click();
//        //шаг 3
//        driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[@class='oro-subtitle']"))));
//        WebElement expenditure = driver.findElement(By.xpath("//ul[contains(@class, 'main-menu')]/li/a/span[text()='Расходы']"));
//        expenditure.click();
//        driverWait.until(ExpectedConditions.visibilityOf(expenditure));
//        //шаг 4
//        driver.findElement(By.xpath("//span[text()='Командировки']")).click();
//        //шаг 5 - 6
//        driver.findElement(By.xpath("//a[@title='Создать командировку']")).click();
//        WebElement createtrip = driver.findElement(By.xpath("//h1[@class='user-name' and text()='Создать командировку']"));
//        driverWait.until(ExpectedConditions.visibilityOf(createtrip));
//        Assert.assertTrue(createtrip.isDisplayed());
//        //шаг 7 - 8
//        driver.findElement(By.xpath("//select[contains(@id, 'crm_business_trip_businessUnit-uid')]/option[@value='7']")).click();
//        Assert.assertEquals("Отдел внутренней разработки", driver.findElement(By.xpath("//div[contains(@id, 'crm_business_trip_businessUnit-uid')]/span")).getText());
//
//        driver.findElement(By.xpath("//div/a[@id='company-selector-show']")).click();
//        Assert.assertEquals("display: block;", driver.findElement(By.xpath("//div[@id='company-selector']")).getAttribute("style"));
//
//        driver.findElement(By.xpath("//span[@class='select2-chosen' and text()='Укажите организацию']")).click();
//        WebElement divchoise = driver.findElement(By.xpath("//div[@class='select2-result-label' and text()='(Хром) Призрачная Организация Охотников']"));
//        driverWait.until(ExpectedConditions.visibilityOf(divchoise));
//        divchoise.click();
//        Assert.assertEquals("(Хром) Призрачная Организация Охотников", driver.findElement(By.xpath("//span[@class='select2-chosen']")).getText());
//
//
//        WebElement checkBox = driver.findElement(By.xpath("//label[text()='Заказ билетов']/../input[@type='checkbox']"));
//        checkBox.click();
//        Assert.assertTrue(checkBox.isSelected());
//
//        WebElement departureField = driver.findElement(By.xpath("//input[contains(@id, 'crm_business_trip_departureCity')]"));
//        departureField.sendKeys("Россия Тест");
//
//        WebElement arrivalField = driver.findElement(By.xpath("//input[contains(@id, 'crm_business_trip_arrivalCity')]"));
//        arrivalField.sendKeys("Россия Тест Пока");
//
//
//        WebElement departureDateField = driver.findElement(By.xpath("//input[contains(@id, 'date_selector_crm_business_trip_depart')]"));
//        WebElement arrivalDateField = driver.findElement(By.xpath("//input[contains(@id, 'date_selector_crm_business_trip_return')]"));
//        WebElement datePicker = driver.findElement(By.xpath("//span[@id='duration-plan']"));
//        departureDateField.sendKeys("11.02.2024");
//        arrivalDateField.sendKeys("20.02.2024");
//        driver.findElement(By.xpath("//a[contains(@class, 'ui-state-active')]")).click();
//
//        Assert.assertEquals("10", datePicker.getText());
//        //Шаг 9 - 10
//        driver.findElement(By.xpath("//button[@type='submit' and contains(text(), 'Сохранить и закрыть')]")).click();
//        driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='loader-content']"))));
//        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='validation-failed']")).isDisplayed());
//    }
//    @After
//    public void after(){
//        driver.quit();
//    }
//}
