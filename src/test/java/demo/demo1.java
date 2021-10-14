package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

        Logger logger= LogManager.getLogger(demo1.class.getName());


        @Test
        public void tc1(){
            logger.info("open url");
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            logger.debug("continue");
            driver.get("https://www.youtube.com/watch?v=q2wfjl0ffA");
            driver.quit();

    }
}
