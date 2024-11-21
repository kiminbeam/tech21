package ex05;

public class DispatcherServlet {

    private final Controller con;

    private final ControllerAdvice advice;

    public DispatcherServlet(Controller con, ControllerAdvice advice) {
        this.con = con;
        this.advice = advice;
    }

    public void route(String path){

        try {
            if (path.equals("/")){
                con.list();
            }else if(path.equals("/board")){
                con.detail();
            }else{
                System.out.println("오류발생: 404 not found");
            }
        }catch (RuntimeException e) {
            // 1. 컴퍼넌트 스캔 @ControllerAdvice
            // 2. inVoke(호출) RuntimeException 매개변수를 가진 친구 한다. (리플렉션)


            advice.process(e);
        }


    }
}
