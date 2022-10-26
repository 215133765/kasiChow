package za.ac.cput.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import za.ac.cput.Entity.Ratings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Factory.RatingsFactory;
import za.ac.cput.Service.impl.RatingsService;

import java.util.List;

@Controller
@RequestMapping("/Ratings")
public class RatingsController {
    @Autowired
    private RatingsService ratingsService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("ratings",ratingsService.getAll());
        return "ratingsHome";
    }
    @GetMapping("/create")
    public String getCreateForm(@ModelAttribute("ratings") Ratings ratings){
        return "ratingsAdd";
    }

    @PostMapping(value = "/create")
    public String create (@ModelAttribute("ratings") Ratings ratings, BindingResult result)
    {
        if (result.hasErrors())
            return "ratingsAdd";
        Ratings newRat = RatingsFactory.createRatings(
                ratings.getRateID(),
                ratings.getOrderID(),
                ratings.getRateScale(),
                ratings.getRateReview()
        );
        ratingsService.create(newRat);
        return "redirect:/ratings/home";
    }

    @GetMapping(value = "/read/{ratingsId}")
    public Ratings read(@PathVariable String ratingsId)
    {
        return ratingsService.read(ratingsId);
    }
    @GetMapping("/update/{rateIDID}")
    public String getUpdateForm(@PathVariable("rateID") String rateID, Model model) {
        Ratings ratings = ratingsService.read(rateID);
        model.addAttribute("ratings", ratings);
        return "ratingsUpdate";
    }

    @PostMapping("/update")
    public String update(Ratings ratings, BindingResult result, Model model) {
        if (result.hasErrors())
            return "ratingsUpdate";
        ratingsService.update(ratings);
        return "redirect:/ratings/home";
    }
    @DeleteMapping("/delete/{rateID}")
    public boolean delete (@PathVariable(value = "rateID") String rateID)
    {
        return ratingsService.delete(rateID);
    }
    @GetMapping("/delete/{rateID}")
    public String delete(@PathVariable("rateID") String rateID, Model model) {
        ratingsService.delete(rateID);
        model.addAttribute("ratings", ratingsService.getAll());
        return "redirect:/ratings/home";
    }

    @GetMapping("/getall")
    public List<Ratings> getAll()
    {
        return ratingsService.getAll();
    }

}
