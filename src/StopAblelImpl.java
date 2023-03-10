public class StopAblelImpl implements StopAble{
    @Override
    public void allCars(Car[] car) {
        for (Car a:car) {
            System.out.println("All cars: "+a);
        }
    }

    @Override
    public void passenger(Car[] car, String name) throws Exception {
       try {
           for (Car a : car) {
               if (a.getName().equals(name)) {
                   if (a instanceof Bus) {
                       System.out.println("Bus's passenger:" + ((Bus) a).getPeople());
                   } else if (a instanceof Taxi) {
                       System.out.println("Taxi's passenger" + ((Taxi) a).getPeople());
                   }
               }
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    @Override
    public void cars(Car[] cars, String name) {

        try {
            for (Car a : cars) {
                if (a.getName().equals(name)) {
                    System.out.println("Only buses: "+a.getName());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
