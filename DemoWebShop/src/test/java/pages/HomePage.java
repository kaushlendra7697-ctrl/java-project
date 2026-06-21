package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By loginLink = By.linkText("Log in");
    private By registerLink = By.linkText("Register");
    private By searchBox = By.id("small-searchterms");
    private By searchButton = By.xpath("//input[@value='Search']");
    private By shoppingCartLink = By.linkText("Shopping cart");
    private By wishlistLink = By.linkText("Wishlist");

    // Actions

    public LoginPage clickLogin() {
        driver.findElement(loginLink).click();
        return new LoginPage(driver);
    }

    public RegisterPage clickRegister() {
        driver.findElement(registerLink).click();
        return new RegisterPage(driver);
    }

    public SearchPage searchProduct(String productName) {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();

        return new SearchPage(driver);
    }

    public CartPage navigateToCart() {
        driver.findElement(shoppingCartLink).click();
        return new CartPage(driver);
    }

    public WishlistPage navigateToWishlist() {
        driver.findElement(wishlistLink).click();
        return new WishlistPage(driver);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}