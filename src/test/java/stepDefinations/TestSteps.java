package stepDefinations;

import java.sql.ResultSet;

import dbmanager.DBManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps extends DBManager {

	@Given("a connection to environment {string} with database {string}")
	public void a_connection_to_environment_with_database(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	}
	@When("I query the database for the {string} schema")
	public void i_query_the_database_for_the_schema(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("the {string} schema should match the {string} schema")
	public void the_schema_should_match_the_schema(String string, String string2) throws Exception {
		String q = "Select * from Products";
		FetchDataFromDB(q);	    
	}
	
	@When("I run {string} queries from file {string} against source table {string}")
	public void i_run_queries_from_file_against_source_table(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("I execute the stored procedure {string}")
	public void i_execute_the_stored_procedure(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("target table {string} should receive the {string} rows from source table {string}")
	public void target_table_should_receive_the_rows_from_source_table(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("target table {string} should not receive the deleted rows from source table {string}")
	public void target_table_should_not_receive_the_deleted_rows_from_source_table(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}