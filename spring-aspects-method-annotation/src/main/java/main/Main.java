package main;

import config.ProjectConfig;
import entities.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MovieService;

public class Main {
    public static void main(String[] args) {
        var ct = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Movie movie = new Movie();
        movie.setName("Avengers EndGame");
        movie.setImdbRating(8.4);

        MovieService service = ct.getBean(MovieService.class);

        service.bingeWatching(movie);
        service.torrentDownload(movie);

    }
}
