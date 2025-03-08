import java.util.ArrayList;
import java.util.List;

public class LanguageTest {
    public static void main(String[] args) {
        List<Language> languages = new ArrayList<>();
        Language language = new Language();
        language.setName("SINDHI LANGUAGE");
        language.setLanguageFamily("Indo-Aryan Language");
        language.setNationalLanguage("Before inception of Paksitan it is national language of Sindh");
        language.setOfficialLanguage("Offical Language of Sindh Province of Pakistan");
        language.setEthnicity("Sindhis");
        language.setFamousPoet("Shah Abdul Latif Bhittai");
        language.setNativeCountries("Pakistan and India");
        language.setNativeSpeakers("32 Million (2011 - 2017)");
        language.setOrigin("The name Sindhi, is derived from the Sanskrit síndhu, the original name of the Indus River");
        language.setWritingSystem("Perso-Arabic and Devanagari");
        languages.add(language);
        System.out.println(languages);

    }
}
