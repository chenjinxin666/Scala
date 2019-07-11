package day04.sort_java;

public class Gril implements Comparable<Gril>{
    private String name;
    private int faceValue;

    public Gril(String name, int faceValue) {
        this.name = name;
        switch (this.faceValue = faceValue) {
        }
    }

    public Gril() {
    }

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

    @Override
    public int compareTo(Gril o) {
        return o.getFaceValue()-this.getFaceValue();
    }
}
