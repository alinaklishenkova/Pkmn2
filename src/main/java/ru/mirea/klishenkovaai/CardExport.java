package ru.mirea.klishenkovaai;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CardExport {
    public void saveCard(Card card) {
        String fileName = card.getName() + ".crd"; // Имя файла - имя покемона
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(card);
            System.out.println("Карта сохранена: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении карты: " + e.getMessage());
        }
    }
}
