class Statement:
    sql: str

    def __init__(self, sql:str):
        self.sql = sql

    def getStatement(self):
        return self.sql.lower()
