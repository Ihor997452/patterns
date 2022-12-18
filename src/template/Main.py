from src.template.python.LandingPage import LandingPage
from src.template.python.MessagesPage import MessagesPage

if __name__ == '__main__':
    template = MessagesPage()
    template.show()
    print()

    template = LandingPage()
    template.show()
    print()
