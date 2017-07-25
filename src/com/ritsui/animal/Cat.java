package com.ritsui.animal;

/**
 * ペットを例にしてJavaのオブジェクト指向を演習する。
 * 本ファイルはオブジェクト指向の変数定義
 * @author ritsui_so
 */
public class Cat {
    //対象者（猫）属性：ネーム、年齢、体重、品種
    String name;//ネーム
    int month;//年齢
    double weight;//体重
    String species;//品種

    //対象者メソッド：走る（run）、食う（eat）
    //走る（RUN)メソッド
    public void run() {
        System.out.println("猫ちゃんが走っている");
    }

    public void run(String name) {
        System.out.println(name + "ちゃんが走っている");
    }

    //食う（eat）メソッド
    public void eat() {
        System.out.println("猫ちゃんが魚を食っている");
    }

    public void eat(String name) {
        System.out.println(name + "ちゃんが魚を食っている");
    }
}
