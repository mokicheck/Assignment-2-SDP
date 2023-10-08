public class LeatherSeatsDecorator extends CarDecorator {
    public LeatherSeatsDecorator(Car car) {
        super(car);
    }


    public String getDescription() {
        return decoratedCar.getDescription() + ", Кожанные сиденья";
    }

    public double getCost() {
        return decoratedCar.getCost() + 1500.0;
    }
}
