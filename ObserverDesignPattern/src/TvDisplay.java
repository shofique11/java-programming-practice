public class TvDisplay implements Observer{
    private String weather;
    public void update(String weather){
        this.weather = weather;
        display();
    }

    public void display(){
        System.out.println("TV Display: Weather updated -"+weather);
    }
}
