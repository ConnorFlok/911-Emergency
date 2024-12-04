public class Emergency {
    String description;
    int priority;

    public Emergency(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Emergency{" + description + "', Priority " + priority + "}";
    }
}
