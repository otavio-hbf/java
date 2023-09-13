package q2; 

public class Tarefa<T> {
    private String description;
    private double workload;
    private T responsible;

    Tarefa(String d, T r){

        this.description = d;
        this.responsible = r;
        this.setWorkload();

    }

    public String getDescription() {
        return description;
    }
    
    public T getResponsible() {
        return responsible;
    }

    private void setWorkload() {
        // implementar uma funçõa daora
        if(this.description == "fiscal"){
            this.workload = 40;
        }
        else if(this.description == "development"){
            this.workload = 60;
        }
        else if(this.description == "marketing"){
            this.workload = 20;
        }
        else if(this.description == "admin"){
            this.workload = 30;
        }
        else if(this.description == "sales"){
            this.workload = 30;
        }
        else{

            System.out.println(this.description + " is not a function");
            this.workload = 0;
        }
        
    }

    public double getWorkload() {
        return workload;
    }
}
