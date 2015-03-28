package homeWork1;

/**
 * Created by Kirill on 28.03.2015.
 */
public class MachineCreator {
    public MachineCreator(String nameMachine, String typeMachine, String ownerMachine, int numberMachine, String nameOfFactoryWhoCreatedMachine, boolean readinessStatus,
                          String descriptionOfTheMachine, double priceOfMachine) {
        this.nameMachine = nameMachine;
        this.typeMachine = typeMachine;
        this.ownerMachine = ownerMachine;
        this.numberMachine = numberMachine;
        this.nameOfFactoryWhoCreatedMachine = nameOfFactoryWhoCreatedMachine;
        this.readinessStatus = readinessStatus;
        this.descriptionOfTheMachine = descriptionOfTheMachine;
        this.priceOfMachine = priceOfMachine;
    }

    @Override
    public String toString() {
        return "MachineCreator{" +
                "nameMachine='" + nameMachine + '\'' +
                ", typeMachine='" + typeMachine + '\'' +
                ", ownerMachine='" + ownerMachine + '\'' +
                ", numberMachine=" + numberMachine +
                ", nameOfFactoryWhoCreatedMachine='" + nameOfFactoryWhoCreatedMachine + '\'' +
                ", readinessStatus=" + readinessStatus +
                ", descriptionOfTheMachine='" + descriptionOfTheMachine + '\'' +
                ", priceOfMachine=" + priceOfMachine +
                '}';
    }

    private String nameMachine;
    private String typeMachine;
    private String ownerMachine;
    private int numberMachine;
    private String nameOfFactoryWhoCreatedMachine;
    private boolean readinessStatus;
    private String descriptionOfTheMachine;
    private double priceOfMachine;

    public String getNameMachine() {
        return nameMachine;
    }

    public void setNameMachine(String nameMachine) {
        this.nameMachine = nameMachine;
    }

    public String getTypeMachine() {
        return typeMachine;
    }

    public void setTypeMachine(String typeMachine) {
        this.typeMachine = typeMachine;
    }

    public String getOwnerMachine() {
        return ownerMachine;
    }

    public void setOwnerMachine(String ownerMachine) {
        this.ownerMachine = ownerMachine;
    }

    public int getNumberMachine() {
        return numberMachine;
    }

    public void setNumberMachine(int numberMachine) {
        this.numberMachine = numberMachine;
    }

    public String getNameOfFactoryWhoCreatedMachine() {
        return nameOfFactoryWhoCreatedMachine;
    }

    public void setNameOfFactoryWhoCreatedMachine(String nameOfFactoryWhoCreatedMachine) {
        this.nameOfFactoryWhoCreatedMachine = nameOfFactoryWhoCreatedMachine;
    }

    public boolean isReadinessStatus() {
        return readinessStatus;
    }

    public void setReadinessStatus(boolean readinessStatus) {
        this.readinessStatus = readinessStatus;
    }

    public String getDescriptionOfTheMachine() {
        return descriptionOfTheMachine;
    }

    public void setDescriptionOfTheMachine(String descriptionOfTheMachine) {
        this.descriptionOfTheMachine = descriptionOfTheMachine;
    }

    public double getPriceOfMachine() {
        return priceOfMachine;
    }

    public void setPriceOfMachine(double priceOfMachine) {
        this.priceOfMachine = priceOfMachine;
    }
    /* ask about data*/


}
