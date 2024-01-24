package model;

public enum Path {
    USER_JSON("src//numbersandsigns//repository//UserData.json"),
    TAG_JSON("src//numbersandsigns//repository//TagData.json");

    private final String path;

    Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
