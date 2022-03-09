package com.dam1;

public class BuilderPizzas {

    protected Pizzas  _pizza;

    public Pizzas build(){
        return this._pizza;
    }

    public BuilderPizzas(){
        _pizza = new Pizzas();
    }

    public BuilderPizzas setTipoMasa(int tipoMasa){
            _pizza.setTipoMasa(tipoMasa);
            return this;
    }

    public BuilderPizzas setTamaño(int tamaño){
        _pizza.setTamaño(tamaño);
        return this;
    }

    public BuilderPizzas setSalsa(int salsa){
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizzas setRecojida(int recojida){
        _pizza.setRecojida(recojida);
        return this;
    }

    public BuilderPizzas setJamon(boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }

    public BuilderPizzas setChampiñones(boolean champiñones){
        _pizza.setChampiñones(champiñones);
        return this;
    }

    public BuilderPizzas setPiña(boolean piña){
        _pizza.setPiña(piña);
        return this;
    }

    public BuilderPizzas setExtraQueso(boolean queso){
        _pizza.setExtraQueso(queso);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean gluten){
        _pizza.setSinGluten(gluten);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSalsaBool(boolean salsaBool){
        _pizza.setSalsaBool(salsaBool);
        return this;
    }

    public BuilderPizzas setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }

}
