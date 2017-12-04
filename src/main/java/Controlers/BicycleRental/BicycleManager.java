package Controlers.BicycleRental;

import java.util.*;

/**
 * @author  Francisco Carena
 */
public interface BicycleManager {

    void createBicycle(Bicycle bicycle) throws ServiceFailureException;

    Bicycle getBicycleByID(Long id) throws ServiceFailureException;

    List<Bicycle> findAllBicycles() throws ServiceFailureException;

    void updateBicycle(Bicycle bicycle) throws ServiceFailureException;

    void deleteBicycle(Long id) throws ServiceFailureException;

}
