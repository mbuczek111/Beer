package beer;

import java.util.Objects;

public class Beer {
    private String name;
    private String type;
    private double alcohol;
    private int volume;

    public Beer(String name, String type, double alcohol, int volume)
    {
        this.name = name;
        this.type = type;
        this.alcohol = alcohol;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || !(obj instanceof Beer))
        {
            return false;
        }
        Beer beer = (Beer) obj;
        return Double.compare(beer.alcohol, this.alcohol) == 0 &&
                this.volume == beer.volume &&
                Objects.equals(this.name, beer.name) &&
                Objects.equals(this.type, beer.type);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, type, alcohol, volume);
    }
}
