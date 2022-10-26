package za.ac.cput.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Entity.Ratings;
import za.ac.cput.Repository.Interface.IRatingsRepository;
import za.ac.cput.Service.Interface.IRatingsService;

import java.util.List;
import java.util.Optional;

@Service
public class RatingsService implements IRatingsService {

    private static IRatingsService ratingsService = null;

    @Autowired
    private IRatingsRepository repository;

    private RatingsService() {
    }
    public static IRatingsService getRatingsService() {

        if(ratingsService == null)
            ratingsService = new RatingsService();
        return ratingsService;

    }
    @Override
    public Ratings create(Ratings ratings) {
        return this.repository.save(ratings);
    }

    @Override
    public Ratings read(String s) {
        Optional<Ratings> optRat = this.repository.findById(s);
        return optRat.orElse(null); }

    @Override
    public Ratings update(Ratings ratings) {
        if (this.repository.existsById(ratings.getOrderID()))
            return this.repository.save(ratings);
        return null;
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if (this.repository.existsById(s))
            return false;
        else
            return true;    }

    @Override
    public List<Ratings> getAll() {
        return this.repository.findAll();
    }
}
