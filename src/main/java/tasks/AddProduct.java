package tasks;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {

    private String quantity;
    public AddProduct(String quantity) {
        this.quantity = quantity;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(), // Select color
                Enter.theValue(quantity).into(), // Add quantity
                Click.on(), //Select go to the Car
                Click.on() //Select see the car
        );

    }

    public static AddProduct quantity(String quantity) {
        return instrumented(AddProduct.class, quantity);
    }
}
