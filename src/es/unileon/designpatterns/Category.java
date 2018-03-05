package es.unileon.designpatterns;

import java.util.ArrayList;

public class Category implements Component{

    //TODO Cambiar ArrayList por una estructura propia
    //TODO Gestion de orden/niveles (Patron desconocido)

    private String name;
    private ArrayList<Component> components;

    public Category(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public String getDescription() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.toString());

        for(int i = 0; i < components.size(); i++){
            stringBuilder.append(components.get(i).toString());
        }

        return stringBuilder.toString();

    }

    @Override
    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public String toString(){
        return this.name;
    }

}
