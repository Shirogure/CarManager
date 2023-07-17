package project.car;

public interface Serviceable {
    public abstract boolean isReadyToService();
    public int getDistanceOnService();
    public void addDistance(int additionalD);
    public void addDistance(double additionalD);

}
