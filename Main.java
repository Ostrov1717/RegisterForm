import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String targetURL="https://services.explorecalifornia.org/rest/tours.php";
        String urlParameters="packageid=5";
        URL url = new URL(targetURL);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Length",""+Integer.toString(urlParameters.getBytes().length));
        connection.setRequestProperty("Content-Language","en-US");
        DataOutputStream wr=new DataOutputStream(connection.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();
    }
}
