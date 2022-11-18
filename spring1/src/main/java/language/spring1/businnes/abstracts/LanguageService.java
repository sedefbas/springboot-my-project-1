package language.spring1.businnes.abstracts;

import language.spring1.entity.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    List<Language> delete(int id);
    List<Language> update(int id,String name);
    List<Language> add(int id, String name);
    Language getOne(int id);
}
