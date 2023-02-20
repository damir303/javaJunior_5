package lesson21;

public class Vopros {
    private String tema;
    private String coment;

    public Vopros() {
    }

    public Vopros(String tema, String coment) {
        this.tema = tema;
        this.coment = coment;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vopros vopros = (Vopros) o;

        if (tema != null ? !tema.equals(vopros.tema) : vopros.tema != null) return false;
        return coment != null ? coment.equals(vopros.coment) : vopros.coment == null;
    }

    @Override
    public int hashCode() {
        int result = tema != null ? tema.hashCode() : 0;
        result = 31 * result + (coment != null ? coment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vopros{" +
                "tema='" + tema + '\'' +
                ", coment='" + coment + '\'' +
                '}';
    }
}
