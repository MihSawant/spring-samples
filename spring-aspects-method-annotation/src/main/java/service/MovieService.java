package service;

import entities.Movie;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MovieService {

    private Logger logger = Logger.getLogger(MovieService.class.getName());

    public void bingeWatching(Movie movie){
        logger.info("Binge Watching Movie: "+movie.getName());
    }

    @LogIt
    public void downloading(Movie movie){
        logger.info("Downloading Movie: "+movie.getName());
    }

    public void rating(Movie movie, double rating){
        movie.setImdbRating(rating);
        logger.info(movie.getName()+" Movie Rated: "+movie.getImdbRating());
    }
}
