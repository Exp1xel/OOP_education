package Classes;

import java.util.Random;

import Interfaces.iReturnOrder;
/**
 * Класс, описывающий особого покупателя,
 * имплементирующий интерфейс возврата товара
 */
public class SpecialClient extends Actor implements iReturnOrder{
    private int vipId;

    public int getNumber() {
        return vipId;
    }

    public void setNumber(int vipId) {
        this.vipId = vipId;
    }

    public SpecialClient(String name, int vipId) {
        super(name);
        this.vipId = vipId;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
    
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
        
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
        
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }
    public Actor getActor() {
        return this;
    }
    /**
     * Метод, описывающий возращение товара
     * в виде логического значение на основе случайного числа (0 || 1)
     */
    public boolean returnOrder() {
        //Random rand = new Random();
        //return (rand.nextInt(1) == 1) ? true : false;
        return true;
    }
}
