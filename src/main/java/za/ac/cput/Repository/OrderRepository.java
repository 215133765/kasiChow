//package za.ac.cput.Repository;
//
///**
// IOrderRepository.java
// IOrderRepository
// Author: Zimkhitha Nkqenkqa 216280427
// Date: 10 April 2022
// */
//
//public class OrderRepository implements IOrderRepository{
//    private static OrderRepository orderRepository = null;
//    private Set<Orders> orderRepositoryDB = null;
//
//    private OrderRepository(){
//        orderRepositoryDB = new HashSet<Orders>();
//        }
//
//    public static OrderRepository getRepository(){
//        if(orderRepository == null){
//            orderRepository = new OrderRepository();
//        }
//        return orderRepository;
//    }
//
//    @Override
//    public Set<Orders> getAll() {
//        return orderRepositoryDB;
//    }
//
//
//    @Override
//    public Orders create(Orders order) {
//        boolean success = orderRepositoryDB.add(order);
//        if(!success)
//            return null;
//        return order;
//    }
//
//    @Override
//    public Orders read(String s) {
//        Orders order = orderRepositoryDB.stream()
//                .filter(e -> e.getOrderID().equals(s))
//                .findAny()
//                .orElse(null);
//        return order;
//    }
//
//    @Override
//    public Orders update(Orders order) {
//        Orders prevOrder = read(order.getOrderID());
//        if (prevOrder != null){
//            orderRepositoryDB.remove(prevOrder);
//            orderRepositoryDB.add(order);
//            return order;
//
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String s) {
//        Orders orderDeleted = read(s);
//        if (orderDeleted == null)
//            return false;
//        orderRepositoryDB.remove(orderDeleted);
//        return true;
//    }
//}
