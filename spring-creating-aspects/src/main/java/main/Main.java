package main;

import config.AppConfig;
import entities.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.MovieService;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);



        Movie movie = new Movie();
        movie.setName("Top Gun: Maverick");
        movie.setImdbRating(8.5);

        MovieService service = ctx.getBean(MovieService.class);
        service.streamMovie(movie);



    }
}
