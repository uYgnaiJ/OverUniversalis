package omniaetern.OverUniversalis;

import static omniaetern.OverUniversalis.common.exception.ExceptionHandler.handle;

public class Main {
    static void main() {
        try{
            Game game = new Game();
        }catch(Exception e){
            handle(e);
        }
    }
}
