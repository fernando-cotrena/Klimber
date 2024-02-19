package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import net.serenitybdd.screenplay.Task;

public class NavigateTo{

    public static Performable navigateTo(String url) {
        return Task.where("{0} navigate to "+url,
                Open.relativeUrl(url)
                );
    }
}
