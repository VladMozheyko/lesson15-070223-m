

public class Main {

    /*
    План занятия
    1) Работа со строками
    2) Знакомство с классами StringBuilder и StringBuffer
    3) Практика
     */

    /*
    Теория
    Строка - это набор(массив) символов. В языках высокого уровня для работы со строками существуют классы, в таких классах
    описан алгоритм работы с набором(массивом) символов. У каждого алгоритма есть свои преимущества и свои недостатки, поэтому
    достаточно часто таких классов несколько. Крайне важно знать специфику каждого класса, потому что как правило программисты
    работают со строками, поэтому вряд ли получится пройти какое-либо собеседование без четкого понимания нюансов работы
    с каждым таким классом.
    В Java есть 3 класса для работы со строками:
    1) String - это класс для которого в Java есть исключение - для него перегружен оператор =, т.е. можно создать объект
    этого класса без слова new. Особенности данного класса:
    Все его объекты хранятся в специальном пуле и если объект класса String имеет значение, которое уже есть в пуле, то в него
    просто записывается ссылка на элемент этого пула. String - иммутабельный(immutable) класс, т.е. его объекты не могут
    менять свои значения, по факту при изменении строки типа String в переменную записывается ссылка на новую строку.
    Этот класс не подходит для частных изменений переменных. В Java память освобождается сборщиком мусора(garbage collector).
    Поскольку при создании нового значения типа String в него записывается новая ссылка, то старая будет уничтожена сборщиком
    мусора, соответсвенно, если часто менять переменные типа String, то работа программы замедлится за счет частых запуском
    сборщика мусора.
    Остальные классы для работы со строками изменяемые(mutable). Классы StringBuilder и StringBuffer имеют одинаковые методы,
    которые выполняют одинаковые функции.
    2) StringBuilder - подходит для работы в однопоточной среде
    3) StringBuffer  - подходит для работы во многопоточной среде
     */

    /*
    Заметки

     */

    /*
    Задачи со звездочкой
    Сделать класс по аналоги со String, т.е. неизменяемый и класс по аналогии со StringBuilder - изменяемый для обработки
    массива типа char.
     */




    String str = "Hello";
    static StringBuilder stringBuilder = new StringBuilder();  // Объекты классов
    static StringBuffer stringBuffer = new StringBuffer();
    public static void main(String[] args) {

        stringBuilder.append("Hello, StringBuilder");
        System.out.println(stringBuilder);
        stringBuilder.insert(5, "cool");
        System.out.println(stringBuilder);
        stringBuilder.replace(5, 7, "BB");
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(5);
        System.out.println(stringBuilder);

        stringBuffer.append("Hello, StringBuffer");
        System.out.println(stringBuffer);
        stringBuffer.insert(10, "String");
        System.out.println(stringBuffer);
        stringBuffer.replace(15, 18, "Bye");
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(3);
        System.out.println(stringBuffer);

        System.out.println(stringBuilder.charAt(11));

        //Ниже работа с продленнкой. Класс MyString тоже делали с продленкой

//        try {
//            display(7);
//        }
//        catch (MyException ex){
//            ex.printStackTrace();
//        }
//        finally {
//            System.out.println("Проверили конструкцию try-catch-finally");
//        }

        char[] chars = {'h','e', 'l', 'l', 'o'};
        MyString myString = new MyString(chars);
        myString.add('a');
        myString.add('b');
        myString.add('c');
        myString.display();

        myString.addString(chars);
        myString.display();


    }

    public static void display(int a) throws MyException {
           if(a > 5){
               throw new MyException("Ошибка. Число больше 5");
           }
    }
}
