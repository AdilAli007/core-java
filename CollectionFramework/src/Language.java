public class Language {
    private String name ;
    private String origin ;
    private String languageFamily ;
    private String ethnicity ;
    private String nativeCountries ;
    private String nativeSpeakers ;
    private String famousPoet ;
    private String officialLanguage ;
    private String nationalLanguage ;
    private String writingSystem ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLanguageFamily() {
        return languageFamily;
    }

    public void setLanguageFamily(String languageFamily) {
        this.languageFamily = languageFamily;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getNativeCountries() {
        return nativeCountries;
    }

    public void setNativeCountries(String nativeCountries) {
        this.nativeCountries = nativeCountries;
    }

    public String getNativeSpeakers() {
        return nativeSpeakers;
    }

    public void setNativeSpeakers(String nativeSpeakers) {
        this.nativeSpeakers = nativeSpeakers;
    }

    public String getFamousPoet() {
        return famousPoet;
    }

    public void setFamousPoet(String famousPoet) {
        this.famousPoet = famousPoet;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public String getNationalLanguage() {
        return nationalLanguage;
    }

    public void setNationalLanguage(String nationalLanguage) {
        this.nationalLanguage = nationalLanguage;
    }

    public String getWritingSystem() {
        return writingSystem;
    }

    public void setWritingSystem(String writingSystem) {
        this.writingSystem = writingSystem;
    }

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", languageFamily='" + languageFamily + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", nativeCountries='" + nativeCountries + '\'' +
                ", nativeSpeakers='" + nativeSpeakers + '\'' +
                ", famousPoet='" + famousPoet + '\'' +
                ", officialLanguage='" + officialLanguage + '\'' +
                ", nationalLanguage='" + nationalLanguage + '\'' +
                ", writingSystem='" + writingSystem + '\'' +
                '}';
    }
}
