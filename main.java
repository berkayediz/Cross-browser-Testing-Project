public class CrossBrowserTest {
    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        // Other browser configurations
    }

    @Test
    public void testFunctionality() {
        // Test functionality
    }

    // Other test methods

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
