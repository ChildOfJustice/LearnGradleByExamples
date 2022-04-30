public class SomeConsumer {
    public static void main(String[] args) {
        AwsConnectionsManager manager = new AwsConnectionsManager();
        System.out.println("Access key is: " + manager.getCreds().getCredentials().getAWSAccessKeyId());
    }
}
