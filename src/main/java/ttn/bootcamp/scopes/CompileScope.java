package ttn.bootcamp.scopes;
import com.fasterxml.jackson.databind.ObjectMapper;
public class CompileScope{
    public static void main(String[] args) {
        try {
            String json = "{\"name\":\"Preeti\", \"competency\":\"JVM\"}";
            // Resolved at compile time
            ObjectMapper objectMapper = new ObjectMapper();
            BootCampTrainee bootCampTrainee= objectMapper.readValue(json, BootCampTrainee.class);
            System.out.println("Bootcamp Trainee Name: " + bootCampTrainee.getName());
            System.out.println("Competency: " + bootCampTrainee.getCompetency());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class BootCampTrainee {
    private String name;
    private String competency;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCompetency() { return competency; }
    public void setCompetency(String competency) { this.competency = competency; }
}
