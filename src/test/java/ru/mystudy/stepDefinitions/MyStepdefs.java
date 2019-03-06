package ru.mystudy.stepDefinitions;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import org.testng.Assert;

import java.math.BigDecimal;

public class MyStepdefs {
    private static BigDecimal cash = new BigDecimal(120000);


    @Дано("на счете пользователя имеется {int} рублей")
    public void наСчетеПользователяИмеетсяРублей(int arg0) {
        Assert.assertEquals(0, cash.compareTo(new BigDecimal(arg0)));
    }

    @Когда("пользователь снимает со счета {int} рублей")
    public void пользовательСнимаетСоСчетаРублей(int arg0) {
        cash = cash.subtract(new BigDecimal(arg0));
    }
}
