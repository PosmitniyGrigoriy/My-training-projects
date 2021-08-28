package ru.site.start.lesson29;

import java.text.*;
import java.text.*;
import java.time.LocalDateTime;
import java.util.*;

public class Start {
    public static void main(String[] args) {

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
        SimpleDateFormat s = new SimpleDateFormat();
// !!!!!!!!!!!!!! Посмотреть что значат эти методы. Если по описанию подойдут, то попробовать набрать код, если выведется нужное, то методы оставить и записать заметки
//s.parse();
//s.format();
//s.applyLocalizedPattern();
//s.applyPattern();
//s.formatToCharacterIterator();
//s.toPattern();
//s.parseObject();
//s.setCalendar();
//         Также почитать статьи на русском про SimpleDateFormat . Может будут какие-то методы полезные.
//
//
//
//
//
//
//
//
//
//
//
//
//Суда дописать 3 часть - класс Calendar и что там полезного для работы с датами можно использовать, затем ниже информацию с урока по курсу, а там уже LocalDate, LocalTime, LocalDateTime











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
