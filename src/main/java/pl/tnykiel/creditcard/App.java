package pl.tnykiel.creditcard;

import java.util.Collections;

public class App {

    public static void main(String[] args){
        var name = "Tomasz";
        var message = String.format("Hello %s", name);

        var names = Collections.singletonList("Tomasz Nykiel");

        System.out.println(message);
    }
}
