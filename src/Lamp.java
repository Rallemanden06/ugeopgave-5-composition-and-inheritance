public class Lamp {

    private int watt;
    private boolean isOn;

    public Lamp(int watt){
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public int getWatt() {
        return watt;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public String toString(){
        return watt + "W";
    }


}
