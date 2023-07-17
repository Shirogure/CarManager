package project.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Motorcycle implements Serviceable{

    String name;
    int YearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    boolean isReadyToDrive = true;
    int distance = 0;
    protected int distanceOnService = 0;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType) {
        this.name = name;
        YearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = Color.valueOf(color.replace(" ", "").toUpperCase());
        this.engineType = engineType;

    }
    public void addDistance(int additionalD) {
        distance += additionalD;
        distanceOnService += additionalD;
        if (distance >= 200000) {
            destroyEngine();

        }
    }
    public void destroyEngine() {
        isReadyToDrive = distance < 280000;
    }
    public void repair() {
        isReadyToDrive = true;
    }
    public void repaint(Color repaint) {
        color = repaint;
    }
    public boolean isReadyToService() {
        if(distanceOnService > 8000) {
            return true;
        }
        return false;
    }
    @Override
    public void addDistance(double additionalD) {

    }
    @Override
    public int getDistanceOnService() {
        return distanceOnService;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", YearOfProduction=" + YearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, distance, isReadyToDrive);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Motorcycle other = (Motorcycle) obj;
        return color == other.color && distance == other.distance && isReadyToDrive == other.isReadyToDrive;
    }

}
