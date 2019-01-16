package getInfo;

public class DisciplineInfo {
    private String nameDisc;
    private String group;


    public DisciplineInfo(String nameDisc, String group){
        this.nameDisc = nameDisc;
        this.group = group;
    }

    public String getNameDisc() {
        return nameDisc;
    }

    public void setNameDisc(String nameDisc) {
        this.nameDisc = nameDisc;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
