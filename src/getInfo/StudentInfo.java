package getInfo;

public class StudentInfo {
    private String fio;
    private int birthday;
    private String spec;
    private int idStud;
    private int idGroup;

    //Информация о студенте
    public StudentInfo(String fio, int birthday, String spec, int idGroup){
        this.fio = fio;
        this.birthday = birthday;
        this.spec = spec;
        this.idGroup = idGroup;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getIdStud() {
        return idStud;
    }

    public void setIdStud(int idStud) {
        this.idStud = idStud;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
}
