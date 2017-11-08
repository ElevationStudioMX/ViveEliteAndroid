package com.example.desarrollo_elevation.viveelite.json;

import java.util.List;

import static android.R.attr.duration;
import static com.example.desarrollo_elevation.viveelite.R.style.se;

/**
 * Created by Desarrollo_Elevation on 03/04/17.
 */

public class MovieModel {

    private String movie;
    private int year;
    private float reating;
    private String duration;
    private String director;
    private String tagline;
private List<Cast> castList;
    private String image;
    private String story;

    public float getReating() {
        return reating;
    }

    public void setReating(float reating) {
        this.reating = reating;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<Cast> getCastList() {
        return castList;
    }

    public void setCastList(List<Cast> castList) {
        this.castList = castList;
    }

    static  class  Cast{
        private String name;

        public String getName(){
            return name;
        }

        public void SetName(String name){

            this.name = name;

        }

    }

    public MovieModel() {
    }
}