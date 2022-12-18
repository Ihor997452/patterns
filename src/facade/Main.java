package src.facade;

import src.facade.java.com.my.DataBaseFacade;

public class Main {
    public static void main(String[] args) {
        DataBaseFacade dataBaseFacade = new DataBaseFacade();
        dataBaseFacade.execute("*insert user sql statement*");
    }
}
