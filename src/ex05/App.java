package ex05;

public class App {
    public static void main(String[] args) {
        Controller con = new Controller();
        DispatcherServlet ds = new DispatcherServlet(con);
        Repository rep = new Repository();
        Service service = new Service();

        ds.route("/");


    }
}
