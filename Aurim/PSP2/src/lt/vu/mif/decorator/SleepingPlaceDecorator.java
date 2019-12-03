package lt.vu.mif.decorator;

//https://www.hillside.net/plop/plop97/Proceedings/riehle.pdf - skaiciau
//https://stackabuse.com/behavioral-design-patterns-in-java/
//https://www.fernuni-hagen.de/ps/prjs/IROP/
public abstract class SleepingPlaceDecorator implements SleepingPlace {

    private SleepingPlace sleepingPlace;
    private String roleName;

    private static final String NOT_EXISTING_ROLE = "NOT_EXISTING";

    public SleepingPlaceDecorator(SleepingPlace sleepingPlace, String roleName) {
        this.sleepingPlace = sleepingPlace;
        this.roleName = roleName;
    }

    public SleepingPlaceDecorator removeRole(String roleName) {
        if (this.getRoleName().equals(roleName)) {
            if (this.getSleepingPlace() instanceof SleepingPlaceDecorator) {
                this.setRoleName(this.getAccomodationDecorator().getRoleName());
                return (SleepingPlaceDecorator) this.getSleepingPlace();
            } else {
                this.setRoleName(NOT_EXISTING_ROLE);
            }
        } else {
            if (this.getSleepingPlace() instanceof SleepingPlaceDecorator) {
                this.setSleepingPlace(((SleepingPlaceDecorator) this.getSleepingPlace()).removeRole(roleName));
            }
        }
        return this;
    }

    public SleepingPlaceDecorator getRole(String name) {
        if ((this).getRoleName().equals(name)) {
            return this;
        } else {
            if (this.getSleepingPlace() instanceof SleepingPlaceDecorator)
                return ((SleepingPlaceDecorator) this.getSleepingPlace()).getRole(name);
        }
        return null;
    }

    @Override
    public double price(int nights) {
        return sleepingPlace.price(nights);
    }

    public SleepingPlace getSleepingPlace() {
        return sleepingPlace;
    }

    public SleepingPlaceDecorator getAccomodationDecorator() {
        return (SleepingPlaceDecorator) sleepingPlace;
    }

    public void setSleepingPlace(SleepingPlace sleepingPlace) {
        this.sleepingPlace = sleepingPlace;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
