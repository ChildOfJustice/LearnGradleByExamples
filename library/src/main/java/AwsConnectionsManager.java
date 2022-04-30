import com.amazonaws.auth.AWSCredentialsProvider;

public class AwsConnectionsManager {
    public AWSCredentialsProvider getCreds(){
        return new MyOwnCredentialsProvider();
    }
}
