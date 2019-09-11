package week10.basicInheritance;

class Motor extends Component {
    private String motorType;

    Motor(String motorType, String id, String producer, String description) {
        // Call super classes constructor to build the object (always on first line)
        super(id, producer, description);
        this.motorType = motorType; // add the motor type as well
    }

    String getMotorType() {
        return this.motorType;
    }

    @Override
    public String toString() {
        return "MOTOR: \n" + super.toString() + "\nMOTOR TYPE: " + this.getMotorType();
    }
}
