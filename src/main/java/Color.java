public enum Color {
    RED, WHITE, BLACK, GREEN, BROWN;
    public String toString() {
        switch (this) {
            case RED: return "Red";
            case WHITE: return "White";
            case BLACK: return "Black";
            case GREEN: return "Green";
            case BROWN: return "Brown";
            default: return "No info";
        }
    }
}
