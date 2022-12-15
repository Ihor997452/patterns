from src.abstractFactoryMethod.python.AbstractFactory import AbstractFactory
from src.builder.python.Message import Message
from src.prototype.python.db.model.User import User

if __name__ == '__main__':
    fileFactory = AbstractFactory.getFactory("pdf")
    imageFactory = AbstractFactory.getFactory("png")
    frm = User(0, "username0", "password0", "email0")
    to = User(1, "username1", "password1", "email1")
    content = "content"

    message = Message()\
        .set_frm(frm)\
        .set_to(to)\
        .set_content(content)\
        .set_file(fileFactory.create())\
        .set_image(imageFactory.create())

    print(message)
