package lesson_9.Doc;

import lesson_9.Doc.Documents;

import javax.swing.text.Document;

public class Register {
    private int count;
    Documents[] documents = new Documents[10];

    public void saveDocument(Documents document) {
        if (count < 10) {
            documents[count] = document;
            count++;
        } else {
            System.out.println("Невозможно добавить новый документ. Регистр переполнен.");
        }
    }

    public void getInfoDocuments(Documents document) {
        System.out.println(document.getInfo());
    }
}