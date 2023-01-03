package pages;

public class TestSandbox extends BasePage{

    private String categoryDropdown = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[10]/div[2]/div/div/div[1]/div[2]/div/input";

    public TestSandbox(){
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("https://demoqa.com/automation-practice-form");
    }

    public void selectCategory(String category){
        selectFromDropdownByValue(categoryDropdown, category);
    }
}