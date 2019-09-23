from account import Account
from uberX import UberX
from uberPool import UberPool
from uberVan import UberVan 
from uberBlack import UberBlack

class Car:
    id        = int
    license   = str
    driver    = Account("","")
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
