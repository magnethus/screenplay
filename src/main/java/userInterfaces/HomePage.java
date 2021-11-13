package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://es.aliexpress.com")
public class HomePage extends PageObject {
    public static final Target INPUT_SEARCH_ARTICLE = Target.the("Input where the search is made").located(By.id("search-key"));
    public static final Target SELECT_CATEGORY_TYPE = Target.the("Select category type").located(By.id("search-dropdwon-box"));
    public static final Target BUTTON_SEARCH_ARTICLE = Target.the("Button search article").located(By.className("search-button"));
    public static final Target BUTTON_CLOSE_WINDOW = Target.the("Button close window").located(By.className("next-dialog-close"));

}
