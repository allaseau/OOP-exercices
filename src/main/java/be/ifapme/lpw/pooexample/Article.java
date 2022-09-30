package be.ifapme.lpw.pooexample;

public class Article {
    private String reference;
    private String designation;
    private float costHTVA;
    private int rateTVA;

    public Article(String reference, String designation, float costHTVA, int rateTVA) {
        this.reference = reference;
        this.designation = designation;
        this.costHTVA = costHTVA;
        this.rateTVA = rateTVA;
    }

    public Article() {
        this.reference = "Ref Name";
        this.designation = "Designation name";
        this.costHTVA = 150.0F;
        this.rateTVA = 21;
    }

    public Article(String reference, String designation) {
        this.reference = reference;
        this.designation = designation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getCostHTVA() {
        return costHTVA;
    }

    public void setCostHTVA(float costHTVA) {
        this.costHTVA = costHTVA;
    }

    public int getRateTVA() {
        return rateTVA;
    }

    public void setRateTVA(int rateTVA) {
        this.rateTVA = rateTVA;
    }

    public Article(Article article){
        this.reference = article.getReference();
        this.designation = article.getDesignation();
        this.costHTVA = article.getCostHTVA();
        this.rateTVA = article.getRateTVA();
    }

    public float calculateCostTTC(){
        return costHTVA+ (costHTVA * rateTVA)/100;
    }

    public void printArticle(){
        System.out.println("Ref: " + this.reference);
        System.out.println("Designation: " + this.designation);
        System.out.println("Cost HTVA: " + this.costHTVA);
        System.out.println("Rate TVA: " + this.rateTVA);
    }
}
