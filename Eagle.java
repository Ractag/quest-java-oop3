public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (this.flying) {
            System.out.println("Hawkeye lands on the ground.");
        } else {
            this.flying = true;
            System.out.println("Hawkeye takes off in the sky.");
        }
    }

    @Override
    public int ascend(int altitude) {
        while (this.altitude < 120) {
            this.altitude += altitude;
            if (this.altitude >= 120) {
                System.out.println("Hawkeye flies upward, altitude: 120.");
                break;
            } else if (this.altitude <= 30) {
                System.out.println("Hawkeye flies upward, altitude: 30.");
            }
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        System.out.println("Hawkeye glides.");
    }

    @Override
    public int descend(int altitude) {
        while (this.altitude > 0) {
            this.altitude -= altitude;
            if (this.altitude == 30) {
                System.out.println("Hawkeye flies downward, altitude: 30.");
                break;
            } else if (this.altitude <= 9) {
                System.out.println("Hawkeye flies downward, altitude: 9.");
                break;
            }

        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude > 9) {
            System.out.println("Hawkeye is too high to land yet.");
        } else {
            System.out.println("Hawkeye lands.");
        }

    }
}

