package ru.mystudy.stepDefinitions;

import cucumber.api.java.ru.Допустим;

public class CucumberExprStepDefs {
    @Допустим("передадим в метод шага целое число {int}")
    public void передадим_в_метод_шага_целое_число(Integer int1) {
        System.out.println("Целое число " + int1);
    }

    @Допустим("передадим в метод шага дробное число {double}")
    public void передадим_в_метод_шага_дробное_число(Double double1) {
        System.out.println("Дробное число " + double1);
    }

    @Допустим("передадим в метод шага {string}")
    public void передадим_в_метод_шага (String string) {
        System.out.println("Строка " + string);
    }

    @Допустим("передадим в метод шага слово {word}")
    public void передадим_в_метод_шага_слово(String string) {
        System.out.println("Слово " + string);
    }
}
