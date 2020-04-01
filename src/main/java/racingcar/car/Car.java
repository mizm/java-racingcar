package racingcar.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private static final int THRESHOLD = 4;
    private String name;
    private int position;
    private final List<Integer> record;
    private final Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        position = 0;
        record = new ArrayList<>();
        this.engine = engine;
    }

    public Car(String name, List<Integer> record) {
        this.name = name;
        this.record = new ArrayList<>(record);
        position = this.record.get(this.record.size() - 1);
        this.engine = new RandomEngine();
    }

    public String getName() {
        return name;
    }

    public void move() {
        if (engine.generateNumber() >= THRESHOLD) {
            position++;
        }
        record.add(position);
    }

    public List<Integer> getRecord() {
        return new ArrayList<>(record);
    }

    public Integer getRecord(int index) {
        return record.get(index);
    }

    public int getFinalRecord() {
        return record.get(record.size() - 1);
    }

    public boolean isWin(int maxRecord) {
        return getFinalRecord() == maxRecord;
    }
}