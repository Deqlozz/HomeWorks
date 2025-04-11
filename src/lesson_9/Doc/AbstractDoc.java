package lesson_9.Doc;


import java.util.Date;

public abstract class AbstractDoc implements Documents {
        protected static String numDoc;
        protected Date dateDoc;
        public AbstractDoc (String numDoc, Date dateDoc) {
            this.numDoc = numDoc;
            this.dateDoc = dateDoc;
        }

        public abstract String getInfo();
    }

