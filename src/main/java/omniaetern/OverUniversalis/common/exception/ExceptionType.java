package omniaetern.OverUniversalis.common.exception;

public enum ExceptionType {
    MISSING_GAME_CONTENT(2001);
    private final int code;
    ExceptionType(int code) {
        this.code = code;
    }
    public int code() {return code;}
}
