package omniaetern.OverUniversalis.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameLogicException extends RuntimeException {
    int code;
    String message;

    public GameLogicException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString(){
        return "GAME LOGIC EXCEPTION " + code + ": " + message;
    }

}
