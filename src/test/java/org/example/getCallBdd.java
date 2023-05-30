package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.*;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class getCallBdd {
    @Test
    public void testNumberOfCircuits() throws IOException {
        Response res = given().when().get("https://reqres.in/api/users?page=2");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int i=0;
        while(res.jsonPath().get("data["+i+"].id")!=null){
            int id = res.jsonPath().get("data["+i+"].id");
            String name = res.jsonPath().getString("data["+i+"].last_name");
            hm.put(name,id);
            i++;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        Map<String, Integer> hm1 = sortByValue(hm);
        Map.Entry<String,Integer> entry1 = hm1.entrySet().iterator().next();
        String youngestName = entry1.getKey();
        int youngestAge = entry1.getValue();
        System.out.println("Youngest player is: "+youngestName+" his age is: "+youngestAge);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        Map<String, Integer> map = hm1;
        String oldestName = "";
        int oldestAge = 0;
        for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
            oldestName = entry2.getKey();
            oldestAge = entry2.getValue();
        }
        System.out.println("Oldest player is: "+oldestName+" his age is: "+oldestAge);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(resp.jsonPath().getString("data[1].last_name"));
        baseURI = "https://reqres.in/api";
        given().when().get("/users?page=2").then().statusCode(200).
                body("data[1].last_name",equalTo("Ferguson")).
                body("data.first_name",hasItems("George","Rachel"));
        JSONObject jo = new JSONObject();
        jo.put("name","Sourav");
        jo.put("role","Manager");
        Response createResp = given().auth().none().header("Content-Type","application/json").
                when().body(jo.toJSONString()).post("/api/users");
        System.out.println("**************************");
        System.out.println(createResp.asString());
        System.out.println(createResp.jsonPath().getString("name"));
        System.out.println("**************************");
        ObjectMapper om = new ObjectMapper();
        File f = new File("src/test/java/testData/createPayload.json");
        createEmp emp = om.readValue(f, createEmp.class);
        System.out.println(emp.getName());
        emp.setName("John");
        String updatedPayload = om.writeValueAsString(emp);
        given().auth().none().header("Content-Type","application/json").
                when().body(updatedPayload).post("/api/users").then().statusCode(201);
        Response cRes = given().auth().none().header("Content-Type","application/json").
                when().body(updatedPayload).post("/api/users");
        System.out.println(cRes.asString());
        Map<String,Object> emps = om.readValue(f,new TypeReference<Map<String,Object>>(){});
        emps.put("name", "Subir");
        emps.put("company", "geniusVibe");
        emps.remove("role");
        String newPayload = om.writerWithDefaultPrettyPrinter().writeValueAsString(emps);
        System.out.println(newPayload);
    }
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
