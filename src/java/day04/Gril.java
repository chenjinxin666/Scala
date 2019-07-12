package main.java.day04;

public class Gril implements Comparable<Gril> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    private String name;
    private int faceValue;

    @Override
    public int compareTo(Gril o) {
        return o.getFaceValue() - this.getFaceValue();
    }
}
