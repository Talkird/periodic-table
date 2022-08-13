package element;

public class Element {

    private String name, symbol;
    private int atomicNumber, period, group;
    private double atomicWeight;
    private Category category;

    public Element(String name, String symbol, int atomicNumber, double atomicWeight, Category category, int period, int group) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
        this.category = category;
        this.period = period;
        this.group = group;
    }
    
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public Category getCategory() {
        return category;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public int getPeriod() {
        return period;
    }

    public int getGroup() {
        return group;
    }

}
