public enum State {
    BAD, SATISFACTORY, GOOD, PERFECT;

    public String toString() {
        switch(this) {
            case BAD: return "Bad";
            case SATISFACTORY: return "Satisfactory";
            case GOOD: return "Good";
            case PERFECT: return "Perfect";
            default: return "No infromation";
        }
    }
}
