package strategy;

public class Navigator {
    private Route_Strategy routeStrategy;

    public void setStrategy(Route_Strategy strategy) {
        this.routeStrategy = strategy;
    }

    public void buildRoute(String A, String B) {
        if (routeStrategy == null) {
            System.out.println("Error: Selecciona un modo de transporte primero.");
            return;
        }
        routeStrategy.buildRoute(A, B);
    }
}
