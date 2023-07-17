package project.car;
public enum Color {
    BLACK("Black"), ORANGE("Orange"), WHITE("White"), YELLOW("Yellow"), BLUE("Blue"), GREEN("Green");

    private String color;
    Color(String color) {
        this.color = color;
    }

    public String toString() {
        return color;
    }
}

