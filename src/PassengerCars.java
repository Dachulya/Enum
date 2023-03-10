import static sun.swing.MenuItemLayoutHelper.max;

public class PassengerCars extends Car implements Competing{
    public static int[] SPISOK={13,34,2,1,45,67,8};
    private final BodyType bodyType;

    @Override
    public int pitStop() {
        int randomNumm1 = (int)(Math.random()*10);
        return randomNumm1;
    }

    @Override
    public int getBestLapTime() {
        /*ArrayList<Integer> SPISOK = new ArrayList<>();
        return Collections.max(SPISOK);*/
        return max(SPISOK);
    }

    @Override
    public int getMaxSpeed() {
        int randomNummm = (int)(Math.random()*100);
        return randomNummm;
    }

    public PassengerCars(String brend, String model, float engineCapacity,BodyType bodyType){
        super(brend,model,engineCapacity);
        this.bodyType=bodyType;
    }
    @Override
    public void startMovement(){
        System.out.println("НАчать движение");
    }
    @Override
    public void stopMovement(){
        System.out.println("Остановиться");
    }

    @Override
    public void printType() {

        System.out.println(bodyType);

    }
    public String toString(){
        return "бренд и модель:"+getBrend()+"  "+getModel()+"  двигатель  "+getEngineCapacity()+bodyType;
    }
}
