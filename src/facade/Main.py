from src.decorator.facade.python.DataBaseFacade import DataBaseFacade

if __name__ == '__main__':
    db = DataBaseFacade()
    db.execute("*sqlstatement*")
