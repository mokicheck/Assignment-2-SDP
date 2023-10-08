public class main {
    public static void main (String[] args) {
        //Создаем базовый автомобиль
        Car basicCar = new Car();
        System.out.println("Описание: " + basicCar.getDescription());
        System.out.println("Стоимость: $" + basicCar.getCost());


        // Добавляем декоратор для кожанных сиденьй
        Car carWithLeatherSeats = new LeatherSeatsDecorator(basicCar);
        System.out.println("Описание: " + carWithLeatherSeats.getDescription());
        System.out.println("Стоимость: $" + carWithLeatherSeats.getCost());

        // Добавляем декоратор для блютуз проигрывателя ()
        Car carWithBluetoothAudio = new BluetoothAudio(basicCar);
        System.out.println("Описание: " + carWithBluetoothAudio.getDescription());
        System.out.println("Стоимость: $" + carWithBluetoothAudio.getCost());

    }
    }

