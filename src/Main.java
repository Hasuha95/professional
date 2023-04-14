import Losson_1.Apple;
import Losson_1.Box;
import Losson_1.Orange;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

/*
                      ЗАДАНИЕ 1
        String[] array = new String[]{"10","20","30","40"};
        Integer[] array = new Integer[]{10,20 ,30 ,40};
        System.out.println(new Generics<>().arrayToList(array));

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        for (int i = 0; i < 51; i++) {
            appleBox.putFruitInBox(new Apple());
            orangeBox.putFruitInBox(new Orange());
            appleBox1.putFruitInBox(new Apple());
        }

        System.out.println(appleBox.compare(orangeBox));

        appleBox.shiftFruitsIn(appleBox1);
        System.out.println(appleBox.getWaight());
        System.out.println(appleBox1.getWaight());
*/



    }


    //                  задание 1
/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;
3. Большая задача:
Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов и вес одного фрукта (вес яблока – 1.0f, апельсина – 1.5f. Не важно, в каких это единицах);
Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true – если она равны по весу, false – в противном случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую (помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами). Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
Не забываем про метод добавления фрукта в коробку.
*/



}