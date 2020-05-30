import javax.imageio.metadata.IIOMetadataFormat;

public class Car {

    public int doors;
    public int wheels;
    public String model;
    public String engine;
    public String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("ford")){
            this.model = model;
        } else{
            this.model = "Unknown";
        }

    }
    public String getModel(){
        return this.model;
    }




}
