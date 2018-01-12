package Car;

public enum Name {
    TESLA, MERCEDES, CHEVROLET, BMW, NISSAN;

    public String toString() {
        switch (this) {
            case TESLA: return "Tesla";
            case MERCEDES: return "Mercedes";
            case CHEVROLET: return "Chevrolet";
            case BMW: return "BMW";
            case NISSAN: return "Nissan";
            default: return "No such car";
        }
    }

}
