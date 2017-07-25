package com.ritsui.animal;

/**
 * ペットを例にしてJavaのオブジェクト指向を演習する。
 * 本ファイルはオブジェクト指向の簡単実例
 * @author ritsui_so
 */

public class CatTest {
    public static void main(String[] args) {
        //オブジェクト指向の実例化
        Cat one = new Cat();
        //テスト
        one.run();//結果の１行目
        one.name = "はな";
        one.month = 2;
        one.weight = 1000;
        one.species = "ブリティッシュショートヘア";
        //オブジェクト指向の実例化(2)
        Cat two = new Cat();
        //test；値を対象に入れる
        two.eat();//結果の２行目
        two.name = "まんじゅう";
        two.month = 1;
        two.weight = 800;
        two.species = "ベンガル";
        //はなちゃんの実例
        System.out.println("ネーム：" + one.name);
        System.out.println("年齢：" + one.month);
        System.out.println("体重：" + one.weight);
        System.out.println("品種：" + one.species);
        one.run(one.name);
        //まんじゅうの実例    
        System.out.println("ネーム：" + two.name);
        System.out.println("年齢：" + two.month);
        System.out.println("体重：" + two.weight);
        System.out.println("品種：" + two.species);
        two.eat(two.name);
    }

}
