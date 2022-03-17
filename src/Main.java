public class Main {
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_RED + """
                Weaknesses
                1: Not much coding experience
                2: Impatient
                3: Small group
                4: Very specialised group, 
                because we all have same function (to write code)
                5: We are students
                """ + ANSI_RESET);
    }
}