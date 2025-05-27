import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import com.google.gson.Gson;

public class Http {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com/users/octocat"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());

            
            Gson gson = new Gson();
            Map<?, ?> jsonMap = gson.fromJson(response.body(), Map.class);

            System.out.println("Parsed JSON:");
            System.out.println("Login: " + jsonMap.get("login"));
            System.out.println("Public Repos: " + jsonMap.get("public_repos"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
