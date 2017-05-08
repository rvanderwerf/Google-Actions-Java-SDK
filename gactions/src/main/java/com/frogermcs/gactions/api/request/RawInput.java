package com.frogermcs.gactions.api.request;

/**
 * Created by froger_mcs on 17/01/2017.
 */
public class RawInput {
    public Time create_time;
    public String query;
    public InputType input_type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RawInput rawInput = (RawInput) o;

        if (create_time != null ? !create_time.equals(rawInput.create_time) : rawInput.create_time != null)
            return false;
        if (query != null ? !query.equals(rawInput.query) : rawInput.query != null) return false;
        return input_type == rawInput.input_type;
    }

    @Override
    public int hashCode() {
        int result = create_time != null ? create_time.hashCode() : 0;
        result = 31 * result + (query != null ? query.hashCode() : 0);
        result = 31 * result + (input_type != null ? input_type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RawInput{" +
                "create_time=" + create_time +
                ", query='" + query + '\'' +
                ", input_type=" + input_type +
                '}';
    }
}
