package ResstAssured;

import ResstAssured.AbstractDomain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
public class ReqResData extends AbstractDomain {

    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

}
