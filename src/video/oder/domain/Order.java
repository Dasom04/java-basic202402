package video.oder.domain;

import video.movie.domain.Movie;
import video.user.domain.User;

import java.time.LocalDate;

public class Order {

    private User user;
    private Movie movie;
    private LocalDate orderDate;
    private  LocalDate rentalDate;

    // 연체료 속성 추가해야됨.


    public Order(User user, Movie movie) {
        this.user = user;
        this.movie = movie;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }
}
