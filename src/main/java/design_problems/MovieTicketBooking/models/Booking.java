package design_problems.MovieTicketBooking.models;

import java.util.List;

public class Booking {

    private final String id;
    private final Show show;
    private final List<Seat> bookedSeats;
    private final User user;
    private BookingStatus bookingStatus;

    public Booking(String id, Show show, List<Seat> bookedSeats, User user) {
        this.id = id;
        this.show = show;
        this.bookedSeats = bookedSeats;
        this.user = user;
        this.bookingStatus = BookingStatus.CREATED;
    }

    public boolean isBookingConfirmed(){
        return this.bookingStatus == BookingStatus.CONFIRMED;
    }

    public void confirmBooking() throws Exception {
        if(this.bookingStatus != BookingStatus.CREATED){
            throw new Exception();
        }
        this.bookingStatus = BookingStatus.CONFIRMED;
    }

    public void expireBooking() throws Exception{
        if(this.bookingStatus != BookingStatus.CREATED){
            throw new Exception();
        }
        this.bookingStatus = BookingStatus.EXPIRED;
    }
}
