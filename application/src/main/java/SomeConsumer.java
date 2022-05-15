import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

public class SomeConsumer {
    public static void main(String[] args) {
        AwsConnectionsManager manager = new AwsConnectionsManager();
        System.out.println("Access key is: " + manager.getCreds().getCredentials().getAWSAccessKeyId());

        //using a different version of aws core
        //(lib was compiled with a different version of aws core sdk)
        AWSCredentialsProvider someCredsprovider = new AWSCredentialsProvider() {
            @Override
            public AWSCredentials getCredentials() {
                return null;
            }

            @Override
            public void refresh() {

            }
        };
        System.out.println("Creds provider from the core: " + someCredsprovider.getCredentials());


        //if you pass "core" -> this wont call any code that accesses not provided sdk
        //but if you pass "cloudfront" -> this will result in the java.lang.NoClassDefFoundError: com/amazonaws/services/cloudfront/AmazonCloudFrontClientBuilder error
        manager.testUnusedDependencies("core");
    }
}
