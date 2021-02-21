package day17_19.demo;

/**
 * Date:2021/2/19 10:27
 * Author:lyf
 */
public class Movie {
    private String name;
    private String director;
    private String actor;
    private int time;

    public Movie(String name, String director, String actor, int time) {
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.time = time;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", time=" + time +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
