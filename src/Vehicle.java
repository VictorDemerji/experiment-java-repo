public class Vehicle {

    int passegers, wheels, maxspeed, burnup;

    //declare the method, which calculates the distance traveled
    //the method receives the interval parameter, which sets the time
    //and does not return any value (void)
    void distance (double interval) {
        double value = maxspeed * interval;
        System.out.println("Va parcurge o distanta egala cu " + value + " km.");
    }
    // distance(double interval)
    //Vehicule class

    public static void main(String[] args) {
        Vehicle masina = new Vehicle();
        masina.passegers  = 2;
        masina.wheels     = 4;
        masina.maxspeed   = 130;
        masina.burnup     = 30;

        Vehicle autobuz = new Vehicle();
        autobuz.passegers = 45;
        autobuz.wheels    = 4;
        autobuz.maxspeed  = 100;
        autobuz.burnup    = 25;

        double time = 0.5;
        System.out.println("Automobilul cu " + masina.passegers + " pasageri ");
        masina.distance(time);
        System.out.println("Autobuzul cu " + autobuz.passegers + " pasageri ");
        autobuz.distance(time);
    }

}
