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
            if (mailServices == null) {
                bandits = null;
            } else {
                bandits = new MailService[mailServices.length];
                System.arraycopy(mailServices, 0, bandits, 0, mailServices.length);
            }
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

        public Spy (Logger logger) {
            LOGGER = logger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage){
                if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)){
                    LOGGER.warning("Detected target mail correspondence: from " + mail.getFrom() + " to " + mail.getTo() + "\"" +
                            ((MailMessage) mail).getMessage()+"\"");
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

        public Thief(int greedLevel){
            minimumPriceForStealing = greedLevel;
        }

        public int getStolenValue (){
            return stolenValue;
        }


        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage){
                MailPackage mailInProceed = (MailPackage) mail;
                int price = mailInProceed.getContent().getPrice();
                String content = mailInProceed.getContent().getContent();
            }
            return mail;
        }
    }

    public static class Inspector implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            return null;
        }
    }


}
