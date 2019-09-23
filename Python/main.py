from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello World")

    car = Car("OLA 123", Account("pepito perez", "JSDN987"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("MOLA 456", Account("edna moda", "QWEAS852"))
    print(vars(car2))
    print(vars(car2.driver))
