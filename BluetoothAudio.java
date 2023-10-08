public class BluetoothAudio extends CarDecorator {
    public BluetoothAudio(Car car) {
        super(car);
    }


    public String getDescription() {
        return decoratedCar.getDescription() + ", Блютуз проигрыватель";
    }

    public double getCost() {
        return decoratedCar.getCost() + 500.0;
    }
}
