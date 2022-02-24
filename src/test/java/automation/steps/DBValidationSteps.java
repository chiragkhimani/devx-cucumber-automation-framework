package automation.steps;

import automation.utils.Constant;
import automation.utils.DatabaseUtils;
import automation.utils.PropertyReader;
import com.sun.org.apache.bcel.internal.Const;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBValidationSteps {

    @Then("verify all details updated in database")
    public void verify_all_details_updated_in_database() throws Exception {
        String email = Constant.inputDataOnUI.get("email");
        String query = PropertyReader.getProperty("fetch.userdata");
        query = String.format(query,email);
        ResultSet rs = DatabaseUtils.executeQuery(query);
        rs.next();
        Constant.dataFromDB.put("email",rs.getString("email_address"));
        Constant.dataFromDB.put("title",rs.getString("title"));
        Constant.dataFromDB.put("firstName",rs.getString("first_name"));
        Constant.dataFromDB.put("lastName",rs.getString("last_name"));
        Constant.dataFromDB.put("gender",rs.getString("gender"));
        Constant.dataFromDB.put("dob",rs.getString("dob"));
        Constant.dataFromDB.put("ssn",rs.getString("ssn").replace("-",""));

        System.out.println("Data entered in UI - "+ Constant.inputDataOnUI);
        System.out.println("Data from DB - "+ Constant.dataFromDB);
        Assert.assertTrue("Data from UI is not matching with Data in database", Constant.dataFromDB.equals(Constant.inputDataOnUI));
    }

}
