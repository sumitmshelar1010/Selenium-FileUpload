package MainPackage.SeleniumChromeDriver.locators.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingMethod { //FILE UPLOADING BY USING SEND KEYS
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://the-internet.herokuapp.com/upload");
        WebElement we = wd.findElement(By.id("file-upload"));
        we.sendKeys("C:\\Users\\ADMIN\\Desktop\\API\\check123.csv");
        Thread.sleep(3000);
        WebElement we1 = wd.findElement(By.id("file-submit"));
        we1.click();

        WebElement we2 = wd.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        we2.getText();
        if (we2.getText().equals("File Uploaded!"));
        {
            System.out.println("File uploaded successfully");
        }
    }
}
