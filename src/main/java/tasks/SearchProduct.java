package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.HomePage.INPUT_SEARCH_ARTICLE;
import static userInterfaces.HomePage.SELECT_CATEGORY_TYPE;
import static userInterfaces.HomePage.BUTTON_SEARCH_ARTICLE;

public class SearchProduct implements Task {

    private String description;
    private String typeCategory;

    public SearchProduct(String description, String typeCategory) {
        this.description = description;
        this.typeCategory = typeCategory;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(description).into(INPUT_SEARCH_ARTICLE), //Insert a value to the search
                SelectFromOptions.byVisibleText(typeCategory).from(SELECT_CATEGORY_TYPE), // Select item  category from select
                Hit.the(Keys.ENTER).into(BUTTON_SEARCH_ARTICLE), // Press Enter to perform search
                Click.on() // Select product to add

        );
    }


    public static SearchProduct withDescription(String description, String typeCategory) {
        return instrumented(SearchProduct.class, description, typeCategory); //Create instance of class
    }
}
