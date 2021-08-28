package ru.site.start.lesson29;

import java.text.*;
import java.text.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class Start {
    public static void main(String[] args) throws ParseException {

        // 1 часть: заметки для работы с классом Date
        /**
         * Можно написать строку: Date date = new Date();
         * Далее вызывать метод setTime и указать значение самое длинное и в конце дописать L: 1589286650000L
         * Потом можно вывести в сауте date. и будет Tue May 12 22:30:50 VLAT 2020
         * Также есть метод date.getTime() . Он выводит значение в милисекундах (длинное число) какой-то даты.
         * Также можно лонговое значение указывать в параметры new Date() и сразу выводить в саут или сохрарять
         * в переменную типа Date.
         *
         * Пример кода ниже:
         */
//        Date date = new Date(1589286650000L); // v1: выведется в сауте по переменной date Tue May 12 22:30:50 VLAT 2020
//        Date date = new Date(); // v2
//        date.setTime(1589286650000L); // v2
//        System.out.println(date); // v2 Tue May 12 22:30:50 VLAT 2020
//        System.out.println(date.getTime()); // 1589286650000
        /**
         * Date date = new Date();
         * Если в параметры написать год, месяц, день или часы еще, то часы правильно выведет, а год, месяц и день
         * не правильно. Не понятно почему.
         *
         */
        // Для параметров ниже - год указывается не 2020, а 120, так как вычетаем 1900, а месяц начинает индекс с 0, а не 1. Может и для других значений тоже особенности есть
//        Date date2 = new Date(120, 5, 12); // Вывод: Fri Jun 12 00:00:00 VLAT 2020 // Год, месяц, день.
//        System.out.println(date2);
//        Date date2 = new Date(120, 5, 12, 15, 30, 50); // Вывод: Fri Jun 12 15:30:50 VLAT 2020 // Год, месяц, день, часы, минуты, секунды
//        System.out.println(date2);
        // В году добавляется сразу 1900, поэтому нужно не 2021 писать или 2021, а 120, чтобы 120 + 1900 = 2020 год.

//        Date date3 = new Date();
//        System.out.println(date3); // Thu Aug 26 23:26:19 VLAT 2021
//        date3.setYear(110);
//        System.out.println(date3); // Thu Aug 26 23:26:19 VLAST 2010
//        System.out.println(date3.getYear() + 1900);

        // В примере выше (в коде). Там можно вызывать разные сеттеры. и сетить год, месяц, день, часы, минуты, секунды
        // Также есть геттеры.
        // Важно: это устарелые методы, и их лучше не использовать.
        // Но если они будут использоваться, то для сета года нужно писать число с вычетом 1900. Для 2010 году указать 110,
        // Так как 2020-1900=110 - это и писать. А для гет года - там нужно добавить + 1900, чтобы получить 2010.

        // Есть метод before (до) и after (после). Это булиэн. Первая дата до второй даты или первая дата после второй даты?
        // Также есть метод equals и compareTo (сравнивают два объекта)

//        Date date5 = new Date(120, 5, 12);  // Вывод: Fri Jun 12 00:00:00 VLAT 2020 // Год, месяц, день.
//        Date date6 = new Date(120, 5, 12, 15, 30, 50); // Вывод: Fri Jun 12 15:30:50 VLAT 2020 // Год, месяц, день.
//        System.out.println(date5.after(date6)); // false
//        System.out.println(date5.before(date6)); // true

//        System.out.println(date5.compareTo(date6)); // -1 // Первая дата меньше второй, поэтому -1
//        System.out.println(date5.equals(date6)); // false // Первая дата и вторая разная по заполенным аргументам, поэтому false. Если был бы одинаковый формат, например, и там, и там был бы одинаковый год, месяц, день и больше ничего, то было бы true





        // 2 часть: заметки для работы с классом SimpleDateFormat
        // В этом классе и в других могут писать форматы времени. типа "yyyy-MM-dd'T'HH:mm:ss.SSSZ". Проще открыть класс и посмотреть формат и подобрать для себя нужный формат.

        // Этот класс можно использовать для форматирования даты. Чтобы дату вывести в том варианте, котором нужно.
//        SimpleDateFormat s = new SimpleDateFormat();
        // Пример кода, который форматирует дату указан в самом низу класса (Start).
        // Также у класса SimpleDateFormat есть разные методы для работы с датами, но пока не известно, как с ними работать. Лучше использовать старые варианты (примеры кода указаны в конце этого файла Start) или делать по уроку, используя LocalDate, LocalTime, LocalDateTime.

        // В конце файла есть пример кода. Там используется SimpleDateFormat. Сначала указывается формат в параметрах, затем вызываетс метод формат и в него ложится дата (Date) и это все сохраняется в строку. Затем создается снова объект SimpleDateFormat и уже используется метод парсер и указывается строка сохраненная и на выходе Date.





        // Часть 1: Date
//        Date date = new Date();
//        System.out.println(date); // Вывод: Sat Aug 28 15:40:02 VLAT 2021

        // Часть 2: Calendar
//        Calendar calendar = Calendar.getInstance(); // нельзя написать new Calendar(), так как кэнстрактэ приватный. Можно лиш вызывать экземпляр, как показано в примере.
//        calendar.setTime(date);
//        System.out.println(calendar); // Выводится много всяких данных, кроме стандартного вывода. Еще зона, эра и так далее.
//        System.out.println(calendar.getTime()); // Чтобы вывелась дата без дополнительных значений, дописать метод getTime()
//        calendar.add(Calendar.WEEK_OF_MONTH, 1); // Добавили 1 неделю к текущей дате. Здесь есть и другие опции на выбор, кроме недельного добавления даты
//        System.out.println(calendar.getTime()); //  Вывод: Sat Sep 04 15:40:02 VLAT 2021

        // Часть 3: DateFormat
//        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT); // Здесь также нельзя создать экземпляр через new. Можно лишь вызывать. Также во внутрь параметров можно положить сразу тип формата даты.
//        System.out.println(dateFormat.format(calendar.getTime())); // Вывод: 04.09.2021


        // Часть 4: SimpleDateFormat
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Указать формат даты. Можно еще время добавить HH:mm:ss
//        System.out.println(simpleDateFormat.format(calendar.getTime())); // 04/09/2021
//        Date newDate = simpleDateFormat.parse("05/12/1985");
//        System.out.println(newDate); // Thu Dec 05 00:00:00 VLAT 1985
        // Для части 4: создали на одной строке формат. Затем вызывали метод формат и положили в параметры готовую дату (Date). И вывелась дата в нужном формате.
        // Классы SimpleDateFormat и DateFormat нужны для форматирования даты





        // 3 часть: заметки для работы с классом Calendar
        /**
         * Класс календарь - это абстрактный класс, поэтому нельзя создать объект календаря, но вызывать экземпляр, как в примере ниже
         *
         * У класса календарь один наследник - GregorianCalendar. Можно создать объект по этому классу.
         *
         * Календарь - это свод правил, чтобы вычислить день, месяц, год или другое что-то по какому-то критерию.
         */
//        Calendar calendar = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();
        /** Два основных метода - set и get.
         * set() - первым аргументом передается параметр, который нужно установить, а вторым аргументом меняем этот параметр. Пример ниже.
         */

//        calendar.set(11, 1); // v1 Устанавливаем часы. Делаем час = 1 часу. Если сейчас 17 часов, то будет 1 час.
//        calendar.set(Calendar.HOUR_OF_DAY, 1); // v2
        // v1 и v2 устанавливают час. Делают равным час 1. Можно первый аргумент как числом указывать, так и через константу (инам). Результат одинаковый будет
//        System.out.println(calendar.getTime());
        // также у календаря есть специализированный метод set. Там можно устанавливать год месяц, дату, час, минуты, секунды. Можно еще без секунд указывать. Или просто дату указать (год, месяц, день)
//        calendar.set(2020, 0,05); // Месяца - от 0 по 11. Также может есть особенности по другим параметрам
//        calendar.set(2020, 0,05, 10,30,44);
//        System.out.println(calendar.getTime());
//        calendar.setTime(ЗДЕСЬ УКАЗАТЬ ПЕРЕМЕННУЮ КОТОРАЯ ТИПА Date); // Такой вариант тоже можно использовать
        // Ниже геттеры
//        System.out.println(calendar.getTime()); // Sat Aug 28 17:44:24 VLAT 2021
//        System.out.println(calendar.getCalendarType()); // gregory
//        System.out.println(calendar.getTimeZone()); // sun.util.calendar.ZoneInfo[id="Asia/Vladivostok",offset=36000000,dstSavings=0,useDaylight=false,transitions=67,lastRule=null]
//        System.out.println(calendar.get(Calendar.YEAR)); // 2021
//        System.out.println(calendar.get(Calendar.MONTH)); // 7
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 28
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // 240

        // Метод add. Первый параметр - туда вставляем параметр, который нужно поменять. Второй параметр - на сколько меняем. Например, указываем месяц и добавляем 1 к текущей дате. и выводим результат.
//        calendar.add(Calendar.MONTH, 1); // Первый параметр можно другой поставить. Есть на выбор разные.
//        System.out.println(calendar.getTime()); // Thu Oct 28 17:47:49 VLAT 2021 - добавился 1 месяц
//        calendar.add(Calendar.MONTH, -1); // Также можно отнимать
//        System.out.println(calendar.getTime()); // Sat Aug 28 17:49:42 VLAT 2021
//        calendar.clear(); // Очистка даты календаря. Ставит значение Thu Jan 01 00:00:00 VLAT 1970
//        System.out.println(calendar.getTime()); // Thu Jan 01 00:00:00 VLAT 1970

        // Выводит список зарегистрированных в джаве тайм зон для установки ее в календарь. Как устанавливать будет показано ниже, но не сразу прям снизу.
//        String[] arrayTimeZones = TimeZone.getAvailableIDs();
//        for(String result : arrayTimeZones) {
//            System.out.println(result);
//        }

        // Выводит список зарегистрированных локалей в джаве для установки ее в календарь.
//        Locale[] locales = Locale.getAvailableLocales();
//        for(Locale result : locales) {
//            // Обязательно вывод делать так: сначала по языку, затем по стране, затем варианты
//            // Это весь список
////            System.out.println(result.getDisplayLanguage() + "] - [" + result.getDisplayCountry() + "] - [" +
////                    result.getDisplayVariant());
//
//            // А по условию будет так. Если нужно варианты, только, где русские языки
//            if(result.getDisplayLanguage().equals("русский")) {
//                System.out.println(result.getDisplayLanguage() + "] - [" + result.getDisplayCountry() + "] - [" +
//                    result.getDisplayVariant());
//            }
//        }

        // Ниже будет строка, как установить тайм зону и локалиазацию
//        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"), new Locale("en"));
        // Тайм зона нужна, чтобы время правильно вывести. И чтобы, если меняется время На +1 или -1 час в году 1 раз, то , чтобы это делалось правильно.
        // Локаль нужна, чтобы правильно выставить первый день недели. Что это понедельник рабочий день - первый день. Вроде так про тайм зону и локаль.


        // Date и Calendar - два старых класса для работы с датами. Новые (удобные) - LocalDate, localTime, LocalDateTime.

        /** По этой ссылке можно посмотреть таблицу, в которой показано какие классы есть для работы с датами и временем.
         * Показано какие классы работают только с датой, а другие с временем, другой только с годом, а еще другой только с месяцем,
         * а какие классы могут работать с тайм зоной.
         *
         * https://docs.oracle.com/javase/tutorial/datetime/iso/overview.html
         *
         * А это общая ссылка. Там можно другие страницы из документации еще почитать.
         *
         * Например, на этой странице написано какие методы есть и что они делают:
         * https://docs.oracle.com/javase/tutorial/datetime/overview/naming.html
         */

        // Метод of - создает дату
        // Метод from - берет откуда-то дату и немного меняет ее формат. Например, с полной (год, месяц, день, часы, минуты, секунды) и делает год, месяц, день.
        // Метод parse - берет строку и конвертирует ее в дату в формат LocalDate или LocalTime или LocalDateTime.
        // Метод format - указывается формат и форматируется дата
        // Методы гет (их много). Вывести день месяца, день недели, час, милисекунды, минуты, месяц и так далее.
        // Методы is... - для сравнения.
        // Методы with - вернуть копию объекта с какими-то изменениями.
        // Методы plus и minus - прибавить и отнять от даты или времени что-то.

        /**
         * Важно: объекты, созданные новыми классами LocalDate, localTime, LocalDateTime. считаются не изменяемыми.
         * Если указана первая дата и от нее отнимается 1 месяц, то создается второй объект и потом выводится вторйо объект, а не первый.
         * Первый объект останется не измененным.
         */

        /**
         * sql.Date сохраняет дату в секундах или милисекундах, а не в дате.
         * Если в базе данных сохраняется в дате, а используется localdate, то это уже другой тип данных
         * и нужно преобразовать один тип в другой. В обе стороны можно конвертацию делать. Пример кода ниже.
         * Но чтобы не было компиляционных ошибок, класс нужно вставить за мэин.
         */
//        public static class DateUtils {
//
//            public static Date asDate(LocalDate localDate) {
//                return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
//            }
//
//            public static Date asDate(LocalDateTime localDateTime) {
//                return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
//            }
//
//            public static LocalDate asLocalDate(Date date) {
//                return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
//            }
//
//            public static LocalDateTime asLocalDateTime(Date date) {
//                return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
//            }
//        }


        /**
         * В базе данных в основном хранят дату и время в этих трех вариантах, но могут быть и другие.
         * Date, Time, Timestamp.
         */

        // Параметры для создания формата даты (часы, минуты, секунды, эра, и так далее, можно посмотреть по этой
        // ссылке: https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar







        // 4 часть: заметки для работы с классами (это новые классы) LocalDate, LocalTime, LocalDateTime
        /**
         * В уроке будет информация просто по классам и методам. Без часовых поясов.
         *
         * 
         */

















//        public static List<Date> listDates(Date startDate, Date endDate) {
//            List<Date> dates = new ArrayList<>();
//            long interval = 24 * 1000 * 60 * 60;
//            long endTime = endDate.getTime();
//            long curTime = startDate.getTime();
//            while (curTime <= endTime) {
//                dates.add(new Date(curTime));
//                curTime += interval;
//            }
//            return dates;
//        }
//
//        public static Date getCurrentDateMinusDays(Long numberOfDays) {
//            Long makeOperationsForDealsBeforeDateMilliseconds = (new Date().getTime()) - (86400000L * numberOfDays);
//            Date makeOperationsForDealsBeforeDate = null;
//            try {
//                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                makeOperationsForDealsBeforeDate = formatter.parse(new SimpleDateFormat(
//                        "dd-MM-yyyy HH:mm:ss").format(new Date(makeOperationsForDealsBeforeDateMilliseconds)));
//            } catch (Exception ex) {
//                log.error("Ошибка при работе с датой: " + ex);
//            }
//            return makeOperationsForDealsBeforeDate;
//        }
//
//        public static Date convertDateAndTime(String dateAndTimeString) {
//            StringBuilder dateAndTimeStringBuilder = new StringBuilder(dateAndTimeString);
//            String day = dateAndTimeStringBuilder.substring(8,10);
//            String year = dateAndTimeStringBuilder.substring(0,4);
//            dateAndTimeStringBuilder
//                    .replace(0,4, day)
//                    .replace(6,8, year)
//                    .replace(10,11, " ");
//            Date dateAndTimeFromAdSlot = null;
//            try {
//                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                dateAndTimeFromAdSlot = formatter.parse(dateAndTimeStringBuilder.toString());
//            } catch (Exception ex) {
//                log.error("Ошибка при работе с датой: " + ex);
//            }
//            return dateAndTimeFromAdSlot;
//        }
//
//        public static Date getNewDate(int numberOfDays, Date date) {
//            Calendar instance = Calendar.getInstance();
//            instance.setTime(date);
//            instance.add(Calendar.DAY_OF_MONTH, numberOfDays);
//            Date newDate = instance.getTime();
//            return newDate;
//        }
//
//        public Date getStartOrEndDateAdSlot(int adSlotTimeStartOrEnd) {
//            String dateAdSlot = new SimpleDateFormat("dd-MM-yyyy").format(new Date(slotDate.getTime()));
//            String timeAdSlot = null;
//            if (adSlotTimeStartOrEnd == 0) {
//                timeAdSlot = new SimpleDateFormat("HH:mm:ss").format(new Date(slotTimeFrom.getTime()));
//            } else {
//                timeAdSlot = new SimpleDateFormat("HH:mm:ss").format(new Date(slotTimeTo.getTime()));
//            }
//            String dateAndTimeToAdSlot = dateAdSlot.concat(" ").concat(timeAdSlot);
//            Date dateAndTimeAdSlot = null;
//            try {
//                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                dateAndTimeAdSlot = formatter.parse(dateAndTimeToAdSlot);
//            } catch (Exception ex) {
//                log.error("Ошибка при работе с датой: " + ex);
//            }
//            return dateAndTimeAdSlot;
//        }

    }

}
