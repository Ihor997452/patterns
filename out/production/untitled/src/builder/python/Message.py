from src.abstractFactoryMethod.python.fileLoader.file.File import File
from src.factoryMethod.python.image.Image import Image
from src.prototype.python.db.model.User import User


class Message:
    frm = None
    to = None
    image = None
    file = None
    content = None

    def set_to(self, usr: User):
        self.to = usr
        return self

    def set_frm(self, usr: User):
        self.frm = usr
        return self

    def set_image(self, image: Image):
        self.image = image
        return self

    def set_file(self, file: File):
        self.file = file
        return self

    def set_content(self, content: str):
        self.content = content
        return self

    def build(self):
        return self

    def __str__(self):
        return ("Message{" +
                "content='" + str(self.content) + '\'' +
                ", image=" + str(self.image) +
                ", file=" + str(self.file) +
                ", from=" + str(self.frm) +
                ", to=" + str(self.to) +
                '}')
