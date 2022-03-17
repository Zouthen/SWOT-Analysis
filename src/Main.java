public class Main {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

    public static void main(String[] args) {
        System.out.println(ANSI_CYAN_BACKGROUND + "SWOT ANALYSIS" + ANSI_RESET);
        System.out.println(ANSI_BLUE + """    
                STRENGTHS:
                1: Produktudvikling
                2: Kundeservice
                3: Koordinering & analyse
                4: Database SQL
                5: Spil erfaring
                6: Markedsføring
                7: Studerenes udviklende erfaring og viden
                 """ + ANSI_RESET);
    }

}
