# Assignment-2-SDP

# Декоратор: Оформление автомобиля

Пример реализации паттерна "Декоратор" для оформления автомобиля.

## Класс `Car`

`Car` - это базовый класс, представляющий основу для всех автомобилей. Он имеет два метода:

- `getDescription()`: Возвращает описание автомобиля (по умолчанию "Автомобиль").
- `getCost()`: Возвращает стоимость автомобиля (по умолчанию $20,000).

## Класс `CarDecorator`

`CarDecorator` - это абстрактный класс декоратора, который наследует от `Car`. Он играет роль базы для всех декораторов и имеет следующие элементы:

- Поле `decoratedCar`: Это поле хранит ссылку на декорируемый объект типа `Car`.
- Конструктор `CarDecorator(Car car)`: Конструктор принимает объект типа `Car` и устанавливает его в поле `decoratedCar`.

## Класс `LeatherSeatsDecorator`

`LeatherSeatsDecorator` - это конкретный декоратор для добавления кожаных сиденья к автомобилю. Он наследует от `CarDecorator` и предоставляет следующие элементы:

- Конструктор `LeatherSeatsDecorator(Car car)`: Конструктор принимает объект типа `Car` и передает его в конструктор родительского класса.
- Метод `getDescription()`: Переопределяет метод `getDescription()` и добавляет "Кожаные сиденья" к описанию базового автомобиля.
- Метод `getCost()`: Переопределяет метод `getCost()` и добавляет стоимость кожаных сидений к стоимости базового автомобиля.

Пример использования:

```java
Car basicCar = new Car();
System.out.println("Описание: " + basicCar.getDescription());
System.out.println("Стоимость: $" + basicCar.getCost());

Car carWithLeatherSeats = new LeatherSeatsDecorator(basicCar);
System.out.println("Описание: " + carWithLeatherSeats.getDescription());
System.out.println("Стоимость: $" + carWithLeatherSeats.getCost());
