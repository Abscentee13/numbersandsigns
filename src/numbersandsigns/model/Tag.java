package model;

public class Tag {
    private String idTag;
    private String titleTag;
    private String descriptionTag;
    private String colorTag;

    public Tag(String idTag, String titleTag, String descriptionTag, String colorTag) {
        this.idTag = idTag;
        this.titleTag = titleTag;
        this.descriptionTag = descriptionTag;
        this.colorTag = colorTag;
    }

    public Tag() {

    }

    public String getIdTag() {
        return idTag;
    }

    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

    public String getTitleTag() {
        return titleTag;
    }

    public void setTitleTag(String titleTag) {
        this.titleTag = titleTag;
    }

    public String getDescriptionTag() {
        return descriptionTag;
    }

    public void setDescriptionTag(String descriptionTag) {
        this.descriptionTag = descriptionTag;
    }

    public String getColorTag() {
        return colorTag;
    }

    public void setColorTag(String colorTag) {
        this.colorTag = colorTag;
    }

    @Override
    public String toString() {
        return "TagContainer{" +
                "idTag='" + idTag + '\'' +
                ", titleTag='" + titleTag + '\'' +
                ", descriptionTag='" + descriptionTag + '\'' +
                ", colorTag='" + colorTag + '\'' +
                '}';
    }


    public void displayTag() {
        System.out.println("Tag Information:");
        System.out.println("ID Tag: " + idTag);
        System.out.println("Title Tag: " + titleTag);
        System.out.println("Description Tag: " + descriptionTag);
        System.out.println("Color Tag: " + colorTag);
    }

}
