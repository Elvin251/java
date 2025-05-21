package Lesson12Homework;

public class Mouse {

        String name;
        String size;
        String color;

    public Mouse(String name, String size, String color) {
            if ((name == null || name.isEmpty()) && (color == null || color.isEmpty())) {
                this.name = "Not exist";
            } else if (name == null || name.isEmpty()) {
                this.name = "Unknown";
            } else {
                this.name = name;
            }

            this.size = size;
            this.color = color;
        }

        public void printInfo() {
            System.out.println("Mouse -> Name: " + name + ", Size: " + size + ", Color: " + color);
        }

}
