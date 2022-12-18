from src.template.python.WebPageTemplate import WebPageTemplate


class MessagesPage(WebPageTemplate):
    def header(self):
        print("Messages page header")

    def content(self):
        print("Messages page content")

    def footer(self):
        print("Messages page footer")
