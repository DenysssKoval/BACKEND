package task;

import java.util.Objects;

public class TV {
    private String producer;
    private Integer size;

    public TV(String producer, Integer size) {
        this.producer = producer;
        this.size = size;
    }

    public String getProducer() {
        return producer;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "producer='" + producer + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return Objects.equals(producer, tv.producer) && Objects.equals(size, tv.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, size);
    }
}
