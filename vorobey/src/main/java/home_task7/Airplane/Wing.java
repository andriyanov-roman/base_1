package home_task7.Airplane;


public class Wing extends Airplane{
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    private double size;

    public Wing(String model,String color,int capacity,double size){
        super(model,color,capacity);
        this.size=size;
    }
}
