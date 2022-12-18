from src.decorator.facade.python.db.Statement import Statement
from src.decorator.facade.python.db.Transaction import Transaction
from src.decorator.facade.python.db.Connection import Connection


class DataBaseFacade:
    def execute(self, sql: str):
        statement = Statement(sql)
        connection = Connection()
        transaction = Transaction()

        connection.connect("*dbUrl*")

        transaction.begin_transaction()
        connection.execute_statement(statement)
        print(connection.get_result_set().get_result())
        transaction.end_transaction()
