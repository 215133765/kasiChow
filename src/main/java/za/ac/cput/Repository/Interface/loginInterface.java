/**
 * Mziyanda Mwanda
 * 2133765
 * ADP 3
 *Assignment 1
 * Due date
 * 10 Aprile 2022
 * Interface
 * Login
 * **/
package za.ac.cput.Repository.Interface;

import za.ac.cput.Entity.login;
import za.ac.cput.Repository.iml.iRepository;

import java.util.Set;

public interface loginInterface extends iRepository<login, String> {

    public Set<login> getAll();


}
