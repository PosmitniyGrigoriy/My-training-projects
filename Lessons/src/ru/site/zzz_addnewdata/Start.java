// Урок от Project of unknown source

package ru.site.addnewdata;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Start {
 
    public static void main(String[] args) {
        
    	// Ниже код дозаписывает файл, а не перезаписывает.
    	
                    try {
                        // Записываем значение этой переменной в файл .дат с
                        // пометкой КИРИЛЛИЦА "Ср1251" + знак "|"
                        File f = new File("c:\\Java\\test.txt");
                        RandomAccessFile out = new RandomAccessFile(f, "rw"); // Читает, потом записывает
                        out.seek(f.length()); // переходит на конец файла.
                        out.write(("Арбуз\n").getBytes("Cp1251")); // этот метод конвертирует строку из UTF-16 (которая в яве) в кодировку Ср1251 и потом делает из неё массив байт
                        out.write(("Новый\n").getBytes("Cp1251"));
                        out.close();
                    }
                    // Ловим исключение
                    catch (IOException e) {
                    }
            

            }
        
    }