import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Task 5
        /*
        Создайте класс Dog, содержащий два поля типа String: name и says. В методе
        main() создайте два объекта Dog с разными именами (spot и scruffy) и сообщениями.
        Выведите значения обоих полей для каждого из объектов.
         */

        Dog scruffy = new Dog("Scruffy", "fuf, I'm ");
        Dog spot = new Dog("Spot","fuf, I'm ");
        Dog bufDog = spot;

        System.out.println(scruffy.getSays() + scruffy.getName() + '\n' +
                spot.getSays() + spot.getName());

        // Task 6
        /*
        В упражнении 5 создайте новую ссылку на Dog и присвойте ее объекту spot.
        Сравните ссылки оператором == и методом equals().
         */

        System.out.println( '\n' + "comparison");
        System.out.println("equal: " + bufDog.equals(spot) + '\n' +
                "==: " + (bufDog == spot));

        // Task 8
        /*
        Покажите, что шестнадцатеричная и восьмеричная записи могут использоваться
        с типом long. Для вывода результатов используйте метод Long.toBinaryString().
        */
        Task8.task8();

        // Task 10
        /*
        Напишите программу с двумя константами: обе константы состоят из череду-
        ющихся нулей и единиц, но у одной нулю равен младший бит, а у другой старший
        (подсказка: константы проще всего определить в шестнадцатеричном виде). Объ-
        едините эти две константы всеми возможными поразрядными операторами. Для
        вывода результатов используйте метод Integer.toBinaryString().
         */
        Task10.task10();


        // Task 12
        /*
        Начните с числа, состоящего из двоичных единиц. Сдвиньте его влево, а затем
        используйте беззнаковый оператор сдвига вправо по всем двоичным позициям,
        с выводом всех промежуточных результатов методом Integer.toBinaryString().
        */
        Task12.task12();


        // task 14
        /*
        Напишите метод, который получает два аргумента String, выполняет с ними
        все операции логических сравнений и выводит результаты. Для операций == и I =
        также выполните проверку equals(). Вызовите свой метод из main() для нескольких
        разных объектов String.
        */
        BoolOperation.operations("Dog", "Tree");

    }
}
