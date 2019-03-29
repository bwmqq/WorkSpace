package lianxi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestZentao {
	@Test
	public void initDriver() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Install\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.baidu.com");
		driver.manage().window().maximize();
		//全局隐式等待，设置为10秒，元素定位失败时不立即报错，等待10秒
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.id("u1"));
		login.findElement(By.name("tj_login")).click();
		WebElement QQ = driver.findElement(By.className("bd-acc-list"));
		QQ.findElement(By.className("phoenix-btn-item")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String a:windowHandles) {
			String title = driver.switchTo().window(a).getTitle();
			/*System.out.println(title);
			if (title.contains("QQ账号安全登录")){
				driver.switchTo().window(a);
				WebElement bottom_qlogin = driver.findElement(By.id("bottom_qlogin"));
				driver.switchTo().frame(driver.findElement(By.id("ptlogin_iframe")));
			}*/
		}
		System.out.println(driver.getTitle() + "1");/*
		driver.findElement(By.xpath("//*[@id=\"switcher_plogin\"]"));*/



		Thread.sleep(3000);
		driver.quit();
	}
}
