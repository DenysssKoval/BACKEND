package code.task2.service;

public class Repair implements Serviceable{

    private String typeWorkDescription;
    private String workStatus;


    public Repair(String typeWorkDescription) {
        this.typeWorkDescription = typeWorkDescription;
        this.workStatus = "Assigned";
    }

    @Override
    public void assignWork(String typeWorkDescription) {
        this.typeWorkDescription = typeWorkDescription;
        this.workStatus = "In progress";
    }

    @Override
    public String getWorkStatus() {
        return typeWorkDescription + " : " + workStatus;
    }

    @Override
    public void changeWorkStatus(String newStatus) {
        workStatus = newStatus;
    }
}
