package mg.fanantenana.garage.services;

import org.springframework.stereotype.Service;

import mg.fanantenana.garage.models.Users;
import mg.fanantenana.garage.repositories.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(String firstname,String lastname,String mail,String mdp,Short rolesId)throws Exception{
        Users user = Users.builder()
                    .firstname(firstname)
                    .lastname(lastname)
                    .pwd(mdp)
                    .roles_id(rolesId)
                    .build();
        /*
         * Check donnée
        */
        user.Mail(mail);
        userRepository.save(user);
        return;
    }

    public void update(Long id,String firstname,String lastname){
        Users user = Users.builder()
                    .id(id)
                    .firstname(firstname)
                    .lastname(lastname)
                    .build();
        /*
         * Validator for blanks
        */
        userRepository.save(user);
        return;
    }
}
