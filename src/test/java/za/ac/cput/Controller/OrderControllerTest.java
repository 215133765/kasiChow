//package za.ac.cput.Controller;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.*;
//import za.ac.cput.Entity.Orders;
//import za.ac.cput.Factory.OrderFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
//class OrderControllerTest {
//
//    private static Orders orders = OrderFactory.createOrder("21852", "ORD98","DRV25", 10, "Delivered", "14:32");
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private  String baseURL = "http://localhost:8080/orders/";
//
//
//    @Test
//    void create() {
//        String url = baseURL + "/create";
//        ResponseEntity<Orders> postResponse = restTemplate.postForEntity(url, orders, Orders.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//        orders = postResponse.getBody();
//        System.out.println("Order \n----------\n" + orders);
//        assertEquals(orders.getOrderID(), postResponse.getBody().getOrderID());
//
//    }
//
//    @Test
//    void read() {
//        String url = baseURL + "/read/" + orders.getTrackStatus();
//        System.out.println("URL: " + url);
//        ResponseEntity<Orders> response =
//                restTemplate.getForEntity(
//                        url,
//                        Orders.class
//                );
//        assertNotNull(response.getBody());
//        assertEquals(orders.getTrackStatus(), response.getBody().getTrackStatus());
//
//    }
//
//    @Test
//    void update() {
//        Orders updated = new Orders.Builder().copy(orders).setOrderID("ORD94").build();
//        String url = baseURL + "/update";
//        System.out.println("Updated data\n------------\n" + updated);
//        ResponseEntity<Orders> response =
//                restTemplate.postForEntity(
//                        url,
//                        updated,
//                        Orders.class
//                );
//        assertNotNull(response.getBody());
//    }
//
//    @Test
//    void getAll() {
//        String url = baseURL+"/getall";
//        org.springframework.http.HttpHeaders headers = new HttpHeaders();
//        HttpEntity<Orders> entity = new HttpEntity<>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
//        System.out.println("Orders: ");
//        System.out.println(response);
//        System.out.println(response.getBody());
//
//    }
//    @Test
//    void delete() {
//        String url = baseURL+"/delete/"+orders.getOrderID() ;
//        System.out.println("URL: "+url);
//        restTemplate.delete(url);
//
//    }
//}