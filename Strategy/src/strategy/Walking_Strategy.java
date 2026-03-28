package strategy;

class Walking_Strategy implements Route_Strategy {
    @Override
    public void buildRoute(String A, String B) {
        System.out.println("Calculando ruta a pie entre " + A + " y " + B + " (evitando autopistas).");
    }
}
