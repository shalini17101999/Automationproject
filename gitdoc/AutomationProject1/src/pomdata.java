@Test(dataProvider="regi_Data")
public void Sign_up(String fname,String lname,String email,String password,String dob,String gender,String mobile,String bio) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\shalini.a\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://mobileworld.banyanpro.com/");        
    Open open=new Open(driver);
    open.signup(fname,lname,email,password,dob,gender,mobile,bio);
    }
@Test(dataProvider="getData")
public void signin(String username,String password) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shalini.a\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://mobileworld.banyanpro.com/");
      Open open=new Open(driver);
      open.signin(username,password);
      driver.quit();
}    
@AfterTest
public void home() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\shalini.a\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://mobileworld.banyanpro.com/");
     Open open=new Open(driver);
     open.home();
}
@DataProvider
public Object[][] getData(){
    Object[][] data=new Object[3][2];
    data[0][0]="Annapurna";
    data[0][1]="Anu@123";
    data[1][0]="Durga";
    data[1][1]="Durga@123";
    data[2][0]="Vinni";
    data[2][1]="vini@123";
    return data;
}
@DataProvider
public Object[][] regi_Data(){
    Object[][] rg=new Object[2][8];
    rg[0][0]="Annapurna";
    rg[0][1]="S";
    rg[0][2]="annapurna@gmail.com";
    rg[0][3]="Anu@123";
    rg[0][4]="09/07/2000";
    rg[0][5]="female";
    rg[0][6]="9576372365";
    rg[0][7]="Hello I am Annapurna";
    rg[1][0]="Chandu";
    rg[1][1]="S";
    rg[1][2]="chandu@gmail.com";
    rg[1][3]="chandu@123";
    rg[1][4]="16/10/2000";
    rg[1][5]="male";
    rg[1][6]="9895372365";
    rg[1][7]="Hello I am chandu";
    return rg;
    
