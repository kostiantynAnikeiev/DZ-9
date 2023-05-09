public class Man extends Person {
    private boolean isMarried;

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.isMarried = false;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public boolean isRetired() {
        return this.getAge() > 65;
    }

    @Override
    public void registerPartnership() {
        super.registerPartnership();
        if (this.getPartner() instanceof Woman) {
            this.isMarried = true;
        }
    }

    @Override
    public void deregisterPartnership(boolean revertLastName) {
        super.deregisterPartnership(revertLastName);
        if (this.getPartner() instanceof Woman) {
            this.isMarried = false;
        }
    }
}
