package lesson_9.Doc;
import lesson_9.Exception.ABCxception;
import lesson_9.Exception.Done1a2b;
import lesson_9.Exception.Start555;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        try

            {
                Contract contract = new Contract("ab1234", 5, new Date(), "12rdf3541");
                Emloyee employee = new Emloyee(new Date(), "Георгий", "32esd31", new Date());
                Score score = new Score(301, "34а", new Date(), "5551fds231");

                
                checkDocumentNumber(Contract.getDocumentNumber());
                checkDocumentNumber(employee.getDocumentNumber());
                checkDocumentNumber(score.getDocumentNumber());

                register.saveDocument(contract);
                register.saveDocument(employeeContract);
                register.saveDocument(score);

                for (int i = 0; i < register.documents.length; i++) {
                    if (register.documents[i] != null) {
                        register.getInfoDocuments((Documents) register.documents[i]);
                    }
                }
            } catch(ABCxception |Start555 |
            Done1a2b e)

            {
                System.out.println("Исключение: " + e.getMessage());
            }
        }

        public static void checkDocumentNumber (String numDoc) throws ABCxception, Start555, Done1a2b {
            if (numDoc.contains("abc")) {
                throw new ABCxception("Номер документа содержит последовательность 'abc'");
            }

            if (numDoc.startsWith("555")) {
                throw new Start555("Номер документа начинается с последовательности '555'");
            }

            if (numDoc.endsWith("1a2b")) {
                throw new Done1a2b("Номер документа оканчивается на последовательность '1a2b'");
            }
        }
    }

