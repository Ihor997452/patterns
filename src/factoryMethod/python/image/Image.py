from abc import ABCMeta


class Image(metaclass=ABCMeta):
    def __str__(self):
        return "Image"
