package com.example.calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class UsersList {
    private static List<UserModel> arr;
    static {
        arr = new ArrayList();
        arr.add(new UserModel(R.drawable.img01, "Дарий", "Коцюбинский", new Date(1950, 1, 1),
                "Украина", "Киев"));
        arr.add(new UserModel(R.drawable.img02, "Шарль", "Беляков", new Date(1951, 1, 2),
                        "Украина", "Донецк"));
        arr.add(new UserModel(R.drawable.img03, "Фёдор", "Фёдоров", new Date(1952, 2, 3),
                        "Украина", "Харьков"));
        arr.add(new UserModel(R.drawable.img04, "Денис", "Крюков", new Date(1953, 4, 4),
                        "Украина", "Одесса"));
        arr.add(new UserModel(R.drawable.img05, "Чарльз", "Григорьев", new Date(1954, 5, 5),
                        "Украина", "Днепр"));
        arr.add(new UserModel(R.drawable.img06, "Николай", "Потапов", new Date(1955, 6, 6),
                        "Россия", "Москва"));
        arr.add(new UserModel(R.drawable.img07, "Чарльз", "Суворов", new Date(1956, 7, 7),
                        "Россия", "Тамбов"));
        arr.add(new UserModel(R.drawable.img08, "Жигер", "Быков", new Date(1957, 8, 8), "Россия",
                        "Тюмень"));
        arr.add(new UserModel(R.drawable.img09, "Любомир", "Громов", new Date(1958, 9, 9),
                        "Россия", "Брянск"));
        arr.add(new UserModel(R.drawable.img10, "Устин", "Королёв", new Date(1959, 10, 10),
                        "Россия", "Воронеж"));
        arr.add(new UserModel(R.drawable.img11, "Болеслав", "Марков", new Date(1960, 11, 11),
                        "Беларусь", "Минск"));
        arr.add(new UserModel(R.drawable.img12, "Олег", "Гамула", new Date(1961, 12, 12),
                        "Беларусь", "Гомель"));
        arr.add(new UserModel(R.drawable.img13, "Шарль", "Кобзар", new Date(1962, 1, 13),
                        "Беларусь", "Брест"));
        arr.add(new UserModel(R.drawable.img14, "Цицерон", "Зварыч", new Date(1963, 2, 14),
                        "Беларусь", "Бобруйск"));
        arr.add(new UserModel(R.drawable.img15, "Йоган", "Гурьев", new Date(1964, 3, 15),
                        "Беларусь", "Могилёв"));
        arr.add(new UserModel(R.drawable.img16, "Никита", "Якушев", new Date(1965, 4, 16),
                        "Украина", "Киев"));
        arr.add(new UserModel(R.drawable.img17, "Эрик", "Сирко", new Date(1966, 5, 17), "Украина"
                        , "Донецк"));
        arr.add(new UserModel(R.drawable.img18, "Захар", "Рыбаков", new Date(1967, 6, 18),
                        "Украина", "Харьков"));
        arr.add(new UserModel(R.drawable.img19, "Динар", "Журавлёв", new Date(1968, 7, 19),
                        "Украина", "Одесса"));
        arr.add(new UserModel(R.drawable.img20, "Платон", "Яровой", new Date(1969, 8, 20),
                        "Украина", "Днепр"));
        arr.add(new UserModel(R.drawable.img21, "Прохор", "Мухин", new Date(1970, 9, 21),
                        "Россия", "Москва"));
        arr.add(new UserModel(R.drawable.img22, "Пётр", "Маслов", new Date(1971, 10, 22),
                        "Россия", "Тамбов"));
        arr.add(new UserModel(R.drawable.img23, "Юлиан", "Орлов", new Date(1972, 11, 23),
                        "Россия", "Тюмень"));
        arr.add(new UserModel(R.drawable.img24, "Устин", "Тимофеев", new Date(1973, 12, 24),
                        "Россия", "Брянск"));
        arr.add(new UserModel(R.drawable.img25, "Тимофей", "Кабанов", new Date(1974, 1, 25),
                        "Россия", "Воронеж"));
        arr.add(new UserModel(R.drawable.img26, "Кирилл", "Сафонов", new Date(1975, 2, 26),
                        "Беларусь", "Минск"));
        arr.add(new UserModel(R.drawable.img27, "Харитон", "Шумейко", new Date(1976, 3, 27),
                        "Беларусь", "Гомель"));
        arr.add(new UserModel(R.drawable.img28, "Валериан", "Трясило", new Date(1977, 4, 28),
                        "Беларусь", "Брест"));
        arr.add(new UserModel(R.drawable.img29, "Юрий", "Меркушев", new Date(1978, 5, 1),
                        "Беларусь", "Бобруйск"));
        arr.add(new UserModel(R.drawable.img30, "Фёдор", "Гребневский", new Date(1979, 6, 2),
                        "Беларусь", "Могилёв"));
        arr.add(new UserModel(R.drawable.img01, "Шамиль", "Маслов", new Date(1980, 7, 3),
                        "Украина", "Киев"));
        arr.add(new UserModel(R.drawable.img02, "Фёдор", "Андрухович", new Date(1981, 8, 4),
                        "Украина", "Донецк"));
        arr.add(new UserModel(R.drawable.img03, "Олег", "Лукин", new Date(1982, 9, 5), "Украина",
                        "Харьков"));
        arr.add(new UserModel(R.drawable.img04, "Денис", "Погомий", new Date(1983, 10, 6),
                        "Украина", "Одесса"));
        arr.add(new UserModel(R.drawable.img05, "Иммануил", "Журавлёв", new Date(1984, 11, 7),
                        "Украина", "Днепр"));
        arr.add(new UserModel(R.drawable.img06, "Шарль", "Громов", new Date(1985, 12, 8),
                        "Россия", "Москва"));
        arr.add(new UserModel(R.drawable.img07, "Йосеф", "Терещенко", new Date(1986, 1, 9),
                        "Россия", "Тамбов"));
        arr.add(new UserModel(R.drawable.img08, "Гордей", "Пархоменко", new Date(1987, 2, 10),
                        "Россия", "Тюмень"));
        arr.add(new UserModel(R.drawable.img09, "Прохор", "Михайлов", new Date(1988, 3, 11),
                        "Россия", "Брянск"));
        arr.add(new UserModel(R.drawable.img10, "Викентий", "Моисеев", new Date(1989, 4, 12),
                        "Россия", "Воронеж"));
        arr.add(new UserModel(R.drawable.img11, "Влад", "Гуляев", new Date(1990, 5, 13),
                        "Беларусь", "Минск"));
        arr.add(new UserModel(R.drawable.img12, "Евстахий", "Фомин", new Date(1991, 6, 14),
                        "Беларусь", "Гомель"));
        arr.add(new UserModel(R.drawable.img13, "Цефас", "Чернов", new Date(1992, 7, 15),
                        "Беларусь", "Брест"));
        arr.add(new UserModel(R.drawable.img14, "Чарльз", "Тарасов", new Date(1993, 8, 16),
                        "Беларусь", "Бобруйск"));
        arr.add(new UserModel(R.drawable.img15, "Устин", "Герасимов", new Date(1994, 9, 17),
                        "Беларусь", "Могилёв"));
        arr.add(new UserModel(R.drawable.img16, "Родион", "Антонов", new Date(1995, 10, 18),
                        "Украина", "Киев"));
        arr.add(new UserModel(R.drawable.img17, "Никита", "Мамонтов", new Date(1996, 11, 19),
                        "Украина", "Донецк"));
        arr.add(new UserModel(R.drawable.img18, "Елисей", "Горбачёв", new Date(1997, 12, 20),
                        "Украина", "Харьков"));
        arr.add(new UserModel(R.drawable.img19, "Роман", "Поляков", new Date(1998, 1, 21),
                        "Украина", "Одесса"));
                arr.add(new UserModel(R.drawable.img20, "Артём", "Сирко", new Date(1999, 2, 22),
                        "Украина", "Днепр"));
                arr.add(new UserModel(R.drawable.img21, "Цефас", "Симоненко", new Date(1955, 3, 23),
                        "Россия", "Москва"));
                arr.add(new UserModel(R.drawable.img22, "Зураб", "Князев", new Date(1956, 4, 24),
                        "Россия", "Тамбов"));
                arr.add(new UserModel(R.drawable.img23, "Игорь", "Коломоец", new Date(1957, 5, 25),
                        "Россия", "Тюмень"));
                arr.add(new UserModel(R.drawable.img24, "Шарль", "Мухин", new Date(1958, 6, 26), "Россия"
                        , "Брянск"));
                arr.add(new UserModel(R.drawable.img25, "Устин", "Скляренко", new Date(1959, 7, 27),
                        "Россия", "Воронеж"));
                arr.add(new UserModel(R.drawable.img26, "Конрад", "Спивак", new Date(1960, 8, 28),
                        "Беларусь", "Минск"));
                arr.add(new UserModel(R.drawable.img27, "Павел", "Выговский", new Date(1961, 9, 1),
                        "Беларусь", "Гомель"));
                arr.add(new UserModel(R.drawable.img28, "Казбек", "Кулагин", new Date(1962, 10, 2),
                        "Беларусь", "Брест"));
                arr.add(new UserModel(R.drawable.img29, "Лаврентий", "Авдеев", new Date(1963, 11, 3),
                        "Беларусь", "Бобруйск"));
                arr.add(new UserModel(R.drawable.img30, "Ждан", "Кононов", new Date(1964, 12, 4),
                        "Беларусь", "Могилёв"));
                arr.add(new UserModel(R.drawable.img01, "Назар", "Галкин", new Date(1965, 1, 5),
                        "Украина", "Киев"));
                arr.add(new UserModel(R.drawable.img02, "Владислав", "Селезнёв", new Date(1966, 2, 6),
                        "Украина", "Донецк"));
                arr.add(new UserModel(R.drawable.img03, "Юлий", "Захаров", new Date(1967, 3, 7),
                        "Украина", "Харьков"));
                arr.add(new UserModel(R.drawable.img04, "Евстахий", "Зварыч", new Date(1968, 4, 8),
                        "Украина", "Одесса"));
                arr.add(new UserModel(R.drawable.img05, "Лоренс", "Червоний", new Date(1969, 5, 9),
                        "Украина", "Днепр"));
                arr.add(new UserModel(R.drawable.img06, "Леон", "Сирко", new Date(1970, 6, 10), "Россия",
                        "Москва"));
                arr.add(new UserModel(R.drawable.img07, "Осип", "Михеев", new Date(1971, 7, 11), "Россия"
                        , "Тамбов"));
                arr.add(new UserModel(R.drawable.img08, "Остин", "Соловьёв", new Date(1972, 8, 12),
                        "Россия", "Тюмень"));
                arr.add(new UserModel(R.drawable.img09, "Евдоким", "Бобылёв", new Date(1973, 9, 13),
                        "Россия", "Брянск"));
               arr.add( new UserModel(R.drawable.img10, "Егор", "Абрамов", new Date(1974, 10, 14),
                        "Россия", "Воронеж"));
               arr.add( new UserModel(R.drawable.img11, "Жигер", "Толочко", new Date(1975, 11, 15),
                        "Беларусь", "Минск"));
                arr.add(new UserModel(R.drawable.img12, "Зуфар", "Кузнецов", new Date(1976, 12, 16),
                        "Беларусь", "Гомель"));
                arr.add(new UserModel(R.drawable.img13, "Борис", "Посидайло", new Date(1977, 1, 17),
                        "Беларусь", "Брест"));
                arr.add(new UserModel(R.drawable.img14, "Закир", "Быков", new Date(1978, 2, 18),
                        "Беларусь", "Бобруйск"));
                arr.add(new UserModel(R.drawable.img15, "Эдуард", "Полищук", new Date(1979, 3, 19),
                        "Беларусь", "Могилёв"));
                arr.add(new UserModel(R.drawable.img16, "Жигер", "Ермаков", new Date(1980, 4, 20),
                        "Украина", "Киев"));
                arr.add(new UserModel(R.drawable.img17, "Евгений", "Воронцов", new Date(1981, 5, 21),
                        "Украина", "Донецк"));
                arr.add(new UserModel(R.drawable.img18, "Феликс", "Яворивский", new Date(1982, 6, 22),
                        "Украина", "Харьков"));
                arr.add(new UserModel(R.drawable.img19, "Георгий", "Галкин", new Date(1983, 7, 23),
                        "Украина", "Одесса"));
                arr.add(new UserModel(R.drawable.img20, "Болеслав", "Шестаков", new Date(1984, 8, 24),
                        "Украина", "Днепр"));
                arr.add(new UserModel(R.drawable.img21, "Платон", "Власов", new Date(1985, 9, 25),
                        "Россия", "Москва"));
                arr.add(new UserModel(R.drawable.img22, "Леопольд", "Петров", new Date(1986, 10, 26),
                        "Россия", "Тамбов"));
                arr.add(new UserModel(R.drawable.img23, "Эдуард", "Абрамов", new Date(1987, 11, 27),
                        "Россия", "Тюмень"));
                arr.add(new UserModel(R.drawable.img24, "Гордей", "Хитрук", new Date(1988, 12, 28),
                        "Россия", "Брянск"));
                arr.add(new UserModel(R.drawable.img25, "Роберт", "Гребневский", new Date(1989, 1, 1),
                        "Россия", "Воронеж"));
                arr.add(new UserModel(R.drawable.img26, "Ждан", "Беляев", new Date(1990, 2, 2),
                        "Беларусь", "Минск"));
                arr.add(new UserModel(R.drawable.img27, "Родион", "Беспалов", new Date(1991, 3, 3),
                        "Беларусь", "Гомель"));
                arr.add(new UserModel(R.drawable.img28, "Цицерон", "Скляренко", new Date(1992, 4, 4),
                        "Беларусь", "Брест"));
                arr.add(new UserModel(R.drawable.img29, "Карл", "Абрамов", new Date(1993, 5, 5),
                        "Беларусь", "Бобруйск"));
                arr.add(new UserModel(R.drawable.img30, "Богдан", "Голубев", new Date(1994, 6, 6),
                        "Беларусь", "Могилёв"));
                arr.add(new UserModel(R.drawable.img01, "Геннадий", "Белоусов", new Date(1995, 7, 7),
                        "Украина", "Киев"));
                arr.add(new UserModel(R.drawable.img02, "Святослав", "Макаров", new Date(1996, 8, 8),
                        "Украина", "Донецк"));
                arr.add(new UserModel(R.drawable.img03, "Устин", "Коваленко", new Date(1997, 9, 9),
                        "Украина", "Харьков"));
                arr.add(new UserModel(R.drawable.img04, "Станислав", "Дьячков", new Date(1998, 10, 10),
                        "Украина", "Одесса"));
                arr.add(new UserModel(R.drawable.img05, "Йозеф", "Исаков", new Date(1999, 11, 11),
                        "Украина", "Днепр"));
                arr.add(new UserModel(R.drawable.img06, "Цезарь", "Кузьмин", new Date(2000, 12, 12),
                        "Россия", "Москва"));
                arr.add(new UserModel(R.drawable.img07, "Пётр", "Архипов", new Date(2001, 1, 13),
                        "Россия", "Тамбов"));
                arr.add(new UserModel(R.drawable.img08, "Ждан", "Петренко", new Date(2002, 2, 14),
                        "Россия", "Тюмень"));
                arr.add(new UserModel(R.drawable.img09, "Павел", "Дроздов", new Date(2003, 3, 15),
                        "Россия", "Брянск"));
    }

    public static List<UserModel> users(){
        Random rnd=new Random(System.currentTimeMillis());
        List<UserModel> list=new ArrayList<>();
//        for (int i = 0; i < arr.size(); i++) {
        for (int i = 0; i < 5; i++) {
            list.add(arr.get(i));
        }
        return list;
    }
    public static void addUser(String fname, String lname, String country, String city){
        Random rnd=new Random(System.currentTimeMillis());
        arr.add(
            new UserModel(
                R.drawable.img01
                ,fname
                , lname
                , new Date(rnd.nextInt(65)+1950, rnd.nextInt(12)+1, rnd.nextInt(28)+1)
                ,country
                , city)
        );
    }
}
