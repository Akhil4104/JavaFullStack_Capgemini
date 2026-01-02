package hasARelationship;

public class Pages {
    private String pageContent;

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }

    // Constructors
    Pages() {
    }

    Pages(String pageContent) {
        this.pageContent = pageContent;
    }
}
