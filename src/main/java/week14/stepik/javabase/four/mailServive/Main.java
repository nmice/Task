package week14.stepik.javabase.four.mailServive;

public class Main {

    public static void main(String[] args) {
        Sendable newMessage = new MailMessage("Greg","Mike","Hello");
        MailService[] persons = new MailService[]{new RealMailService(), new RealMailService()};
        MailService uMW = new UntrustworthyMailWorker(persons);

    }


    public static class UntrustworthyMailWorker implements MailService {
        MailService[] bandits;

        public UntrustworthyMailWorker(MailService[] mailservices) {
            if (mailservices == null){
                bandits = null;
            }
            bandits = new MailService[mailservices.length];
            System.arraycopy(mailservices, 0, bandits, 0, mailservices.length);
        }

        @Override
        public Sendable processMail(Sendable mail) {

            return null;
        }
    }

    public static class Spy implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            return null;
        }
    }

    public static class Thief implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            return null;
        }
    }

    public static class Inspector implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            return null;
        }
    }


}
