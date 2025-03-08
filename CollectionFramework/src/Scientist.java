public class Scientist {
    private String name ;
    private String mainSubjects ;
    private String notableBooks ;
    private String achievement ;
    private String eraName ;
    private String otherSubjects ;
    private String bornYear ;
    private String deathYear ;
    private String ideas ;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainSubjects() {
        return mainSubjects;
    }

    public void setMainSubjects(String mainSubjects) {
        this.mainSubjects = mainSubjects;
    }

    public String getNotableBooks() {
        return notableBooks;
    }

    public void setNotableBooks(String notableBooks) {
        this.notableBooks = notableBooks;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getEraName() {
        return eraName;
    }

    public void setEraName(String eraName) {
        this.eraName = eraName;
    }

    public String getOtherSubjects() {
        return otherSubjects;
    }

    public void setOtherSubjects(String otherSubjects) {
        this.otherSubjects = otherSubjects;
    }

    public String getBornYear() {
        return bornYear;
    }

    public void setBornYear(String bornYear) {
        this.bornYear = bornYear;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }

    public String getIdeas() {
        return ideas;
    }

    public void setIdeas(String ideas) {
        this.ideas = ideas;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "name='" + name + '\'' +
                ", mainSubjects='" + mainSubjects + '\'' +
                ", notableBooks='" + notableBooks + '\'' +
                ", achievement='" + achievement + '\'' +
                ", eraName='" + eraName + '\'' +
                ", otherSubjects='" + otherSubjects + '\'' +
                ", bornYear='" + bornYear + '\'' +
                ", deathYear='" + deathYear + '\'' +
                ", ideas='" + ideas + '\'' +
                ", age=" + age +
                '}';
    }
}
