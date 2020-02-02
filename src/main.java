
import java.util.*;

public class main  {

    public static void main(String[] args) {
        /*
        Задача №5: Таблица умножения.
        Выполнил Хлюстов М.В.
        Условие: Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
         Использовать циклы запрещено.
         */
        Scanner in = new Scanner(System.in); // объявим объект для ввода
        double str;//сохранит введенное число
        int number=1;// порядковый номер
        int dec = 0;// множитель
        System.out.println("Товарищ пользователь введите пожалуйста любое число:");
        str = in.nextDouble();//записали введеное число
        in.close();// закрыли объект,теперь он не нужен
        System.out.println("Таблица умножения от 1 до 10 для числа:" + str);


        double  rezult =str* ++dec; // результат
        System.out.println(number + "." + str + "*" + dec + "=" + rezult); // формат для вывода значений, результат


        rezult =str* ++dec;
        number++;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);

        number++;
        rezult =str* ++dec;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);

        number++;
        rezult =str* ++dec;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);

        number++;
        rezult =str* ++dec;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);
        rezult =str* ++dec;

        number++;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);

        number++;
        rezult =str* ++dec;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);

        number++;
        rezult =str* ++dec;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);

        number++;
        rezult =str* ++dec;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);

        number++;
        rezult =str* ++dec;
        System.out.println(number + "." + str + "*" + dec + "=" + rezult);

        System.out.println("Таблица умножения успешно построена, задача выполнена!");
}
}
