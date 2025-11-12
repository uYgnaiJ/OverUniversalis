package omniaetern.OverUniversalis.common;

public enum IdPrefix {
    Character("CH"),
    Culture("CU"),
    Effect("EF"),
    Land("LA"),
    Trait("TR");
    private final String value;
    IdPrefix(String value) {this.value = value;}
    public String value(){
        return value;
    }
}
