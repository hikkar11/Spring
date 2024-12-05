package koschei.models;

import koschei.KoscheiTheDeathless;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private final KoscheiTheDeathless koscheiTheDeathless;
    private Deth8 deth;

    @Autowired
    public Needle7(Deth8 deth, KoscheiTheDeathless koscheiTheDeathless) {this.deth = deth;
        this.koscheiTheDeathless = koscheiTheDeathless;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth.toString();
    }
}
