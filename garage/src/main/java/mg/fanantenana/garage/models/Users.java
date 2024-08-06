package mg.fanantenana.garage.models;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import mg.fanantenana.garage.utilities.EmailValidator;

@Getter
@Setter
@Builder
public class Users {
    @Id
    Long id;
    String firstname;
    String lastname;
    String mail;
    String pwd;
    Short roles_id;

    public void Mail(String mail)throws Exception{
        if(EmailValidator.isValidEmail(mail)){
            this.mail = mail;
            return;
        }
        throw new Exception("Tsy marina le email");
        
    }



    

    

    
}
