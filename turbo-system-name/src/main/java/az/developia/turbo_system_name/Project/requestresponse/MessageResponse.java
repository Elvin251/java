package az.developia.turbo_system_name.Project.requestresponse;


public class MessageResponse {

    private String message;

    public MessageResponse(){}

    public MessageResponse(String message){
        this.message=message;
    }

    public String getMessage(){ return message; }
    public void setMessage(String message){ this.message=message; }
}
