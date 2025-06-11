package sistemaDrones;

public enum EstadoMision {
    COMPLETADA(2), ENPROCESO(1), FALLADA(3), SINEMPEZAR(0);
    private int index;
    private EstadoMision(int index){
        this.index=index;
    }

    public int getIndex() {
        return index;
    }

}
