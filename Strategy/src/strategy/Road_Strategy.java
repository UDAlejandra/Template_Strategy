package strategy;


class Road_Strategy implements Route_Strategy {
    @Override
    public void buildRoute(String A, String B) {
        System.out.println("Calculando ruta por carretera entre " + A + " y " + B + " (usando GPS y tráfico).");
    }
}
