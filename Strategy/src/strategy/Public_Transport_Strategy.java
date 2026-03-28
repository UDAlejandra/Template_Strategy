package strategy;

public class Public_Transport_Strategy implements Route_Strategy {
    @Override
    public void buildRoute(String A, String B) {
        System.out.println("Calculando ruta en transporte público entre " + A + " y " + B + " (buscando horarios de bus/metro).");
    }
}
