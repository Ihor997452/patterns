class UserDTO:
    email = None
    username = None

    def __init__(self, email, username):
        self.email = email
        self.username = username

    def set_email(self, email):
        self.email = email

    def set_username(self, username):
        self.username = username

    def __str__(self):
        return ("UserDTO{" +
                "email='" + str(self.email) + '\'' +
                ", username='" + str(self.username) + '\'' +
                '}')
