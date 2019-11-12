package generics;

public class CellPhone {
    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "title='" + title + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
