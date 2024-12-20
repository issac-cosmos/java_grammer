package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class C0703JsonParsing {
    public static void main(String[] args) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        Path filePath = Paths.get("src/C07ExceptionFileParhing/json1.json");
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);

//        readTree : 트리구조의 JsonNode 객체로 변환
//        트리구조의 장점은 유연하게 데이터를 파싱한다는 것
//        JsonNode j1 = objectMapper.readTree(st1);
//        Map<String, String> m1 = new HashMap<>();
//        System.out.println(j1);
//        System.out.println(m1.put("id",j1.get("id").asText()));
//        System.out.println(m1.put("name",j1.get("name").asText()));
//        for(JsonNode j : j1){
//            System.out.println(j);
//        }

//        readvalue : 바로 java객체로 변환
//        Map<String, String> myMap = objectMapper.readValue(st1, Map.class);
//        System.out.println(myMap);
//        System.out.println(myMap.get("name"));
//        System.out.println(myMap.get("city"));

//        Student s1 = objectMapper.readValue(st1,Student.class);
//        System.out.println(s1);

//        실습: 리스트 형식의 student json데이터를 파싱
        ObjectMapper objectMapper = new ObjectMapper();
        List<Student> students = new ArrayList<>();
        Path filePath = Paths.get("src/C07ExceptionFileParhing/json2.json");
        String st1 = Files.readString(filePath);
        JsonNode j2 = objectMapper.readTree(st1);
        for(JsonNode j : j2){
            Student s1 = objectMapper.readValue(j.toString(), Student.class);
            students.add(s1);
        }
    }
}
//실제 값을 setting은 reflection이라는 기술을 통해 변수에 직접 접근. private이라 할지라도 접근가능.
//objectmapper는 getter 또는 setter의 메서드명을 통해 필드값 유추
class Student{
    private int id;
    private String name;
    private String classNumber;
    private String city;


    public String getCity() {
        return city;
    }
    public String getClassNumber() {
        return classNumber;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}