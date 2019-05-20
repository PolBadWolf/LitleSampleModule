package ru.yandex.fixcolor.test.ModuleMain;

import ru.yandex.fixcolor.test.ModuleBig.Him;

public class MainClass {
    Him him;
    public static void main(String[] args) {
        System.out.println("Hello");
        new MainClass().go();
    }
    private void go() {
        him = new Him();
    }
}
