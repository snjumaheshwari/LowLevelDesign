package design_problems.MovieTicketBooking.models;

import java.util.List;

public class Theater {
    private String id;
    private String name;
    private List<Screen> screens;

    public Theater(final String id, final String name, final List<Screen> screens){
        this.id = id;
        this.name = name;
        this.screens = screens;
    }

    public void addScreen(final Screen screen){
        screens.add(screen);
    }
}
