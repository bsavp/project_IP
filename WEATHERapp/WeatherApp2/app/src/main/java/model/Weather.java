package model;

/**
 * Created by Bobi on 7.5.2017 г..
 */

public class Weather {

    public Place place;
    public String inonData;
    public CurrentCondition currentCondition = new CurrentCondition();
    public Temperature temperature = new Temperature();

    public Wind wind = new Wind();
    public Snow snow = new Snow();
    public Clouds clouds = new Clouds();

}
