package za.ac.cput.Service.Interface;

import za.ac.cput.Entity.Ratings;
import za.ac.cput.Service.IService;

import java.util.List;

public interface IRatingsService extends IService<Ratings, String> {
    public List<Ratings> getAll();
}