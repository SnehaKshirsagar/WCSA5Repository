package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//store all the home page module
	@FindBy(xpath = "//div[.='Time-Track']/../descendant::img") private WebElement timeTrackModule;
    @FindBy(xpath = "//div[text()='Tasks']/following-sibling::img") private WebElement taskModule;
    @FindBy(xpath = "//div[text()='Reports']/following-sibling::img") private WebElement reportsModule;
    @FindBy(xpath = "//div[text()='Users']/following-sibling::img") private WebElement usersModule;
    @FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::img") private WebElement workScleduleModule;
    @FindBy(xpath = "//div[text()='Settings']/following-sibling::img") private WebElement settingsModule;
    @FindBy(xpath = "//a[text()='Logout']") private WebElement logOutLinkModule;
    
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }

	public WebElement getTimeTrack() {
		return timeTrackModule;
	}

	public WebElement getTask() {
		return taskModule;
	}

	public WebElement getReport() {
		return reportsModule;
	}

	public WebElement getUsers() {
		return usersModule;
	}

	public WebElement getWorkScleduleModule() {
		return workScleduleModule;
	}

	public WebElement getSettings() {
		return settingsModule;
	}

	public WebElement getLogOutLink() {
		return logOutLinkModule;
	}
   
	public void clickOnTimeTrackModule()
	{
		timeTrackModule.click();
	}
	public void clickOnTaskModule()
	{
		taskModule.click();
	}
	public void clickOnReportsModule()
	{
		reportsModule.click();
	}
	public void clickOnUsersModule()
	{
		usersModule.click();
	}
	public void clickOnWorksScheduleModule()
	{
		workScleduleModule.click();
	}
	public void clickOnSettingsModule()
	{
		settingsModule.click();
	}
	public void clickOnLogoutModule()
	{
		logOutLinkModule.click();
	}
}
