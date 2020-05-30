public class Vehicle {
    private String nae;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String nae, String size) {
        this.nae = nae;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steering(): Steering at " + currentDirection + " degrees. ");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction" + currentDirection);
    }

    public String getNae() {
        return nae;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
