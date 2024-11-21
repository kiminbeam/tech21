package ex05;

public class App {
    public static void main(String[] args) {
        ControllerAdvice controllerAdvice = new ControllerAdvice();
        Repository rep = new Repository();
        Service service = new Service(rep);
        Controller con = new Controller(service);
        DispatcherServlet ds = new DispatcherServlet(con, controllerAdvice);

        ds.route("/board");

    }
}
