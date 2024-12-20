package C07ExceptionFileParhing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0704HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
//        HttpClient클래스를 통해 외부 데이터 (api) 요청
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String posts = response.body();

        ObjectMapper objectMapper = new ObjectMapper();
        List<User> users = new ArrayList<>();
        JsonNode j1 = objectMapper.readTree(posts);
        for(JsonNode j : j1){
            User u1 = objectMapper.readValue(j.toString(), User.class);
            users.add(u1);
        }
        System.out.println(users);
//        for(User a : users){
//            System.out.println(a);
//        }



    }
}
class User{
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}