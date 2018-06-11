package com.nau.digitalhospital;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.equalTo;

import com.mongodb.MongoClient;
import com.nau.digitalhospital.document.*;
import com.nau.digitalhospital.repository.AccountRepository;
import com.nau.digitalhospital.repository.HospitalRepository;
import com.nau.digitalhospital.repository.PatientRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;
import java.time.Month;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataMongoTest
@AutoConfigureMockMvc
public class DigitalHospitalApplicationTests {
	private static final Logger logger = LogManager.getLogger();
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ApplicationContext context;
	@Autowired
	private HospitalRepository hospitalRepository;
	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private MongoOperations mongoOperations;
	@Autowired
	private MongoClient mongoClient;
	@Autowired
	private AccountRepository accountRepository;


	@Test
	public void contextLoads() {

	}

	@Test
	public void shouldConnectToDatabase() {

	}

	@Test
	public void shouldAddSomeEntries() {
		Assert.assertEquals(hospitalRepository.count(),3);
	}

	@Test
	public void connectToLocalhost() {

	}

	@Test
	public void countPatientCollectionEntries() {
		long count = patientRepository.count();
		Assert.assertEquals(1, count);
	}

	@Test
	public void insertTestData() {
		accountRepository.deleteAll();
		Contacts contacts = new Contacts("artur@gmail.com", "0939078745",
				new Address("Kiev","Street", 20, 11)
		);
		Patient arturPatient = new Patient("Артур", "Сребранец", "Едуардович",
				LocalDate.of(1996, Month.DECEMBER, 16), 21, Gender.male, contacts);
		MedicalCard arturMedicalCard = new MedicalCard(arturPatient, null);
		Account arturAccount = new Account(arturMedicalCard, "artur", "12345", LocalDate.now());
		accountRepository.save(arturAccount);
		Assert.assertEquals(1, accountRepository.count());
	}

	@Test
	public void testQuery() {
		Account account = accountRepository.findAccountByMiddleName("Срєбранец");
	}

	@Test
	@WithMockUser(password = "user", username = "user", authorities = "USER")
	public void shouldGetHelloFromPatientsController() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(equalTo("Hello from PatientController")));
	}


}