from src.decorator.facade.python.db.ResultSet import ResultSet
from src.decorator.facade.python.db.Statement import Statement


class Connection:
    result: ResultSet

    def connect(self, db: str):
        print("connected to " + db)

    def execute_statement(self, statement: Statement):
        print("Executing statement " + statement.getStatement())
        self.result = ResultSet(statement.getStatement())

    def get_result_set(self) -> ResultSet:
        return self.result
