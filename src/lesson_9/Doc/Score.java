package lesson_9.Doc;
import java.util.Date;

public class Score extends AbstractDoc {
    private double totalAmount;
    private String departmentCode;

    public Score (double totalAmount, String departmentCode, Date dateDoc, String numDoc) {
        super(numDoc, dateDoc);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }
    public String getDocumentNumber() {
        return "INV" + numDoc;
    }

    @Override
    public String getInfo() {
        System.out.println("Накладная:" +
                " Номер документа - " + numDoc +
                ", Дата документа - " + dateDoc +
                ", Итоговая сумма за месяц - " + totalAmount +
                ", Код департамента - " + departmentCode);
        return "";
    }
}
