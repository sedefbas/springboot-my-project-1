package language.spring1.wepApi;

import language.spring1.businnes.abstracts.LanguageService;
import language.spring1.entity.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/lan")
public class LanguageController {
    public LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();
    }


    @GetMapping("/delete")
    public List<Language> delete()
    {
        return languageService.delete(1);
    }
    @GetMapping("/update")
    public List<Language> update()
    {
        return languageService.update(4,"sedef");
    }

    @GetMapping("/ad")
    public List<Language> add()
    {
        return languageService.add(5,"enes");
    }
    @GetMapping("/getone")
    public Language getOne()
    {
        return languageService.getOne(2);
    }
}

