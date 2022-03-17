package RISK_Analysis;

public class Risk {

    private int pro;
    private int con;
    private int severity;
    private String level;

    public void setPro (int pro) {
        this.pro = pro;
    }
    int getPro() {
        return pro;
    }

    int getCon() {
        return con;
    }
    void setCon (int con) {
        this.con = con;
    }

    void setSeverity(int severity) {
        this.severity = severity;
    }
    int getSeverity() {
        return severity;
    }

    void setLevel (String level) {
        this.level = level;
    }
    String getLevel() {
        return level;
    }
 }