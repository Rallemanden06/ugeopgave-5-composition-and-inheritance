public class Window {
    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm){
        this.widthCm = widthCm;
        this.heightCm = heightCm;

    }

    public int getAreaCm2(){
        return this.widthCm * this.heightCm;
    }

    public String toString(){
        return widthCm + "x" + heightCm + "cm";
    }
}
