package week14.stepik.javabase.four.mailServive;

import java.util.logging.Logger;

public class Main {

    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static void main(String[] args) {
        Sendable newMessage = new MailMessage("Greg", "Mike", "Hello");
        MailService[] persons = new MailService[]{new RealMailService(), new RealMailService()};
        MailService uMW = new UntrustworthyMailWorker(persons);
    }


    public static class UntrustworthyMailWorker implements MailService {
        private final MailService realMailService = new RealMailService();
        private MailService[] bandits;

        public UntrustworthyMailWorker(MailService[] mailServices) {
            bandits = mailServices;
        }

        public MailService getRealMailService() {
            return realMailService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            for (MailService bandit : bandits) {
                bandit.processMail(mail);
            }
            return realMailService.processMail(mail);
        }
    }


    public static class Spy implements MailService {
        private Logger LOGGER;

        public Spy(Logger logger) {
            LOGGER = logger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage) {
                if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)) {
                    LOGGER.warning("Detected target mail correspondence: from " + mail.getFrom() + " to " + mail.getTo() + " \"" + ((MailMessage) mail).getMessage() + "\"");
                } else {
                    LOGGER.info("Usual correspondence: from " + mail.getFrom() + " to " + mail.getTo());
                }
            }
            return mail;
        }
    }

    public static class Thief implements MailService {
        private int minimumPriceForStealing;
        private int stolenValue;

        public Thief(int greedLevel) {
            minimumPriceForStealing = greedLevel;
        }

        public int getStolenValue() {
            return stolenValue;
        }


        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                MailPackage mailInProceed = (MailPackage) mail;
                int price = mailInProceed.getContent().getPrice();
                if (price >= minimumPriceForStealing) {
                    String from = mailInProceed.getFrom();
                    String to = mailInProceed.getTo();
                    String content = mailInProceed.getContent().getContent();
                    Package changedPackage = new Package("stones instead of " + content, 0);
                    MailPackage changedMail = new MailPackage(from, to, changedPackage);
                    stolenValue += price;
                    return changedMail;
                }
            }
            return mail;
        }
    }


    public static class IllegalPackageException extends RuntimeException {
        /*public IllegalPackageException(String message) {
            super(message);
        }*/
    }

    public static class StolenPackageException extends RuntimeException {
        /*public StolenPackageException(String message) {
            super(message);
        }*/
    }

    public static class Inspector implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                MailPackage mailInProceed = (MailPackage) mail;
                int price = mailInProceed.getContent().getPrice();
                String from = mailInProceed.getFrom();
                String to = mailInProceed.getTo();
                String content = mailInProceed.getContent().getContent();
                if (content.equals(WEAPONS) || content.equals(BANNED_SUBSTANCE)) {
                    throw new IllegalPackageException(/*"This package has prohibited content!"*/);
                } else if (content.contains("stones")) {
                    throw new StolenPackageException(/*"This package may be from the Thief"*/);
                }
            }
            return mail;
        }
    }
}
