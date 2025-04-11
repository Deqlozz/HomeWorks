package lesson_9.Doc;

import java.util.Date;

public class Contract extends AbstractDoc {
    private String goodsType;
    private int goodsQuantity;

    public Contract(String goodsType, int goodsQuantity, Date dateDoc, String numDoc) {
        super(numDoc, dateDoc);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }

    public static String getDocumentNumber() {
        return "GC" + numDoc;
    }

    @Override
    public String getInfo() {
        System.out.println("Контракт на поставку товаров:" +
                " Номер документа - " + numDoc +
                ", Дата документа - " + dateDoc +
                ", Тип товара - " + goodsType +
                ", Количество товаров - " + goodsQuantity);
        return "";
    }
}

