from src.composite.python.File import File
from src.composite.python.Message import Message

if __name__ == '__main__':
    message1 = Message("message1")
    message2 = Message("message2")
    file1 = File("file1")
    file2 = File("file2")
    file3 = File("file3")
    file4 = File("file4")

    message1.addFile(file1);
    message2.addFile(file2);
    message2.addFile(file4);
    message2.addFile(file3);

    message1.click();
    message2.click();
    pass
