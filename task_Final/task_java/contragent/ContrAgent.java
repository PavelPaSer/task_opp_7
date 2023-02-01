package task_java.contragent;

import task_java.connection.ConnectionMethod;


public class ContrAgent extends AbstractContrAgent{
    private ConnectionMethod listCommunicationMethod;

    public ContrAgent(String name, int age, ConnectionMethod listCommunicationMethod) {
        super.name = name;
        super.age = age;
        this.listCommunicationMethod = listCommunicationMethod;
    }

    public ContrAgent(String nameCompany, ConnectionMethod listCommunicationMethod) {
        super.nameCompany = nameCompany;
        this.listCommunicationMethod = listCommunicationMethod;
    }

    public int getAge() {return age;}
    public String getName() {return name;}
    public String getNameCompany() {return nameCompany;}
    public ConnectionMethod getListCommunicationMethod() {return listCommunicationMethod;}
    

    @Override
    public String toString() {
        if(age != 0 ){
            return "ContrAgent [ " + name + ", " + age + " ]";
        }
        else{
            return "ContrAgent [ " + nameCompany + " ]";
        }
    }
}
