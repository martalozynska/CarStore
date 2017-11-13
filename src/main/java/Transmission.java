public enum Transmission {
    MECHANICAL, AUTOMATIC;

    public String toString() {
        switch (this) {
            case MECHANICAL: return "Mechanical";
            case AUTOMATIC: return "Automatic";
            default: return "No info";
        }
    }
}
