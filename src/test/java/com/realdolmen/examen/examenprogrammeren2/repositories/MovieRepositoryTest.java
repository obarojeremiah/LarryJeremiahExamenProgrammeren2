package com.realdolmen.examen.examenprogrammeren2.repositories;

import com.realdolmen.examen.examenprogrammeren2.repositories.MovieRepository;
import com.realdolmen.examen.examenprogrammeren2.domain.Movie;
import com.realdolmen.examen.examenprogrammeren2.exceptions.NoQueryPossibleException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class MovieRepositoryTest {
    
    //TODO 
    //Opdracht 2 Unit testen : Er is al een deel van de repository test opgesteld. Alle gegevens die je nodig hebt staan al ingevuld.
    //19 : annoteer alle methoden met de juiste annotaties, zodat ze aanzien worden als test methoden. Boven sommige methoden staan tips, bekijk ze goed. 
    //20 : tracht alle methoden die hieronder beschreven zijn in te vullen zodat ze slagen. Tips kan je vinden in de methoden zelf.
    private static String URL = "jdbc:mysql://localhost:3306/movie_db_test?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private MovieRepository repository;
    
     @Before
    public void init() {
        repository = new MovieRepository(URL);
    }
    
    
    //TODO maak een test voor MovieRepository.find()
    @Test
    public void findTestSucces() throws Exception {
        //Geef als parameter de String "SELECT * FROM movies" mee
        

         List<Movie> movies = new ArrayList<>();
         movies = repository.find("SELECT * FROM movies");
    //     assertTrue(myCustomArrayList.getMyList().contains(stringToAdd));

//      
//        int lenghtToTest = myCustomArrayList.getMyList().size();
//        assertEquals(initlength + 1, lenghtToTest);
//        
//        List<Movie> result = repository.find();
//        assertEquals(movies, result);
//        verify(repository, times(1)).findAll();
    }
    
    
    //TODO maak een test voor MovieRepository.find()
    @Test
    public void findTestWrongQueryThrowsNoQueryPossibleException() throws Exception{
        //Geef als parameter de String "SELECT tieeel FROM movies" mee
        
        //Doe de nodige check om een succesvolle test te krijgen indien nodig
    }
    
}
