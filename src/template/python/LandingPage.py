from src.template.python.WebPageTemplate import WebPageTemplate


class LandingPage(WebPageTemplate):
    def header(self):
        print("Landing page header")

    def content(self):
        print("Landing page content")

    def footer(self):
        print("Landing page footer")
