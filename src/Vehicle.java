public class Vehicle {

    int passegers, wheels, maxspeed, burnup;

    //declare the method, which calculates the distance traveled
    //the method receives the interval parameter, which sets the time
    //and does not return any value (void)
    void distance (double interval) {
        double value = maxspeed * interval;
        System.out.println("will travel a distance equal to " + value + " km.");
    }
    // distance(double interval)
    //Vehicule class

    public static void main(String[] args) {
        Vehicle masina = new Vehicle();
        masina.passegers  = 2;
        masina.wheels     = 4;
        masina.maxspeed   = 130;
        masina.burnup     = 30;

        //another example of the class Vehicle
        Vehicle autobuz = new Vehicle();
        autobuz.passegers = 45;
        autobuz.wheels    = 4;
        autobuz.maxspeed  = 100;
        autobuz.burnup    = 25;

        //calculating the route traveled in 0.5 hours
        double time = 0.5;
        System.out.print("The car with " + masina.passegers + " passagers ");
        masina.distance(time);
        System.out.print("The bus with " + autobuz.passegers + " passagers ");
        autobuz.distance(time);
    }

}
