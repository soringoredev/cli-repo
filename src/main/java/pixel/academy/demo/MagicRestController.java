package pixel.academy.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicRestController {

    // injecting props from application.properties

    @Value("${wizard.name}")
    private String wizardName;

    @Value("${wizard.name}")
    private String wizardHouse;

    @Value("${wizard.spell}")
    private String wizardSpell;

}
