package CarShop;

public class Producent {
    private ProducentName producentName;
    private Model model;
    private Type type;

    public enum ProducentName {
        TOYOTA, BMW, AUDI, VOLVO
    }

    public enum Model {
        COROLLA, AVENSIS, YARIS,
        X3, Z4_ROADSTER, i4M50,
        A3, A4, A6,
        S60, XC40, C30

    }

    public enum Type {
        SEDAN, MIKRO, KABRIOLET, SUV, COUPE

    }
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
