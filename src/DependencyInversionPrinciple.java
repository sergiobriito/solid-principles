public class DependencyInversionPrinciple {
    // Abstraction for Notification
    interface Notification {
        void sendNotification(String message);
    }

    // Concrete implementation: Email Notification
    class EmailNotification implements Notification {
        @Override
        public void sendNotification(String message) {
            System.out.println("Sending email notification: " + message);
        }
    }

    // Concrete implementation: SMS Notification
    class SMSNotification implements Notification {
        @Override
        public void sendNotification(String message) {
            System.out.println("Sending SMS notification: " + message);
        }
    }

    class NotificationService {
        private final Notification notification;

        public NotificationService(Notification notification) {
            this.notification = notification;
        }

        public void sendNotification(String message) {
            notification.sendNotification(message);
        }
    }

    public void Test() {
        // Using Dependency Injection to provide the required notification implementation
        Notification emailNotification = new EmailNotification();
        NotificationService emailService = new NotificationService(emailNotification);
        emailService.sendNotification("Hello via email");

        Notification smsNotification = new SMSNotification();
        NotificationService smsService = new NotificationService(smsNotification);
        smsService.sendNotification("Hello via SMS");
    }

}
