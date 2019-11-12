package generics;

public class Pen {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "title='" + title + '\'' +
                '}';
    }


}
