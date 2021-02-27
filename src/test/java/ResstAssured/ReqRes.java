package ResstAssured;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
public class ReqRes extends AbstractDomain {

    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<ReqResData> data;
    private ReqResAd ad;
	
}
