package io.github.wotjd243.pokemon.pokemon.domain;

import java.util.Objects;

public class CaptureRate {
    private static final int MINIMUM = 3;
    private static final int MAXIMUM = 255;

    private final int captureRate;

    public CaptureRate(final int captureRate) {
        validate(captureRate);
        this.captureRate = captureRate;
    }

    static public CaptureRate valueOf(final int captureRate) {
        return new CaptureRate(captureRate);
    }

    private void validate(int captureRate) {
        if (captureRate < MINIMUM || captureRate > MAXIMUM) {
            throw new IllegalArgumentException("wrong captureRate!!!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaptureRate that = (CaptureRate) o;
        return captureRate == that.captureRate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(captureRate);
    }
}
