from car import Car
from account import Account

if __name__=="__main__":
    print("hola mundo")

    car = Car("amd789", Account("jose andrs","asdfqwe"))
    print(vars(car))
    print(vars(car.driver))

   