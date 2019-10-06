package secure_data_warehouse;

import java.util.ArrayList;
//данный класс предназначен для хранения списка вопросов теста
public class TestQuestionsList2 {
    // Questions list
    // данные надо защищать от изменений, поэтому обьявлено private final
    // для использования
    private static final ArrayList<String> questionsList = new ArrayList<>();

    static
    {   //1) ООП
        questionsList.add(" Что такое ООП?");     //вопрос 1
        questionsList.add(" Что такое обьект?");   //вопрос 2
        questionsList.add(" Назовите основные принципы ООП."); //вопрос 3
        questionsList.add(" Что такое наследование?");  //вопрос 4
        questionsList.add(" Что такое полиморфизм? Какие проявления полиморфизма в Java Вы знаете?"); //вопрос 5
        questionsList.add(" Что такое инкапсуляция?"); //вопрос 6
        questionsList.add(" Что такое aбстракция?");   //вопрос 7
        questionsList.add(" В чем преимущества объектно-ориентированных языков программирования?"); //вопрос 8
        questionsList.add(" Как использование объектно – ориентерованного подхода" +
                          " улучшает разработку программного обеспечения?"); //вопрос 9
        questionsList.add(" Имеется выражение «является»  и «имеет». Что они подразумевают" +
                          " в плане принципов ООП? В  чем разница между композицией и агрегацией? "); //вопрос 10
        questionsList.add(" Что вы подразумеваете под  полиморфизмом, инкапсуляцией и" +
                          " динамическим связыванием?"); //вопрос 11

        //2) JAVA CORE
        questionsList.add(" Чем отличаются JRE, JVM и JDK?"); //вопрос 12
        questionsList.add(" Опишите модификаторы доступа в Java."); //вопрос 13
        questionsList.add(" Что такое package level access ?"); //вопрос 14
        questionsList.add(" Чем абстрактный класc отличается от интерфейса?" +
                          " В каких случаях Вы бы использовали абстрактный класс, а в каких интерфейс?"); //вопрос 15
        questionsList.add(" Может ли объект получить доступ к private-переменной класса?" +
                          " Если, да, то каким образом?"); //вопрос 16
        questionsList.add(" Для чего в джаве статические блоки?"); //вопрос 17
        questionsList.add(" Можно ли перегрузить static метод?"); //вопрос 18
        questionsList.add(" Расскажите про внутренние классы. Когда вы их будете использовать?"); //вопрос 19
        questionsList.add(" В чем разница между переменной экземпляра и статической переменной?" +
                          " Приведите пример."); //вопрос 20
        questionsList.add(" Приведите пример когда можно использовать статический метод?"); //вопрос 21
        questionsList.add(" Расскажите про классы - загрузчики и про динамическую зарузку классов."); //вопрос 22
        questionsList.add(" Что такое статическая и что такое динамическая загрузка класса?"); //вопрос 23
        questionsList.add(" Для чего нужен оператор \"assert\" в джава?"); //вопрос 24
        questionsList.add(" Почему в некоторых интерфейсах  вообще не определяют методов?"); //вопрос 25
        questionsList.add(" Какая основная разница между String, StringBuffer, StringBuilder?"); //вопрос 26
        questionsList.add(" Расскажите про потоки ввода-вывода Java."); //вопрос 27
        questionsList.add(" Что такое Heap и Stack память в Java?"); //вопрос 28
        questionsList.add(" Какая разница между Stack и Heap памятью в Java?"); //вопрос 29
        questionsList.add(" Расскажите про модель памяти в джава?"); //вопрос 30
        questionsList.add(" Как работает сборщик мусора (garbage collector)?"); //вопрос 31
        questionsList.add(" Расскажите про приведение типов. Что такое понижение и повышение типа?" +
                          " Когда вы получаете ClassCastException?"); //вопрос 32
        questionsList.add(" Что такое статический класс, какие особенности его использования?"); //вопрос 33
        questionsList.add(" Каким образом из вложенного класса получить доступ к полю внешнего класса."); //вопрос 34
        questionsList.add(" Какие существуют типы вложенных классов? Для чего они используются?"); //вопрос 35
        questionsList.add(" Возможно ли при переопределении (override) метода изменить:\n" +
                          " 1) Модификатор доступа,\n" +
                          " 2) Возвращаемый тип,\n" +
                          " 3) Тип аргумента или количество,\n" +
                          " 4) Имя аргументов,\n " +
                          " 5) Изменять порядок, количество или вовсе убрать секцию throws?"); //вопрос 36
        questionsList.add(" Что такое autoboxing?"); //вопрос 37
        questionsList.add(" Что такое Generics?"); //вопрос 38
        questionsList.add(" Какова истинная цель использования обобщенных типов в Java?"); //вопрос 39
        questionsList.add(" Каким образом передаются переменные в методы, по значению или по ссылке?"); //вопрос 40
        questionsList.add(" Какие методы есть у класса Object?"); //вопрос 41
        questionsList.add(" Правила переопределения метода Object.equals()."); //вопрос 42
        questionsList.add(" Если вы хотите переопределить equals(), какие условия должны удовлетворяться" +
                          " для переопределенного метода?"); //вопрос 43
        questionsList.add(" Какая связь между hashCode и equals?"); //вопрос 44
        questionsList.add(" Каким образом реализованы методы hashCode и equals в классе Object?"); //вопрос 45
        questionsList.add(" Что будет, если переопределить equals не переопределяя hashCode?" +
                          " Какие могут возникнуть проблемы?"); //вопрос 46
        questionsList.add(" Есть ли какие-либо рекомендации о том, какие поля следует использовать" +
                          " при подсчете hashCode? "); //вопрос 47
        questionsList.add(" Для чего нужен метод hashCode()?"); //вопрос 48
        questionsList.add(" Правила переопределения метода Object.hashCode()."); //вопрос 49
        questionsList.add(" Расскажите про клонирование объектов." +
                          " В чем отличие между поверхностным и глубоким клонированием?"); //вопрос 50
        questionsList.add(" Правила переопределения метода Object.clone()."); //вопрос 51
        questionsList.add(" Где и как вы можете использовать  закрытый конструктор?"); //вопрос 52
        questionsList.add(" Что такое конструктор по умолчанию?"); //вопрос 53
        questionsList.add(" Опишите метод Object.finalize()."); //вопрос 54
        questionsList.add(" Чем отличаются слова final, finally и finalize?"); //вопрос 55
        questionsList.add(" Опишите иерархию исключений."); //вопрос 56
        questionsList.add(" Какие виды исключений в Java вы знаете, чем они отличаются?"); //вопрос 57
        questionsList.add(" Что такое checked и unchecked Exception?"); //вопрос 58
        questionsList.add(" Как создать свой unchecked Exception?"); //вопрос 59
        questionsList.add(" Какие есть Unchecked Exceptions?"); //вопрос 60
        questionsList.add(" Что такое Error?"); //вопрос 61
        questionsList.add(" Опишите работу блока try-catch-finally."); //вопрос 62
        questionsList.add(" Возможно ли использование блока try-finally (без catch)?"); //вопрос 63
        questionsList.add(" Всегда ли исполняется блок finally?"); //вопрос 64
        questionsList.add(" Какие есть оссобенности класса String? Что делает метод intern()."); //вопрос 65
        questionsList.add(" Можно ли наследовать строковый тип, почему?"); //вопрос 66
        questionsList.add(" Почему строка является популярным ключом в HashMap в Java?"); //вопрос 67
        questionsList.add(" Дайте определение понятию конкатенация строк."); //вопрос 68
        questionsList.add(" Как перевернуть строку?"); //вопрос 69
        questionsList.add(" Как сравнить значение двух строк?"); //вопрос 70
        questionsList.add(" Как обрезать пробелы в начале и конце строки?"); //вопрос 71
        questionsList.add(" Дайте определение понятию \"пул строк\"."); //вопрос 72
        questionsList.add(" Можно ли синхронизировать доступ к строке?"); //вопрос 73
        questionsList.add(" Как правильно сравнить значения строк двух различных" +
                          " объектов типа String и StringBuffer?"); //вопрос 74
        questionsList.add(" Почему строка неизменная и финализированная в Java?"); //вопрос 75
        questionsList.add(" Напишите метод удаления данного символа из строки."); //вопрос 76
        questionsList.add(" Что такое рефлексия? "); //вопрос 77
        questionsList.add(" Что произойдет со сборщиком мусора (GC)," +
                          " если во время выполнения метода finalize() некоторого объекта произойдет" +
                          " исключение?"); //вопрос 78
        questionsList.add(" Что такое интернационализация, локализация?"); //вопрос 79
        questionsList.add(" Что такое Аннотации в Java?"); //вопрос 80
        questionsList.add(" Какие функции выполняет Аннотации?"); //вопрос 81
        questionsList.add(" Какие встроенные аннотации в Java вы знаете?"); //вопрос 82
        questionsList.add(" Что делают аннотации @Retention, @Documented, @Target и @Inherited?"); //вопрос 83
        questionsList.add(" Что делают аннотации @Override, @Deprecated, @SafeVarargs и @SuppressWarnings?"); //вопрос 84
        questionsList.add(" Какой жизненный цикл аннотации можно указать с помощью @Retention?"); //вопрос 85
        questionsList.add(" К каким элементам можно применять аннотацию, как это указать?"); //вопрос 86
        questionsList.add(" Как создать свою Аннотацию?"); //вопрос 87
        questionsList.add(" Атрибуты каких типов допустимы в аннотациях?"); //вопрос 88
        questionsList.add(" Что такое JMX?"); //вопрос 89
        questionsList.add(" Какие выгоды предлагает JMX?"); //вопрос 90
        questionsList.add(" Что еще умеет JMX кроме дистанционного управления?"); //вопрос 91
        questionsList.add(" Что такое MBean?"); //вопрос 92
        questionsList.add(" Какие типы MBeans существуют?"); //вопрос 93
        questionsList.add(" Что такое MBean Server?"); //вопрос 94
        questionsList.add(" Какие механизмы обеспечивают безопасность в технологии Java?"); //вопрос 95
        questionsList.add(" Назовите несколько видов проверок которые выполняет верификатор байт-кода Java?"); //вопрос 96
        questionsList.add(" Что вы знаете о \"диспетчере защиты\" в Java?"); //вопрос 97
        questionsList.add(" Что такое JAAS?"); //вопрос 98
        questionsList.add(" Что такое Рефакторинг?"); //вопрос 99

        //3) JAVA COLLECTIONS FRAMEWORK
        questionsList.add(" Что такое Коллекция?"); //вопрос 100
        questionsList.add(" Назовите основные интерфейсы коллекций и их имплементации."); //вопрос 101
        questionsList.add(" Чем отличается ArrayList от LinkedList? В каких случаях лучше" +
                          " использовать первый, а в каких второй?"); //вопрос 102
        questionsList.add(" Чем отличается HashMap от Hashtable?"); //вопрос 103
        questionsList.add(" Чем отличается ArrayList от Vector?"); //вопрос 104
        questionsList.add(" Как сравниваются елементы коллекций?"); //вопрос 105
        questionsList.add(" Расположите в виде иерархии следующие интерфейсы: List, Set, Map, SortedSet," +
                          " SortedMap, Collection,Iterable, Iterator, NavigableSet, NavigableMap."); //вопрос 106
        questionsList.add(" Почему Map - это не Collection, в то время как List и Set являются Collection?"); //вопрос 107
        questionsList.add(" Дайте определение понятию \"iterator\"."); //вопрос 108
        questionsList.add(" Что вы знаете об интерфейсе Iterable?"); //вопрос 109
        questionsList.add(" Как одной строчкой преобразовать HashSet в ArrayList?"); //вопрос 110
        questionsList.add(" Как одной строчкой преобразовать ArrayList в HashSet?"); //вопрос 111
        questionsList.add(" Как перебрать все ключи Map учитывая, что Map - это не Iterable?"); //вопрос 112
        questionsList.add(" Как перебрать все значения Map учитывая, что Map - это не Iterable?"); //вопрос 113
        questionsList.add(" Как перебрать все пары ключ-значение в Map учитывая, что Map - это не Iterable?"); //вопрос 114
        questionsList.add(" В чем проявляется 'сортированность' SortedMap, кроме того, что toString()  выводит все по порядку?"); //вопрос 115
        questionsList.add(" Как одним вызовом копировать элементы из любой Collection в массив?"); // вопрос 116
        questionsList.add(" Реализуйте симметрическую разность двух коллекций используя методы Collection (addAll()," +
                          " removeAll(), retainAll())."); //вопрос 117
        questionsList.add(" Сравните Enumeration и Iterator."); //вопрос 118
        questionsList.add(" Как между собой связаны Iterable и Iterator?"); //вопрос 119
        questionsList.add(" Как между собой связаны Iterable, Iterator и 'for-each' введенный в Java 5?"); //вопрос 120
        questionsList.add(" Сравните Iterator и ListIterator."); //вопрос 121
        questionsList.add(" Что произойдет, если я вызову Iterator.next() не \"спросив\" Iterator.hasNext()?"); //вопрос 122
        questionsList.add(" Что произойдет, если я вызову Iterator.next() перед этим 10 раз вызвав Iterator.hasNext()?" +
                          " Я пропущу 9 элементов?"); //вопрос 123
        questionsList.add(" Если у меня есть коллекция и порожденный итератор, изменится ли коллекция," +
                          " если я вызову iterator.remove()?"); //вопрос 124
        questionsList.add(" Если у меня есть коллекция и порожденный итератор, изменится ли итератор," +
                          " если я вызову collection.remove(..)?"); //вопрос 125
        questionsList.add(" Зачем добавили ArrayList, если уже был Vector?"); //вопрос 126
        questionsList.add(" В реализации класса ArrayList есть следующие поля: Object[] elementData," +
                          " int size. Объясните, зачем хранить отдельно size, если всегда можно взять" +
                          " elementData.length?"); //вопрос 127
        questionsList.add(" LinkedList - это односвязный, двусвязный или четырехсвязный список?"); //вопрос 128
        questionsList.add(" Какое худшее время работы метода contain() для элемента, который есть " +
                          " в LinkedList (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?"); //вопрос 129
        questionsList.add(" Какое худшее время работы метода contain() для элемента, который есть" +
                          " в ArrayList (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?"); //вопрос 130
        questionsList.add(" Какое худшее время работы метода add() для LinkedList (O(1), O(log(N))," +
                          " O(N), O(N*log(N)), O(N*N))?"); //вопрос 131
        questionsList.add(" Какое худшее время работы метода add() для ArrayList (O(1), O(log(N))," +
                          " O(N), O(N*log(N)), O(N*N))?"); //вопрос 132
        questionsList.add(" Сколько выделяется элементов в памяти при вызове ArrayList.add()?"); //вопрос 133
        questionsList.add(" Сколько выделяется элементов в памяти при вызове LinkedList.add()?"); //вопрос 134
        questionsList.add(" Оцените количество памяти на хранение одного примитива типа byte в LinkedList?"); //вопрос 135
        questionsList.add(" Оцените количество памяти на хранение одного примитива типа byte в ArrayList?"); //вопрос 136
        questionsList.add(" Я добавляю элемент в середину List-а: list.add(list.size()/2, newElem)." +
                          " Для кого эта операция медленнее - для ArrayList или для LinkedList?"); //вопрос 137
        questionsList.add(" Как перебрать элементы LinkedList в обратном порядке, не используя медленный" +
                          " get(index)?"); //вопрос 138
        questionsList.add(" Как одним вызовом из List получить List со всеми элементами, кроме первых и последних 3-х?"); //вопрос 139
        questionsList.add(" Могут ли у разных объектов в памяти (ref0 != ref1) быть ref0.hashCode() == ref1.hashCode()?"); //вопрос 140
        questionsList.add(" Могут ли у разных объектов в памяти (ref0 != ref1) быть ref0.equals(ref1) == true?"); //вопрос 141
        questionsList.add(" Могут ли у разных ссылок на один объект в памяти (ref0 == ref1) быть" +
                          " ref0.equals(ref1) == false?"); //вопрос 142
        questionsList.add(" Есть класс Point{int x, y;}. Почему хэш-код в виде 31 * x + y предпочтительнее чем x + y?"); //вопрос 143
        questionsList.add(" Если у класса Point{int x, y;} 'правильно' реализовать метод" +
                          " equals(return ref0.x == ref1.x && ref0.y == ref1.y), но сделать хэш-код в виде" +
                          " int hashCode() {return x;}, то будут ли корректно такие точки помещаться и" +
                          " извлекаться из HashSet? "); //вопрос 144
        questionsList.add(" equals() порождает отношение эквивалентности. Какими из свойств обладает такое отношение:" +
                          " коммутативность, симметричность, рефлексивность, дистрибутивность," +
                          " ассоциативность, транзитивность?"); //вопрос 145
        questionsList.add(" Можно ли так реализовать equals(Object that){return this.hashCode() == that.hashCode()}?"); //вопрос 146
        questionsList.add(" В equals требуется проверять, что аргумент (equals(Object that)) такого же типа\n" +
                          " как и сам объект. В чем разница между this.getClass() == that.getClass() и that instanceof MyClass?"); //вопрос 147
        questionsList.add(" Можно ли реализовать метод equals класса MyClass вот так:" +
                          " class MyClass{public boolean equals(MyClass that) {return this == that;}}? "); //вопрос 148
        questionsList.add(" Будет ли работать HashMap, если все ключи будут возвращать int hashCode() {return 42;}?"); //вопрос 149
        questionsList.add(" Зачем добавили HashMap, если уже был Hashtable? "); //вопрос 150
        questionsList.add(" Согласно Кнуту и Кормену существует две основных реализации хэш-таблицы:" +
                          " на основе открытой адресацией и на основе метода цепочек. Как реализована" +
                          " HashMap? Почему так сделали (по вашему мнению)? В чем минусы и плюсы каждого" +
                          " подхода?"); //вопрос 151
        questionsList.add(" Сколько переходов по ссылкам происходит, когда вы делаете HashMap.get(key)" +
                          " по ключу, который есть в таблице?"); //вопрос 152
        questionsList.add(" Сколько создается новых объектов, когда вы добавляете новый элемент в HashMap?"); //вопрос 153
        questionsList.add(" Как работает HashMap при попытке сохранить в нее два элемента по ключам" +
                          " с одинаковым hashCode, но для которых equals == false? "); //вопрос 154
        questionsList.add(" HashMap может выродиться в список даже для ключей с разным hashCode." +
                          " Как это возможно?"); //вопрос 155
        questionsList.add(" Какое худшее время работы метода get(key) для ключа, которого нет в таблице" +
                          " (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?"); //вопрос 156
        questionsList.add(" Какое худшее время работы метода get(key) для ключа, который есть в таблице" +
                          " (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?"); //вопрос 157
        questionsList.add(" Объясните смысл параметров в конструкторе HashMap(int initialCapacity, float loadFactor)."); //вопрос 158
        questionsList.add(" В чем разница между HashMap и IdentityHashMap? Для чего нужна IdentityHashMap?" +
                          " Как может быть полезна для реализации сериализации или клонирования?"); //вопрос 159
        questionsList.add(" В чем разница между HashMap и WeakHashMap? Для чего нужна WeakHashMap?"); //вопрос 160
        questionsList.add(" В WeakHashMap используются WeakReferences. А почему бы не создать SoftHashMap" +
                          " на SoftReferences?"); //вопрос 161
        questionsList.add(" В WeakHashMap используются WeakReferences. А почему бы не создать PhantomHashMap" +
                          " на PhantomReferences?"); //вопрос 162
        questionsList.add(" Сделайте HashSet из HashMap (используйте только множество ключей, но не множество значений)."); //вопрос 163
        questionsList.add(" Сделайте HashMap из HashSet (HashSet<Map.Entry<K, V>>)."); //вопрос 164
        questionsList.add(" Сравните интерфейсы java.util.Queue и java.util.Deque."); //вопрос 165
        questionsList.add(" Кто кого расширяет: Queue расширяет Deque, или Deque расширяет Queue?"); //вопрос 166
        questionsList.add(" Почему LinkedList реализует и List, и Deque?"); //вопрос 167
        questionsList.add(" В чем разница между классами java.util.Arrays и java.lang.reflect.Array?"); //вопрос 168
        questionsList.add(" В чем разница между классами java.util.Collection и java.util.Collections?"); //вопрос 169
        questionsList.add(" Напишите НЕмногопоточную программу, которая заставляет коллекцию выбросить" +
                          " ConcurrentModificationException."); //вопрос 170
        questionsList.add(" Что такое \"fail-fast поведение\"?"); //вопрос 171
        questionsList.add(" Для множеств еnum-ов есть специальный класс java.util.EnumSet? Зачем?" +
                          " Чем авторов не устраивал HashSet или TreeSet?"); //вопрос 172
        questionsList.add(" java.util.Stack - считается 'устаревшим'. Чем его рекомендуют заменять?" +
                          " Почему?"); //вопрос 173
        questionsList.add(" Какая коллекция реализует дисциплину обслуживания FIFO?"); //вопрос 174
        questionsList.add(" Какая коллекция реализует дисциплину обслуживания FILO?"); //вопрос 175
        questionsList.add(" Приведите пример, когда какая-либо коллекция выбрасывает" +
                          " UnsupportedOperationException."); //вопрос 176
        questionsList.add(" Почему нельзя написать 'ArrayList<List> numbers = new ArrayList<ArrayList>();'" +
                          " но можно \"List<ArrayList> numbers = new ArrayList<ArrayList>();\"? "); //вопрос 177
        questionsList.add(" LinkedHashMap - что это еще за 'зверь'? Что в нем от LinkedList, а что от" +
                          " HashMap?"); //вопрос 178
        questionsList.add(" LinkedHashSet - что это еще за 'зверь'? Что в нем от LinkedList, а что от" +
                          " HashSet?"); //вопрос 179
        questionsList.add(" Говорят, на LinkedHashMap легко сделать простенький кэш c \"invalidation policy\"," +
                          " знаете как?"); //вопрос 180
        questionsList.add(" Что позволяет сделать PriorityQueue?"); //вопрос 181
        questionsList.add(" В чем заключаются отличия java.util.Comparator от java.lang.Comparable?"); //вопрос 182

        //4) JAVA 8
        questionsList.add(" Какие нововведения, появились в Java 8?"); //вопрос 183
        questionsList.add(" Как сортировать список строк с помощью лямбда-выражения?"); //вопрос 184
        questionsList.add(" Какова структура лямбда-выражения?"); //вопрос 185
        questionsList.add(" К каким переменным есть доступ у Лямбда-выражений?"); //вопрос 186
        questionsList.add(" Что такое ссылки на метод?"); //вопрос 187
        questionsList.add(" Какие виды ссылок на методы вы знаете?"); //вопрос 188
        questionsList.add(" Объясните выражение System.out::println."); //вопрос 189
        questionsList.add(" Что такое функциональные интерфейсы?"); //вопрос 190
        questionsList.add(" Для чего нужен функциональный интерфейс BiConsumer<T,U>?"); //вопрос 191
        questionsList.add(" Для чего нужен функциональный интерфейс BiFunction<T,U,R>?"); //вопрос 192
        questionsList.add(" Для чего нужен функциональный интерфейс BinaryOperator<T>?"); //вопрос 193
        questionsList.add(" Для чего нужен функциональный интерфейс BiPredicate<T,U>?"); //вопрос 194
        questionsList.add(" Для чего нужен функциональный интерфейс BooleanSupplier?"); //вопрос 195
        questionsList.add(" Для чего нужен функциональный интерфейс Consumer<T>?"); //вопрос 196
        questionsList.add(" Для чего нужен функциональный интерфейс DoubleBinaryOperator?"); //вопрос 197
        questionsList.add(" Для чего нужен функциональный интерфейс DoubleConsumer?"); //вопрос 198
        questionsList.add(" Для чего нужен функциональный интерфейс DoubleFunction<R>?"); //вопрос 199
        questionsList.add(" Для чего нужен функциональный интерфейс DoublePredicate?"); //вопрос 200
        questionsList.add(" Для чего нужен функциональный интерфейс DoubleSupplier?"); //вопрос 201
        questionsList.add(" Для чего нужен функциональный интерфейс DoubleToIntFunction?"); //влопрос 202
        questionsList.add(" Для чего нужен функциональный интерфейс DoubleToLongFunction?"); //вопрос 203
        questionsList.add(" Для чего нужен функциональный интерфейс DoubleUnaryOperator?"); //вопрос 204
        questionsList.add(" Для чего нужен функциональный интерфейс Function<T,R>?"); //вопрос 205
        questionsList.add(" Для чего нужен функциональный интерфейс IntBinaryOperator?"); //вопрос 206
        questionsList.add(" Для чего нужен функциональный интерфейс IntConsumer?"); //вопрос 207
        questionsList.add(" Для чего нужен функциональный интерфейс IntFunction<R>?"); //вопрос 208
        questionsList.add(" Для чего нужен функциональный интерфейс IntPredicate?"); //вопрос 209
        questionsList.add(" Для чего нужен функциональный интерфейс IntSupplier?"); //вопрос 210
        questionsList.add(" Для чего нужен функциональный интерфейс IntToDoubleFunction?"); //вопрос 211
        questionsList.add(" Для чего нужен функциональный интерфейс IntToLongFunction?"); //вопрос 212
        questionsList.add(" Для чего нужен функциональный интерфейс IntUnaryOperator?"); //вопрос 213
        questionsList.add(" Для чего нужен функциональный интерфейс LongBinaryOperator?"); //вопрос 214
        questionsList.add(" Для чего нужен функциональный интерфейс LongConsumer?"); //вопрос 215
        questionsList.add(" Для чего нужен функциональный интерфейс LongFunction<R>?"); //вопрос 216
        questionsList.add(" Для чего нужен функциональный интерфейс LongPredicate?"); //вопрос 217
        questionsList.add(" Для чего нужен функциональный интерфейс LongSupplier?"); //вопрос 218
        questionsList.add(" Для чего нужен функциональный интерфейс LongToDoubleFunction?"); //вопрос 219
        questionsList.add(" Для чего нужен функциональный интерфейс LongToIntFunction?"); //вопрос 220
        questionsList.add(" Для чего нужен функциональный интерфейс LongUnaryOperator?"); //вопрос 221
        questionsList.add(" Для чего нужен функциональный интерфейс ObjDoubleConsumer<T>?"); //вопрос 222
        questionsList.add(" Для чего нужен функциональный интерфейс ObjIntConsumer<T>?"); //вопрос 223
        questionsList.add(" Для чего нужен функциональный интерфейс ObjLongConsumer<T>?"); //вопрос 224
        questionsList.add(" Для чего нужен функциональный интерфейс Predicate<T>?"); //вопрос 225
        questionsList.add(" Для чего нужен функциональный интерфейс Supplier<T>?"); //вопрос 226
        questionsList.add(" Для чего нужен функциональный интерфейс ToDoubleBiFunction<T,U>?"); //вопрос 227
        questionsList.add(" Для чего нужен функциональный интерфейс ToDoubleFunction<T>?"); //вопрос 228
        questionsList.add(" Для чего нужен функциональный интерфейс ToIntBiFunction<T,U>?"); //вопрос 229
        questionsList.add(" Для чего нужен функциональный интерфейс ToIntFunction<T>?"); //вопрос 230
        questionsList.add(" Для чего нужен функциональный интерфейс ToLongBiFunction<T,U>?"); //вопрос 231
        questionsList.add(" Для чего нужен функциональный интерфейс ToLongFunction<T>?"); //вопрос 232
        questionsList.add(" Для чего нужен функциональный интерфейс UnaryOperator<T>?"); //вопрос 233
        questionsList.add(" Что такое StringJoiner?"); //вопрос 234
        questionsList.add(" Что такое default методы?"); //вопрос 235
        questionsList.add(" Что такое static методы?"); //вопрос 236
        questionsList.add(" Как вызывать default-метод интерфейса в классе?"); //вопрос 237
        questionsList.add(" Как вызывать static-метод интерфейса в классе?"); //вопрос 238
        questionsList.add(" Что такое потоки(stream) в Java 8"); //вопрос 239
        questionsList.add(" Для чего нужен метод collect Java 8?"); //вопрос 240
        questionsList.add(" В чем разница между коллекцией(Collection) и потоком(Stream)?"); //вопрос 241
        questionsList.add(" Для чего предназначен метод forEach в потоках(stream)?"); //вопрос 242
        questionsList.add(" Как вывести на экран 10 случайных чисел, используя forEach?"); //вопрос 243
        questionsList.add(" Для чего предназначен метод map в потоках(stream)?"); //вопрос 244
        questionsList.add(" Как можно вывести на экран уникальные квадраты чисел используя метод map?"); //вопрос 245
        questionsList.add(" Какова цель метода filter в потоках(stream)?"); //вопрос 246
        questionsList.add(" Как вывести на экран количество пустых строк с помощью метода filter?"); //вопрос 247
        questionsList.add(" Для чего предназначен метод limit в потоках(stream)?"); //вопрос 248
        questionsList.add(" Для чего предназначен метод sorted в потоках(stream)?"); //вопрос 249
        questionsList.add(" Как вывести на экран 10 случайных чисел в отсортированном порядке в Java 8?"); //вопрос 250
        questionsList.add(" Параллельная обработка в Java 8?"); //вопрос 251
        questionsList.add(" Как найти максимальное число в списке Java 8?"); //вопрос 252
        questionsList.add(" Как найти минимальное число в списке Java 8?"); //вопрос 253
        questionsList.add(" Как получить сумму всех чисел в списке, используя Java 8?"); //вопрос 254
        questionsList.add(" Как получить среднее значение всех чисел, в списке, используя Java 8?"); //вопрос 255
        questionsList.add(" Что такое Optional?"); //вопрос 256
        questionsList.add(" Что такое Nashorn?"); //вопрос 257
        questionsList.add(" Что такое jjs в Java 8?"); //вопрос 258
        questionsList.add(" Что такое LocalDateTime в Java 8?"); //вопрос 259
        questionsList.add(" Что такое ZonedDateTime в Java 8?"); //вопрос 260
        questionsList.add(" Как получить текущую дату с использованием time API из Java 8?"); //вопрос 261
        questionsList.add(" Как добавить 1 неделю к текущей дате с использованием time API?"); //вопрос 262
        questionsList.add(" Как добавить 1 месяц к текущей дате с использованием time API?"); //вопрос 263
        questionsList.add(" Как добавить 1 год к текущей дате с использованием time API?"); //вопрос 264
        questionsList.add(" Как добавить 10 лет к текущей дате с использованием time API?"); //вопрос 265
        questionsList.add(" Как получить следующий вторник используя time API?"); //вопрос 266
        questionsList.add(" Как получить вторую субботу текущего месяца используя time API?"); //вопрос 267
        questionsList.add(" Как получить текущую дату в миллисекундах используя time API?"); //вопрос 268
        questionsList.add(" Как получить текущую дату по местному времени в миллисекундах" +
                          " используя используя time API?"); //вопрос 269
        questionsList.add(" Какой класс появился в Java 8 для декодирования данных?"); //вопрос 270
        questionsList.add(" Какой класс появился в Java 8 для кодирования данных?"); //вопрос 271
        questionsList.add(" Как создать Base64 декодировщик?"); //вопрос 272
        questionsList.add(" Как создать Base64 кодировщик?"); //вопрос 273

        //5) ПОТОКИ ВВОДА/ВЫВОДА В JAVA
        questionsList.add(" Что такое символьная ссылка?"); //вопрос 274
        questionsList.add(" Какая разница между I/О и NIO?"); //вопрос 275
        questionsList.add(" Какие особенности NIO вы знаете?"); //вопрос 276
        questionsList.add(" Какие существуют виды потоков ввода/вывода?"); //вопрос 277
        questionsList.add(" Назовите основные классы потоков ввода/вывода."); //вопрос 278
        questionsList.add(" Чем отличаются и что общего у OutputStream, InputStream, Writer, Reader?"); //вопрос 279
        questionsList.add(" Какие подклассы базового класса InputStream ви знаєте, для чего они" +
                          " предназначены?"); //вопрос 280
        questionsList.add(" Что вы знаете о RandomAccessFile?"); //вопрос 281
        questionsList.add(" Какие есть режимы доступа к файлу есть у RandomAccessFile ?"); //вопрос 282
        questionsList.add(" Какие подклассы базового класса OutputStream ви знаєте, для чего они" +
                          " предназначены?"); //вопрос 283
        questionsList.add(" Для чего используется PushbackInputStream?"); //вопрос 284
        questionsList.add(" Для чего используется SequenceInputStream?"); //вопрос 285
        questionsList.add(" Какие подклассы базового класса Reader ви знаете, для чего они предназначены?"); //вопрос 286
        questionsList.add(" Какие подклассы базового класса Writer ви знаете, для чего они предназначены?"); //вопрос 287
        questionsList.add(" Что  такое абсолютный путь и относительный путь?"); //вопрос 288
        questionsList.add(" В каких пакетах лежат классы-потоки?"); //вопрос 289
        questionsList.add(" Что вы знаете о классах-надстройках?"); //вопрос 290
        questionsList.add(" Какой класс-надстройка позволяет читать данные из входного байтового потока" +
                          " в формате примитивных типов данных?"); //вопрос 291
        questionsList.add(" Какой класс-надстройка позволяет ускорить чтение/запись за счет использования" +
                          " буфера?"); //вопрос 292
        questionsList.add(" Какие классы позволяют преобразовать байтовые потоки в символьные и обратно?"); //вопрос 293
        questionsList.add(" В чем отличие класса PrintWriter от PrintStream?"); //вопрос 294
        questionsList.add(" Какой класс предназначен для работы с элементами файловой системы?"); //вопрос 295
        questionsList.add(" Какой символ является разделителем при указании пути в файловой системе?"); //вопрос 296
        questionsList.add(" Какие методы класса File ви знаєте?"); //вопрос 297
        questionsList.add(" Что вы знаете об интерфейсе FileFilter?"); //вопрос 298
        questionsList.add(" Какие классы позволяют архивировать объекты?"); //вопрос 299

        //6) MULTITHREADING
        questionsList.add(" Чем отличается процесс от потока?"); //вопрос 300
        questionsList.add(" Каким образом можно создать поток?"); //вопрос 301
        questionsList.add(" Что такое монитор?"); //вопрос 302
        questionsList.add(" Какие способы синхронизации в Java?"); //вопрос 303
        questionsList.add(" Как работают методы wait и notify/notifyAll?"); //вопрос 304
        questionsList.add(" Чем отличается работа метода wait с параметром и без параметра?"); //вопрос 305
        questionsList.add(" Как работает метод Thread.yield()? Чем отличаются методы Thread.sleep()" +
                          " и Thread.yield()? "); //вопрос 306
        questionsList.add(" Как работает метод Thread.join()?"); //вопрос 307
        questionsList.add(" Что такое dead lock?"); //вопрос 308
        questionsList.add(" На каком объекте происходит синхронизация при вызове static synchronized" +
                          " метода?"); //вопрос 309
        questionsList.add(" Для чего используется ключевое слово volatile, synchronized, transient, native?"); //вопрос 310
        questionsList.add(" Что значит приоритет потока?"); //вопрос 311
        questionsList.add(" Что такое потоки – демоны в джава?"); //вопрос 312
        questionsList.add(" Что значит усыпить поток?"); //вопрос 313
        questionsList.add(" В каких состояниях может быть поток в джава? Как вообще работает поток?"); //вопрос 314
        questionsList.add(" Чем отличаются два интерфейса для реализации задач Runnable и Callable?"); //вопрос 315
        questionsList.add(" Различия между CyclicBarrier и CountDownLatch?"); //вопрос 316
        questionsList.add(" Что такое состояние гонки (race condition)?"); //вопрос 317
        questionsList.add(" Как остановить нить?"); //вопрос 318
        questionsList.add(" Что происходит, когда в нити появляется исключение?"); //вопрос 319
        questionsList.add(" Что такое ThreadLocal переменная?"); //вопрос 320
        questionsList.add(" Что такое FutureTask?"); //вопрос 321
        questionsList.add(" Различие между interrupted и isInterrupted?"); //вопрос 322
        questionsList.add(" Почему методы wait и notify вызываются в синхронизированном блоке?"); //вопрос 323
        questionsList.add(" Что такое пул нитей?"); //вопрос 324
        questionsList.add(" Различия между livelock и deadlock?"); //вопрос 325
        questionsList.add(" Как проверить, удерживает ли нить lock?"); //вопрос 326
        questionsList.add(" Как получить дамп нити?"); //вопрос 327
        questionsList.add(" Какой JVM параметр используется для контроля размера стека нити?"); //вопрос 328
        questionsList.add(" Различия между synchronized и ReentrantLock?"); //вопрос 329
        questionsList.add(" Что такое Semaphore?"); //вопрос 330
        questionsList.add(" Что будет, если очередь пула нитей уже заполнена, а вы подадите задачу?"); //вопрос 331
        questionsList.add(" Различия между методами submit() и execute() у пула нитей?"); //вопрос 332
        questionsList.add(" Что такое блокирующий метод?"); //вопрос 333
        questionsList.add(" Что такое ReadWriteLock?"); //вопрос 334
        questionsList.add(" Что такое double checked locking Синглтона?"); //вопрос 335
        questionsList.add(" Что такое фреймворк Fork/Join?"); //вопрос 336
    }

    public static ArrayList<String> getQuestionsList() {

        return questionsList;

    }
}
