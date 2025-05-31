import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest.BodyPublishers;

public class TestPost {
    public static void main(String[] args) throws Exception {
        String json = """
            {
                "title": "Event 1",
                "description": "Descriere",
                "location": "Timisoara",
                "organizer": "Banat IT",
                "dateTime": "2025-06-01T10:00:00"
            }
        """;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/api/events"))
                .header("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(json))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}
