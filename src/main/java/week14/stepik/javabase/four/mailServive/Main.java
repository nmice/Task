package week14.stepik.javabase.four.mailServive;

public class Main {

    public static void main(String[] args) {

    }


    public static class UntrustworthyMailWorker implements MailService {
        public UntrustworthyMailWorker(MailService[] mailservices) {
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
