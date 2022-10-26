package za.ac.cput.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import za.ac.cput.Entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Factory.OrderFactory;
import za.ac.cput.Service.impl.OrderService;

import java.util.List;

@Controller
@RequestMapping("/Order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("orders", orderService.getAll());
        return "orderHome";
    }
    @GetMapping("/create")
    public String create(@ModelAttribute("order") Orders order) {
        return "orderAdd";
    }
    @PostMapping("/create")
    public String create (@ModelAttribute("order") Orders order, BindingResult result)
    {
        if (result.hasErrors())
            return "orderAdd";
        Orders newOrder = OrderFactory.createOrder
                (
                        order.getCustID(),
                        order.getOrderID(),
                        order.getDriverID(),
                        order.getItemID(),
                        order.getTrackStatus(),
                        order.getTrackETA()
                );
        orderService.create(newOrder);
        return  "redirect:/order/home";
    }

    @GetMapping("/read/{orderID}")
    public Orders read(@PathVariable String orderID)
    {
        return orderService.read(orderID);
    }

    @GetMapping("/update/{orderID}")
    public String getUpdateForm(@PathVariable("orderID") String orderID, Model model) {
        Orders order = orderService.read(orderID);
        model.addAttribute("orders", order);
        return "orderUpdate";
    }
    @PostMapping("/update")
    public String update(Orders order, BindingResult result, Model model) {
        if (result.hasErrors())
            return "orderUpdate";
        orderService.update(order);
        return "redirect:/orders/home";
    }

    @DeleteMapping ("/delete/{orderID}")
    public boolean delete (@PathVariable(value = "orderID") String orderID)
    {
        return orderService.delete(orderID);
    }
    @GetMapping("/delete/{orderID}")
    public String delete(@PathVariable("orderID") String orderID, Model model) {
        orderService.delete(orderID);
        model.addAttribute("orders", orderService.getAll());
        return "redirect:/orders/home";
    }

    @GetMapping(value = "/getall")
    public List<Orders> getAll()
    {
        return orderService.getAll();
    }

}