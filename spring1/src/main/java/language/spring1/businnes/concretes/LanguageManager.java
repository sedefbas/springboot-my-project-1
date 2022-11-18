package language.spring1.businnes.concretes;

import language.spring1.businnes.abstracts.LanguageService;
import language.spring1.dataAccess.abstracts.LanguageRepository;
import language.spring1.entity.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;


    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public LanguageRepository getLanguageRepository() {
        return languageRepository;
    }

    public void setLanguageRepository(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public List<Language> delete(int id) {
        return languageRepository.delete(id);
    }

    @Override
    public List<Language> update(int id, String name) {
        return languageRepository.update(id,name);
    }

    @Override
    public List<Language> add(int id, String name) {
        try {
            if(id > 0 && !Objects.equals(name, ""))
            {return languageRepository.add(id,name); }
        }
        catch (Exception e)
        { throw new RuntimeException("dil eklenemedi");};
        return null;
    }

    @Override
    public Language getOne(int id) {
        return languageRepository.getOne(id);
    }
}
