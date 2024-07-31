public class test {
    public static void main(String[] args) {
        // Create an EmailNotifier instance
        Notifier emailNotifier = new EmailNotifier();
        
        // Decorate with SMSNotifier
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        
        // Decorate further with SlackNotifier
        Notifier slackSMSNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        // Send notifications through decorated notifiers
        slackSMSNotifier.send("Hello, world!");
    }
}
