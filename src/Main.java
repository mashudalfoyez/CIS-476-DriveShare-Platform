import com.driveshare.model.*;
import com.driveshare.pattern.*;
import com.driveshare.service.*;

// main class to start and test the Drive share system
// also deonstrates all features and design patterns
public class Main {
    public static void main(String[] args) {

        System.out.println("DriveShare Started \n");

        // User + Session
        User user = new User("test123@email.com", "123abcd");
        Session.getInstance_Time().login(user);

        // Builder + Car
        Car car = new CarBuilder()
                .setModel("Toyota")
                .setPrice(50)
                .build();

        // Observer
        Renter renter = new Renter("John");
        car.add_Observer(renter);
        car.setThe_price(40);

        // Booking
        BookingService bs = new BookingService();
        bs.book_theCar(car, "2026-06-20", "2026-06-25");
        bs.book_theCar(car, "2026-06-22", "2026-06-27"); // overlap

        // Payment
        Payment payment = new PaymentProxy();
        payment.pay(100);

        // Chain of Responsibility
        System.out.println("\nPassword Recovery:");

        SecurityHandler s1 = new QuestionHandler("Color?", "blue");
        SecurityHandler s2 = new QuestionHandler("Pet?", "max");
        SecurityHandler s3 = new QuestionHandler("City?", "detroit");

        s1.setNext(s2);
        s2.setNext(s3);

        System.out.println("Result: " + s1.check("blue"));

        // Mediator simply checkout
        UIMediator mediator = new UIMediator();
        mediator.notify("Search Click");

        System.out.println("\nProgram Finished");
    }
}