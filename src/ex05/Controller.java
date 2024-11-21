package ex05;

public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void list(){
        service.목록보기();
    }

    public void detail(){
        service.상세보기();
    }
}
