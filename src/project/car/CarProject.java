package project.car;
import java.util.ArrayList;
import java.util.List;
public class CarProject {

    public static void main(String[] args) {

        Car prius = new PassengerCar("Toyota Prius", 2008, 1200, 15000, Color.GREEN);
        Car renault = new Bus   ("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
        Car renault1 = new Bus   ("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

        List<Car> cars = new ArrayList<>();

        cars.add(prius);
        cars.add(renault);
        cars.add(renault1);

        System.out.println(cars);

        prius.addDistance(100);
        prius.addDistance(15000);
        prius.servicing();

        renault.addDistance(15000);

        Motorcycle suzuki = new Motorcycle ("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel");
        Motorcycle yamaha  = new Motorcycle ("Yamaha FZ1", 2007, 9000, 700, "orangE ", "gas");

        List<Motorcycle> moto = new ArrayList<>();

        moto.add(yamaha);
        moto.add(suzuki);

        System.out.println(moto);

        yamaha.addDistance(190000);
        yamaha.addDistance(60000);
        yamaha.repaint(Color.BLACK);
        yamaha.repair();

        suzuki.addDistance(60000);
        suzuki.addDistance(1902);

        System.out.println(prius + "\n");
        System.out.println(renault + "\n");
        System.out.println(suzuki  + "\n");
        System.out.println(yamaha + "\n");

        System.out.println(suzuki.equals(yamaha) + "\n");

        System.out.println(prius.isReadyToService());
        System.out.println(renault.isReadyToService());
        System.out.println(yamaha.isReadyToService());
    }

}
