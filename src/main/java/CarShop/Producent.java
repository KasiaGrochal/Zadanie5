package CarShop;

import CarShop.Enums.Model;
import CarShop.Enums.ProducentName;
import CarShop.Enums.Type;

public class Producent {
    private ProducentName producentName;
    private final Model model;
    private final Type type;


    public Producent(Model model, Type type) {
        this.model = model;
        this.type = type;
    }

    public ProducentName getProducentName(Model model) {
        switch (model) {
            case YARIS:
            case AVENSIS:
            case COROLLA:
                setProducentName(ProducentName.TOYOTA);
                break;
            case X3:
            case i4M50:
            case Z4_ROADSTER:
                setProducentName(ProducentName.BMW);
                break;
            case A3:
            case A6:
                setProducentName(ProducentName.AUDI);
                break;
            case S60:
            case C30:
                setProducentName(ProducentName.VOLVO);
                break;
        }
        return producentName;
    }

    public void setProducentName(ProducentName producentName) {
        this.producentName = producentName;
    }

    public Model getModel() {
        return model;
    }
}
