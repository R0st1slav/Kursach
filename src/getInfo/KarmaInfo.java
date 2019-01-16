package getInfo;

public class KarmaInfo {
    private String fio;
    private String nameDisc;
    private String nameGroup;
    private int karma;
    private float grade;

    public KarmaInfo(String fio, String nameDisc, String nameGroup, int karma){
        this.fio = fio;
        this.nameDisc = nameDisc;
        this.nameGroup = nameGroup;
        this.karma = karma;
    }

    public KarmaInfo(String fio, String nameDisc, String nameGroup, float grade){
        this.fio = fio;
        this.nameDisc = nameDisc;
        this.nameGroup = nameGroup;
        this.grade = grade;
    }

    public KarmaInfo(int karma){
        this.karma = karma;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNameDisc() {
        return nameDisc;
    }

    public void setNameDisc(String nameDisc) {
        this.nameDisc = nameDisc;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
