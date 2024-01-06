package Domain;

public class HotDrink extends Product{
    private int temperature;

    //Конструктор
    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    //Переопределение вывода текста
    @Override
    public String toString(){
        return super.toString() + "Temperature = " + temperature + "\n";
    }

}
