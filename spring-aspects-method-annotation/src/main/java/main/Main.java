package main;

import config.ProjectConfig;
import entities.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MovieService;

public class Main {
    public static void main(String[] args) {
        var ct = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Movie movie = new Movie();
        movie.setName("Jai Bhim");
        movie.setImdbRating(8.6);

        MovieService service = ct.getBean(MovieService.class);

        service.bingeWatching(movie);
        service.rating(movie, 9.1);
        service.downloading(movie);

    }
}
