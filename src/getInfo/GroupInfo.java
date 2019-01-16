package getInfo;

public class GroupInfo {
    private String studentFio;
    private String nameGroup;

    //Информация о группе
    public GroupInfo(String nameGroup, String studentFio){
        this.nameGroup = nameGroup;
        this.studentFio = studentFio;

    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getStudentFio() {
        return studentFio;
    }

    public void setStudentFio(String studentFio) {
        this.studentFio = studentFio;
    }
}
