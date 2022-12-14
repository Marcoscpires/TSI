
package entidade;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Veterinario implements Serializable {
    private static AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String nome;
    private Animal animal;

    public Veterinario(String nome, Animal animal) {
        this.id = count.getAndIncrement();
        this.nome = nome;
        this.animal = animal;
    }

    public Veterinario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veterinario other = (Veterinario) obj;
        if (this.id != other.id){
            return false;
        }
        return true;
    }
    
    
   

    
}
