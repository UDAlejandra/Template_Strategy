package strategy;

public class Main {
    public static void main(String[] args) {
        Navigator nav = new Navigator();
        String origen = "Casa";
        String destino = "Trabajo";

        // El usuario elige ir en coche
        nav.setStrategy(new Road_Strategy());
        nav.buildRoute(origen, destino);

        // El usuario decide que mejor camina
        nav.setStrategy(new Walking_Strategy());
        nav.buildRoute(origen, destino);
    }
}
