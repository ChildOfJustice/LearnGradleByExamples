import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.cloudfront.AmazonCloudFront;
import com.amazonaws.services.cloudfront.AmazonCloudFrontClient;
import com.amazonaws.services.cloudfront.AmazonCloudFrontClientBuilder;

public class AwsConnectionsManager {
    public AWSCredentialsProvider getCreds(){
        return new MyOwnCredentialsProvider();
    }

    public void testUnusedDependencies(String serviceType){
        if(serviceType.equals("core")){
            BasicAWSCredentials testCreds = new BasicAWSCredentials("","");
        } else if(serviceType.equals("cloudfront")){
            AmazonCloudFront client = AmazonCloudFrontClientBuilder.defaultClient();
        }
    }
}
