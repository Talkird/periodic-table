package element;

import java.util.ArrayList;

public class ElementManager {
    
    public static ArrayList<Element> elements = new ArrayList<Element>();

    public void initElements() {

        //Reactive Nonmetals
        elements.add(new Element("Hydrogen", "H" , 1, 1.008, Category.REACTIVE_NONMETALS, 1, 1));
        elements.add(new Element("Carbon", "C", 6, 12.011, Category.REACTIVE_NONMETALS, 2, 14));
        elements.add(new Element("Nitrogen", "N", 7, 14.007, Category.REACTIVE_NONMETALS, 2, 15));
        elements.add(new Element("Phosphorus", "P", 15, 30.974, Category.REACTIVE_NONMETALS, 3, 15));
        elements.add(new Element("Oxygen", "O", 8, 16.0, Category.REACTIVE_NONMETALS, 2, 16));
        elements.add(new Element("Sulfur", "S", 16, 32.06, Category.REACTIVE_NONMETALS, 3, 16));
        elements.add(new Element("Selenium", "Se", 34, 78.971, Category.REACTIVE_NONMETALS, 4, 16));
        elements.add(new Element("Fluoride", "F", 9, 18.998, Category.REACTIVE_NONMETALS, 2, 17));
        elements.add(new Element("Chlorine", "Cl", 17, 35.45, Category.REACTIVE_NONMETALS, 3, 17));
        elements.add(new Element("Bromine", "Br", 35, 79.904, Category.REACTIVE_NONMETALS, 4, 17));
        elements.add(new Element("Iodine", "I", 53, 126.90, Category.REACTIVE_NONMETALS, 5, 17));

        //Alkali Metals
        elements.add(new Element("Lithium", "Li", 3, 6.94, Category.ALKALI_METALS, 2, 1));
        elements.add(new Element("Sodium", "Na", 11, 22.990, Category.ALKALI_METALS, 3, 1));
        elements.add(new Element("Potassium", "K", 19, 39.098, Category.ALKALI_METALS, 4, 1));
        elements.add(new Element("Rubidium", "Rb", 37, 85.468, Category.ALKALI_METALS, 5, 1));
        elements.add(new Element("Caesium", "Cs", 55, 132.91, Category.ALKALI_METALS, 6, 1));
        elements.add(new Element("Francium", "Fr", 87, 223.0, Category.ALKALI_METALS, 7, 1));

        //Alkaline Earth Metals
        elements.add(new Element("Beryllium", "Be", 4, 9.0122, Category.ALKALINE_EARTH_METALS, 2, 2));
        elements.add(new Element("Magnesium", "Mg", 12, 24.305, Category.ALKALINE_EARTH_METALS, 3, 2));
        elements.add(new Element("Calcium", "Ca", 20, 40.078, Category.ALKALINE_EARTH_METALS, 4, 2));
        elements.add(new Element("Strontium", "Sr", 38, 87.62, Category.ALKALINE_EARTH_METALS, 5, 2));
        elements.add(new Element("Barium", "Ba", 56, 137.33, Category.ALKALINE_EARTH_METALS, 6, 2));
        elements.add(new Element("Radium", "Ra", 88, 226.0, Category.ALKALINE_EARTH_METALS, 7, 2));

        //Transition Metals
        elements.add(new Element("Scandium", "Sc", 21, 44.956, Category.TRANSITION_METALS, 4, 3));
        elements.add(new Element("Yttrium", "Y", 39, 88.906, Category.TRANSITION_METALS, 5, 3));
        elements.add(new Element("Titanium", "Ti", 22, 47.867, Category.TRANSITION_METALS, 4, 4));
        elements.add(new Element("Zirconium", "Zr", 40, 91.224, Category.TRANSITION_METALS, 5, 4));
        elements.add(new Element("Hafnium", "Hf", 72, 178.49, Category.TRANSITION_METALS, 6, 4));
        elements.add(new Element("Rutherfordium", "Rf", 104, 267.0, Category.TRANSITION_METALS, 7, 4));
        elements.add(new Element("Vanadium", "V", 23, 50.942, Category.TRANSITION_METALS, 4, 5));
        elements.add(new Element("Niobium", "Nb", 41, 92.906, Category.TRANSITION_METALS, 5, 5));
        elements.add(new Element("Tantalum", "Ta", 73, 180.95, Category.TRANSITION_METALS, 6, 5));
        elements.add(new Element("Dubnium", "Db", 105, 268.0, Category.TRANSITION_METALS, 7, 5));
        elements.add(new Element("Chromium", "Cr", 24, 51.996, Category.TRANSITION_METALS, 4, 6));
        elements.add(new Element("Molybdenum", "Mo", 42, 95.95, Category.TRANSITION_METALS, 5, 6));
        elements.add(new Element("Tungsten", "W", 74, 183.84, Category.TRANSITION_METALS, 6, 6));
        elements.add(new Element("Seaborgium", "Sg", 106, 269.0, Category.TRANSITION_METALS, 7, 6));

        elements.add(new Element("Iron", "Fe", 26, 55.845, Category.TRANSITION_METALS, 4, 8));

        //Post-transition Metals
        elements.add(new Element("Aluminium", "Al", 13, 26.982, Category.POST_TRANSITION_METALS, 3, 13));
        elements.add(new Element("Gallium", "Ga", 31, 69.723, Category.POST_TRANSITION_METALS, 4, 13));
        elements.add(new Element("Indium", "In", 49, 114.82, Category.POST_TRANSITION_METALS, 5, 13));
        elements.add(new Element("Thallium", "Tl", 81, 204.38, Category.POST_TRANSITION_METALS, 6, 13));
        elements.add(new Element("Tin", "Sn", 50, 118.71, Category.POST_TRANSITION_METALS, 5, 14));
        elements.add(new Element("Lead", "Pb", 82, 207.2, Category.POST_TRANSITION_METALS, 6, 14));
        elements.add(new Element("Bismuth", "Bi", 83, 208.98, Category.POST_TRANSITION_METALS, 6, 15));
        elements.add(new Element("Polonium", "Po", 84, 209.0, Category.POST_TRANSITION_METALS, 6, 16));

        //Metalloids
        elements.add(new Element("Boron", "B", 5, 10.81, Category.METALLOIDS, 2, 13));
        elements.add(new Element("Silicon", "Si", 14, 28.085, Category.METALLOIDS, 3, 14));
        elements.add(new Element("Germanium", "Ge", 32, 72.630, Category.METALLOIDS, 4, 14));
        elements.add(new Element("Arsenic", "As", 33, 74.922, Category.METALLOIDS, 4, 15));
        elements.add(new Element("Antimony", "Sb", 51, 121.76, Category.METALLOIDS, 5, 15));
        elements.add(new Element("Tellurium", "Te", 52, 127.60, Category.METALLOIDS, 5, 16));
        elements.add(new Element("Astatine", "At", 85, 210.0, Category.METALLOIDS, 6, 17));

        //Noble Gases
        elements.add(new Element("Helium", "He", 2, 4.0026, Category.NOBLE_GASES, 1, 18));
        elements.add(new Element("Neon", "Ne", 10, 20.180, Category.NOBLE_GASES, 2, 18));
        elements.add(new Element("Argon", "Ar", 18, 39.948, Category.NOBLE_GASES, 3, 18));
        elements.add(new Element("Krypton", "Kr", 36, 83.798, Category.NOBLE_GASES, 4, 18));
        elements.add(new Element("Xenon", "Xe", 54, 131.29, Category.NOBLE_GASES, 5, 18));
        elements.add(new Element("Radon", "Rn", 86, 222.0, Category.NOBLE_GASES, 6, 18));

    }

    public void printElements() {

        for (Element e: elements) {
            System.out.println(e.getName());
        }
    }

    public static void printElementByAtomicNumber(int a) {
        for (Element e: elements) {
            if (e.getAtomicNumber() == a) {
                System.out.println(e.getName());
            }
        }
    }

    public static void printElementByCoordinates(int period, int group) {
        for (Element e: elements) {
            if (e.getPeriod() == period && e.getGroup() == group) {
                System.out.println(e.getName());
            }
        }
    }

}
