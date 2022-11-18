package language.spring1.dataAccess.concretes;

import language.spring1.dataAccess.abstracts.LanguageRepository;
import language.spring1.entity.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class inMemoryLanguageRepository implements LanguageRepository {

    public List<Language> languages ;

    public inMemoryLanguageRepository(List<Language> languages) {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"java"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"python"));
        languages.add(new Language(4,"javascpirpt"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public List<Language> delete(int id) {
        languages.remove(id-1);
        return languages;
    }


    @Override
    public List<Language> update(int id, String name) {
        languages.set((id-1),(new Language(id,name)));
        return languages;
    }

    @Override
    public List<Language> add(int id, String name) {
        languages.add(new Language(id,name));
        return null;
    }

    @Override
    public Language getOne(int id) {
        return languages.get(id-1);
    }


}
