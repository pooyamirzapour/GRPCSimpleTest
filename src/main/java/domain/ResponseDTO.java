package domain;

public class ResponseDTO {
    private String output;

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "output='" + output + '\'' +
                '}';
    }
}
