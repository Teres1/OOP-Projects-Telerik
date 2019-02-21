package utils;

public class StringValidator {
    public int getMinValue() {
        return minValue;
    }

    private int minValue;
    private int maxValue;

    public StringValidator(int minValue, int maxValue) {
        setMinValue(minValue);
    }

    private void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public boolean isValid(int value) {
        return getMinValue() <= value && value <= getMaxValue();
    }
}
