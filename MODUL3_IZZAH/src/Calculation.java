public class Calculation implements Runnable{
    public double radius;
    public double side;
    public double area;
    public double phi = 3.14 ;

    public void setSquare(double side) throws IllegalAccessError{
        if (side < 1) {
            throw new IllegalArgumentException();
        }
        else{
            area = side*side;
        } 
    }
    public double getSquare(){
        return area;
    }
    public void setCircle(double radius){
        area = radius*radius*phi;
    }

    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t){
        if ((a<1) & (b<1) & (t<1)) {
            throw new IllegalArgumentException();
        }
        else{
            this.area = (a + b)*(t/2);
        }
    }
    public double getTrapezoid(){
        return area;
    }

    @Override
    public void run(){
        System.out.println("===Program will Start in ===");
        for (int i = 3; i > 0; i--){    
        try {
            System.out.println("Starting with thread :"+ i );
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        } 
    }
}