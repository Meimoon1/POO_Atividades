package modells;

public abstract class Base{
    public int id;

    @Override
    public String toString(){
        return "Id:"+this.id;
    }
    

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pratos){
            Pratos outro = (Pratos)obj;
            if(this.id == outro.id){
                return true;
            }
        }
        return false;
    }



    
}