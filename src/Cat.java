public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    private Plate plate;




    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getSatiety(Plate plate) {
        if (appetite < plate.getFood() ) this.satiety = true;
        else this.satiety = false;
        return satiety;
    }

//    public void setSatiety(int appetite) {
//        if (appetite == 0 ) this.satiety = true;
//    }

    public void eat(Plate plate) {
        plate.setFood(plate.getFood() - appetite);
        if (appetite < plate.getFood() ) this.satiety = true;
        else this.satiety = false;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}' + "\n";
    }
}