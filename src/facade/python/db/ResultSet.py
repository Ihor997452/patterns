class ResultSet:
    result: str

    def __init__(self, result: str):
        self.result = result.lower()

    def get_result(self) -> str:
        return self.result
