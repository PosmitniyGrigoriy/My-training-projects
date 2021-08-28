package ru.site.start.dictionary;

import java.util.*;

public class Dictionary {

    public static void main(String[] args) {

        /**
         * Чтобы программа работала правильно нужно сделать 4 шага. Они отмечены ниже.
         *
         * Шаг 1. Подготовка текстовых строк. На 1 строке не о дно слово, а предложения могут быть.
         * Важно: удалить через фильтр символы " и \, иначе будут ошибки компиляции.
         *
         * Шаг 2: вставить строки с текстом в класс DictionaryText
         *
         * Шаг 3: добавить строки в коллекцию во внутрь метода в классе DictionaryCollection
         *
         * Шаг 4: правильно указать размер массива, где строка int arraySize = *;.
         * Размер массива = размер добавленных записей в коллекцию (не больше и не меньше).
         * Если будет больше, то будет иксепшин на строке String[] arrayWords = text.split(" ");
         * Если будет меньше, то не все строки поместятся (не все слова будут проанализированы).
         *
         * Важно: количество строк можно добавлять 6000. И будет работать.
         * Пробовал добавить 7200 и уже была ошибка, что слишком много строк.
         * Так как 6000 строк можно за 1 раз обрабатывать, то поставил это значение на строку int arraySize = 6000;
         * и в коллекцию также добавил от 1 по 6000 запись. Останется только строки обновлять,
         * после программу можно запускать. Строк делать 6000.
         */




        // Собрать в ТХТ новые строки с документации, затем их обработать в екселе,
        // и потом добавить суда в класс DictionaryText и запустить анализ




//        1. Копировать полностью класс в ТХТ
//        2. Затем удалять пустые строки в ТХТ
//        3. Заменить символы / * # ^ на !
//        4. Найти символ " и удалить.
//        5. Переносить все строки из ТХТ в ексель
//        6. В екселе через фильтр найти все строки, где есть символ ! и выделить фон ячеек зеленым
//        7. Остальные строки в екселе - это код. Его удалить.
//        8. Строки далее разделить по 6000 строк и переносить в программу и обрабатывать.





        List<String> listTextsWithDuplicates = DictionaryCollection.addInCollectionTexts();
        int arraySize = 6000;
        String[] arrayTextsToLowerCase = new String[arraySize];
        for(int i = 0; i < listTextsWithDuplicates.size(); i++) {
            arrayTextsToLowerCase[i] = listTextsWithDuplicates.get(i).toLowerCase();
        }
        List<String> listOfWordsWithDuplicates = new ArrayList<>();
        for(int i = 0; i < arrayTextsToLowerCase.length; i++) {
            String text = arrayTextsToLowerCase[i];
            String[] arrayWords = text.split(" ");
            for(String word : arrayWords) {
                if(!word.isEmpty() && !word.equals("!")) {
                    listOfWordsWithDuplicates.add(word
                                                      .replace("0", "")
                                                      .replace("1", "")
                                                      .replace("2", "")
                                                      .replace("3", "")
                                                      .replace("4", "")
                                                      .replace("5", "")
                                                      .replace("6", "")
                                                      .replace("7", "")
                                                      .replace("8", "")
                                                      .replace("9", "")
                                                      .replace("(", "")
                                                      .replace(")", "")
                                                      .replace("<", "")
                                                      .replace(">", "")
                                                      .replace("{", "")
                                                      .replace("}", "")
                                                      .replace("[", "")
                                                      .replace("]", "")
                                                      .replace(".", "")
                                                      .replace("@", "")
                                                      .replace("=", "")
                                                      .replace(":", "")
                                                      .replace(",", "")
                                                      .replace("_", "")
                                                      .replace("|", "")
                                                      .replace("&", "")
                                                      .replace("%", "")
                                                      .replace("-", "")
                                                      .replace("+", "")
                                                      .replace("#", "")
                                                      .replace(";", "")
                                                      .replace("?", "")
                                                      .replace("^", "")
                                                      .replace("'", "")
                                                      .replace("!", "")
                                                      .replace("~", "")
                                                      .replace("$", "")
                                                      );
                }
            }
            arrayWords = null;
        }
        Collections.sort(listOfWordsWithDuplicates);
        Map<String, Integer> mapWords = new HashMap<>();
        for(int i = 0; i < listOfWordsWithDuplicates.size(); i++) {
            if(!mapWords.containsKey(listOfWordsWithDuplicates.get(i))) {
                mapWords.put(listOfWordsWithDuplicates.get(i), 1);
            } else {
                for (Map.Entry<String, Integer> entity : mapWords.entrySet()) {
                    if (entity.getKey().equals(listOfWordsWithDuplicates.get(i))) {
                        Integer value = entity.getValue();
                        entity.setValue(value += 1);
                    }
                }
            }
        }
        mapWords.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

}
