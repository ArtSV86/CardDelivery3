package ru.netology;

import java.time.format.DateTimeFormatter;

public class LocalDate {
    static String dataInput(int days) {
        String inputDate = java.time.LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        return inputDate;
    }
}
