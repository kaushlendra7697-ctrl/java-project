package Test;

public class GoogleTest extends BaseTest{

    @Test
    public void openGoogle() {
        getDriver().get("https://google.com");
        System.out.println("Title: " + getDriver().getTitle());
    }

    @Test
    public void openBing() {
        getDriver().get("https://bing.com");
        System.out.println("Title: " + getDriver().getTitle());
    }

    @Test
    public void openYahoo() {
        getDriver().get("https://yahoo.com");
        System.out.println("Title: " + getDriver().getTitle());
    }

}
