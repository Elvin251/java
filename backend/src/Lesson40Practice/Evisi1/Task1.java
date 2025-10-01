package Lesson40Practice.Evisi1;

class NumberChecker {
    void checkNumber(int num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Menfi eded qebul edilmir!");
        } else {
            System.out.println("Eded qebul olundu: " + num);
        }
    }

    public static void main(String[] args) {
        NumberChecker nc = new NumberChecker();
        try {
            nc.checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Xeta: " + e.getMessage());
        }
    }
}