package services;

import entities.Movie;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MovieService {

    private final Logger logger = Logger.getLogger(MovieService.class.getName());

    public void streamMovie(Movie movie){
       logger.info("------------Streaming Movie: "+movie.getName()+"----------------");
    }
}
