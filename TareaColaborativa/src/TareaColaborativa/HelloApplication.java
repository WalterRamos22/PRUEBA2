package TareaColaborativa;


import java.util.ArrayList;
import java.util.List;

public class HelloApplication {
    public static void main(String[] args) {
        Client client = new Client();
        client.setEmail("ramoswalter22n@gmail.com");
        client.setID("900231");
        client.setName("Walter Ramos");
        client.setNit("9624068-5");

        List<Color> colors = new ArrayList<Color>();

        Color azul = new Color();
        azul.setHex("1011");
        azul.setName("Morado");
        colors.add(azul);

        Color rojo = new Color();
        rojo.setHex("1012");
        rojo.setName("Blanco");
        colors.add(rojo);

        Color verde = new Color();
        verde.setHex("1013");
        verde.setName("Anaranjado");
        colors.add(verde);

        client.setColors(colors);

        client.dispatch();
    }
}