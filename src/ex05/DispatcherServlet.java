package ex05;

public class DispatcherServlet {

    private final Controller con;

    public DispatcherServlet(Controller con) {
        this.con = con;
    }

    public void route(String path){
        if (path.equals("/")){
            con.list();
        }else if(path.equals("/board")){
            con.detail();
        }else{
            System.out.println("404 not found");
        }
    }
}
