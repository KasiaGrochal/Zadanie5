package CarShop;

public class Producent {
    private ProducentName producentName;
    private Model model;
    private String type;

    public enum ProducentName {
        TOYOTA, BMW, AUDI, VOLVO
    }

    public enum Model {
        Corolla, Avensis, Yaris,
        X3, Z4Roadster, i4M50,
        A3, A4, A6,
        S60, XC40, C30

    }

    public enum Type {

    }

    public ProducentName getProducentName(Model model) {
        switch (model) {
            case Yaris:
            case Avensis:
            case Corolla:
                setProducentName(ProducentName.TOYOTA);
                break;
            case X3:
            case i4M50:
            case Z4Roadster:
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

    public void setModel(Model model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public Producent(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }
}
