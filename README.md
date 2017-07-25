ペットを例にしてJavaのオブジェクト指向を演習する。 
オブジェクト指向の簡単実例

本プロジェクトをソースツリーでクローンして、
ロカールのEclipseで起動して実行できる。

本プロジェクト目的：
オブジェクト指向を理解すること；
今後のプロジェクトでオブジェクト指向を活用していけること；
オブジェクト指向を作成していけること。

```java
public class CatTest {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.run();
        one.name = "xx";
        one.month =x;
        one.weight = xx;
        one.species = "xx";
        System.out.println("ネーム：" + one.name);
        System.out.println("年齢：" + one.month);
        System.out.println("体重：" + one.weight);
        System.out.println("品種：" + one.species);
        one.run(one.name);
```