package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Entity.MenuItem;

@Repository
public interface MenuInterface extends JpaRepository<MenuItem, String> {

//    public Set<Menu> getAll();
}
