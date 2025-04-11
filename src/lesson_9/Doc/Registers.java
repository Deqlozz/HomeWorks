package lesson_9.Doc;

import javax.swing.text.Document;


public class Register {
    private int count;
    Document [] documents = new Document[10];

    public void saveDocument (Document document){
        if (count < 10) {
            documents[count] = document;
            count ++;
        } else {
            System.out.println("Невозможно добавить новый документ. Регистр переполнен.");
        }
    }
    public void getInfoDocuments (Documents document) {
        System.out.println(Documents.getInfo());
    }
}